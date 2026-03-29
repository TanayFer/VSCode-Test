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