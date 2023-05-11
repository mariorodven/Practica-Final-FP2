package fp2.poo.pfpNVT2454;

import java.util.Comparator;

import fp2.poo.utilidades.RecursoLocalInterfaz;

public class OrdenacionRecursosPorAccesos implements Comparator<RecursoLocalInterfaz> {
  public int compare(RecursoLocalInterfaz r1, RecursoLocalInterfaz r2) {
    return r1.compareTo(r2);
	
  }
}