public class ResultadoEscolar {

    public static void main(String[] args) {
        
        int nota = 6;
        if (nota>=7) {
            System.out.println("aprovado");            
        } else if (nota >= 5 &&nota < 7) {
            System.out.println("recuperação");   
        }else{
            System.out.println("aprovado");
        }
    }
}
