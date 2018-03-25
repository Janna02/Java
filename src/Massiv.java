public class Massiv {
    public static void main (String [] args){
        int[] array = new int[20];
        int temp;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 20) - 10);
            System.out.print(array[i] + ", ");
        }

        int ar_max = array[0];
        int armaxindex=0;
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] < ar_max){
                ar_max = array[i];
                armaxindex=i;}

        }
        System.out.println("");
        System.out.println("Максимальный отрицательный"+"   "+ar_max);




        int ar_min = Integer.MAX_VALUE;
        int arminindex=0;
        for (int i = 0; i <array.length; i++)
        {
            if(array[i]>0 && array[i] <ar_min ) {
                ar_min = array[i];
            arminindex=i;}


        }
       System.out.println("Минимальный положительный"+"   "+ar_min);

        temp=array[armaxindex];
        array[armaxindex]=array[arminindex];
        array[arminindex]=temp;


        System.out.println("\nМеняем местами : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }


}
