package proxy_pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Evgeny Borisov
 */
public class ProxyCreatorFactory {

    public <T,E extends T> E createProxy(Class<T> ifc) {
        Object proxy = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{ifc}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println(method.getName()+" was invoked");
                System.out.println("blablablablab");

                return null;
            }
        });
        return (E) proxy;
    }


}
