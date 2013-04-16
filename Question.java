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
  
}

public void display (){
System.out.println("For "+points);
System.out.println("In the category "+category);
System.out.println("The question is "+question);
for (int i=0;i<4;i++)
  System.out.println((char)(i+(int)'A')+") "+answers[i]);
}

public void shuffle(){
swap1=Math.random()*4;
swap2=Math.random()*4;
String 
if (swap1=rightAnswer)

}
}