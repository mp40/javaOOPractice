package udemyRocketSimulator;

public abstract class Rocket {

    int cost;
    int weight;
    int maxWeightWithCargo;

    public int getRocketCostInMillions() {
        return cost;
    }

    void setRocketCostInMillions(int cost) {
        this.cost = cost;
    }

    public int getRocketWeightInTonnes() {
        return weight;
    }

    void setRocketWeightInTonnes(int weight) {
        this.weight = weight;
    }

    public int getMaxWeightWithCargo() {
        return maxWeightWithCargo;
    }

    void setMaxWeightWithCargo(int maxWeightWithCargo) {
        this.maxWeightWithCargo = maxWeightWithCargo;
    }

    Rocket() {

    }

    boolean canCarry(Item item) {
        int itemWeightInTonnes = item.weight / 1000;
        int totalWeight = this.weight + itemWeightInTonnes;
        return totalWeight <= this.maxWeightWithCargo;
    }

    void carry(Item item) {
        int itemWeightInTonnes = item.weight / 1000;
        this.weight = this.weight + itemWeightInTonnes;
    }

}
