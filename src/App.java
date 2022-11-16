public class App {

    public static void main(String[] args) throws Exception {

        // Diba yung `MyStore` class ay naka `Single Inheritance` sa `Store` class?
        // Ang gagawin lang nito - lalagyan natin ng kung anong `type` yung Store at kung anong `name` nung Store
        // In our case ang `type` nung Store ay - `Karinderya` at ang `name` nung Store ay - `Myla's Ku_C_na`
        MyStore mylaStore = new MyStore("Karinderya", "Myla\'s Ku_C_na");

        // Dahil naka `Single` Inherit` etong `MyStore` sa `Store` Class
        mylaStore.printStoreTypeStoreName(); // <--- Maaaccess natin etong Function na eto na nasa `Store` class
        mylaStore.inputItems(); // <--- Eto naman yung nag iisang Function na nasa `MyStore` class

    }

}
