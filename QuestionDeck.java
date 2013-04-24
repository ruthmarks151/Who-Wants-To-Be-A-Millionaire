import java.io.*;
import java.lang.Math;

class QuestionDeck{
  protected Question[] deck;
  protected QuestionLoader ql;
  private boolean doneLoading;
  
  QuestionDeck() {
    doneLoading=false;
    deck=new Question[1];
    ql=new QuestionLoader();
    try{  
      deck[0]=ql.read();}catch (IOException e){
        System.out.println("The first question wouldn't load!");
        doneLoading=true;
      }
  }
  
//fills the deck with questions from the file
  public void fill(){
    while(!doneLoading){//if the end of the file has not been reached
      addQuestion();//add a sigle question
    }
  } 
  
//Gets a random question and returns it
  public Question get(){
    return deck[(int)(Math.random()*deck.length)];
  }
  
//Gets a random question and if it has the requested value of points, returns it
  public Question get(int points){
    Question q;
    do{
      q=deck[(int)(Math.random()*deck.length)];
    }while (q.level.value()!=points);
    return q;
  }

//Gets a random question and if it has the requested category, returns it
  public Question get(String category){
    Question q;
    do{
      q=deck[(int)(Math.random()*deck.length)];
    }while (!(category.equals((q.category()))));
    return q;
  }

//Gets a random question and if it has the requested value of points and category, returns it
  public Question get(int points,String category){
    Question q;
    do{
      q=deck[(int)(Math.random()*deck.length)];
    }while (!((q.level.value()==points)&&(category.equals((q.category())))));
    return q;
  }
  
  
//creates a new array, copies all the old elements and adds a new one to the end that was loaded from a file
  protected void addQuestion(){
    Question[] tempdeck=new Question[deck.length+1];
    
    for (int i=0;i<deck.length;i++){
      tempdeck[i]=deck[i];
    }
    try{
      System.out.println("Trying to add");
      
      tempdeck[deck.length]=ql.read();
      deck=tempdeck;
    }
    catch (IOException e){//if the question loader has an exception, which most likeley is the end of the file
      System.out.println(deck.length+" Questions added End of File!");
      doneLoading=true;
    }
    
  }
  
}