public abstract class Characters {
    protected int fuerza;
    protected int destreza;
    protected int inteligencia;
    protected int carisma;
    protected int constitucion;
    protected int sabiduria;
    protected int mod_req_princ;
    protected String tipo;
    protected String alineacion;

    public Characters(int _fuerza, int _destreza, int _inteligencia, int _carisma, int _constitucion, int _sabiduria, int _mod_req_princ,String _alineacion) {
        this.fuerza=_fuerza;
        this.destreza=_destreza;
        this.inteligencia=_inteligencia;
        this.carisma=_carisma;
        this.constitucion=_constitucion;
        this.sabiduria=_sabiduria;
        this.mod_req_princ=_mod_req_princ;
        this.alineacion=_alineacion;
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

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void MostrarPorConsola()
    {
        System.out.println("Tu eres un: "+this.tipo);
        System.out.println("Tu fuerza es: "+this.fuerza);
        System.out.println("Tu destreza es: "+this.destreza);
        System.out.println("Tu carisma es: "+this.carisma);
        System.out.println("Tu constitucion es: "+this.constitucion);
        System.out.println("Tu sabiduria es: "+this.sabiduria);
        System.out.println("Tu alineacion es: "+this.alineacion);
    }
}

