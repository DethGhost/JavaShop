package org.ua.deth.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ua.deth.dao.service.ClientService;
import org.ua.deth.entitys.Client;

@Controller
@RequestMapping("/client.html")
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping(method = RequestMethod.GET)
    public String listItems(Model model) {
        model.addAttribute("item", new Client());
        model.addAttribute("listItems", this.clientService.showAll());
        return "WEB-INF/pages/client.jsp";
    }


}
