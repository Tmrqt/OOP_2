package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    void setReurnOrder(boolean returnOrder); // Постановка факта возвращение заказа
    boolean isReturnOrder(); // Фиксация факта возвращение заказа
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
}
