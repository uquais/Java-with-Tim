public class Hello {

    public static void main(String[] args) {

        Display('A', 3);
        int Score =HighSchool(600);
        System.out.println("the second method score is " + Score);
    }

    public static void Display (char name, int position)

    {
        System.out.println( name +" Manged to into position "+ position+ "in the high school");
    }
    public static  int HighSchool(int score)
    {
     if (score> 1000)
         return 1;
     else if (score>500 && score <1000)
         return 2;
     else if (score> 100 && score<500)
         return 3;
     else
         return 4;
}
}
