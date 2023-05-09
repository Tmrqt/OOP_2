package Classes;

public class PromotionClient extends Actor {
    private int idPC; // Номер клиента, который отличает акционного клиента
    private String PromotionName; // Название акции

    // Создаем класс PromotionClient при помощи абстракции Actor. 
    public PromotionClient(String name, int idSP, String PromotionName) {
        super(name);
        this.idPC = idSP;
        this.PromotionName = PromotionName;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
        
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder; 
    }

    //Добавляем униникалыне get для класса с idPC и PromotionName
    public int getIdPC() {
        return idPC;
    }

    public String getPromotionName() {
        return PromotionName;
    }

    // Рассширям класс по причине добавление интерфейса возврата заказа
    @Override
    public void setReurnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;
    }

    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
}
