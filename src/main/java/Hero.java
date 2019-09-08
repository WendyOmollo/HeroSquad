    public class Hero {

    private String name;
    private int age;
    private String strength ;
    private String weakness;

        public Hero(String name, int age, String strength, String weakness){
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.weakness = weakness;

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
    }
