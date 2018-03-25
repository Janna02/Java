package Present;

import java.util.ArrayList;


public class Present {
    public ArrayList<Sweet>sweetArrayList = new ArrayList<Sweet>();
    public ArrayList<Sweet> getSweetArrayList() {
        return sweetArrayList;
    }

    public static void main(String[] args) {
        /*
        Сладости в наличии
         */
        Bar twix = new Bar("Твикс",0.2,45,true);
        Bar kitkat = new Bar("KitKat", 0.1, 50, false);
        Cookie yubileinoe = new Cookie("Юбилейное", 0.3, 70, "Орех и глазурь");
        Jellybean bonpari = new Jellybean("Бон Пари", 0.1, 65, 0.6);
        Candy alpengold = new Candy("AlpenGold", 0.2, 250, "Composition");
        Candy rotFront = new Candy("Коровка", 0.07, 240, "Любимая");
        /*
        Создать подарок, куда будем собирать сладости
         */
        NewYear gift = new NewYear();
        /*
        Кладем в подарок сладости
         */
        gift.getSweetArrayList().add(twix);
        gift.getSweetArrayList().add(kitkat);
        gift.getSweetArrayList().add(yubileinoe);
        gift.getSweetArrayList().add(bonpari);
        gift.getSweetArrayList().add(alpengold);
        gift.getSweetArrayList().add(rotFront);

        /*
        Взвешиваем подарок
         */
        double totalWeight = 0;
        for (Sweet sweets: gift.getSweetArrayList()) {
            totalWeight += sweets.getWeight();
        }
        System.out.printf("Общий вес подарка в кг: " + "%.2f", totalWeight);
        System.out.println("");

        /*
        Общая стоимость подарка
         */
        float totalCost = 0;
        for (Sweet sweet: gift.getSweetArrayList()) {
            totalCost += sweet.getCost();
        }
        System.out.println("Общая стоимость подарка: " + totalCost+" "+"руб.");

        /*
        Подробности о подарке
         */
        System.out.println("В подарке присутствуют сладости:");
        for (Sweet sweet: gift.getSweetArrayList()) {
            System.out.println(sweet.toString());
        }
    }
}



