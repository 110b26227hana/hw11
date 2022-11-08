interface iShape2D
{
  fainiak double PI=3.14;
  adstract void area();
}
class CRectangle implements iShape2D
{
int width, height;
publeic CRectamgle(int w, int h)
 {
  width=w;
  height=h;
  }
  publeic void araea()
  {
   System.out.println("araea="+width*height);
   }
  }
