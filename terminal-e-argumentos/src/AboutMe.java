public class AboutMe {
    public static void main(String[] args) throws Exception {
        String nome = args [0];
        String sobrnome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá me chamo:  " + nome + " " + sobrnome);
        System.out.println("Tenho: " + idade + " " + "anos");
        System.out.println("Minha altura é: " + altura + " " + "cm");

    }
}
