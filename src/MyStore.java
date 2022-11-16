import java.util.Scanner;

public class MyStore extends Store { // <--- Naka `Single Inheritance` lang 

    int numberOfItems; // <--- Gagamitin natin para sa pag input sa magiging `size` ng 
    
    Scanner input = new Scanner(System.in); // <--- Ang katumbas nito sa C++ ay yung `cin >>` (para makapag input tayo)
    
    // Ang gagawin nitong `Constructor` na to ay 
    // lalagyan ng `value` yung dalawang variable na nasa `super` yung `constructor` (kung saan naka inherit etong `MyStore` class)
    public MyStore(String storeType, String nameOfStore) {
        super(storeType, nameOfStore);
    }

    // Kagaya lang to nung sa C++ na Bubble Sort (dinagdagan lang ng pag `Swap` sa `String Array` - yung `itemToBuy`)
    private void bubbleSort(String itemToBuy[], int itemQuantityToBuy[]) { //Naka `private` sya para lang hindi natin sya maaccess sa `App.java`
        
        int n = itemQuantityToBuy.length;

        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (itemQuantityToBuy[j] > itemQuantityToBuy[j + 1]) {
                    
                    // Ang gagawin nito - 
                    // kung mababa yung quantity nung item - ilalagay yon sa pinaka una (para maging low to high yung order ng array)
                    int temp1 = itemQuantityToBuy[j];
                    itemQuantityToBuy[j] = itemQuantityToBuy[j + 1];
                    itemQuantityToBuy[j + 1] = temp1;

                    // Ang gagawin dito -
                    // gagayahin lang natin yung order nung quantity nung item para mag pantay sila ng index.
                    String temp2 = itemToBuy[j];
                    itemToBuy[j] = itemToBuy[j + 1];
                    itemToBuy[j + 1] = temp2;
                }
            }
        }
    }
    
    public void inputItems() {

        // Kung ano man yung nilagay mo na `Name` nung Store sa `Constructor`
        // ipiprint nya yon
        System.out.println("\nWelcome to " + nameOfStore + " Store!"); 

        // Dito ang gagawin nito, tatanongin kung ilan yung magiging size nung array
        System.out.print("\nPlease input number of items you want to buy: ");
        numberOfItems = input.nextInt();
        
        // Etong dalawang to, katumbas nito sa C++ yung `int array[MAX]` 
        // Ibig sabihin - kung ano man yung ininput mo na size, ayun yung magiging size nung dalawang array na to
        String[] itemNameToBuy = new String[numberOfItems];
        int[] itemQuantityToBuy = new int[numberOfItems];

        
        System.out.println("\nInput ---> " + numberOfItems + " Items and it's Name and Quantity:");

        // Dito sa part na to, ang gagawin lang nya e mag loloop tayo from 0 to (kung ano man yung `size` nung `numberOfItems`)
        // Then lagyan natin ng `Name` for Item yung `itemNameToBuy` at ganon din sa `itemQuantityToBuy`
        for (int i = 0; i < itemNameToBuy.length; i++) {
            System.out.print("\nPlease Input Name for Item[" + (i + 1) + "]: ");
            itemNameToBuy[i] = input.next();

            System.out.print("Please Input Quantity for " + itemNameToBuy[i] + ": ");
            itemQuantityToBuy[i] = input.nextInt();
        }   

        // Tapos gagamitin natin yung `Bubble Sort` para mag sort sya from low to high order
        bubbleSort(itemNameToBuy, itemQuantityToBuy);

        // Tapos ipiprint lang natin yung Sorted Array na `itemQuantityToBuy` at `itemNameToBuy`
        System.out.println("\nYou bought: ");
        for (int i = 0; i < itemNameToBuy.length; i++) {
            System.out.println(itemQuantityToBuy[i] + " - " + itemNameToBuy[i]);
        }

    }

    
}
