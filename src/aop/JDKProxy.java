package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Yue Lin
 * @since 2018-04-08
 */
public class JDKProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        method.invoke()
        return null;
    }
}
