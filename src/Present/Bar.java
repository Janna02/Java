package Present;

public class Bar extends Sweet {

    private boolean white;
    public Bar(String name, double weight, float cost, boolean white) {
        super(name, weight, cost);
        setWhite(white);
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isWhite() {
        return white;
    }

    public String toString() {
        return "Батончик: " + getName() + ", Вес: " + getWeight() + ", Стоимость: " +getCost()+ ", Белый шоколад: " + isWhite();
    }
}
