class Level{
  private int []levels={100,200,300,500,1000,2000,4000,8000,16000,32000,64000,125000,250000,500000,1000000};
  private int level;//Holds a reference to the array not a value
  
  Level(){
    level=0;
  }
  public int levelAt(int i){return levels[i];}
  Level (int points){
    System.out.println("Constructing points!");
    setLevel(points);
    System.out.println("Sucsess!");
  }
  public void setLevel(int points){
    for (int i=0;(points<levels[i])&&(i<14);i++){
      level=i;
    }
  }
  
  public void nextLevel(){
    level++;
  }
  
  public int value(){
    return levels[level];  
  }
  
  public int dropLevel(){
    while((level+1)%5!=0)
      level--;
    return levels[level];
    
  }
  
}