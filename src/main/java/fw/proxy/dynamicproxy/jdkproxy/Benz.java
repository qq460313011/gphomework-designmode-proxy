package fw.proxy.dynamicproxy.jdkproxy;

import fw.proxy.Car;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 16:14
 * @Description:
 */
public class Benz implements Car {
    public void sell() {
        System.out.println("卖奔驰汽车");
    }

    public void myMethod() {
        System.out.println("奔驰汽车的自有方法");
    }
}
