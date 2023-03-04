package HomeWork5;

public class ProgramComputer {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.processor = "Intel"; // марка производителя
        computer.ram = 8; // в гигабайтах
        computer.hardDisk = 500; // гигов
        computer.workResource = 3; // количество допустимых полных циклов работы

        computer.description();
        while (computer.isWorking) {
            computer.inclusion();
            computer.shutdown();
        }
        computer.launchAttempt();
    }
}
