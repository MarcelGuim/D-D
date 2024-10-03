public class Guerrero extends Characters{
    //metodos del Guerrero
    public Guerrero(int fuerza, int destreza, int inteligencia, int carisma, int constitucion, int sabiduria, int mod_req_princ,String alineacion) {
        super(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion);
        super.tipo="Guerreo";
    }

    public void PonCosa(){
        System.out.println("HOLA SOY UN GUERRERO");
    }
}
