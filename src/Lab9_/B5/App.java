package Lab9_.B5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        testOriginalData();
        testSortIncreasingByPopulation();
        testSortDecreasingByPopulation();
        testSortIncreasingByArea();
        testSortDecreasingByArea();
        testSortIncreasingByGdp();
        testSortDecreasingByGdp();

        testFilterAfricaCountry();
        testFilterAsiaCountry();
        testFilterEuropeCountry();
        testFilterNorthAmericaCountry();
        testFilterOceaniaCountry();
        testFilterSouthAmericaCountry();

        testFilterMostPopulousCountries();
        testFilterLeastPopulousCountries();
        testFilterLargestAreaCountries();
        testFilterSmallestAreaCountries();
        testFilterHighestGdpCountries();
        testFilterLowestGdpCountries();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;

        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);

                Country country;
                switch (continent.toLowerCase()) {
                    case "africa":
                        country = new AfricaCountry(code, name, population, area, gdp);
                        break;
                    case "asia":
                        country = new AsiaCountry(code, name, population, area, gdp);
                        break;
                    case "europe":
                        country = new EuropeCountry(code, name, population, area, gdp);
                        break;
                    case "north america":
                        country = new NorthAmericaCountry(code, name, population, area, gdp);
                        break;
                    case "oceania":
                        country = new OceaniaCountry(code, name, population, area, gdp);
                        break;
                    case "south america":
                        country = new SouthAmericaCountry(code, name, population, area, gdp);
                        break;
                    default:
                        continue;
                }

                countryManager.append(country);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();

        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);

            for (String s : splitData) {
                result.add(s);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "src/Lab9_/B5/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        System.out.println("Original:");
        System.out.println(CountryArrayManager.codeOfCountriesToString(countryManager.getCountries()));
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterAfricaCountry() {
        CountryArrayManager.print(countryManager.filterAfricaCountry());
    }

    public static void testFilterAsiaCountry() {
        CountryArrayManager.print(countryManager.filterAsiaCountry());
    }

    public static void testFilterEuropeCountry() {
        CountryArrayManager.print(countryManager.filterEuropeCountry());
    }

    public static void testFilterNorthAmericaCountry() {
        CountryArrayManager.print(countryManager.filterNorthAmericaCountry());
    }

    public static void testFilterOceaniaCountry() {
        CountryArrayManager.print(countryManager.filterOceaniaCountry());
    }

    public static void testFilterSouthAmericaCountry() {
        CountryArrayManager.print(countryManager.filterSouthAmericaCountry());
    }

    public static void testFilterMostPopulousCountries() {
        CountryArrayManager.print(countryManager.filterMostPopulousCountries(10));
    }

    public static void testFilterLeastPopulousCountries() {
        CountryArrayManager.print(countryManager.filterLeastPopulousCountries(10));
    }

    public static void testFilterLargestAreaCountries() {
        CountryArrayManager.print(countryManager.filterLargestAreaCountries(10));
    }

    public static void testFilterSmallestAreaCountries() {
        CountryArrayManager.print(countryManager.filterSmallestAreaCountries(10));
    }

    public static void testFilterHighestGdpCountries() {
        CountryArrayManager.print(countryManager.filterHighestGdpCountries(10));
    }

    public static void testFilterLowestGdpCountries() {
        CountryArrayManager.print(countryManager.filterLowestGdpCountries(10));
    }
}
