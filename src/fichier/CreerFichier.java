package fichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import fichier.Ville;


public class CreerFichier {

	
	
	public static void main(String[] args) throws IOException {
	
			
		Path pathOrigin = Paths.get("C:\\Users\\tyran\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\approche-object\\src\\fichier\\recensement.csv");
		Path pathCible = Paths.get("C:\\Users\\tyran\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\approche-object\\src\\fichier\\test.csv");
		
		List<String> lines = Files.readAllLines(pathOrigin, StandardCharsets.UTF_8);
		ArrayList<String> linesCent = new ArrayList<String>();
		for (int i=0; i<=100; i++)
		{
			String linesC = lines.get(i);
			linesCent.add(linesC);
		}
		
		Files.write(pathCible, linesCent);	
		
		
			
			
		
	
	
		
		
				
		
		

	}

}
