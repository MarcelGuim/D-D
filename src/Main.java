import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterBuilder constructor = new CharacterBuilder();
        int fuerza = (int) (Math.random() * 15) + 3;
        constructor.setFuerza(fuerza);
        int destreza = (int) (Math.random() * 15) + 3;
        constructor.setDestreza(destreza);
        int inteligencia = (int) (Math.random() * 15) + 3;
        constructor.setInteligencia(inteligencia);
        int carisma = (int) (Math.random() * 15) + 3;
        constructor.setCarisma(carisma);
        int constitucion = (int) (Math.random() * 15) + 3;
        constructor.setConstitucion(constitucion);
        int sabiduria = (int) (Math.random() * 15) + 3;
        constructor.setSabiduria(sabiduria);
        int mod_req_princ = (int) (Math.random() * 15) + 3;
        constructor.setMod_req_princ(mod_req_princ);
        int ataque = (int) (Math.random() * 20) + 1;
        constructor.setAtaque(ataque);

        String cual ="";
        boolean ok = false;
        if(inteligencia>=9 && constitucion>=9 && destreza>=9 && !ok)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo\nEnano\nElfo\nGuerrero\nLadron\nMago\nMediano");
                cual = scanner.nextLine();
                if(cual.equals("Clerigo") || cual.equals("Enano") || cual.equals("Elfo") || cual.equals("Guerrero") || cual.equals("Ladron") || cual.equals("Mago") || cual.equals("Mediano") )
                    ok = true;
                else
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
            }
        }
        else if(inteligencia>=9 && constitucion>=9 && destreza<9 && !ok)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo\nEnano\nElfo\nGuerrero\nLadron\nMago");
                cual = scanner.nextLine();
                if(cual.equals("Clerigo") || cual.equals("Enano") || cual.equals("Elfo") || cual.equals("Guerrero") || cual.equals("Ladron") || cual.equals("Mago"))
                    ok = true;
                else
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
            }
        }
        else if(inteligencia<9 && constitucion>=9 && destreza>=9  && !ok)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo\nEnano \nGuerrero\nnLadron\nMago\nMediano");
                cual = scanner.nextLine();
                if(cual.equals("Clerigo") || cual.equals("Enano") || cual.equals("Guerrero") || cual.equals("Ladron") || cual.equals("Mago") || cual.equals("Mediano") )
                    ok = true;
                else
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
            }
        }
        else if(inteligencia>=9 && constitucion<9  && !ok)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo\nElfo\nGuerrero\nLadron\nMago");
                cual = scanner.nextLine();
                if(cual.equals("Clerigo") || cual.equals("Elfo") || cual.equals("Guerrero") || cual.equals("Ladron") || cual.equals("Mago"))
                    ok = true;
                else
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
            }
        }
        else if(inteligencia<9 && constitucion>=9 && destreza<9 && !ok)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo\nEnano\nGuerrero\nLadron\nMago");
                cual = scanner.nextLine();
                if(cual.equals("Clerigo") || cual.equals("Enano") || cual.equals("Guerrero") || cual.equals("Ladron") || cual.equals("Mago"))
                    ok = true;
                else
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
            }
        }
        else if(inteligencia<9 && constitucion<9 && destreza<9 && !ok)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo\nGuerrero\nLadron\nMago");
                cual = scanner.nextLine();
                if(cual.equals("Clerigo") || cual.equals("Guerrero") || cual.equals("Ladron") || cual.equals("Mago"))
                    ok = true;
                else
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
            }
        }

        constructor.setGolpe(Main.CalcularGolpe(cual,constitucion));

        ok = false;
        String alineacion = "";
        while (!ok)
        {
            System.out.println("Que alineacion quieres tener? Legal, Neutral o Caotico?");
            alineacion = scanner.nextLine();
            if (alineacion.equals("Legal") || alineacion.equals("Neutral") || alineacion.equals("Caotico"))
                ok = true;
            else
                System.out.println("Intenta de nuevo, ha ocurrido un error");
        }
        constructor.setAlineacion(alineacion);

        Characters character = constructor.buildCharacter(cual);
        //Aixo es per fer un Casting, que crea un Clerig o a partir del character que ja tens.
//        Clerigo clerigo = (Clerigo) character;
//        clerigo.PonCosa();
        int j = 1;

        character.MostrarPorConsola();
        ok = false;
        String Respuesta = "";

        while (!ok) {
            System.out.println("Eres nivel1 y tienes un GAC0 de 19. Tu tirada de ataque es: " + character.getAtaque() + ". Quieres consultar la clase de armadura del enemigo que puedes impactar? [si/no]");
            Respuesta = scanner.nextLine();
            if (Respuesta.equals("si")){
                Main.DimeImpacto(character.getAtaque());
                ok = true;
            }
            else if (Respuesta.equals("no")) {ok = true;}
            else{System.out.println("Intenta de nuevo, ha ocurrido un error");}

        }





    }

    public static void DimeImpacto(int atac){
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