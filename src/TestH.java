/**
 * @author Yue Lin
 * @since 2018-04-14
 */
public class TestH {

    public TestH() {
        this(10);
    }

    public TestH(int data) {
        this.data = data;
    }

    public void display() {
//        class Decrementer {
//            public void decrement(){data--;}};
//        Decrementer d = new Decrementer();
//        d.decrement();
        System.out.println("data=" + data);
    }
    private int data;

            class Decrementer {
            public void decrement(double data){data = data - 1.0;}}

    public static void main(String[] args) {
                Integer a = new Integer("32111");
    }
    static char[] getCharArray(byte[] arr) {
                char[] carr = new char[4];
                int i = 0;
                for (byte c : arr) {
                    carr[i] = (char)c++;
                    i++;
                }
                return carr;
    }
}
