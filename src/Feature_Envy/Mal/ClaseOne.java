/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feature_Envy.Mal;

/**
 *
 * @author san_t
 */
public class ClaseOne {
    public void resolution(ClaseTwo cs){
        cs.llenar(cs.getNomCal(), cs.getNomOpe(), cs.getNomPro(), cs.getCant());
        cs.est(cs.isEstado(), cs.getNomRes());
    }
}
