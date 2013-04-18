import java.lang.Math;
class Question{
    protected String question;//The text of the question
    protected String[] answers;//All the possible answers
    protected int rightAnswer,points;//The array position of the right answer and the point/money value of the question
    protected boolean lockin;//false if the person is not locked in, true when they do
    protected String category;//The category of the question
    Question (){}
    
    Question (int givenPoints,String givenCategory,String givenQuestion,String[] givenAnswers,int givenRight){
        //Define everything as the given value
        points=givenPoints;
        category=givenCategory;
        question=givenQuestion;
        rightAnswer=givenRight;
        answers=givenAnswers;
        for (int i=0;i<4;i++){
          shuffle();}
    }
    public int rightAnswer(){
    return rightAnswer;
    }
    
    public String[] answers(){
    return answers;
    }
    
    public String question(){
    return question;
    }
    
    public int value(){
    return points;
    }
    
    public String category(){
    return category;
    }
    
    public void display (){
        System.out.println("For "+points);
        System.out.println("In the category "+category);
        System.out.println("The question is "+question);
        for (int i=0;i<4;i++)
            System.out.println(((char)(i+(int)'A'))+")+"+answers[i]);
        
        System.out.println("The right answer was "+(char)(rightAnswer+(int)'A'));
    }
    
    public void shuffle(){
      
        int swap1=(int)(Math.random()*4);
        int swap2=(int)(Math.random()*4);
        //System.out.println("EVERYDAY IM SHUFFLIN\n"+swap1+" and "+swap2+" swapped");
        String buffer=answers[swap1];
        answers[swap1]=answers[swap2];
        answers[swap2]=buffer;
        //if one of the swapped answers was the righ
        if (rightAnswer==swap1)
            rightAnswer=swap2;
        else if (rightAnswer==swap2)
            rightAnswer=swap1;
    }
}