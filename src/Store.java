public class Store {

    String storeType; // <--- Gagamitin natin para sa pag specify kung anong `Type` nung Store
    String nameOfStore; // <--- Gagamitin natin para sa pag specify sa `Name` nung Store
    
    // Ang gagawin lang nitong `Constructor` 
    // e para lagyan ng value yung dalawa nating variable `storeType` at `nameOfStore`
    public Store(String storeType, String nameOfStore) {
        this.storeType = storeType;
        this.nameOfStore = nameOfStore;
    }

    // Ang gagawin lang nitong `Function` na to e ipiprint kung anong `Type` and `Name` nung Store
    public void printStoreTypeStoreName() {
        System.out.println("Store Type: " + storeType);
        System.out.println("Store Name: " + nameOfStore);
    }  
  
}
