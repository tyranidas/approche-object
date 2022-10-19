package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import fichier.Ville;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
	
		
		ArrayList<Ville> list1 = new ArrayList<Ville>();
		
		Path path = Paths.get("C:\\Users\\tyran\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\approche-object\\src\\fichier\\recensement.csv");
		boolean exists = Files.exists(path);
		Path pathCible = Paths.get("C:\\Users\\tyran\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\approche-object\\src\\fichier\\genererFichier.csv");
		//System.out.println(exists);
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		//gérer la 1ère ligne
		String firstLine = lines.get(1);
		String[] breakFirst = firstLine.split(";");
		String [] finalFirst = {breakFirst[1], breakFirst[2], breakFirst[6],breakFirst[9]};
		ArrayList<String> createFirst = new ArrayList<>();
		createFirst.add(finalFirst[0]+";"+finalFirst[1]+";"+finalFirst[2]+";"+finalFirst[3]);
		lines.remove(0);
		
		// transformer table en ville
		for (String l: lines)
		{
			
			 l = l.replaceAll("\\s", "");
			 String[] tokens = l.split(";");
			 
			  list1.add(new Ville(tokens[6], tokens[2],tokens[1],Integer.parseInt(tokens[9])));
		}
		// ajouter les villes > 25k habitans à la liste
		for (Ville v: list1)
		{
			if (v.getPop()> 25000)
			{
			createFirst.add(v.getReg()+";"+v.getDep()+";"+v.getName()+";"+v.getPop());
			}
			
		}
		
		// créer le fichier
		Files.write(pathCible,createFirst , StandardOpenOption.APPEND );
		
		
		
		
		
		
			
	}

}
