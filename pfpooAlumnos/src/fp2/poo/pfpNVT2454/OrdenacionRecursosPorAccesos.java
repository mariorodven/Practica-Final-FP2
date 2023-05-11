package fp2.poo.pfpNVT2454;
import fp2.poo.pfpNVT2454.Solicitud;
import java.util.Comparator;
import java.util.Collections;
public class OrdenacionRecursosPorAccesos implements Comparator<Solicitud> {
  public int compare(Solicitud s1, Solicitud s2) {
    return Integer.compare(s1.getNumAcceso(), s2.getNumAcceso());
  }
}
