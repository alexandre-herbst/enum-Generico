package poo;

public class Teste {

    public static void main(String[] args) {
//        Cor corDoFundo = Cor.getByCodigo(0);
//        Cor corDoTexto = Cor.getByCodigo(7);
//
//        System.out.println("Cor do Fundo: " + corDoFundo);

        Caixa<String> c = new Caixa<>();
        Caixa<Pessoa> d = new Caixa<>();

        String s = "Ola Mundo";
        Pessoa p = new Pessoa("Joao");
        c.setDado(s);
        d.setDado(p);
        String nova =  c.getDado();
        Pessoa outra =  d.getDado();

    }


}
