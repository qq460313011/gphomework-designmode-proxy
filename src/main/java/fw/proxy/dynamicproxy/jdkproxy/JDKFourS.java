package fw.proxy.dynamicproxy.jdkproxy;

import fw.proxy.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 *
 * 实现InvocationHandler接口，写一个getInstance的方法获取实例，通过Proxy.newProxyInstance获取
 * 通过invoke方法调用原对象的方法，执行增强
 * @Auther: Administrator
 * @Date: 2019/4/3 16:04
 * @Description:
 */
public class JDKFourS implements InvocationHandler {

    private Car car;

    public Object getInstance(Car car) {
        this.car = car;
        Class<?> clazz = this.car.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.car, args);
        after();
        return object;
    }

    private void before() {
        System.out.println("4s店开始销售");
    }

    private void after() {
        System.out.println("4s店完成销售");
    }
}
