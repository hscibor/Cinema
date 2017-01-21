
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Damian
 */
@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class glowna {
    public String getMessage(){
        return "Pierwsza strona!";
    }
    
}
