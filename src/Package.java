public class Package {

    public float weight;
    public String customerFullName;
    public Addr addr;
    public DeliveryPoint deliveryPoint;

    public Package(float weight, String customerFullName, Addr addr, DeliveryPoint deliveryPoint) {
        this.weight = weight;
        this.customerFullName = customerFullName;
        this.addr = addr;
        this.deliveryPoint = deliveryPoint;
        this.deliveryPoint.associatePackage(this);
    }

    public float calcPrice(){
        float price = 0;
        
        if(weight <= 500){
            price += 1.99F;
        } else if (weight <= 2000) {
            price += 3.99F;
        } else if (weight <= 5000) {
            price += 5.99F;
        } else {
            price += 8.99F;
        }

        if(!addr.isInFrance()){
            price += 6F;
        }

        return price;
    }
}
