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


}