public class Mediano extends Characters {
    //metodos del Mediano
    public Mediano(int fuerza, int destreza, int inteligencia, int carisma, int constitucion, int sabiduria, int mod_req_princ) {
        super.setFuerza(fuerza);
        super.setCarisma(carisma);
        super.setConstitucion(constitucion);
        super.setDestreza(destreza);
        super.setInteligencia(inteligencia);
        super.setMod_req_princ(mod_req_princ);
        super.setSabiduria(sabiduria);
    }
    public void PonCosa(){
        System.out.println("HOLA SOY UN MEDIANO");
    }
}
