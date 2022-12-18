package HelpNotes;

public class StringReplaceAll {
    String censorLetter(String let, char d){
        String govno=let.replaceAll(d+"","*");
        return govno;
    }
    public static void main(String[]aaaa){
        StringReplaceAll buc=new StringReplaceAll();
        String final2=buc.censorLetter("computer science",'e');
        System.out.println(final2);

        String final3=buc.censorLetter("trick or treat",'t');
        System.out.println(final3);
    }
}
