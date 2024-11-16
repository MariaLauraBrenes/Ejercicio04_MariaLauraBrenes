/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4MariaLauraBrenes.com.service.impl;

import Ejercicio4MariaLauraBrenes.com.dao.ProductoDao;
import Ejercicio4MariaLauraBrenes.com.domain.Producto;
import Ejercicio4MariaLauraBrenes.com.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

     @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
    
    @Override
@Transactional(readOnly = true)
public List<Producto> findByActivoAndExistenciasGreaterThanOrderByPrecioDesc(boolean activo, int existenciasMin) {
    return productoDao.findByActivoAndExistenciasGreaterThanOrderByPrecioDesc(activo, existenciasMin);
}

    
}
