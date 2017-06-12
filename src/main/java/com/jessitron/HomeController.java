package com.jessitron;

import com.jessitron.surveyStore.GetYourSurveysHere;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/")
    public String home() {
        return "Hello Atomist World";
    }

    private GetYourSurveysHere thing = new GetYourSurveysHere();


        @CrossOrigin()
        @RequestMapping(path = "/survey")
        public Survey survey(@RequestParam(value = "seed") int seed)
        {
            return new Survey("Survey " + seed, seed,
                    thing.optionsByTitle("Survey " + seed));
        }



}
