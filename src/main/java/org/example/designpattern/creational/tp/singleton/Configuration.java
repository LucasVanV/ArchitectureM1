package org.example.designpattern.creational.tp.singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private static Configuration instance;
    private Map<String, String> dict;

    private Configuration(){
        this.dict = new HashMap<String, String>();
    }

    public static Configuration getInstance(){
        if(instance == null){
            instance = new Configuration();
        }
        return instance;
    }

    public String getConfig(String key){
        return this.dict.get(key);
    }

    public void setConfig(String key, String value){
        this.dict.put(key, value);
    }
    
}
