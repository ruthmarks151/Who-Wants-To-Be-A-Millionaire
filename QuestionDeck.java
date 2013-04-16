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
public void fill(){
  while(!doneLoading){
  addQuestion();
  }
} 

public Question get(){
return deck[(int)(Math.random()*deck.length)];
}

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
  catch (IOException e){
  System.out.println(deck.length+" Questions added End of File!");
    doneLoading=true;
  }
  
}

}