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

    public void DimeImpacto(int atac){
        switch (atac) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9:
                System.out.println("No puedes impactar a nadie");
                break;
            case 10:
                System.out.println("Puedes impactar a enemigo con clase de armadura 9 o >");
                break;
            case 11:
                System.out.println("Puedes impactar a enemigo con clase de armadura 8 o >");
                break;
            case 12:
                System.out.println("Puedes impactar a enemigo con clase de armadura 7 o >");
                break;
            case 13:
                System.out.println("Puedes impactar a enemigo con clase de armadura 6 o >");
                break;
            case 14:
                System.out.println("Puedes impactar a enemigo con clase de armadura 5 o >");
                break;
            case 15:
                System.out.println("Puedes impactar a enemigo con clase de armadura 4 o >");
                break;
            case 16:
                System.out.println("Puedes impactar a enemigo con clase de armadura 3 o >");
                break;
            case 17:
                System.out.println("Puedes impactar a enemigo con clase de armadura 2 o >");
                break;
            case 18:
                System.out.println("Puedes impactar a enemigo con clase de armadura 1 o >");
                break;
            case 19:
                System.out.println("Puedes impactar a enemigo con clase de armadura 0 o >");
                break;
            case 20:
                System.out.println("Puedes impactar a cualquier enemigo");
                break;

        }

    }

    public static int CalcularGolpe(String tipo, int con){
        int golpe=0;
        boolean ok = false;
        while (!ok){
            //Uso de dados apropiados segun la clase
            switch (tipo){
                case "Clerigo","Elfo","Mediano":
                    golpe = (int) (Math.random() * 6) + 1;
                    break;
                case "Enano", "Guerrero":
                    golpe = (int) (Math.random() * 8) + 1;
                    break;
                case "Ladron","Mago":
                    golpe = (int) (Math.random() * 4) + 1;
                    break;

            }
            //Regla opcional, repetir si sale 1/2 en caso de nivel 1
            if (golpe>2)
                ok=true;
        }

        //Aplicacion de modificadores por constitucion
        switch (con) {
            case 3:
                golpe = golpe - 3;
                break;
            case 4,5:
                golpe = golpe - 2;
                break;
            case 6,7,8:
                golpe = golpe - 1;
                break;
            case 13,14,15:
                golpe = golpe + 1;
                break;
            case 16,17:
                golpe = golpe + 2;
                break;
            case 18:
                golpe = golpe + 3;
                break;

        }
        return golpe;
    }
}

