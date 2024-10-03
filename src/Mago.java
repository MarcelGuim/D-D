public class Mago extends Characters{
    //metodos del Mago
    public Mago(int fuerza, int destreza, int inteligencia, int carisma, int constitucion, int sabiduria, int mod_req_princ,String alineacion) {
        super(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion);
        super.tipo="Mago";
    }

    public void PonCosa(){
        System.out.println("HOLA SOY UN MAGO");
    }
}
