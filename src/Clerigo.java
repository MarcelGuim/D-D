public class Clerigo extends Characters{
//metodos del clerigo


    public Clerigo(int fuerza, int destreza, int inteligencia, int carisma, int constitucion, int sabiduria, int mod_req_princ,String alineacion, int ataque, int golpe) {
        super(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion,ataque,golpe);
        super.tipo="Clerigo";
        super.muerte_veneno=11;
        super.varitas=12;
        super.paralisis_petrificacion=14;
        super.ataque_aliento=16;
        super.hechizos_varas_bastones=15;
    }
    public void PonCosaCler(){
        System.out.println("HOLA SOY UN CLERIGO");
    }
}