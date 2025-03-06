public class WasteManagementSystem {
    public static void main(String[] args) {
        // Create collectors and set up chain
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);

        // Create waste containers
        WasteContainer organicWaste = new WasteContainer("Organic", 50);
        WasteContainer recyclableWaste = new WasteContainer("Recyclable", 30);
        WasteContainer hazardousWaste = new WasteContainer("Hazardous", 10);
        WasteContainer unknownWaste = new WasteContainer("Electronic", 20);

        // Process waste collection
        organicCollector.collectWaste(organicWaste);
        organicCollector.collectWaste(recyclableWaste);
        organicCollector.collectWaste(hazardousWaste);
        organicCollector.collectWaste(unknownWaste);
    }
}