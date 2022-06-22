package _1_ACA.Gorcnakan_1.Saving_Accaunt.Ponchik;

public class Store {
    private int donut = 100;
    private int iceCream = 100;
    private int juice = 100;

    void seller(int _donut, int _iceCream, int _juice) {
        System.out.println("You booking is donuts: " + _donut + " IceCreams: " + _iceCream + " juices: " + _juice);
        CashRegister cr = new CashRegister();
        if (this.donut > _donut && this.iceCream > _iceCream && this.juice > _juice) {
            this.donut = this.donut - _donut;
            this.iceCream = this.iceCream - _iceCream;
            this.juice = this.juice - _juice;
            System.out.println("Store: You need to pay for yor booking at Cash Register");
            if (cr.payFor(_donut, _iceCream, _juice)) {
                System.out.println("Store: This is your purchase: THANK YOU \n");
            } else {
                System.out.println("Store: You don't pay for your booking: I cant give you your booking");
                this.donut = this.donut + _donut;
                this.iceCream = this.iceCream + _iceCream;
                this.juice = this.juice + _juice;
            }
        }
        else {
            if (this.donut < _donut) {
                System.out.println("Store: Sorry but we have only:  " + this.donut + "  donuts");
            }
            if (this.iceCream < _iceCream) {
                System.out.println("Store: Sorry but we have only:  " + this.iceCream + "  IceCream");
            }
            if (this.juice < _juice) {
                System.out.println("Store: Sorry but we have only:  " + this.juice + "  juice");
            }
        }

    }

    public int getDonut() {
        return donut;
    }

    public void setDonut(int donut) {
        this.donut = this.donut + donut;
    }

    public int getIceCream() {
        return iceCream;
    }

    public void setIceCream(int iceCream) {
        this.iceCream = this.iceCream + iceCream;
    }

    public int getJuice() {
        return juice;
    }

    public void setJuice(int juice) {
        this.juice = this.juice + juice;
    }
}