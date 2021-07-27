package com.was.springservices.controller;

import com.was.springservices.entity.ProductDetail;
import com.was.springservices.repository.ProductDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/products")
public class ControllerServices {
    private final ProductDetailRepository repository;
    @Autowired
    public  ControllerServices(ProductDetailRepository repository){
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable findAll(){
        return  repository.findAll();
    }
    @RequestMapping(method = RequestMethod.POST)
    public ProductDetail create(@RequestBody ProductDetail detail){
        return (ProductDetail) repository.save(detail);
    }
}
