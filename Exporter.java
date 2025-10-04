public interface Exporter {
    void export(String text);
}

class PDFExporter implements Exporter {
    public void export(String text) {
        System.out.println("Экспортируем в PDF: " + text);
    }
}

class WordExporter implements Exporter {
    public void export(String text) {
        System.out.println("Экспортируем в Word: " + text);
    }
}
