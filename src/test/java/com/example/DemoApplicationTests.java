package com.example;

import com.example.api.QuoteApiHelper;
import com.example.dto.MyCoolQuote;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
        MyCoolQuote myCoolQuote = new QuoteApiHelper().getQuote();
        System.out.println(myCoolQuote.toString());

	}


}
