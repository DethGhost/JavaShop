package org.ua.deth.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ua.deth.dao.service.ClientService;
import org.ua.deth.entitys.Client;

@Controller
public class ClientController {

    final
    ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value = "/client.html", method = RequestMethod.GET)
    public String client(Model model) {
        model.addAttribute("item", new Client());
        model.addAttribute("listItems", this.clientService.showAll());
        return "client";
    }



}
