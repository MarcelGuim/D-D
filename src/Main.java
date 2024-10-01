import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clerigo clerigo = null;
        Enano enano = null;
        Elfo elfo = null;
        Guerrero guerrero = null;
        Ladron ladron = null;
        Mago mago = null;
        Mediano mediano = null;
        Scanner scanner = new Scanner(System.in);
        int fuerza = (int) (Math.random() * 15) + 3;
        int destreza = (int) (Math.random() * 15) + 3;
        int inteligencia = (int) (Math.random() * 15) + 3;
        int carisma = (int) (Math.random() * 15) + 3;
        int constitucion = (int) (Math.random() * 15) + 3;
        int sabiduria = (int) (Math.random() * 15) + 3;
        int mod_req_princ = (int) (Math.random() * 15) + 3;
        CharacterBuilder constructor = new CharacterBuilder(fuerza,destreza,inteligencia,carisma,constitucion,sabiduria,mod_req_princ);
        int cual = 0;
        boolean ok = false;
        if(inteligencia>=9 && constitucion>=9 && destreza>=9 && ok == false)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo = 1\nEnano = 2\nElfo = 3\nGuerrero = 4\nLadron = 5\nMago = 6\nMediano = 7");
                cual = Integer.parseInt(scanner.nextLine());
                if(cual!=1 && cual !=2 && cual !=3 && cual !=4 && cual !=5 && cual !=6 && cual !=7 )
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
                else
                    ok = true;
            }
        }
        else if(inteligencia>=9 && constitucion>=9 && destreza<9 && ok == false)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo = 1\nEnano = 2\nElfo = 3\nGuerrero = 4\nLadron = 5\nMago = 6");
                cual = Integer.parseInt(scanner.nextLine());
                if(cual!=1 && cual !=2 && cual !=3 && cual !=4 && cual !=5 && cual !=6 )
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
                else
                    ok = true;
            }
        }
        else if(inteligencia<9 && constitucion>=9 && destreza>=9  && ok == false)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo = 1\nEnano = 2\nGuerrero = 4\nLadron = 5\nMago = 6\nMediano = 7");
                cual = Integer.parseInt(scanner.nextLine());
                if(cual!=1 && cual !=2 && cual !=4 && cual !=5 && cual !=6 && cual != 7)
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
                else
                    ok = true;
            }
        }
        else if(inteligencia>=9 && constitucion<9  && ok == false)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo = 1\nElfo = 3\nGuerrero = 4\nLadron = 5\nMago = 6");
                cual = Integer.parseInt(scanner.nextLine());
                if(cual!=1 && cual !=3 && cual !=4 && cual !=5 && cual !=6)
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
                else
                    ok = true;
            }
        }
        else if(inteligencia<9 && constitucion>=9 && destreza<9 && ok == false)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo = 1\nEnano = 2\nGuerrero = 4\nLadron = 5\nMago = 6");
                cual = Integer.parseInt(scanner.nextLine());
                if(cual!=1 && cual !=2 && cual !=4 && cual !=5 && cual !=6)
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
                else
                    ok = true;
            }
        }
        else if(inteligencia<9 && constitucion<9 && destreza<9 && ok == false)
        {
            while(!ok)
            {
                System.out.println("En base a tus modificadores puedes ser:\nClerigo = 1\nGuerrero = 4\nLadron = 5\nMago = 6");
                cual = Integer.parseInt(scanner.nextLine());
                if(cual!=1 && cual !=4 && cual !=5 && cual !=6)
                    System.out.println("has entrado un valor incorrecto, intentalo de nuevo campeon");
                else
                    ok = true;
            }
        }

        if(cual == 1)
        {
            clerigo = (Clerigo) constructor.buildCharacter(cual);
            System.out.println("Que alineacion quieres tener? Legal, Neutral o Caotico?");
            String alineacion = scanner.nextLine();
            clerigo.setAlineacion(alineacion);
        }
        else if (cual == 2)
        {
            enano = (Enano) constructor.buildCharacter(cual);
            System.out.println("Que alineacion quieres tener? Legal, Neutral o Caotico?");
            String alineacion = scanner.nextLine();
            enano.setAlineacion(alineacion);
        }
        else if (cual == 3)
        {
            elfo = (Elfo) constructor.buildCharacter(cual);
            System.out.println("Que alineacion quieres tener? Legal, Neutral o Caotico?");
            String alineacion = scanner.nextLine();
            elfo.setAlineacion(alineacion);
        }
        else if (cual == 4)
        {
            guerrero = (Guerrero) constructor.buildCharacter(cual);
            System.out.println("Que alineacion quieres tener? Legal, Neutral o Caotico?");
            String alineacion = scanner.nextLine();
            guerrero.setAlineacion(alineacion);
        }
        else if (cual == 5)
        {
            ladron = (Ladron) constructor.buildCharacter(cual);
            System.out.println("Que alineacion quieres tener? Legal, Neutral o Caotico?");
            String alineacion = scanner.nextLine();
            ladron.setAlineacion(alineacion);
        }
        else if (cual == 6)
        {
            mago = (Mago) constructor.buildCharacter(cual);
            System.out.println("Que alineacion quieres tener? Legal, Neutral o Caotico?");
            String alineacion = scanner.nextLine();
            mago.setAlineacion(alineacion);
        }
        else if (cual == 7)
        {
            mediano = (Mediano) constructor.buildCharacter(cual);
            System.out.println("Que alineacion quieres tener? Legal, Neutral o Caotico?");
            String alineacion = scanner.nextLine();
            mediano.setAlineacion(alineacion);
        }
        else if (cual == 0)
            System.out.println("ERROR, no ha entrado bien el valor");






        //ATENCIO AQUESTA PART ES NOMES PER TESTEJAR, NO FORMA PART DEL CODI FINAL
        if(cual == 1)
            clerigo.MostrarPorConsola();
        else if (cual == 2)
            enano.MostrarPorConsola();
        else if (cual == 3)
            elfo.MostrarPorConsola();
        else if (cual == 4)
            guerrero.MostrarPorConsola();
        else if (cual == 5)
            ladron.MostrarPorConsola();
        else if (cual == 6)
            mago.MostrarPorConsola();
        else if (cual == 7)
            mediano.MostrarPorConsola();


    }
}