import java.lang.Math;
class Question{
  protected String question;//The text of the question
  protected String[] answers;//All the possible answers
  protected int rightAnswer;//The array position of the right answer and the point/money value of the question
  protected Level level;
  protected boolean lockin;//false if the person is not locked in, true when they do
  protected String category;//The category of the question
  protected int selected;
  //One line acsessors
  public Level level (){return level;}
  public int rightAnswer(){return rightAnswer;}
  public String[] answers(){return answers;} 
  public boolean correct(){return rightAnswer==selected;}
  public String question(){return question;}
  public String category(){return category;}
  public int selected(){return selected;}
  //One line Mutators
  public void lock(){lockin=true;}
  public void selected(int s){selected=s;}
  
  
  
  Question (){}
  
  Question (int givenPoints,String givenCategory,String givenQuestion,String[] givenAnswers,int givenRight){
    //Define everything as the given value
    level=new Level (givenPoints);
    category=givenCategory;
    question=givenQuestion;
    rightAnswer=givenRight;
    answers=givenAnswers;
    for (int i=0;i<4;i++){
      shuffle();}
  }
  
  
  
  
  
  public void display (){
    System.out.println("For "+ level.value());
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