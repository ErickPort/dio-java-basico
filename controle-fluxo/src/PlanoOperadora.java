public class PlanoOperadora {
    public static void main(String[]args){

        String plano = "A";

        switch (plano) {
            
            case "A":
                System.out.println("Plano A - R$ 100,00");
                System.out.println("instagram + tiktok");
                break;

            case "B":
                System.out.println("Plano B - R$ 150,00");
                System.out.println("whatsapp + tiktok");
                break;

            case "C":
                System.out.println("Plano C - R$ 200,00");
                System.out.println("youtube + tiktok");
                break;
            default:
                System.err.println("Plano inválido");
        }


    }
}
