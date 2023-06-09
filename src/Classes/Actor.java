package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnOrder; //провекрка на возвращение заказа
    
    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName(); 

}
