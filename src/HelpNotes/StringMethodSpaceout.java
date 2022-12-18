package HelpNotes;

public class StringMethodSpaceout {
    String spaceOut(String name){

        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        } return name;

    }
    public static void main(String[]aaaa){
        StringMethodSpaceout buc=new StringMethodSpaceout();
        buc.spaceOut("hello");

    }
}