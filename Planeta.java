package poo;

public enum Planeta {
    MERCURIO(1), VENUS(2), TERRA(3), MARTE(4), JUPTER(5), SATURNO(6), URANO(7), NETUNO(8);

    public final int codigo;

    Planeta(int i) {
        this.codigo = i;
    }

    public static Planeta getByCodigo(int c){
//        for (Planeta planeta: Planeta.values()) {
//            if(c == Planet){
//                return planeta;
//            }
//        }
        throw  new IllegalArgumentException("Codigo Invalido ");
    }
}
