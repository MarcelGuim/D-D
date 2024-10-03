public class CharacterBuilder implements CharacterBuilderInt{
    private int fuerza;
    private int destreza;
    private int inteligencia;
    private int carisma;
    private int constitucion;
    private int sabiduria;
    private int mod_req_princ;
    private String alineacion;


    public CharacterBuilder() {}

    @Override
    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    @Override
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    @Override
    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }

    @Override
    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public void setMod_req_princ(int mod_req_princ) {
        this.mod_req_princ = mod_req_princ;
    }

    @Override
    public Characters buildCharacter(String tipo){
        switch (tipo){
            case "Clerigo":
                return new Clerigo(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion);
            case "Enano":
                return new Enano(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion);
            case "Elfo":
                return new Elfo(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion);
            case "Guerrero":
                return new Guerrero(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion);
            case "Ladron":
                return  new Ladron(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion);
            case "Mago":
                return new Mago(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion);
            case "Mediano":
                return new Mediano(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ,alineacion);
            default:
                return null;
        }
    }
}
