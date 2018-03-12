package pattern.factory;

/**
 * @author Yue
 * @since 2018/3/10
 */
public class PizzaStoreB extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("B")) return new PizzaB();
        else return null;
    }
}
