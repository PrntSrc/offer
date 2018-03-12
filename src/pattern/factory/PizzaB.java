package pattern.factory;

/**
 * @author Yue
 * @since 2018/3/10
 */
public class PizzaB extends Pizza {

    public PizzaB() {
        System.out.println(this.getClass().getName());
    }

    public void cut() {
        System.out.println("cut B");
    }

    public void fire() {

    }

}
