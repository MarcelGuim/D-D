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


    }
}