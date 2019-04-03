package fw.proxy.dynamicproxy.cglibproxy;

import fw.proxy.Car;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 16:33
 * @Description:
 */
public class CGLibFourSTest {

    public static void main(String[] args) {

        CGLibFourS cgLibFourS=new CGLibFourS();
        BMW car = (BMW) cgLibFourS.getInstance(BMW.class);
        car.sell();

        BMW car1 = (BMW) cgLibFourS.getInstance(BMW.class);
        car1.myMethod();

    }
}
