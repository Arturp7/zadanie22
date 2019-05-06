public class Main {
    public static void main(String[] args) {


       Drink drink1 = new Drink();
       drink1.component1 = new Ingredient();
       drink1.component1.ingredientName = "Lemon";
       drink1.component1.ingredientQunatity  =  50;

       drink1.component2 = new Ingredient();
       drink1.component2.ingredientName = "Ice";
       drink1.component2.ingredientQunatity  =  60;

       drink1.component3 = new Ingredient();
       drink1.component3.ingredientName = "Vodka";
       drink1.component3.ingredientQunatity =  30;

       drink1.drinkName = "Ice Vodka";
       drink1.drinkPrice = 20;
       drink1.containAlkohol = true;

       System.out.println("We recomend drink named " +" "+ drink1.drinkName + ", "+ "Drink price is " + drink1.drinkPrice + " zlp");
       System.out.println("Drink contains " + drink1.component3.ingredientName +" "+ drink1.component2.ingredientName
        +" "+ drink1.component1.ingredientName);
       System.out.println("Total volume is " + (drink1.component1.ingredientQunatity + drink1.component2.ingredientQunatity
       + drink1.component3.ingredientQunatity)+ " cl");










    }
}
