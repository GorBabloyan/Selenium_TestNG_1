package _3_ItProger_Java.InnerClass;

public class InnerParent {
    private String name;
    private String color;
    void setValues(String name, String color){
        this.name = name;
        this.color= color;
    }
    String getValue(){
        return "name:" + name + " and it is " + color;
    }


    public  Engine engine = new Engine();




    class Engine{
        private boolean isReady;
        private int km;
        void setReady(boolean isReady, int km){
            this.isReady = isReady;
            this.km = km;
        }
        String info(){
            if (isReady)
                return "Engine is OK you csn drive it";
            else
                return "Engine is Not OK, you already drive it " + km + "km";
        }

    }



}
