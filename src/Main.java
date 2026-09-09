//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Addr franceAdress = new Addr("37 Avenue de la Capucine", "31100", "Toulouse", "France");
    Addr germanyAdress = new Addr("9 Kleiststr.", "52477", "Alsdorf", "Germany");

    DeliveryPoint franceDeliveryPoint = new DeliveryPoint("FranceDepot", franceAdress, new ArrayList<Package>());
    DeliveryPoint germanyDeliveryPoint = new DeliveryPoint("GermanyDepot", germanyAdress, new ArrayList<Package>());

    Package packageOne = new Package(3.20F, "Pierre Paul", germanyAdress, franceDeliveryPoint);
    Package packageTwo = new Package(1.30F, "Pedro Ravier", germanyAdress, franceDeliveryPoint);
    Package packageThree = new Package(8.20F, "Karen Holmes", franceAdress, germanyDeliveryPoint);
    Package packageFour = new Package(4.10F, "Peter French", franceAdress, germanyDeliveryPoint);

    System.out.println(franceAdress.isInFrance());
    System.out.println(germanyAdress.isInFrance());

    System.out.println(franceDeliveryPoint.calcProfitability());
}
