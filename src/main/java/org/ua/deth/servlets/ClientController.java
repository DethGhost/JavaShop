package org.ua.deth.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.ua.deth.dao.service.AddressService;
import org.ua.deth.dao.service.ClientService;
import org.ua.deth.dao.service.CountryService;
import org.ua.deth.dao.service.PhoneService;

import javax.servlet.http.HttpSession;

@Controller
public class ClientController {

    final ClientService clientService;
    final AddressService addressService;
    final PhoneService phoneService;
    final CountryService countryService;

    @Autowired
    public ClientController(ClientService clientService, AddressService addressService, PhoneService phoneService, CountryService countryService) {
        this.clientService = clientService;
        this.addressService = addressService;
        this.phoneService = phoneService;
        this.countryService = countryService;
    }

    @RequestMapping(value = "/client.html", method = RequestMethod.GET)
    public String getPage(HttpSession session) {
        session.setAttribute("countries", countryService.showCountries());
        return "client";
    }


    @RequestMapping(value = "/addClient", method = RequestMethod.POST)
    public String client(Model model, @RequestParam("curCountry") String countryId) {
        model.addAttribute("listItems", this.clientService.showAll());
        return "redirect:client.html";
    }


}
