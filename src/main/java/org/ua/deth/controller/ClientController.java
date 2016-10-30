package org.ua.deth.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.ua.deth.entitys.Client;
import org.ua.deth.service.AddressService;
import org.ua.deth.service.ClientService;
import org.ua.deth.service.CountryService;
import org.ua.deth.service.PhoneService;

import javax.servlet.http.HttpSession;


@Controller
public class ClientController {

    final ClientService clientService;

    public ClientController(ClientService clientService, AddressService addressService, PhoneService phoneService, CountryService countryService) {
        this.clientService = clientService;
    }

    @RequestMapping(value = "/client.html", method = RequestMethod.GET)
    public ModelAndView getPage(ModelAndView modelAndView) {
        modelAndView.addObject("clientF", new Client());
        modelAndView.setViewName("client");
        return modelAndView;
    }

    @RequestMapping(value = "/addClient", method = RequestMethod.POST)
    public ModelAndView client(ModelAndView modelAndView, @ModelAttribute("clientF") Client client, HttpSession session) {

        session.setAttribute("client", client);

        modelAndView.setViewName("redirect:addAddress.html");
        return modelAndView;
    }


}
