package interTest;

public class ResizeableCircle extends Circle implements ExtendedShape{

   @Override
   public void resize(int size) {
      System.out.println("크기를 조절한 원을 그립니다" + size + "%");
   }

   
}
