/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package caso2.caso2.dao;


import caso2.caso2.domain.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroDao extends JpaRepository<Genero, Long> {
    
}