package models;

public class Store {
    private Item[][] items;

    public Store() {
        this.items = new Item[7][3];
    }

    public Item getItem(int row, int column) {
        return new Item(this.items[row][column]);
    }

    public void setItem(int row, int column, Item item) {
        this.items[row][column] = new Item(item);
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.length; i++) {
            for (int j = 0; j < this.items[i].length; j++) {
                temp += this.items[i][j].toString();
            }
            temp += "\n\n";
        }
        return temp;
    }
}
