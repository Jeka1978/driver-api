package proxy_pattern;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ProxyCreatorFactory factory = new ProxyCreatorFactory();
        StamService stamService = factory.createProxy(StamService.class);
        stamService.a();
        stamService.b();
    }
}
