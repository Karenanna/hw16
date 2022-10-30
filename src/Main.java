public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov, 1966);
        masterAndMargarita.setYearPublished(2012);
        System.out.println(masterAndMargarita.getYearPublished());
    }
}