import java.util.List;

public class DeliveryPoint {

    public String name;
    public Addr addr;
    public List<Package> packageList;

    public DeliveryPoint(String name, Addr addr, List<Package> packageList) {
        this.name = name;
        this.addr = addr;
        this.packageList = packageList;
    }

    public float calcProfitability(){
        float sum = 0;

        for (Package aPackage : packageList) {
            sum += aPackage.calcPrice();
        }

        return sum;
    }

    public void associatePackage(Package pack){
        this.packageList.add(pack);
    }

}
