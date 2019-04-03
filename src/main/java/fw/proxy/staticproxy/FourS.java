package fw.proxy.staticproxy;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 15:54
 * @Description:
 */
public class FourS  {

    private CarCompany carCompany;

    public FourS(CarCompany carCompany){
        this.carCompany=carCompany;
    }

    public void sell()
    {
        System.out.println("4s店招揽顾客");
        carCompany.sell();
        System.out.println("4s店收取一定费用");
    }
}
