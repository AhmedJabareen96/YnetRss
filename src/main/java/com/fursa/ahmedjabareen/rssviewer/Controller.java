package com.fursa.ahmedjabareen.rssviewer;

import com.sun.syndication.io.FeedException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;


@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("/list")
    public ModelAndView list(Model model) throws IOException, FeedException {
        Entity entity = new Entity("http://www.ynet.co.il/Integration/StoryRss2.xml");
        model.addAttribute("newslist",entity.getData());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news");
        return modelAndView;
    }


}
