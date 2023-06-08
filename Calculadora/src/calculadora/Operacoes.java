package calculadora;

public class Operacoes {
    public static int soma(int a,int b){
      int resultado;
        
      resultado = a + b;
              
      return resultado;  
    }
    public static int subtracao(int a,int b){
      int resultado;
        
      resultado = a - b;
      
      return resultado;   
    }
    public static int multiplicacao(int a,int b){
      int resultado;
      
      resultado = a * b;
      
      return resultado;  
    }
    public static int divisao(int a,int b){
      int resultado;
      
      resultado = a / b;
      
      return resultado;    
    }
    public static int calculo(int a, int b, String sinal){
        int resultado = 0;
        
        switch(sinal){
            case "soma":
                resultado = soma(a,b);
            break;
            
            case "subtracao":
                resultado = subtracao(a,b);
            break;
            
            case "multiplicacao":
                resultado = multiplicacao(a,b);
            break;
            
            case "divisao":
                resultado = divisao(a,b);
            break;
                
        }
        return resultado;
    }
}
