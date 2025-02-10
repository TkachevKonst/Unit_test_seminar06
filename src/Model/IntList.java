package Model;

public class IntList implements List{

    @Override
    public void compareList(double resultAverage1, double resultAverage2) {
        if(resultAverage1 == resultAverage2) {
            System.out.println("Средние значения равны");
        } else if (resultAverage1 > resultAverage2) {
            System.out.println("Первый список имеет большее среднее значение");
        } else {
            System.out.println("Второй список имеет большее среднее значение");
        }
    }

    @Override
    public double averageList(int[] list) {
        double sum = 0;
        for (int j : list) {
            sum = sum + j;
        }
        double resultAverage = Math.round(sum / list.length);
        System.out.println("\nСреднее значение = " + resultAverage + ".\n");
        return resultAverage;
    }
}
