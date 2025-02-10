

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        int[] list1 = new int[]{1,3,4,5,7,9,0,10};
        double averageArray1 = controller.averageList(list1);

        int[] list2 = new int[]{1,3,4,5,7,9,100,11};
        double averageArray2 = controller.averageList(list2);

        controller.compareList(averageArray1, averageArray2);
    }
}