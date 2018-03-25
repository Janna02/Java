public class Four {
    public static void main (String [] args){
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 20) - 10);
            System.out.println(array[i]);
        }
    }
}
