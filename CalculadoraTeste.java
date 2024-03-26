public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); 
        //testar soma
        double soma = calc.somar(2, 3);
        System.out.println(soma);
        //testar subtração
        double sub = calc.subtrair(5, 1);
        System.out.println(sub);
    }
    
}
