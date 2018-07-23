package com.zyp.test.iterator;

public class Client {
    private Iterator it;
    private AbsWarehouse warehouse = new MyWarehouse();
    public void operation(){
        it = warehouse.createIterator();
        while (!it.isDone()){
            System.out.println(it.currentItem().toString());
            it.next();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.operation();
    }
}
