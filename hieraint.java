 class Student{
     int Roll;
     String Name = new String();
     void GetName(){
        Name ="Shiboshree Roy";
        System.out.println("Student Name:"+Name);
     }
 }
  class Academic extends Student{
    int Roll;
    void GetRoll(){
        Roll =503336;
        System.out.println("Student Roll:"+Roll);
    }
  }
  class Result extends Student{
    float Mark;
    void GetMark(){
        Mark =3.92f;
        System.out.println("Mark:"+Mark);
    }
  }
  class  hieraint{
    public static void main(String[] args){
        Academic  A = new Academic();
        A.GetRoll();
        Student S =new Student();
        S.GetName();
        Result R = new Result();
        R.GetMark();
    }
  }
