package fp2.poo.pfpNVT2454;

import java.util.Comparator;

import fp2.poo.utilidades.RecursoLocalInterfaz;

public class OrdenacionRecursoPorAccesos implements Comparator<RecursoLocalInterfaz> {
  public int compare(RecursoLocalInterfaz o1, RecursoLocalInterfaz o2) {
    return Integer.compare(o1.getNumAccesos(), o2.getNumAccesos());	
  }
}
