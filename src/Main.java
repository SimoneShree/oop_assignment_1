import models.Result;

public class Main {
    public static void main(String[] args) {
        Result Simone=new Result();
        Simone.setMusic(91);
        System.out.println("Simone's mark in music:"+ Simone.getMusic());
        Simone.setDance(79);
        System.out.println("Simone's mark in Dance:"+ Simone.getDance());

    }
}
