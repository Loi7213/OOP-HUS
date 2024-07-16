package lab8.ex4.countrymanager.countryarraymanager;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
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

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if (index < 0 || index > this.countries.length) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= this.countries.length) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }

        return this.countries[index];
    }

    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[minIndex].getPopulation()) {
                    minIndex = j;
                }
            }
            Country temp = newArray[minIndex];
            newArray[minIndex] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[maxIndex].getPopulation()) {
                    maxIndex = j;
                }
            }
            Country temp = newArray[maxIndex];
            newArray[maxIndex] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        ArrayList<AfricaCountry> africaCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof AfricaCountry) {
                africaCountries.add((AfricaCountry) country);
            }
        }
        return africaCountries.toArray(new AfricaCountry[africaCountries.size()]);
    }

    public AsiaCountry[] filterAsiaCountry() {
        ArrayList<AsiaCountry> asiaCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries.add((AsiaCountry) country);
            }
        }
        return asiaCountries.toArray(new AsiaCountry[asiaCountries.size()]);
    }

    public EuropeCountry[] filterEuropeCountry() {
        ArrayList<EuropeCountry> europeCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof EuropeCountry) {
                europeCountries.add((EuropeCountry) country);
            }
        }
        return europeCountries.toArray(new EuropeCountry[europeCountries.size()]);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        ArrayList<NorthAmericaCountry> northAmericaCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries.add((NorthAmericaCountry) country);
            }
        }
        return northAmericaCountries.toArray(new NorthAmericaCountry[northAmericaCountries.size()]);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        ArrayList<OceaniaCountry> oceaniaCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries.add((OceaniaCountry) country);
            }
        }
        return oceaniaCountries.toArray(new OceaniaCountry[oceaniaCountries.size()]);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        ArrayList<SouthAmericaCountry> southAmericaCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries.add((SouthAmericaCountry) country);
            }
        }
        return southAmericaCountries.toArray(new SouthAmericaCountry[southAmericaCountries.size()]);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] sortedByPopulation = sortByDecreasingPopulation();
        return Arrays.copyOf(sortedByPopulation, howMany);
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] sortedByPopulation = sortByIncreasingPopulation();
        return Arrays.copyOf(sortedByPopulation, howMany);
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] sortedByArea = sortByDecreasingArea();
        return Arrays.copyOf(sortedByArea, howMany);
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] sortedByArea = sortByIncreasingArea();
        return Arrays.copyOf(sortedByArea, howMany);
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] sortedByGdp = sortByDecreasingGdp();
        return Arrays.copyOf(sortedByGdp, howMany);
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] sortedByGdp = sortByIncreasingGdp();
        return Arrays.copyOf(sortedByGdp, howMany);
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}