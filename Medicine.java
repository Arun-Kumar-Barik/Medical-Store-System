class Medicine {
    private String name;
    int quantity;
    private double price;
    String expDate;

    public Medicine(String name, int quantity, double price,String expDate) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.expDate=expDate;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getExpDate()
    {
        return expDate;
    }
}