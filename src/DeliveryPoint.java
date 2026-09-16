import java.util.List;

public class DeliveryPoint {

    public String name;
    public Addr addr;
    public List<Package> packageList;
    public List<Days> schedule;

    public DeliveryPoint(String name, Addr addr, List<Package> packageList, List<Days> schedule) {
        this.name = name;
        this.addr = addr;
        this.packageList = packageList;
        this.schedule = schedule;
        this.InitializeSchedule();
    }

    private void InitializeSchedule(){

        List<String> week = List.of("Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche");

        for (String aDay : week){
            schedule.add(new Days(aDay, new Schedule("10:30","22:00")));
        }

    }

    public void showSchedule(){

        for (Days aDay : schedule){
            System.out.println(aDay.day + " : " + aDay.schedule.startTime + "-" + aDay.schedule.endTime);
        }

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
