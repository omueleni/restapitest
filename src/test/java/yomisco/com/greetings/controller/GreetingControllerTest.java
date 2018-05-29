package yomisco.com.greetings.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import yomisco.com.greetings.config.TestAppConfig;

/**
 * Created by kogbe on 28/05/2018.
 */


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestAppConfig.class})
@WebAppConfiguration

public class GreetingControllerTest {

   @Test
   public void   greetingsHi(){

   }

    @Test
    public void   greetingsBye(){

    }



}
