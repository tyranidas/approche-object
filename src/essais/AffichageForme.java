package essais;

import formes.*;

public class AffichageForme {

	public static void afficher(Forme forme)
	{
		System.out.println(forme.toString()+" Son périmètre est de "+forme.calculerPerimetre()+"cm. Sa surface est de "+forme.calculerSurface()+"cm².");
	}

}
