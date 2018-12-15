package dk.lagersystem.controller;

import dk.lagersystem.model.Product;
import dk.lagersystem.model.products;
import dk.lagersystem.repository.IProductRepository;
import dk.lagersystem.repository.IProductsOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    IProductRepository iProductRepository;

    @Autowired
    IProductsOld iProductsOld;

    @GetMapping("")
    public String home(Model model){
        model.addAttribute("products", iProductRepository.findAll());
        return "home/index";
    }

    @GetMapping("/{id}")
    public String details(@PathVariable int id, Model model){
        model.addAttribute("product", iProductRepository.getOne(id));
        return "home/details";
    }

    @Transactional
    @GetMapping("/{p_number}/{stock}")
    public String editStock(@PathVariable int p_number, @PathVariable int stock){
        iProductRepository.updateProductsInStock(stock, p_number);
        return "redirect:/home";
    }

    @PostMapping("/update")
    public String updateProduct(@ModelAttribute Product product){
        iProductRepository.save(product);
        return "redirect:/home";
    }

    @GetMapping("/create")
    public String createView(){
        return "home/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product){
        iProductRepository.save(product);
        return "redirect:/home";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        iProductRepository.deleteById(id);
        return "redirect:/home";
    }
}
