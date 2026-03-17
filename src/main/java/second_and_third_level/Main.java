package second_and_third_level;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        OnlineWorker worker = new OnlineWorker("Ines", "Salvans", 20);
        JsonFileSaver.saveObjectInJsonFile(worker);

        System.out.println(AnnotationChecker.checkIfToJsonFileAnnotationIsRegistered(worker));
    }
}
