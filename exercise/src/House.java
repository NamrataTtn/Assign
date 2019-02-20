public class House {

    //QNO 9

    enum HouseDetails {
        BHK1(15),BHK2(25),BHK3(35),Bunglow(50);
        private int price;
        HouseDetails(int p) {
            price = p;
        }
        int getPrice() {
            return price;
        }
    }

}
