/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio4MariaLauraBrenes.com.dao;

import Ejercicio4MariaLauraBrenes.com.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto,Long> {
    //Este query JPA filtra por productos activos con existencias mayores a un número específico y los ordena por precio descendente
public List<Producto> findByActivoAndExistenciasGreaterThanOrderByPrecioDesc(boolean activo, int existenciasMin);  
}

