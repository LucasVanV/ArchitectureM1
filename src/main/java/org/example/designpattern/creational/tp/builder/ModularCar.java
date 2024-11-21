package org.example.designpattern.creational.tp.builder;

public class ModularCar {
    private Modele modele;
    private MotorType motorType;
    private int seat;

    private String color;
    private boolean isGPS;
    private boolean isToitOuvrant;

    ModularCar(Modele modele, MotorType motorType, int seat){
        checkConforme(modele, motorType, seat);
        this.modele = modele;
        this.motorType = motorType;
        this.seat = seat;
    }

    ModularCar(ModularCarBuilder builder){
        checkConforme(builder.modele, builder.motorType, builder.seat);
        this.modele = builder.modele;
        this.motorType = builder.motorType;
        this.seat = builder.seat;
        this.color = builder.color;
        this.isGPS = builder.isGPS;
        this.isToitOuvrant = builder.isToitOuvrant;
    }

    private boolean checkConforme(Modele modele, MotorType motorType, int seat){
        if(modele == Modele.SPORTIVE && motorType == MotorType.ELECTRIQUE){
            throw new IllegalArgumentException("UNE VOITURE DE SPORT CA FAIS DU BRUIT !");
        }
        if(modele == Modele.SUV && seat < 5){
            throw new IllegalArgumentException("T'EN CONNAIS BCP DES SUV A "+ seat+ " PORTES !");
        }
        return true;
    }

    @Override
    public String toString(){
        return "ModularCar : {\n" + "Modele : " + modele.toString()
         + "\n  MotorType : " + motorType.toString()
         + "\n  Color :" + color
         + "\n  seat : " + seat 
         + "\n  GPS : " + (isGPS ? "true" : "false")
         + "\n  toit ouvrant : " + (isToitOuvrant ? "true" : "false") 
         +"\n}";
    }

    public static class ModularCarBuilder {
        private Modele modele;
        private MotorType motorType;
        private int seat;

        private String color;
        private boolean isGPS = false;
        private boolean isToitOuvrant = false;

        ModularCarBuilder(Modele modele, MotorType motorType, int seat){
            this.modele = modele;
            this.motorType = motorType;
            this.seat = seat;
        }

        public ModularCarBuilder setColor(String color){
            this.color = color;
            return this;
        }

        public ModularCarBuilder setIsGPS(boolean isGPS){
            this.isGPS = isGPS;
            return this;
        }

        public ModularCarBuilder setIsToitOuvrant(boolean isToitOuvrant){
            this.isToitOuvrant = isToitOuvrant;
            return this;
        }

        public ModularCar build(){return new ModularCar(this);}
    }
}
