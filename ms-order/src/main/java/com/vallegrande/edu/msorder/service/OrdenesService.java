package com.vallegrande.edu.msorder.service;

import com.vallegrande.edu.msorder.model.Ordenes;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrdenesService {

    List<Ordenes> findAll();

    Ordenes create(Ordenes ordenes);

    Ordenes update(Ordenes ordenes);

    void delete(String id);
}
