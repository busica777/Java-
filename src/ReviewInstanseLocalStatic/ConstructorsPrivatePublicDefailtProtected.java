package ReviewInstanseLocalStatic;

public class ConstructorsPrivatePublicDefailtProtected {
 //Write a java class that have 4 constructors with 4 different access levels
    // of constructors(private,public,default,protected) and
    // create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.
    String nickname,rank;
    double height;

    int money;
//CONSTRUCTOR 1

    private ConstructorsPrivatePublicDefailtProtected (String Green, String cap, double tall,int order){

        nickname=Green;
        rank=cap;
        height=tall;
        money=order;
    }
    //CONSTRUCTOR2

    ConstructorsPrivatePublicDefailtProtected(String Green, String cap){
    nickname=Green;
    rank=cap;
    }

    //CONSTRUCTOR 3
    protected ConstructorsPrivatePublicDefailtProtected(String Green, String cap, int order ){
     nickname=Green;
     rank=cap;
     money=order;
    }
    void print(){
        System.out.println(nickname +" is a"+rank+"and he is "+ height+" tall. "+"His service costs "+money );
    }
}
