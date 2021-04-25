public class Main {

    public static void main(String[] args) {

        Course course1=new Course(1,"Java","Engin Demirog","Java Programlama",0);
        Course course2=new Course(2,"C#","Engin Demirog","C# Programlama",0);
        Course course3=new Course(3,"Python","Engin Demirog","Python Programlama",0);


        Course[] courses={course1,course2,course3};

        for (Course course:courses) {
            System.out.print(course.id+"-");
            System.out.println(course.courseName);
        }

        Category category1=new Category(1,"Programming");
        Category category2=new Category(2,"Front-end");
        Category category3=new Category(3,"Back-end");

        Category[] categories={category1,category2,category3};

        for (Category category:categories) {
            System.out.print(category.id+"-");
            System.out.println(category.categoryName);
        }

        CourseManager courseManager=new CourseManager();

        courseManager.joinCourse(course1);

        courseManager.getDetailCourse(course3);

    }

}
