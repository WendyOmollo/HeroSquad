package models;

    public class Squad {

    private String name;
    private int maxSize;
    private String mission;
   private int identifier;

    public Squad(String name,int maxSize,String mission){
        this.name = name;
        this.maxSize = maxSize;
        this.mission = mission;
        this.identifier = identifier;
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

    }
