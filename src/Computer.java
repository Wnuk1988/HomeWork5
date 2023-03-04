package HomeWork5;

import java.util.Random;

public class Computer extends InputValidation {
    protected String processor;
    protected int ram;
    protected int hardDisk;
    protected int workResource;
    protected static int resource;
    private Random random = new Random();
    protected boolean isWorking = true;

    public void description() {
        System.out.printf("Processor: %s\t ram: %d\t hardDisk: %d\t workResource: %d\n"
                , processor, ram, hardDisk, workResource);
    }

    public void inclusion() {
        if (isWorking && isWorkingLimitExists()) {
            welcome();
            if (userGo == random.nextInt(2)) {
                System.out.println("Вы угадали число, компьютер включается!");
                resource++;
            } else {
                System.out.println("Вы не угадали число, комьютер 'СГОРЕЛ'.");
                isWorking = false;
            }
        }
    }

    public void shutdown() {
        if (isWorking && isWorkingLimitExists()) {
            welcome();
            if (userGo == random.nextInt(2)) {
                System.out.println("Вы угадали число, компьютер выключается!");
                resource++;
            } else {
                System.out.println("Вы не угадали число, комьютер 'СГОРЕЛ'!");
                isWorking = false;
            }
        }
    }

    public boolean isWorkingLimitExists() {
        if (resource < workResource) {
            System.out.printf("Ресурс работы компютера равен: %d\n", resource);
            return true;
        } else {
            System.out.println("Вы привысили лимит ресурса компютера и он 'СГОРЕЛ'!");
            isWorking = false;
            return false;
        }
    }
}