public class Ladron extends Characters{
    //metodos del Ladron
    public Ladron(int fuerza, int destreza, int inteligencia, int carisma, int constitucion, int sabiduria, int mod_req_princ,String alineacion, int ataque, int golpe) {
        super(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion, ataque,golpe);
        super.tipo="Ladron";
        super.muerte_veneno=13;
        super.varitas=14;
        super.paralisis_petrificacion=13;
        super.ataque_aliento=16;
        super.hechizos_varas_bastones=15;
    }

    public void PonCosa(){
        System.out.println("HOLA SOY UN LADRON");
    }
}
