package lab8.ex4.countrymanager.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

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

            // Read file in java line by line.
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
                double population = Double.parseDouble(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String region = dataList.get(5);

                Country country;
                switch (region) {
                    case "Africa":
                        country = new AfricaCountry(code, name, (int) population, area, gdp);
                        break;
                    case "Asia":
                        country = new AsiaCountry(code, name, (int) population, area, gdp);
                        break;
                    case "Europe":
                        country = new EuropeCountry(code, name, (int) population, area, gdp);
                        break;
                    case "North America":
                        country = new NorthAmericaCountry(code, name, (int) population, area, gdp);
                        break;
                    case "Oceania":
                        country = new OceaniaCountry(code, name, (int) population, area, gdp);
                        break;
                    case "South America":
                        country = new SouthAmericaCountry(code, name, (int) population, area, gdp);
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
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
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
        String filePath = "C:/Users/MT HIEP THANH/IdeaProjects/oop/src/lab8/ex4/countrymanager/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.println("Original Data:");
        System.out.println(codesString);
        System.out.println();
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println("Increasing Population:");
        System.out.println(codesString);
        System.out.println();
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println("Decreasing Population:");
        System.out.println(codesString);
        System.out.println();
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println("Increasing Area:");
        System.out.println(codesString);
        System.out.println();
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println("Decreasing Area:");
        System.out.println(codesString);
        System.out.println();
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println("Increasing GDP:");
        System.out.println(codesString);
        System.out.println();
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println("Decreasing GDP:");
        System.out.println(codesString);
        System.out.println();
    }

    public static void testFilterAfricaCountry() {
        AfricaCountry[] africaCountries = countryManager.filterAfricaCountry();
        System.out.println("Africa Countries:");
        CountryArrayManager.print(africaCountries);
        System.out.println();
    }

    public static void testFilterAsiaCountry() {
        AsiaCountry[] asiaCountries = countryManager.filterAsiaCountry();
        System.out.println("Asia Countries:");
        CountryArrayManager.print(asiaCountries);
        System.out.println();
    }

    public static void testFilterEuropeCountry() {
        EuropeCountry[] europeCountries = countryManager.filterEuropeCountry();
        System.out.println("Europe Countries:");
        CountryArrayManager.print(europeCountries);
        System.out.println();
    }

    public static void testFilterNorthAmericaCountry() {
        NorthAmericaCountry[] northAmericaCountries = countryManager.filterNorthAmericaCountry();
        System.out.println("North America Countries:");
        CountryArrayManager.print(northAmericaCountries);
        System.out.println();
    }

    public static void testFilterOceaniaCountry() {
        OceaniaCountry[] oceaniaCountries = countryManager.filterOceaniaCountry();
        System.out.println("Oceania Countries:");
        CountryArrayManager.print(oceaniaCountries);
        System.out.println();
    }

    public static void testFilterSouthAmericaCountry() {
        SouthAmericaCountry[] southAmericaCountries = countryManager.filterSouthAmericaCountry();
        System.out.println("South America Countries:");
        CountryArrayManager.print(southAmericaCountries);
        System.out.println();
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        System.out.println("5 Most Populous Countries:");
        CountryArrayManager.print(countries);
        System.out.println();
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        System.out.println("5 Least Populous Countries:");
        CountryArrayManager.print(countries);
        System.out.println();
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(5);
        System.out.println("5 Largest Area Countries:");
        CountryArrayManager.print(countries);
        System.out.println();
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        System.out.println("5 Smallest Area Countries:");
        CountryArrayManager.print(countries);
        System.out.println();
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(5);
        System.out.println("5 Highest GDP Countries:");
        CountryArrayManager.print(countries);
        System.out.println();
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(5);
        System.out.println("5 Lowest GDP Countries:");
        CountryArrayManager.print(countries);
        System.out.println();
    }
}
