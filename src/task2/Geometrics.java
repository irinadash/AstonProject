package task2;

public class Geometrics {

        public static void main(String[] args) {
            FormsCount circle = new Circle(2, "Красный", "Синий");
            FormsCount rectangle = new Rectangle(2, 3, "Зеленый", "Желтый");
            FormsCount triangle = new Triangle(2, 3, 4, "Фиолетовый", "Розовый");

            System.out.println("Круг:");
            circle.printShapeInfo();
            System.out.println();

            System.out.println("Прямоугольник:");
            rectangle.printShapeInfo();
            System.out.println();

            System.out.println("Треугольник:");
            triangle.printShapeInfo();
        }
}
