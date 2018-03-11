package pattern.factory;

/**
 * @author Yue
 * @since 2018/3/10
 */
public class PizzaStoreA extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("A")) return new PizzaA();
        else return null;
    }
}
