package Interfaces;


// Задаем метод возрата товара с выъелвение клиента при помощи интерфейса
public interface iReturnOder {
    //void takeInQueue(iActorBehaviour actor); // Клиент встал в очередь. Очередь для всех видов деятельности одинаковая. Можно было не прописывать отдельно
    //void releaseFromQueue(); //Клиент вышел из очереди
    void returnOrder(); // Клиент сдал заказ
}
