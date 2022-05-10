package bsu.tasks;

public class Task1 extends Task {

    private double x,y,z;

    @Override
    protected int getTaskNumber() {
        return 1;
    }

    @Override
    protected void welcomeMessage() {
        //Вычислить значение выражения по формуле
        System.out.println("Выполнение задания " + getTaskNumber() + ":");
    }

    @Override
    protected void readParameters() {
        System.out.print("Введите значение X: ");
        x = getIn().nextDouble();
        System.out.print("Введите значение Y: ");
        y = getIn().nextDouble();
    }

    @Override
    protected void executeTask() {
        //Решение задачи
        z = expression(x, y);
    }

    @Override
    protected void writeResults() {
        System.out.print("Результат вычислений: " + z);
        //Запись результата в файл
        filewriter();
    }

    @Override
    protected String getResultString() {
        String result = "Задание №1. Ответ:  " + z;
        return result;
    }

    //Метод для решения Задания №1
    private double expression (double x, double y){
        double Z = Math.pow(2, -x) - Math.cos(x) + Math.sin(2*x*y);
        return Z;
    }
}
