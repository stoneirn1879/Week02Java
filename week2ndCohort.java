class week2ndCohort {

    public static void main(String[] args) {

        boolean isHotOutside = true;
        boolean isWeekday = false;
        boolean hasMoneyInPocket = true;

        double costOfMilk = 3.59;
        double moneyInWallet = 9.79;
        int thirstLevel = 8;

        boolean shouldByIceCream = ((isHotOutside) && (moneyInWallet > 2));
        boolean willGoSwimming = ((isHotOutside) && (!isWeekday));
        boolean isAGoodDay = ((isHotOutside) && (moneyInWallet > 0 ) && (!isWeekday));
        boolean willBuyMilk = ((isHotOutside) && (thirstLevel >= 3) && (moneyInWallet >= 2 * costOfMilk));

        System.out.println(shouldByIceCream);
        System.out.println(willGoSwimming);
        System.out.println(isAGoodDay);
        System.out.println(willBuyMilk);



    }



}
