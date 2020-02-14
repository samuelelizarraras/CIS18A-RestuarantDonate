import java.util.Scanner;

class Entree{
    double price;       //price of the entree
    double donation;    //donation of that entree
}

class Dessert{
    double price;       //price of the dessert
    double donation;    //donation of that dessert
}

class Restaurant{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);     //to get user input
        
        Entree lobsterTaco = new Entree();          //creating objects for entree class
        Entree octopusTaco = new Entree();
        Entree scallopCeviche = new Entree();
        Entree scallopAguachile = new Entree();
        Entree allSeafoodCocktail = new Entree();
        Entree allSeafoodCeviche = new Entree();
        
        Dessert flan = new Dessert();               //creating objects for dessert class
        Dessert panDulce = new Dessert();
        Dessert fresasConCrema = new Dessert();
        
        int choice = 0;
        double totalPrice = 0;
        double totalDonation = 0;
        String[] causes = null;
        causes = new String[3];                         //creates an array to hold all the causes that the customer can choose to donate to
        causes[0] = "homeleess shelter";
        causes[0] = "animal shelter";
        causes[0] = "aid for low income children";
        
        lobsterTaco.price = 5;                  //setting prices and donations for all the entrees
        lobsterTaco.donation = 1.5;             //using the price and donation variables from entree class
        octopusTaco.price = 4;
        octopusTaco.donation = 1;
        scallopCeviche.price = 6;
        scallopCeviche.donation = 2;
        scallopAguachile.price = 8;
        scallopAguachile.donation = 2.5;
        allSeafoodCocktail.price = 7;
        allSeafoodCocktail.donation = 2;
        allSeafoodCeviche.price = 6;
        allSeafoodCeviche.donation = 2;
        
        flan.price = 3;                     //setting prices and donations for all the entrees
        flan.donation = 1;                  //using the price and donation variables from dessert class
        panDulce.price = 3;
        panDulce.donation = 1;
        fresasConCrema.price = 4;
        fresasConCrema.donation = 1.5;
        
        System.out.println("What entrees would you like to order?");    //this question must be asked only once
        do{                                                                 //using a do while loop because the entree menu must print out at least once
            System.out.println("Enter 1 for lobster taco");
            System.out.println("Enter 2 for octopus taco");
            System.out.println("Enter 3 for scallopCeviche");
            System.out.println("Enter 4 for scallopAguachile");
            System.out.println("Enter 5 for allSeafoodCocktail");
            System.out.println("Enter 6 for allSeafoodCeviche");
            System.out.println("Enter 7 when you are done ordering.");
            choice = input.nextInt();
        
            switch(choice){                                                 //the number that is entered determines which case will be performed
            case 1:
                System.out.println("You chose lobster taco.");              //each case lets the customer know which item they chose and adds the total cost and donation of the order
                totalPrice += lobsterTaco.price;
                totalDonation += lobsterTaco.donation;
                break;
            case 2:
                System.out.println("You chose octopus taco.");
                totalPrice += octopusTaco.price;
                totalDonation += octopusTaco.donation;
                break;
            case 3:
                System.out.println("You chose scallop ceviche.");
                totalPrice += scallopCeviche.price;
                totalDonation += scallopCeviche.donation;
                break;
            case 4:
                System.out.println("You chose scallop aguachile.");
                totalPrice += scallopAguachile.price;
                totalDonation += scallopAguachile.donation;
                break;
            case 5:
                System.out.println("You chose all seafood cocktail.");
                totalPrice += allSeafoodCocktail.price;
                totalDonation += allSeafoodCocktail.donation;
                break;
            case 6:
                System.out.println("You chose all seafood ceviche.");
                totalPrice += allSeafoodCeviche.price;
                totalDonation += allSeafoodCeviche.donation;
                break;
            case 7:
                System.out.println("Your entree order is complete.");
                break;
            }
        }while (choice != 7);                                           //do while loop ensures that the customer is able to continue ordering
        
        System.out.println("What desserts would you like to order?");   //this question must only be asked once
        do{                                                                 //using a do while loop because the dessert menu must print out at least once
            System.out.println("Enter 1 for flan");
            System.out.println("Enter 2 for pan dulce");
            System.out.println("Enter 3 for fresas con crema");
            System.out.println("Enter 4 when you are done ordering");
            choice = input.nextInt();
        
            switch(choice){                                                 //the number that is entered determines which case will be performed
            case 1:                                                             //each case lets the customer know which item they chose and adds the total cost and donation of the order
                System.out.println("You chose flan.");
                totalPrice += flan.price;
                totalDonation += flan.donation;
                break;
            case 2:
                System.out.println("You chose pan dulce.");
                totalPrice += panDulce.price;
                totalDonation += panDulce.donation;
                break;
            case 3:
                System.out.println("You chose fresas con crema.");
                totalPrice += fresasConCrema.price;
                totalDonation += fresasConCrema.donation;
                break;
            case 4:
                System.out.println("Your dessert order is complete.");
                break;
            }
        }while (choice != 4);
        
        System.out.println("Your total price is $" + totalPrice + " and your total donation is $" + totalDonation + ".");
        System.out.println("To which cause would you like to donate to?");
        System.out.println("Enter 1 for homeless shelter");
        System.out.println("Enter 2 for animal shelter");
        System.out.println("Enter 3 for low income children");
        choice = input.nextInt();
        while(choice < 0 || choice > 3){                                        //while loop ensures that the user inputs a valid number
            System.out.println("Please enter a number between 1 and 3.");
            choice = input.nextInt();
        }
        choice -= 1;
            
        System.out.println("You will be donating $" + totalDonation + " to " + causes[choice] + ".");
    }
}
