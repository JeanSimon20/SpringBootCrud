package com.vallegrande.edu.msorder.service;

import com.vallegrande.edu.msorder.model.Producto;
import org.springframework.stereotype.Service;

@Service
public interface ProductoService {

    Producto findByID(String id);

}
