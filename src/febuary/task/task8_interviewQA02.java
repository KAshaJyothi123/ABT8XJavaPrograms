package febuary.task;

public class task8_interviewQA02
{
    /*
    Traingle classifier
    write a program that classifies a triangle based on its side lengths.
    given three integers represting the side lengths of a triangle, determine
    if the triangle is equilateral(all sides are equal),
    isosceles(two sides are equal),
    or scalene(no sides are equal).
    if the given side lengths cannot form a valid triangle, print "Not a triangle"

     */
    public static void main(String[] args) {
        int side1=5;
        int side2=5;
        int side3=5;

        if(side1==side2 && side2==side3)
        {
            System.out.println("Equilateral triangle");
        }
        else if(side1==side2 || side2==side3 || side3==side1)
        {
            System.out.println("isosceles triangle");
        }
        else if(side1!=side2 && side2!=side3 && side3!=side1)
        {
            System.out.println("scalene triangle");
        }
        else
        {
            System.out.println("Not a triangle");
        }
    }
}
