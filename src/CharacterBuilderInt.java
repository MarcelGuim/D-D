public interface CharacterBuilderInt {
    void setAlineacion(String alineacion);
    void setFuerza(int fuerza);
    void setDestreza(int destreza);
    void setInteligencia(int inteligencia);
    void setCarisma(int carisma);
    void setConstitucion(int constitucion);
    void setSabiduria(int sabid);
    void setAtaque(int ataque);
    void setGolpe(int golpe);

    Characters buildCharacter(String tipo);
}
