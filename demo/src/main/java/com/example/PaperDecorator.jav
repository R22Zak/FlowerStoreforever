public class PaperDecorator extends AbstractDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 13 + item.price();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", wrapped in paper";
    }
}