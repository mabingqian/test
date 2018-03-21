import ZOOKEEPER.DistributedLock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Properties;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class ZKTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        DistributedLock distributedLock = (DistributedLock) context.getBean("zkLock");

        distributedLock.lock();
        if (distributedLock != null) {
            distributedLock.unlock();
        }
    }
}
