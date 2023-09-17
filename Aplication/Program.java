package Aplication;

import java.time.LocalDate;

import Entities.Pedido;
import enums.OrderStatus;

public class Program {
    public static void main(String[] args) {
        
        Pedido pedido = new Pedido(1080, LocalDate.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(pedido);
    }
    
}
