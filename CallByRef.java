
class Test1

{

                int a, b;

                Test1(int i, int j)

                {

                                a=i;

                                b=j;

                }

                void swap(Test1 ob)

                {

                                int c;

                                c=ob.a;

                                ob.a=ob.b;

                                ob.b=c;

                               System.out.println("Inside swap Method");

                                

                }

}

class SwapCallByRef

{

                public static void main(String[] args)

                {

                                Test1 ob = new Test1(2,3);
                                System.out.println("Before Swapping");

                                 System.out.println("ob.a="+ob.a+"ob.b="+ob.b);

                                

                                ob.swap(ob);
                                System.out.println("after Swapping");

                                System.out.println("ob.a="+ob.a+"ob.b="+ob.b);

                                

                }

}