package br.com.ayranandrade.controller;

import br.com.ayranandrade.model.Customer;
import br.com.ayranandrade.persistence.CustomerRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ayran
 */
@Controller
public class CustomerController 
{
@Autowired
private CustomerRepository rep;

    @RequestMapping(value={"/customer","/"},method=RequestMethod.GET)
    public String list(Model model)
    {
    List<Customer> list=rep.findAll();
      if(list.isEmpty())
      {
      return "redirect:/customer/new";
      }
    model.addAttribute("customers",list);
    return "list";
    }
    
    @RequestMapping(value="/customer/remove/{id}")
    public String delete(@PathVariable("id") Long id)
    {
    rep.delete(id);
    return "redirect:/customer";
    }
    
    @RequestMapping(value="/customer",method=RequestMethod.POST)
    public String create(@Valid Customer customer, BindingResult result, 
            Model model)
    {
      if(result.hasErrors())
      {
      model.addAttribute("customer",customer);//Para o formulario não vir vazio
      return "new";
      }
    rep.save(customer);
    return "redirect:/customer";
    }
    
    @RequestMapping(value="/customer/edit/{id}",method = RequestMethod.POST)
    public String edit(@PathVariable("id") Long id,@Valid Customer customer,
            BindingResult result, Model model)
    {
      if(result.hasErrors())
      {
      model.addAttribute("customer",customer);//Para o formulario não vir vazio
      return "edit";
      }
    customer.setId(id);
    rep.save(customer);
    return "redirect:/customer";
    }
    
    @RequestMapping(value="/customer/edit/{id}",method = RequestMethod.GET)
    public String formEdit(@PathVariable("id") Long id, Model model)
    {
    model.addAttribute("customer",rep.findOne(id));
    return "edit";
    }    
    
    @RequestMapping("/customer/new")
    public String formNew()
    {
    return "new";
    }
}