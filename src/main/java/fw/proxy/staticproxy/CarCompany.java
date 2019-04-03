package fw.proxy.staticproxy;

import fw.proxy.Car;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 15:53
 * @Description:
 */
public class CarCompany implements Car {
    public void sell() {
        System.out.println("汽车厂商卖汽车");
    }
}
