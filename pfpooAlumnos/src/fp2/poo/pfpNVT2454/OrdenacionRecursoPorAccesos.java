package fp2.poo.pfpNVT2454;

import java.util.Comparator;
import fp2.poo.utilidades.RecursoLocalInterfaz;

/**
 * Desctipcion: Esta clase implementa la intefaz Comparator para ordenar una Lista de tipo RecursoLocal 
 * @author Mario Rodríguez Ventura
 * @version 3.3
 */
public class OrdenacionRecursoPorAccesos implements Comparator<RecursoLocalInterfaz> {
  /**
   * Metodo para ordenar los recursos de menor a mayor
   * @param o1 Recurso local a comparar por numero de acceso
   * @param o2
   * @return int
   */
  public int compare(RecursoLocalInterfaz o1, RecursoLocalInterfaz o2) {
    return Integer.compare(o1.getNumAccesos(), o2.getNumAccesos());	
  }
}
