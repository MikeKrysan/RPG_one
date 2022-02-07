public class Merchant implements Seller{    //4

    @Override
    public String sell(Goods goods) {
        String result = "";
        if(goods == Goods.POTION) {
            result = "potion";
        }
        return result;
    }

    public enum Goods {
        POTION
    }
}

/*
Здесь при помощи интерфейса Seller реализован метод sell. Можно еще дописать логику проверки достаточности денег для покупки, а также добавить
товары и метод для покупки вещей, которые будут давать за победу
 */