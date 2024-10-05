public class Elfo extends Characters{
    //metodos del Elfo
    public Elfo(int fuerza, int destreza, int inteligencia, int carisma, int constitucion, int sabiduria, int mod_req_princ,String alineacion, int ataque, int golpe) {
        super(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion,ataque,golpe);
        super.tipo="Elfo";
        super.muerte_veneno=12;
        super.varitas=13;
        super.paralisis_petrificacion=13;
        super.ataque_aliento=15;
        super.hechizos_varas_bastones=15;
    }

    public void PonCosa(){
        System.out.println("HOLA SOY UN ELFO");
    }
}
