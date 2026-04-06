public class Debug {

    public static void main(String[] args) {
        System.out.println("Iniciando o programa... Entrou no metodo main");
        a();
        System.out.println("Finalizando o programa... Saiu do metodo main");
        
    }

    public static void a() {
        System.out.println("Entrou no metodo a");
        b();
        System.out.println("Saiu do metodo a");
    }

    public static void b() {
        System.out.println("Entrou no metodo b");
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        c();
        System.out.println("Saiu do metodo b");
    }

    public static void c() {
        System.out.println("Entrou no metodo c");
        //Thread.dumpStack();
        System.out.println("Saiu do metodo c");
    }
    
}
