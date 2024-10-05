public class Enano extends Characters{
    //metodos del Enano
    public Enano(int fuerza, int destreza, int inteligencia, int carisma, int constitucion, int sabiduria, int mod_req_princ,String alineacion, int ataque, int golpe) {
        super(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion,ataque,golpe);
        super.tipo="Enano";
        super.muerte_veneno=8;
        super.varitas=9;
        super.paralisis_petrificacion=10;
        super.ataque_aliento=13;
        super.hechizos_varas_bastones=12;
    }

    public void PonCosa(){
        System.out.println("HOLA SOY UN ENANO");
    }
}
