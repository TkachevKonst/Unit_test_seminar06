import Model.IntList;

public class Controller {
    IntList intList;

    public Controller(){
        this.intList = new IntList();
    }

    public double averageList(int[] list) {
        return intList.averageList(list);
    }

    public void compareList(double resultAverage1, double resultAverage2){
        intList.compareList(resultAverage1, resultAverage2);
    }

}
