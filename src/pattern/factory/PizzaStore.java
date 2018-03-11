package pattern.factory;

/**
 * @author Yue
 * @since 2018/3/10
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.cut();
        pizza.fire();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
