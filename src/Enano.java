public class Enano extends Characters{
    //metodos del Enano
    public Enano(int fuerza, int destreza, int inteligencia, int carisma, int constitucion, int sabiduria, int mod_req_princ,String alineacion) {
        super(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion);
        super.tipo="Enano";
    }

    public void PonCosa(){
        System.out.println("HOLA SOY UN ENANO");
    }
}
