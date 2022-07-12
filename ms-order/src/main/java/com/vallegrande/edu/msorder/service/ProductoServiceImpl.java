package com.vallegrande.edu.msorder.service;

import com.vallegrande.edu.msorder.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    RestTemplate restTemplate;
    @Override
    public Producto findByID(String id) {
            Producto producto = restTemplate.getForObject("http://localhost:8081/ms-product/v1/products/"+id,Producto.class);
        return producto;
    }
}
