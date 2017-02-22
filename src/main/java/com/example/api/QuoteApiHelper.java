package com.example.api;

import com.example.dto.MyCoolQuote;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jasonskipper on 2/22/17.
 */
public class QuoteApiHelper {

        public MyCoolQuote getQuote() {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

            HttpEntity entity = new HttpEntity(headers);

            HttpEntity response = restTemplate.exchange("http://gturnquist-quoters.cfapps.io/api/random", HttpMethod.GET, entity, MyCoolQuote.class);
            return (MyCoolQuote)response.getBody();
        }

}
