import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        //a
        /* int litetTal = 10;

        if (litetTal<1000)
        {
            int stortTal = 1000;
            System.out.println(litetTal+" är mindre än "+stortTal);
        }
        else
        {
            System.out.println(litetTal+" är mindre än "+stortTal);
        } */

        System.out.println("Varför fungerar inte koden?");
        System.out.println("Svar: Eftersom villkoret inte gäller så körs inte de instruktionerna som är ovanför 'else' detta inkluderar introduktionen av 'stortTal'.");
        System.out.println("Hur kan du få koden att fungera?");
        System.out.println("Svar: Genom att ta ut introduktionen av variabeln 'stortTal' och placera den tillsammans med 'litetTal'. (Se lösning nedan.)");

        int litetTal = 10;
        int stortTal = 1000;

        if (litetTal<1000)
        {
            System.out.println(litetTal+" är mindre än "+stortTal);
        }
        else
        {
            System.out.println(litetTal+" är mindre än "+stortTal);
        }

        //b, c
        int tal1 = 10;
        /* int tal2 = 20; */
        int tal2 = 0;
        if (tal2>tal1){
            System.out.println(tal2+" är större än "+tal1);
        }
        else
        {
            System.out.println(tal2+" är inte större än "+tal1);
        }

        //d
        System.out.print("Hur mycket är klockan (svara i närmaste timme): ");
        int timme = tangentbord.nextInt();
        tangentbord.nextLine();
        if (timme>7){
            System.out.println("'Dags att gå upp!'");
        }
        if (timme==12){
            System.out.println("'Dags att äta!'");
        }
        if (timme>23){
            System.out.println("'Dags att gå och lägga sig!'");
        }
        
        //e
        System.out.print("Hur gammal är du?: ");
        int ålder = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Svara med siffran 1 om du är medlem, annars med siffran 2: ");
        int medlem = tangentbord.nextInt();
        tangentbord.nextLine();
        if (ålder>=18 || medlem==1){
            System.out.println("Välkommen in!");
        }
        else
        {
            System.out.println("Tyvärr får jag inte släppa in er, var så snälla att ge plats åt eventuella andra personer som står i kö.");
        }
        if (ålder>=18 || medlem==1){
            System.out.println("Resultat: du kom in på klubben.");
        }
        else
        {
            System.out.println("Resultat: du kom inte in i klubben.");
        }

        //f
        System.out.println("     ");
        System.out.println("Inmata dina inloggningsuppgifter nedan tack!");
        System.out.println("     ");
        System.out.print("Användarnamn: ");
        String användarnamn = tangentbord.nextLine();
        System.out.print("\nLösenord: ");
        String lösenord = tangentbord.nextLine();
        if (användarnamn.equals("root") && lösenord.equals("passwd")){
            System.out.println("Välkommen!");
        }
        else
        {
            System.out.println("Fel användarnamn och/eller lösenord, försök igen genom att starta om programmet.");
        }
        
        //g
        System.out.println("   ");
        System.out.println("Meny Väderprogram");
        System.out.println("1. Skriv ut temperatur");
        System.out.println("2. Skriv ut vind");
        System.out.println("3. Skriv ut luftfuktighet");
        System.out.print("Ange val: ");
        int val = tangentbord.nextInt();
        tangentbord.nextLine();
        switch (val){
            case 1:
                System.out.println("Det är 18 grader.");
                break;
            case 2:
                System.out.println("Vinden är 10 sekund-meter.");
                break;
            case 3:
                System.out.println("Det är 100% luftfuktighet.");
                break;
            default:
                System.out.println("Fel val!");
        }
        System.out.println("    ");
        System.out.println("Nu är uppgiften slutförd!");
        tangentbord.close();
    }
}
