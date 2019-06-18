package net.jikuodong.springcloud.controller;

import net.jikuodong.springcloud.pojo.Product;
import net.jikuodong.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * describe 控制器
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName ProductController.java
 * @createTime 2019年06月18日 14:45:00
 */
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(Model model){
        List<Product> ps = productService.listProducts();
        model.addAttribute("ps",ps);
        return "products";
    }
}
