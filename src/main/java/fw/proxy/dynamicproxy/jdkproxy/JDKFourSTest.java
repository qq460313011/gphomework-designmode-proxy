package fw.proxy.dynamicproxy.jdkproxy;

import fw.proxy.Car;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 16:13
 * @Description:
 */
public class JDKFourSTest {

    public static void main(String[] args) {

        //动态代理可以实现约定接口的对象，不能代理普通的类,也不能代理非接口中的方法
        JDKFourS jdkFourS=new JDKFourS();
        Car car= (Car) jdkFourS.getInstance(new Benz());
        car.sell();


    }
}
