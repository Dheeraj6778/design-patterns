public class USBTypeCImpl implements USBTypeC{
    @Override
    public void connectTypeC() {
        System.out.println("USB Type-C connected.");
    }

    @Override
    public void transferData() {
        System.out.println("Data transfer via USB Type-C.");
    }
}
