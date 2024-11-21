package org.example.designpattern.creational.tp.singleton;

public class App {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        config.setConfig("BDD", "postgresql://lucas:admin@192.168.1.5/MyDataBase");
        config.setConfig("APIKEY", "SRDXCFVGBHnjhbgfgzd564416315314");
        Configuration config2 = Configuration.getInstance();
        
        System.out.println("SAME BDD : ".concat(config.getConfig("BDD") == config2.getConfig("BDD") ? "true" : "false"));
        System.out.println("SAME APIKEY : ".concat(config.getConfig("APIKEY") == config2.getConfig("APIKEY") ? "true" : "false"));
        System.out.println("SAME Instance : ".concat(config == config2 ? "true" : "false"));

        config2.setConfig("BDD", "postgresql://admin:admin@192.168.1.5/MyDataBase");
        System.out.println("SAME BDD : ".concat(config.getConfig("BDD") == config2.getConfig("BDD") ? "true" : "false"));

    }
}
