package com.vallegrande.edu.msorder.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "order")
public class Ordenes {

    @Id
    private String id;
    private String cliente;
    private String productoid;
    private String nameproduct;
    private Date fecha;

    public String getNameproduct() {

        public void setNameproduct(String nameproduct) {
            this.nameproduct = nameproduct;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCliente() {
            return clienreturn nameproduct;
    }
te;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProductoid() {
        return productoid;
    }

    public void setProductoid(String productoid) {
        this.productoid = productoid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
