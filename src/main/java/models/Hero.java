package models;

import java.util.ArrayList;

public class Hero {
    private static ArrayList<Hero> examples= new ArrayList<>();
    private String name;
    private int age;
    private String strength ;
    private String weakness;
    private int id;

        public Hero(String name, int age, String strength, String weakness){
        this.name = name;
        this.age = age;
        examples.add(this);
        this.strength = strength;
        this.weakness = weakness;
        this.id = examples.size();

        }

    public static ArrayList<Hero> getAll() {
        return examples;
    }

    public static void setExamples(ArrayList<Hero> examples) {
        Hero.examples = examples;
    }

    public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStrength() {
            return strength;
        }

        public void setStrength(String strength) {
            this.strength = strength;
        }

        public String getWeakness() {
            return weakness;
        }

        public void setWeakness(String weakness) {
            this.weakness = weakness;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        public void updateHero(String name,int age,String strength,String weakness){
            this.name = name;
            this.age = age;
            this.strength = strength;
            this.weakness = weakness;
        }
        public void deleteHero(int id,String name,int age,String strength,String weakness){
            this.id =id;
            this.name = name;
            this.age = age;
            this.strength = strength;
            this.weakness = weakness;
        }
        public static void clearAllHeroes(){
            examples.clear();
        }


}
