public class cursoJava {
    public static void main(String[] args){
        
        System.out.println(soma2(2,2));
        System.out.println(soma(10,10,10));        
        msg("CFB Cursos e uma string", 1);  
    }

    public static int soma(int... numeros){
        int res = 0;
        for (int n : numeros) {
            res +=n;
        }
        return res;

    }

    public static int soma2(int n1, int n2) {
        int res = n1 + n2;
        return res;
    }

    public static void msg(String m, int l){
        for (int i = 0; i < l; i++) {
            System.out.println(m);    
        }
        
    }
}
