package lambdas;

import java.util.ArrayList;
import java.util.List;

public class TablaConversion {
    private List<Conversor> conversores = new ArrayList<>();

    public void addConversor(Conversor conversor) {
        conversores.add(conversor);
    }

    public String generaTabla() {
        StringBuffer sb = new StringBuffer();

        for (int grados = 0; grados <= 100; grados += 10) {
            for (Conversor conversor: conversores) {
                sb.append(conversor.convierte(grados));
                sb.append(" , ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
