package pattern.factory;

/**
 * @author Yue
 * @since 2018/3/10
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore storeA = new PizzaStoreA();
        PizzaStore storeB = new PizzaStoreB();
        storeA.orderPizza("A");
        storeB.orderPizza("B");
    }
}
