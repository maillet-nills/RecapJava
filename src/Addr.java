public class Addr {

    public int number;
    public String postal;
    public String cityName;
    public String countryName;

    public Addr(int number, String postal, String cityName, String countryName) {
        this.number = number;
        this.postal = postal;
        this.cityName = cityName;
        this.countryName = countryName;
    }

    public boolean isInFrance(){
        return this.countryName.equals("France");
    }

}
