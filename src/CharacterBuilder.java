public class CharacterBuilder implements CharacterBuilderInt{
    int fuerza;
    int destreza;
    int inteligencia;
    int carisma;
    int constitucion;
    int sabiduria;
    int mod_req_princ;
    String alineacion;


    public CharacterBuilder() {}

    public String getAlineacion() {
        return alineacion;
    }
    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public int getDestreza() {
        return destreza;
    }
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public int getCarisma() {
        return carisma;
    }
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
    public int getConstitucion() {
        return constitucion;
    }
    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }
    public int getSabiduria() {
        return sabiduria;
    }
    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }
    public int getMod_req_princ() {
        return mod_req_princ;
    }
    public void setMod_req_princ(int mod_req_princ) {
        this.mod_req_princ = mod_req_princ;
    }
    Characters character;
    @Override
    public Characters buildCharacter(String tipo){
        switch (tipo){
            case "Clerigo":
                character = new Clerigo(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                break;
            case "Enano":
                character = new Enano(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                break;
            case "Elfo":
                character = new Elfo(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                break;
            case "Guerrero":
                character = new Guerrero(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                break;
            case "Ladron":
                character = new Ladron(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                break;
            case "Mago":
                character = new Mago(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                break;
            case "Mediano":
                character = new Mediano(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                break;
            case "":
                return null;
        }
        character.setAlineacion(alineacion);
        character.setTipo(tipo);
        return character;
    }
}
