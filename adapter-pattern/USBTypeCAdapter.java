public class USBTypeCAdapter implements MicroUSB{
    private USBTypeC usbTypeC;
    public USBTypeCAdapter(USBTypeC usbTypeC) {
        this.usbTypeC = usbTypeC;
    }

    @Override
    public void connectMicroUSB() {
        usbTypeC.connectTypeC();
    }

    @Override
    public void transferData() {
        usbTypeC.transferData();
    }

}
