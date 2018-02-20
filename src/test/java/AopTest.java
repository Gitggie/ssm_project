import com.wlj.aop.HelloWorld;
import com.wlj.aop2.BraveKnight;
import com.wlj.aop3.PersonServer;
import com.wlj.aop4.Mouse;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void aop3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
        PersonServer bean = (PersonServer) ctx.getBean("personServiceBean");
        bean.save(null);
    }

    @Test
    public void aop2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        BraveKnight br = (BraveKnight) ac.getBean("knight");
        br.saying();
    }

    @Test
    public void aop1() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
        HelloWorld hw1 = (HelloWorld) ctx.getBean("helloWorldImpl1");
        HelloWorld hw2 = (HelloWorld) ctx.getBean("helloWorldImpl2");

        System.out.println("哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈^_^");
        hw1.printHelloWorld();
        System.out.println("哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈^_^");
        hw1.doPrint();

        System.out.println("哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈^_^");
        hw2.printHelloWorld();
        System.out.println("哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈^_^");
        hw2.doPrint();

    }

    @Test
    public void aop4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Mouse m = (Mouse) applicationContext.getBean("mouse");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(m.click());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        m.move();
    }
}
