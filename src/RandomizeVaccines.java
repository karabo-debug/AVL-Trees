// Randomize elements in vaccinations.csv file
// Lehlohonolo Mosikili
// Last modified: 21 March 2022

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomizeVaccines {
    
    VaccineArray vac = new VaccineArray();
    int randomLevel;

    ArrayList<Vaccination> list = new ArrayList<>(Arrays.asList(vac.vaccines));
    
    // Reads vaccinations.csv file while adding elements in the array data structure
    public void readFile(){
        File f = new File("data/vaccinations.csv");
        try{
            Scanner scanner = new Scanner(f);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                vac.add(new Vaccination(line));
            }
            scanner.close();

        }catch(Exception e){
            System.out.println("File not found!");
        }    
    }

    // Randomize elements in the array data structure
    public void randomize(Vaccination[] v)throws IOException{
        ArrayList<Vaccination> list = new ArrayList<>(Arrays.asList(vac.vaccines));
        List<Vaccination> list1 = null;
        List<Vaccination> list2= null;

        int n = 495;

        for(int i=0; i < randomLevel;i++){
            list1 = list.subList(n, 9919);
            list2 = list.subList(0, n);
            n+=495;
        }
        list1.addAll(list2);

        // Writes randomized array of elements in a new file
        BufferedWriter writer = new BufferedWriter(new FileWriter("data/vaccinations_random.csv"));

        for(int i = 0; i < list1.size(); i++){
            writer.write(list1.get(i).toString());
            writer.newLine();
        }
        writer.close();
        
    }

}
