package com.practicos.ejercicio3.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practicos.ejercicio3.dto.ProductoRequestDTO;
import com.practicos.ejercicio3.dto.ProductoResponseDTO;
import com.practicos.ejercicio3.model.Producto;

@Service
public class ProductoService {
    
    private long idCounter = 0;
    private List<Producto> productos = new ArrayList<>();

    public ProductoResponseDTO crearProducto(ProductoRequestDTO requestDTO){
        Producto producto = mapearAProducto(requestDTO);
        producto.setId(++idCounter);
        producto.setFechaRegistro(LocalDateTime.now());
        productos.add(producto);
        return mapearAResponse(producto);
    }

    private Producto mapearAProducto(ProductoRequestDTO requestDTO){
        Producto producto = new Producto();
        producto.setNombre(requestDTO.getNombre());
        producto.setDescripcion(requestDTO.getDescripcion());
        producto.setPrecio(requestDTO.getPrecio());
        producto.setStock(requestDTO.getStock());
        producto.setEmailProveedor(requestDTO.getEmailProveedor());
        producto.setFechaVencimiento(requestDTO.getFechaVencimiento());
        producto.setCodigoSKU(requestDTO.getCodigoSKU());
        return producto;
    }

    private ProductoResponseDTO mapearAResponse(Producto producto){
        ProductoResponseDTO responseDTO = new ProductoResponseDTO();
        responseDTO.setId(producto.getId());
        responseDTO.setNombre(producto.getNombre());
        responseDTO.setPrecio(producto.getPrecio());
        responseDTO.setStock(producto.getStock());
        responseDTO.setCodigoSKU(producto.getCodigoSKU());
        responseDTO.setFechaRegistro(producto.getFechaRegistro());
        responseDTO.setEstadoStock(calcularEstadoStock(producto.getStock()));
        return responseDTO;
    }

    private String calcularEstadoStock(Integer stock){
        if (stock == 0){
            return "SIN STOCK";
        }
        if (stock < 10){
            return "STOCK BAJO";
        }
        return "DISPONIBLE";
    }
}
