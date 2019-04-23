import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QS01 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("/home/vcalazans/ExerciciosFURB/municipios.csv"));
		Municipios municipios = new Municipios();
		
		ArrayList<Municipios> arrMunicipios = new ArrayList<>();
		
		String sLinha = "";
		if(scan.hasNext()) {scan.nextLine();}
		while(scan.hasNext()) {
			sLinha = scan.nextLine();
			municipios = new Municipios();
			municipios.codigo = sLinha.split(";")[0];
			municipios.cidade = sLinha.split(";")[1];
			municipios.uf = sLinha.split(";")[2];
			municipios.populacao = Integer.parseInt( sLinha.split(";")[3]);
			arrMunicipios.add(municipios);
		}
		
		municipios = new Municipios();
		municipios.codigo = "2706703";
		if(arrMunicipios.indexOf(municipios) != -1)
		    System.out.println(arrMunicipios.get(arrMunicipios.indexOf(municipios)).cidade);
		
		municipios.codigo = "148233";
		if(arrMunicipios.indexOf(municipios) != -1)
			System.out.println("Sim, tem uma cidade com o código 148233");
		
		municipios.codigo = "2919157";
		if(arrMunicipios.indexOf(municipios) != -1)
		    System.out.println("UF : " + arrMunicipios.get(arrMunicipios.indexOf(municipios)).cidade);
		
		municipios.codigo = "2933000";
		if(arrMunicipios.indexOf(municipios) != -1)
			arrMunicipios.remove(arrMunicipios.indexOf(municipios));
		
		municipios.codigo = "1301852";
		if(arrMunicipios.indexOf(municipios) != -1)
			arrMunicipios.remove(arrMunicipios.indexOf(municipios));
		
		municipios.codigo = "2111805";
		if(arrMunicipios.indexOf(municipios) != -1)
			arrMunicipios.remove(arrMunicipios.indexOf(municipios));
		
	}

}
