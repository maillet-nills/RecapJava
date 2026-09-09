public class Addr {

    public String street;
    public String postal;
    public String cityName;
    public String countryName;

    public Addr(String street, String postal, String cityName, String countryName) {
        this.street = street;
        this.postal = postal;
        this.cityName = cityName;
        this.countryName = countryName;
    }

    public boolean isInFrance(){
        return this.countryName.equals("France");
    }

}
