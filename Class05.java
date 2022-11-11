public class app11_3
{
  public static void main(String args[])
  {
    CShape shape[];
    shape = new shape[2];
    shape[0]=new CRectamgle(5, 10);
    shape[0].setColor("Yellow");
    shape[0].show();
    shape[1]=new CCircle(2.0);
    shape[1].setColor("Green");
    shape[1].show();
  }
}
      
