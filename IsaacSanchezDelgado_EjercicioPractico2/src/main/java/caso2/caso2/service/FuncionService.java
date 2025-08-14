/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package caso2.caso2.service;
import caso2.caso2.domain.Funcion;
import java.util.List;

public interface FuncionService {

    // Se obtiene un listado de funciones en un List
    public List<Funcion> getFunciones(boolean activos);

    // Se obtiene una Funcion, a partir del id de una funcion
    public Funcion getFuncion(Funcion funcion);

    // Se inserta una nueva funcion si el id de la funcion está vacío
    // Se actualiza una funcion si el id de la funcion NO está vacío
    public void save(Funcion funcion);

    // Se elimina la funcion que tiene el id pasado por parámetro
    public void delete(Funcion funcion);
}
