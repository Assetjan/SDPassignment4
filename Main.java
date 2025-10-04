public class Main {
    public static void main(String[] args) {
        Document doc1 = new Report(new PDFExporter());
        doc1.save();

        Document doc2 = new Resume(new WordExporter());
        doc2.save();
    }
}
