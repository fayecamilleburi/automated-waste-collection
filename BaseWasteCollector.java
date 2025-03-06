public class BaseWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No collector available for: " + container.getWasteType());
        }
    }
}