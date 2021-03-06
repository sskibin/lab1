package bsu.tasks;
import java.io.*;

public class Task3 extends Task {

    private byte kol;
    private int [] A;

    @Override
    protected int getTaskNumber() {
        return 3;
    }

    @Override
    protected void welcomeMessage() {
        System.out.println("Выполнение задания " + getTaskNumber() + ":");
    }

    @Override
    protected void readParameters() {
        File file = new File ("Исходник.txt");
        try{
          A = getData(file);
        } catch (IOException e){
           System.out.println("Ошибка чтения исходных данных!");
        }
    }

    @Override
    protected void executeTask() {
        //Подсчитать количество отрицательных чисел среди чисел а, b, с.
        kol = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] < 0) {
                kol++;
            }
        }
    }

    @Override
    protected void writeResults() {
        System.out.print("Количество отрицательных чисел в файле: " + kol);
        filewriter();
    }

    @Override
    protected String getResultString() {
            return "Задание №" + getTaskNumber() + ". Ответ: количество отрицательных чисел в файле равно " + kol;
    }
}
