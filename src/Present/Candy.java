package Present;

public class Candy extends Sweet {
    private String flavor;
    public Candy (String name, double weight, float cost, String flavor) {
        super(name, weight,cost);
        setFlavor(flavor);
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return "Конфеты: " + getName() + ", Вес: " + getWeight() + ", Стоимость: " +getCost()+ ", Вкус: " + getFlavor();
    }

}
