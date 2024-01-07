// Lehlohonolo Mosikili
// Last modified: 20 Mar 2022

public class Vaccination implements Comparable<Vaccination>{
    String country, date, numOfVaccines;

    public Vaccination(){}

    public Vaccination(String line){
        // Format country, date, vaccine
        String[] portions = line.split(",");
        country = portions[0];
        date = portions[1];
        
        if(portions.length == 3)
            numOfVaccines = portions[2];
        else
            numOfVaccines = "0";
    }

    // Compare two objects using country and date as key
    public int compareTo(Vaccination v){
        return (country+","+date).compareTo(v.country+","+v.date);
    }

    public String getCountry(){
        return country;
    }

    public String getDate(){
        return date;
    }

    public String getVaccine(){
        return numOfVaccines;
    }

    public String toString(){
        return country+","+date+","+numOfVaccines;
    }
    
}