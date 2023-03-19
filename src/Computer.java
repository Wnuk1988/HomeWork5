

import java.util.Random;

public class Computer extends InputValidation {
    protected String processor;
    protected int ram;
    protected int hardDisk;
    protected static final int WORK_RESOURCE = 3;
    protected int usedResource;
    private Random random = new Random();
    protected boolean isWorking = true;

    public void description() {
        System.out.printf("Processor: %s\t ram: %d\t hardDisk: %d\t workResource: %d\n"
                , processor, ram, hardDisk, WORK_RESOURCE);
    }

    public void inclusion() {
        if (isWorking && isWorkingLimitExists()) {
            welcome();
            if (userGo == random.nextInt(2)) {
                System.out.println("Вы угадали число, компьютер включается!");
                usedResource++;
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
                usedResource++;
            } else {
                System.out.println("Вы не угадали число, комьютер 'СГОРЕЛ'!");
                isWorking = false;
            }
        }
    }

    public boolean isWorkingLimitExists() {
        if (usedResource < WORK_RESOURCE) {
            System.out.printf("Ресурс работы компютера равен: %d\n", usedResource);
            return true;
        } else {
            System.out.println("Вы привысили лимит ресурса компютера и он 'СГОРЕЛ'!");
            isWorking = false;
            return false;
        }
    }
}