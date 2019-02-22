public class Customer {

    private String name;
    private Boolean orderStatus;
    private float cash;
    private int token;
    private int coffeeQuantity;

    public Customer(String name, Boolean orderStatus, float cash, int token, int coffeeQuantity) {
        this.name = name;
        this.orderStatus = orderStatus;
        this.cash = cash;
        this.token = token;
        this.coffeeQuantity = coffeeQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int getCoffeeQuantity() {
        return coffeeQuantity;
    }

    public void setCoffeeQuantity(int coffeeQuantity) {
        this.coffeeQuantity = coffeeQuantity;
    }
}
