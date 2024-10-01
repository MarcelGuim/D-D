public class CharacterBuilder <T>{
    int fuerza;
    int destreza;
    int inteligencia;
    int carisma;
    int constitucion;
    int sabiduria;
    int mod_req_princ;
    private T T;



    public CharacterBuilder(int fuerza, int destreza, int inteligencia, int carisma, int constitucion, int sabiduria, int mod_req_princ) {
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
        this.constitucion = constitucion;
        this.sabiduria = sabiduria;
        this.mod_req_princ = mod_req_princ;
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
    Clerigo clerigo = null;
    Enano enano = null;
    Elfo elfo = null;
    Guerrero guerrero = null;
    Ladron ladron = null;
    Mago mago = null;
    Mediano mediano = null;
    public T buildCharacter(int i){
        switch (i){
            case 1:
                clerigo = new Clerigo(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                clerigo.setTipo("Clerigo");
                return (T) clerigo;
            case 2:
                enano = new Enano(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                enano.setTipo("Enano");
                return (T) enano;
            case 3:
                elfo = new Elfo(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                elfo.setTipo("Elfo");
                return (T) elfo;
            case 4:
                guerrero = new Guerrero(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                guerrero.setTipo("Guerrero");
                return (T) guerrero;
            case 5:
                ladron = new Ladron(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                ladron.setTipo("Ladron");
                return (T) ladron;
            case 6:
                mago = new Mago(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                mago.setTipo("Mago");
                return (T) mago;
            case 7:
                mediano = new Mediano(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
                mediano.setTipo("Mediano");
                return (T) mediano;
        }
        return T;
    }
    //Aquesta funció esta creada, pero no s'utilitza.
    //El problema que te esq si ho fem aixi el clerigo al que li estem posant una alineació es el que hi ha
    //En aquesta classe, no al del main
    //Igual per seguir el modo BUILDER cal fer-ho amb aquesta funció, però ho he fet amb un setAlineacion al main
    public void ponAlineacion(int caso, String alineacion)
    {
        switch (caso){
            case 1:
                clerigo.setAlineacion(alineacion);
                return;
            case 2:
                enano.setAlineacion(alineacion);
                return;
            case 3:
                elfo.setAlineacion(alineacion);
                return;
            case 4:
                guerrero.setAlineacion(alineacion);
                return;
            case 5:
                ladron.setAlineacion(alineacion);
                return;
            case 6:
                mago.setAlineacion(alineacion);
                return;
            case 7:
                mediano.setAlineacion(alineacion);
        }
    }
}
