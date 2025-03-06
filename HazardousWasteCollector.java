public class HazardousWasteCollector extends BaseWasteCollector {
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getWasteType().equalsIgnoreCase("Hazardous")) {
            System.out.println("Handling hazardous waste with safety protocols.");
        } else {
            super.collectWaste(container);
        }
    }
}