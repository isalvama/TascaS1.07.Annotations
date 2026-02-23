package first_level;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args){

        OnlineWorker worker1 = new OnlineWorker("Ines", "Salvans", 20);
        System.out.println(worker1.calculateSalary(30));

        OnlineWorker worker2 = new OnlineWorker("Ines", "Salvans", 20);
        System.out.println(worker2.calculateBasicSalary(85));

        OfficeBasedWorker worker3 = new OfficeBasedWorker("Ines", "Salvans", 20);
        System.out.println(worker3.calculateSalary(30));

        OfficeBasedWorker.setGasPrice(3);

        System.out.println(OfficeBasedWorker.getGasPrice());
    }
}
