class Application {

    String name="SimpleApplication";

    void run(String[] args) {
        System.out.println(name);
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        
    }
}
