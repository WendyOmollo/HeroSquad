package models;

    public class Squad {

    private String name;
    private int maxSize;
    private String mission;
//    private int identifier;

    public Squad(String name,int maxSize,String mission){
        this.name = name;
        this.maxSize = maxSize;
        this.mission = mission;
//        this.identifier = identifier;
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
    }
