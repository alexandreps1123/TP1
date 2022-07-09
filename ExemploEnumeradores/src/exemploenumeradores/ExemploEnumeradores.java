package exemploenumeradores;

public class ExemploEnumeradores {

    public static void main(String[] args) {

        LivroDeBiblioteca javaComoProgramar = new LivroDeBiblioteca("Java como programar",
                                                "Paul Deitel, Harvey Deitel", (short) 934, 
                                                (short) 2017, "Pratileira A");

        javaComoProgramar.modificarEmprestimo(Estado.EMPRESTA);
        
        System.out.println(javaComoProgramar.toString());
        
        javaComoProgramar.modificarEmprestimo(Estado.DEVOLVE);
        
        System.out.println(javaComoProgramar.toString());
        
    }
    
}
