public class RecyclableWasteCollector extends BaseWasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getWasteType().equalsIgnoreCase("Recyclable")) {
            System.out.println("Collecting and processing recyclable waste.");
        } else {
            super.collectWaste(container);
        }
    }
}