// Lehlohonolo Mosikili
// Last modified: 20 March 2021

public class VaccineArray {
    Vaccination[] vaccines = new Vaccination[9919];
    int records = 0;

    // Adds vaccines into array data structure
    public void add(Vaccination vacc){
        vaccines[records++] = vacc;
    }
}
