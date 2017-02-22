package com.example.controller;

import com.example.api.QuoteApiHelper;
import com.example.dto.MyCoolQuote;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jasonskipper on 2/22/17.
 */
@RestController
public class CardController {

    @RequestMapping(path = "/quote")
    public MyCoolQuote getQuote(){
        QuoteApiHelper helper = new QuoteApiHelper();
        MyCoolQuote myCoolQuote = helper.getQuote();
        // return myCoolQuote;
        return new QuoteApiHelper().getQuote();
    }
}
