import com.workintech.course.cylinder.Circle;
import com.workintech.course.cylinder.Cylinder;
import com.workintech.course.developerCompany.HRManager;
import com.workintech.course.developerCompany.JuniorDeveloper;
import com.workintech.course.developerCompany.MidDeveloper;
import com.workintech.course.developerCompany.SeniorDeveloper;
import com.workintech.course.pool.Cuboid;
import com.workintech.course.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("---------------------");

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("---------------------");

        HRManager hr = new HRManager(1,"Ali",3500);
        JuniorDeveloper serra = new JuniorDeveloper(1,"Serra",2250);
        MidDeveloper mehmet = new MidDeveloper(1,"Mehmet",3200);
        SeniorDeveloper deniz = new SeniorDeveloper(1,"Deniz", 4500);

        JuniorDeveloper ahmet = new JuniorDeveloper(1,"Ahmet",2500);
        JuniorDeveloper furkan = new JuniorDeveloper(1,"Furkan",2250);
        JuniorDeveloper faruk = new JuniorDeveloper(1,"Faruk",2750);

        hr.work();
        hr.addEmployee(serra);
        hr.addEmployee(mehmet);
        hr.addEmployee(deniz);
        hr.addEmployee(ahmet);
        hr.addEmployee(furkan);

        System.out.println("HR Manager: " + hr);
    }
}