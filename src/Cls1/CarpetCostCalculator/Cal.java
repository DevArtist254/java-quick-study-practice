package Cls1.CarpetCostCalculator;

public class Cal {
    private Floor floor;
    private Carpet carpet;

    public Cal(Floor floor, Carpet carpet){
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost(){
        return carpet.getCost() * floor.getArea();
    }
}
