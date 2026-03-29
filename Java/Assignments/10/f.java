abstract class Document {
    abstract void export();
}

class PDFDocument extends Document {
    @Override
    void export() {
        System.out.println("Exporting as PDF...");
    }
}

class WordDocument extends Document {
    @Override
    void export() {
        System.out.println("Exporting as Word document...");
    }
}