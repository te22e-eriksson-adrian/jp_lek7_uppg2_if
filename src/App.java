import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        
        //int litetTal = 10;

        /* if (litetTal<1000)
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
        tangentbord.close();
    }
}
