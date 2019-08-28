package releaseSort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class LeagueRunner {

	public static void main(String[] args) {
		
		
		
		
		String file = "League release.txt";
		String path = "C:\\Users\\adpen\\Documents\\C\\";
		System.out.println(file);
		System.out.println(path);
		ChampGenerator gen = new ChampGenerator();
		ArrayList<Champion> champions = new ArrayList<Champion>();
		
		BufferedReader br;
		String st;
		try {
			br = new BufferedReader(new FileReader(path+file));
			while((st = br.readLine()) != null ) {
				champions.add(gen.createChampion(st));
			}
			
			
			
			Collections.sort(champions, new SortbyRelease());
			File out = new File("C:\\Users\\adpen\\Documents\\C\\champsByRelease.txt");
			
			if(!out.exists())
				out.createNewFile();
			
			FileWriter fw = new FileWriter(out.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(Champion c : champions) {
				bw.write(c.toString());
				bw.newLine();
			}
			bw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		
	}
}
