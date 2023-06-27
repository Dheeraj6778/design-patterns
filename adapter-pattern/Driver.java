public class Driver {
    public static void main(String[] args) {
        USBTypeC usbTypeC = new USBTypeCImpl();
        MicroUSB adapter = new USBTypeCAdapter(usbTypeC);

        // The client code can now work with the MicroUSB interface.
        adapter.connectMicroUSB();
        adapter.transferData();

    }
}
