public class ExemploForArray {
    public static void main (String[]args) {

    //em arrays o indice iniciará em 0
        String carros [] = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String carro : carros) {
            System.out.println(carro);
        }

        for (int x=0; x < carros.length; x++) {
            System.out.println("O carro no indice " + x + " = " + carros[x]);
        }  
    }
}
