abstract class Document {
    protected Exporter exporter;

    Document(Exporter exporter) {
        this.exporter = exporter;
    }

    abstract void save();
}

class Report extends Document {
    Report(Exporter exporter) {
        super(exporter);
    }

    void save() {
        exporter.export("Отчёт");
    }
}

class Resume extends Document {
    Resume(Exporter exporter) {
        super(exporter);
    }

    void save() {
        exporter.export("Резюме");
    }
}