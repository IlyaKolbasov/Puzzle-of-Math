package Space.Kolbasoff.puzzelofmath;

public interface Manager {
    TaskManager manager = new TaskManager();

    class TaskManager{
        int i = 1;

        public void increment(){i++;}
        public  int getI(){return  i;}
        public void setI(int value){ i=value;}
    }

}
