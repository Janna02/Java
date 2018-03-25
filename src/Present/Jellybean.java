package Present;

public class Jellybean  extends Sweet {
    private double inflexibility;
    public Jellybean(String name, double weight, float cost, double inflexibility) {
        super(name, weight, cost);
        setInflexibility(inflexibility);
    }

    public void setInflexibility(double inflexibility) {
        this.inflexibility = inflexibility;
    }

    public double getInflexibility() {
        return inflexibility;
    }

    public String toString() {
        return "Мармелад: " + getName() + ", Вес: " + getWeight() + ", Стоимость: " +getCost()+ ", Мягкость, сгибаемость : " + getInflexibility();
    }
}
