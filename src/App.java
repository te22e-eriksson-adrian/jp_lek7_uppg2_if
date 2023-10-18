public class App {
    public static void main(String[] args) throws Exception {
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

        //b
        int tal1 = 10;
        int tal2 = 20;
        if (tal2>tal1){
            System.out.println("Tal 2 är större än tal 1.");
        }
    }
}
