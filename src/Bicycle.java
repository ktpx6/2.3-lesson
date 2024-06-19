public class Bicycle extends Transport {
    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
