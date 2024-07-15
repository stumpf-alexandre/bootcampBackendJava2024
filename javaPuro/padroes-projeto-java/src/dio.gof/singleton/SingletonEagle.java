package dio.gof.singleton;
/**
 * Singleton "apressado"
 * 
 */
public class SingletonEagle {
    private static SingletonEagle instancia = new SingletonEagle();

    private SingletonEagle() {
        super();
    }

    public static SingletonEagle getInstance() {
        return instancia;
    }
}