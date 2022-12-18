package Review9;


    public class Apple extends Fruit {
        String size;
        String taste;
        double price;

        Apple(String name, String shape, String color, String size) {
            super(name, shape, color);
            this.size = size;
        }

        Apple(String name, String shape, String color, String size, String taste, double price) {
            this(name, shape, color, size);
            this.taste = taste;
            this.price = price;

        }
        //child class method
        //overloading methods with the same name within SAME CLASS
        /*
        * how to achieve overloading:
        * 1.change # of parameters
        * 2.change type of parameters
        *
        * in overloading - method signature MUST BE DIFFERENT
        * method signature = name+parameters
        * */
        void makeJuice(){
            System.out.println("from "+name+"we can make "+taste+"juice");
        }
        /*
        * this is not verloading-> signature is same
        * String makeJuice(){
        * }
        * */
        void makeJuice(String fruit){
            System.out.println("We can have juice from "+name+" mixed w "+fruit);
        }





        public static void main(String[] aaaa) {
            Apple app = new Apple("apple", "circle", "red", "big");
            //app.color; nor visible since access modifier is PRIVATE
            System.out.println(app.name);
            System.out.println(app.shape);

            System.out.println(Fruit.fresh);
            System.out.println(Apple.fresh);

            app.grow();// from fruit class
            app.haveBenefits();//from fruit class
            app.makeJuice();// from apple class
        }
    }
