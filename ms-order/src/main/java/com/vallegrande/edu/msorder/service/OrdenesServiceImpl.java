package com.vallegrande.edu.msorder.service;

import com.vallegrande.edu.msorder.model.Ordenes;
import com.vallegrande.edu.msorder.model.Producto;
import com.vallegrande.edu.msorder.repository.OrdenesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class OrdenesServiceImpl implements OrdenesService{

    @Autowired
    OrdenesRepository ordenesRepository;
    @Autowired
    ProductoService productoService;
    @Override
    public List<Ordenes> findAll() {
        return ordenesRepository.findAll().stream().map(ordenes -> {
         Producto producto = productoService.findByID(ordenes.getProductoid());
            ordenes.setNameproduct(producto.getName());
         return ordenes;
        }).collect(Collectors.toList());
    }

    @Override
    public Ordenes create(Ordenes ordenes) {
        return ordenesRepository.save(ordenes);
    }

    @Override
    public Ordenes update(Ordenes ordenes) {
        Optional<Ordenes> optionalProduct = ordenesRepository.findById(ordenes.getId());
        if (!optionalProduct.isPresent()) throw new RuntimeException("No se encontro el producto a actualizar");
        return ordenesRepository.save(ordenes);
    }

    @Override
    public void delete(String id) {
        Optional<Ordenes> optionalProduct = ordenesRepository.findById(id);
        if (!optionalProduct.isPresent()) throw new RuntimeException("No se encontro el producto a eliminar");
        ordenesRepository.deleteById(id);
    }
}
