package pattern.factory;

/**
 * @author Yue
 * @since 2018/3/10
 */
public class PizzaA extends Pizza {

    public PizzaA() {
        System.out.println(this.getClass().getName());
    }

    public void cut() {
        System.out.println("cut A");
    }

    public void fire() {
        System.out.println("fire A");
    }

}
