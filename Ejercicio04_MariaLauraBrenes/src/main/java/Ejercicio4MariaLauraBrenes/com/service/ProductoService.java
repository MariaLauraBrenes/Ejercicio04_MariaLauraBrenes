/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio4MariaLauraBrenes.com.service;

import Ejercicio4MariaLauraBrenes.com.domain.Producto;
import java.util.List;

public interface ProductoService {

    public List<Producto> getProductos(boolean activo);

    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
    
    public List<Producto> findByActivoAndExistenciasGreaterThanOrderByPrecioDesc(boolean activo, int existenciasMin);

}
