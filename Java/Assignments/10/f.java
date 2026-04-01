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

public class f {
    public static void main(String[] args) {
        Document pdf = new PDFDocument();
        Document word = new WordDocument();

        pdf.export();
        word.export();
    }
}