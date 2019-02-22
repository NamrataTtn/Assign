public class Metal_Furniture {

    private String type;
    private String model_no;
    private float price;
    private static int quan_sold = 0;
    private boolean stress_test;
    private boolean fire_test;

    public Metal_Furniture(String type, String model_no, float price, boolean stress_test, boolean fire_test) {
        this.type = type;
        this.model_no = model_no;
        this.price = price;
        this.stress_test = stress_test;
        this.fire_test = fire_test;
        quan_sold++;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel_no() {
        return model_no;
    }

    public void setModel_no(String model_no) {
        this.model_no = model_no;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static int getQuan_sold() {
        return quan_sold;
    }

    public static void setQuan_sold(int quan_sold) {
        Metal_Furniture.quan_sold = quan_sold;
    }

    public boolean isStress_test() {
        return stress_test;
    }

    public void setStress_test(boolean stress_test) {
        this.stress_test = stress_test;
    }

    public boolean isFire_test() {
        return fire_test;
    }

    public void setFire_test(boolean fire_test) {
        this.fire_test = fire_test;
    }

}
