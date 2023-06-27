public class MicroUSBImpl implements MicroUSB{
    @Override
    public void connectMicroUSB() {
        System.out.println("MicroUSB connected.");
    }

    @Override
    public void transferData() {
        System.out.println("Data transfer via MicroUSB.");
    }
}
