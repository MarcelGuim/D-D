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
    protected int ataque;
    protected int golpe;
    protected int muerte_veneno;
    protected int varitas;
    protected int paralisis_petrificacion;
    protected int ataque_aliento;
    protected int hechizos_varas_bastones;

    public Characters(int _fuerza, int _destreza, int _inteligencia, int _carisma, int _constitucion, int _sabiduria, int _mod_req_princ,String _alineacion, int _ataque, int _golpe) {
        this.fuerza=_fuerza;
        this.destreza=_destreza;
        this.inteligencia=_inteligencia;
        this.carisma=_carisma;
        this.constitucion=_constitucion;
        this.sabiduria=_sabiduria;
        this.mod_req_princ=_mod_req_princ;
        this.alineacion=_alineacion;
        this.ataque=_ataque;
        this.golpe=_golpe;

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

    public int getAtaque() {return ataque;}

    public void setAtaque(int ataque) {this.ataque = ataque;}

    public int getGolpe() {return golpe;}

    public void setGolpe(int golpe) {this.golpe = golpe;}

    public int getMuerte_veneno() {return muerte_veneno;}

    public void setMuerte_veneno(int muerte_veneno) {this.muerte_veneno = muerte_veneno;}

    public int getVaritas() {return varitas;}

    public void setVaritas(int varitas) {this.varitas = varitas;}

    public int getParalisis_petrificacion() {return paralisis_petrificacion;}

    public void setParalisis_petrificacion(int paralisis_petrificacion) {this.paralisis_petrificacion = paralisis_petrificacion;}

    public int getAtaque_aliento() {return ataque_aliento;}

    public void setAtaque_aliento(int ataque_aliento) {this.ataque_aliento = ataque_aliento;}

    public int getHechizos_varas_bastones() {return hechizos_varas_bastones;}

    public void setHechizos_varas_bastones(int hechizos_varas_bastones) {this.hechizos_varas_bastones = hechizos_varas_bastones;}

    public void MostrarPorConsola()
    {
        System.out.println("Tu eres un: "+this.tipo);
        System.out.println("Tu fuerza es: "+this.fuerza);
        System.out.println("Tu destreza es: "+this.destreza);
        System.out.println("Tu carisma es: "+this.carisma);
        System.out.println("Tu constitucion es: "+this.constitucion);
        System.out.println("Tu sabiduria es: "+this.sabiduria);
        System.out.println("Tu alineacion es: "+this.alineacion);
        System.out.println("Tu golpe es: "+this.golpe);
        System.out.println("Eres nivel 1. Tus tiradas de salvación son: M-" + this.muerte_veneno + ", V-" + this.varitas + ", P-" + this.paralisis_petrificacion + ", A-" + this.ataque_aliento + ", H-" + this.hechizos_varas_bastones);
    }
}

