public class App {
    public static void main(String[] args) {
        Lista l1 = new Lista();

        l1.InsertarFinal(111180009);
        l1.InsertarFinal(-111180009);
        l1.InsertarFinal(800);
        l1.InsertarFinal(51);
        l1.InsertarFinal(-2);

        l1.MostrarLista();

        l1.Ordenar();

        l1.MostrarLista();
      }
    
}
