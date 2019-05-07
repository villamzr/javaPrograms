public class saludo {
    private String frase;

    public String getFrase(){
        return this.frase;
    }

    public void setFrase(String frase){
        this.frase = frase;
    }

    public static void main(String[] Args){

        saludo saludo = new saludo();
        saludo.setFrase("Hola, soy un desarrollador Java");
        String palabra = saludo.getFrase();

        System.out.println(palabra);

    }
}
