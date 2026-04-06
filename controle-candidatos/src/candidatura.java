import java.util.concurrent.ThreadLocalRandom;
public class candidatura{
    public static void main(String[] args) throws Exception {
        System.out.println("Processo de candidatura iniciado...");
        imprimirSelecionados();

    }

    static void imprimirSelecionados(){
        String [] candidatos = {"João", "Maria", "Pedro", "Ana", "Lucas", "Carla", "Rafael", "Beatriz", "Gustavo", "Fernanda"};
        System.out.println("Imprimindo a lista de candidatos informado o indice do elemento:");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de numero " + (indice + 1) + " é " + candidatos[indice]);
        }   
        System.out.println("Forma abreviada da interação for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }






    static void selecaoCandidato(){
        String [] candidatos = {"João", "Maria", "Pedro", "Ana", "Lucas", "Carla", "Rafael", "Beatriz", "Gustavo", "Fernanda"};

        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while(candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " pretende um salário de R$" + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato  " + candidato + "  foi selecionado para a vaga.");
                candidatoSelecionado++;
            }
            candidatoAtual++;
        }

    }

    static double  valorPretendido(){
        return  ThreadLocalRandom.current().nextDouble(1800.00, 2500.00);  
    }

        static void analisarCandidato(double salarioPretendido  ) {
    
            double salarioBase = 2000.00;
            if(salarioBase> salarioPretendido){
                    System.out.println("Ligar para o candidato");
            }else if(salarioBase < salarioPretendido){
                    System.out.println("Aguardar novo contato do candidato");
            }else if (salarioBase == salarioPretendido) {
                    System.out.println("Ligar para o candidato e oferecer contra proposta  ");
            }
        }
    

        }
    
