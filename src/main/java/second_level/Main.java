package second_level;

public class Main {
    public static void main(String[] args){
        OnlineWorker worker = new OnlineWorker("Ines", "Salvans", 20, 10);
        JsonFileSaver.saveObjectInJsonFile(worker);
    }
}
