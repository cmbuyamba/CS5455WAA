package edu.mum.cs.cmbk.controller;

import edu.mum.cs.cmbk.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class AdviceController {
    @Autowired
    AdviceService adviceService;

    @RequestMapping(value = "/advice", method = RequestMethod.GET)
    public String adviceForm(Model model) {

        Map<Integer, String> roasts = adviceService.getAllRoasts();
        System.out.println(roasts);
        model.addAttribute("roasts", roasts);

        return "advice";
    }

    @RequestMapping(value = "/advice", method = RequestMethod.POST)
    public String adviceList(Integer roastKey, Model model) throws Exception {

        String roast = adviceService.getRoast(roastKey);
        List<String> advices = adviceService.getListByType(roast);

        model.addAttribute("roast", roast);
        model.addAttribute("advices", advices);

        return "display";

    }
}
