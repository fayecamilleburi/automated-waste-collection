public class OrganicWasteCollector extends BaseWasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getWasteType().equalsIgnoreCase("Organic")) {
            System.out.println("Collecting and composting organic waste.");
        } else {
            super.collectWaste(container);
        }
    }
}