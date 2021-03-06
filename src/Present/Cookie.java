package Present;

public class Cookie extends Sweet {
    private String type;
    public Cookie(String name, double weight, float cost, String type) {
        super(name, weight, cost);
        setType(type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Печенье: " + getName() + ", Вес: " + getWeight() + ", Стоимость: " +getCost()+ ", Вид: " + getType();
    }
}
