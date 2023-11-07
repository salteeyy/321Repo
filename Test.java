public class Test{
    static int id;
    static String name;
    static boolean started;

    public void method1(String name){
        name = "Test";
    }

    public void method2(int id){
        id = 1;
    }

    /**
     * @author StoicNeutron
     * @param started
     */
    public void method3(boolean started){

        if(started){
            System.out.println("This process has started!");
        }else{
            System.out.println("This process has not yet started!");
        }
    }

}
