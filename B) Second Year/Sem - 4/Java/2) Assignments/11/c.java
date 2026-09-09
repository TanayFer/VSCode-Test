// Interface definition
interface ScannerDevice {
    void scan();
}

// DocumentScanner implementation
class DocumentScanner implements ScannerDevice {
    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

// BarcodeScanner implementation
class BarcodeScanner implements ScannerDevice {
    @Override
    public void scan() {
        System.out.println("Scanning barcode...");
    }
}

public class c {
    public static void main(String[] args) {
        ScannerDevice documentScanner = new DocumentScanner();
        ScannerDevice barcodeScanner = new BarcodeScanner();

        documentScanner.scan();
        barcodeScanner.scan();
    }
}