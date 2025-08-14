/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package caso2.caso2.Controller;

import caso2.caso2.domain.Funcion;
import caso2.caso2.service.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcion")
public class FuncionController {

    @Autowired
    private FuncionService funcionService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var funciones = funcionService.getFunciones(false);
        model.addAttribute("funciones", funciones);
        model.addAttribute("totalFunciones", funciones.size());
        return "/funcion/listado";
    }

    @GetMapping("/nuevo")
    public String funcionNueva(Funcion funcion) {
        return "/funcion/modifica";
    }

    @PostMapping("/guardar")
    public String funcionGuardar(Funcion funcion) {        
        funcionService.save(funcion);
        return "redirect:/funcion/listado";
    }

    @GetMapping("/eliminar/{idFuncion}")
    public String funcionEliminar(Funcion funcion) {
        funcionService.delete(funcion);
        return "redirect:/funcion/listado";
    }

    @GetMapping("/modificar/{idFuncion}")
    public String funcionModificar(Funcion funcion, Model model) {
        funcion = funcionService.getFuncion(funcion);
        model.addAttribute("funcion", funcion);
        return "/funcion/modifica";
    }   
}