package models;

import java.util.ArrayList;

public class Squad {

    private String name;
    private int maxSize;
    private String mission;
    private int identifier;
    private static ArrayList<Squad> instances= new ArrayList<>();

    public Squad(String name,int maxSize,String mission){
        this.name = name;
        this.maxSize = maxSize;
        instances.add(this);
        this.mission = mission;
        this.identifier = instances.size();
        }

    public static  ArrayList<Squad> getAll() {
        return instances;
    }

    public static void setInstances(ArrayList<Squad> instances) {
        Squad.instances = instances;
    }

    public int getMaxSize() {
            return maxSize;
        }

        public void setMaxSize(int maxSize) {
            this.maxSize = maxSize;
        }

        public String getMission() {
            return mission;
        }

        public void setMission(String mission) {
            this.mission = mission;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public int getIdentifier() {
            return identifier;
        }

        public void setIdentifier(int identifier) {
            this.identifier = identifier;
        }
        public void updateSquad(String name,int maxSize,String mission){
            this.name = name;
            this.maxSize = maxSize;
            this.mission = mission;
        }
        public void deleteSquad(String name,int maxSize,String mission,int identifier){
            this.name = name;
            this.maxSize = maxSize;
            this.mission = mission;
            this.identifier = identifier;
        }
    public static void clearAllSquads(){
        instances.clear();
    }

    }
