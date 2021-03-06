package bsu;
import bsu.tasks.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte taskNumber = -1;
        while (taskNumber != 0){
            System.out.print("\nВведите номер задания или 0 для выхода из программы: ");
            Scanner in = new Scanner(System.in);
            taskNumber = in.nextByte();

            Task task = null;
            switch (taskNumber){
                case 0:
                    System.out.println("Выход из программы...");
                    break;
                case 1:
                    task = new Task1();
                    break;
                case 2:
                    task = new Task2();
                    break;
                case 3:
                    task = new Task3();
                    break;
                case 4:
                    task = new Task4();
                    break;
                case 5:
                    task = new Task5();
                    break;
                case 6:
                    task = new Task6();
                    break;
                case 7:
                    task = new Task7();
                    break;
                case 8:
                    task = new Task8();
                    break;
                default:
                    System.out.println("Неправильно введен номер задания!");
                    break;
            }
            if (task != null) {
                task.execute();
            }
        }
    }
}
