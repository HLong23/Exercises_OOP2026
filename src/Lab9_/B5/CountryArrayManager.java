package Lab9_.B5;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public  CountryArrayManager() {
        this.countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength){
        this.countries = new Country[maxLength];
        this.length = maxLength;
    }

    public Country[] getCountries() {
        return countries;
    }

    public int getLength() {
        return length;
    }

    private void correct(){
        int nullFirstIndex = 0;

        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore(){
        Country[] newArray = new Country[2*this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country){
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index){
        if (index < 0 || index > this.countries.length) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index){
        if (index < 0 || index >= this.countries.length){
            return  false;
        }

        for (int i = index; i < this.countries.length - 1; i++){
            this.countries[i] = this.countries[i+1];
        }

        this.countries[this.length-1] = null;
        this.length--;
        return true;
    }

    public Country[] sortByIncreasingPopulation(){
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < this.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < this.length; j++){
                if (newArray[j].getPopulation() < newArray[index].getPopulation()){
                    index = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[index];
            newArray[index] = temp;
        }

        return newArray;
    }

    public Country[] sortByDecreasingPopulation(){
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < this.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < this.length; j++){
                if (newArray[j].getPopulation() > newArray[index].getPopulation()){
                    index = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[index];
            newArray[index] = temp;
        }

        return newArray;
    }

    public Country[] sortByIncreasingArea(){
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < this.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < this.length; j++){
                if (newArray[j].getArea() < newArray[index].getArea()){
                    index = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[index];
            newArray[index] = temp;
        }

        return newArray;
    }

    public Country[] sortByDecreasingArea(){
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < this.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < this.length; j++){
                if (newArray[j].getArea() > newArray[index].getArea()){
                    index = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[index];
            newArray[index] = temp;
        }

        return newArray;
    }

    public Country[] sortByIncreasingGdp(){
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < this.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < this.length-1; j++){
                if (newArray[j].getGdp() < newArray[index].getGdp()){
                    index = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[index];
            newArray[index] = temp;
        }

        return  newArray;
    }

    public Country[] sortByDecreasingGdp(){
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < this.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < this.length-1; j++){
                if (newArray[j].getGdp() > newArray[index].getGdp()){
                    index = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[index];
            newArray[index] = temp;
        }

        return  newArray;
    }

    public AfricaCountry[] filterAfricaCountry(){
        ArrayList<AfricaCountry> list = new ArrayList<>();

        for (Country country : this.countries){
            if (country instanceof AfricaCountry){
                list.add((AfricaCountry) country);
            }
        }

        return list.toArray(new AfricaCountry[0]);
    }

    public AsiaCountry[] filterAsiaCountry() {
        ArrayList<AsiaCountry> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (countries[i] instanceof AsiaCountry) {
                list.add((AsiaCountry) countries[i]);
            }
        }

        return list.toArray(new AsiaCountry[0]);
    }

    public EuropeCountry[] filterEuropeCountry() {
        ArrayList<EuropeCountry> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                list.add((EuropeCountry) countries[i]);
            }
        }

        return list.toArray(new EuropeCountry[0]);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        ArrayList<NorthAmericaCountry> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (countries[i] instanceof NorthAmericaCountry) {
                list.add((NorthAmericaCountry) countries[i]);
            }
        }

        return list.toArray(new NorthAmericaCountry[0]);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        ArrayList<OceaniaCountry> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (countries[i] instanceof OceaniaCountry) {
                list.add((OceaniaCountry) countries[i]);
            }
        }

        return list.toArray(new OceaniaCountry[0]);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        ArrayList<SouthAmericaCountry> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (countries[i] instanceof SouthAmericaCountry) {
                list.add((SouthAmericaCountry) countries[i]);
            }
        }

        return list.toArray(new SouthAmericaCountry[0]);
    }

    public Country[] filterMostPopulousCountries(int howMany){
        Country[] sorted = sortByDecreasingPopulation();

        if(howMany > sorted.length){
            howMany = sorted.length;
        }

        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);

        return result;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] sorted = sortByIncreasingPopulation();

        if (howMany > sorted.length) {
            howMany = sorted.length;
        }

        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);

        return result;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] sorted = sortByDecreasingArea();

        if (howMany > sorted.length) {
            howMany = sorted.length;
        }

        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);

        return result;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] sorted = sortByIncreasingArea();

        if (howMany > sorted.length) {
            howMany = sorted.length;
        }

        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);

        return result;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] sorted = sortByDecreasingGdp();

        if (howMany > sorted.length) {
            howMany = sorted.length;
        }

        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);

        return result;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] sorted = sortByIncreasingGdp();

        if (howMany > sorted.length) {
            howMany = sorted.length;
        }

        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);

        return result;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[ ");

        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];

            if (country != null) {
                codeOfCountries.append(country.getCode()).append(" ");
            }
        }

        return codeOfCountries.toString().trim() + " ]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[ ");

        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];

            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }

        System.out.print(countriesString.toString().trim() + " ]");
    }
}
