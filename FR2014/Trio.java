
interface MenuItem{
    String getName();
    double getPrice();
}

public class Trio implements MenuItem{
    private String name;
    private double price;
    public Trio(Sandwich sw,Salad sd,Drink dk){
        name=sw.getName()+"/"+sd.getName()+"/"+dk.getName();
        double p1=sw.getPrice(),p2=sd.getPrice(),p3=dk.getPrice();
        price=p1+p2+p3-Math.min(p1,Math.min(p2,p3));
    }
    public String getName() {return name;}
    public double getPrice() {return price;}
}

