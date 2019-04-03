package fw.proxy.staticproxy;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 15:56
 * @Description:
 */
public class StaticProxyTest {

    public static void main(String[] args) {

        FourS fourS=new FourS(new CarCompany());
        fourS.sell();

    }
}
