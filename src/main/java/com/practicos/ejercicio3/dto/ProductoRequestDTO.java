package com.practicos.ejercicio3.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductoRequestDTO {

    @NotBlank(message = "{producto.nombre.notblank}")
    @Size(min = 3,max = 100,message = "{producto.nombre.size}")
    private String nombre;

    @Size(max = 500,message = "{producto.descripcion.size}")
    private String descripcion;

    @NotNull(message = "{producto.precio.notnull}")
    @Positive(message = "{producto.precio.positive}")
    @DecimalMax(value = "99999.99", message = "{producto.precio.decimalmax}")
    private BigDecimal precio;

    @NotNull(message = "producto.stock.notnull")
    @Min(value = 0, message = "{producto.stock.min}")
    @Max(value = 9999, message = "{producto.stock.max}")
    private Integer stock;

    @NotBlank( message = "{producto.emailProveedor.notblank}")
    @Email(message = "{producto.emailProveedor.email}")
    private String emailProveedor;

    @Future(message = "{producto.fechaVencimiento.future}")
    private LocalDate fechaVencimiento;

    @Pattern(regexp = "[A-Z]{3}-\\d{4}")
    private String codigoSKU;


    
    public ProductoRequestDTO() {
    }

    public ProductoRequestDTO(
            @NotBlank(message = "{producto.nombre.notblank}") @Size(min = 3, max = 100, message = "{producto.nombre.size}") String nombre,
            @Size(max = 500, message = "{producto.descripcion.size}") String descripcion,
            @NotNull(message = "{producto.precio.notnull}") @Positive(message = "{producto.precio.positive}") @DecimalMax(value = "99999.99", message = "{producto.precio.decimalmax}") BigDecimal precio,
            @NotNull(message = "producto.stock.notnull") @Min(value = 0, message = "{producto.stock.min}") @Max(value = 9999, message = "{producto.stock.max}") Integer stock,
            @NotBlank(message = "{producto.emailProveedor.notblank}") @Email(message = "{producto.emailProveedor.email}") String emailProveedor,
            @Future(message = "{producto.fechaVencimiento.future}") LocalDate fechaVencimiento,
            @Pattern(regexp = "[A-Z]{3}-\\d{4}") String codigoSKU) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.emailProveedor = emailProveedor;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSKU = codigoSKU;
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

    
}
