import javax.swing.JOptionPane;

public class Lista {

    // Atributo
    private Nodo punta;

    // Constructor
    public Lista() {
        punta = null;
    }

    public void InsertarFinal(int d) {
        Nodo x = new Nodo(d), p = punta;
        if (punta == null) {
            punta = x;
        } else {
            while (p.getLiga() != null) {
                p = p.getLiga();
            }
            p.setLiga(x);
        }

    }

    public void MostrarLista() {

        // Nodo p = Punta;
        Nodo p;
        String s = "";
        for (p = punta; p != null; p = p.getLiga()) {
            s = s + "|" + p.getDato() + "|-->";
        }

        JOptionPane.showMessageDialog(null, s);

    }

    public void Ordenar() {

        Nodo p = punta, s = null, q = p.getLiga(), as = null;

        while (p != null) {

            s = punta; // s inicia en la punta de la lista
            q = punta.getLiga(); // q inicia en el siguente de la punta
            as = s; // as inicia donde esta s, esta determina el antes de s

            while (q != null) {

                //primera condicion si punta es el mayor
                if (s == punta && (q.getDato() < s.getDato())) {
                    s = q;
                    punta.setLiga(q.getLiga());
                    s.setLiga(punta);
                    punta = s;
                    q = s.getLiga();
                    as = s;
                    s = s.getLiga();
                }

                // cuando los s es mayor a q y son consecuentes que se da en todos los casos
                if (q.getDato() < s.getDato() && s.getLiga() == q) {
                    s.setLiga(q.getLiga());
                    q.setLiga(s);
                    as.setLiga(q);
                    s = as.getLiga();
                    q = q.getLiga();
                }
                
                as = s;// as se queda donde estaba s
                s = s.getLiga(); // s se mueve 
                q = q.getLiga(); // q se mueve
                
            }
            p = p.getLiga();
        }
    }

    public boolean Vacio() { // return true if the list is empty
        return punta == null ? true : false;
    }

}