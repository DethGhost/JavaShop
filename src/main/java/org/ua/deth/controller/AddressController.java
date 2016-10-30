package org.ua.deth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.ua.deth.entitys.Address;
import org.ua.deth.entitys.Client;
import org.ua.deth.entitys.Phone;
import org.ua.deth.service.AddressService;
import org.ua.deth.service.ClientService;
import org.ua.deth.service.CountryService;
import org.ua.deth.service.PhoneService;

import javax.servlet.http.HttpSession;

@Controller
public class AddressController {
    final AddressService addressService;
    final PhoneService phoneService;
    final CountryService countryService;
    final ClientService clientService;

    @Autowired
    public AddressController(AddressService addressService, PhoneService phoneService, CountryService countryService, ClientService clientService) {
        this.addressService = addressService;
        this.phoneService = phoneService;
        this.countryService = countryService;
        this.clientService = clientService;
    }

    @RequestMapping(value = "/addAddress.html", method = RequestMethod.GET)
    public ModelAndView getAddressPage(ModelAndView modelAndView) {
        modelAndView.addObject("countries", countryService.showCountries());
        modelAndView.setViewName("addAddress");
        modelAndView.addObject("addressForm", new Address());
        modelAndView.addObject("phoneForm", new Phone());
        return modelAndView;
    }

    @RequestMapping(value = "/addAddress", method = RequestMethod.POST)
    public ModelAndView addAddress(@ModelAttribute("addressForm") Address address, @RequestParam("phone") String phone,
                                   @RequestParam("countryId") String countryId, ModelAndView modelAndView, HttpSession session) {
        Phone phone1 = new Phone();
        phone1.setPhone(phone);
        address.setCountry(countryService.showById(Long.parseLong(countryId)));
        Client client = (Client) session.getAttribute("client");
        phone1.setClient(client);
        client.setAddress(address);
        client.getPhoneList().add(phone1);
        addressService.createAddress(address);
        clientService.createClient(client);

        modelAndView.setViewName("clients");
        modelAndView.addObject("listItems", client);
        return modelAndView;
    }
}
