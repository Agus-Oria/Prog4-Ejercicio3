package com.practicos.ejercicio3.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Producto {
    
    private Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private Integer stock;
    private String emailProveedor;
    private LocalDate fechaVencimiento;
    private String codigoSKU;
    private LocalDateTime fechaRegistro;


    
    public Producto() {
    }


    public Producto(Long id, String nombre, String descripcion, BigDecimal precio, Integer stock, String emailProveedor,
            LocalDate fechaVencimiento, String codigoSKU, LocalDateTime fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.emailProveedor = emailProveedor;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSKU = codigoSKU;
        this.fechaRegistro = fechaRegistro;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public String getEmailProveedor() {
        return emailProveedor;
    }
    public void setEmailProveedor(String emailProveedor) {
        this.emailProveedor = emailProveedor;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getCodigoSKU() {
        return codigoSKU;
    }
    public void setCodigoSKU(String codigoSKU) {
        this.codigoSKU = codigoSKU;
    }
    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
}
