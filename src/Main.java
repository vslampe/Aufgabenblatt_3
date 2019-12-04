public class Main {
// ????????????????????????????????????? Das sollte eigentlich auch eine Simulation sein..
    public static void main(String[] args)
    {
        final int gleise = 50;
        int i = 1;
        while (true)
        {
            Rangierbahnhof rangierbahnhof = new Rangierbahnhof(gleise);
            Lokfuehrer lokfuehrer = new Lokfuehrer(rangierbahnhof, gleise);
            lokfuehrer.run();
            System.out.println("Durchlauf:" + i );
            i++;
        }
    }
}
