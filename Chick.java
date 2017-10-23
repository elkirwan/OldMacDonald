class Chick implements Animal 
{     
  private String myType;
  private String mySound;
  private String mySound2;
 private int age;
  public Chick(String type, String sound, String sound2)

  {
    myType = type;
    mySound = sound;
    mySound = sound2;
age = (int)Math.random()*2+1;
  }
  public String getSound(){
  if(age == 1)
  {
return mySound;
  }
  else
  {
  return mySound2;
  }
}     
     public String getType(){return myType;} 
}
     //your code here