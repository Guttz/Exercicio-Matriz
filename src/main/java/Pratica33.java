import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica33 {

    public static void main(String[] args) {
        Matriz orig = new Matriz(3, 3);
        Matriz novaMatriz = new Matriz(3, 3);
       
        double[][] m = orig.getMatriz();
        double[][] m2 = novaMatriz.getMatriz();
       
        m[0][0] = 1.0;
        m[0][1] = 1.0;
        m[0][2] = 1.0;
        m[1][0] = 1.0;
        m[1][1] = 1.0;
        m[1][2] = 1.0;
        m[2][0] = 1.0;
        m[2][1] = 1.0;
        m[2][2] = 1.0;
        
        m2[0][0] = 1.0;
        m2[0][1] = 1.0;
        m2[0][2] = 1.0;
        m2[1][0] = 1.0;
        m2[1][1] = 1.0;
        m2[1][2] = 1.0;
        m2[2][0] = 1.0;
        m2[2][1] = 1.0;
        m2[2][2] = 1.0;
        
        System.out.println("Matriz original: " + orig);
        
        Matriz Soma = orig.soma(novaMatriz);
        System.out.println("A soma é: " + Soma);
        
        Matriz Produto = orig.prod(novaMatriz);
        System.out.println("O produto é:" + Produto);
      
    }
}
