package net.jikuodong.springcloud.service;

import net.jikuodong.springcloud.client.ProductClientRibbon;
import net.jikuodong.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * describe 服务类
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName ProductService.java
 * @createTime 2019年06月18日 14:39:00
 */
@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();
    }
}
