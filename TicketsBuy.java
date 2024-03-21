
    class Ticket {
        private int number = 100; // 初始票数
    
        // synchronized method to sell tickets
        public synchronized void sell() {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出了第" + (100 - number + 1) + "张票");
                number--;
            }
        }
    }
    
    class TicketSeller implements Runnable {
        private Ticket ticket;
    
        public TicketSeller(Ticket ticket) {
            this.ticket = ticket;
        }
    
        @Override
        public void run() {
            while (true) {
                ticket.sell();
            }
        }
    
    public class TicketsBuy {
        public static void main(String[] args) {
            Ticket ticket = new Ticket();
    
            new Thread(new TicketSeller(ticket), "售票员A").start();
            new Thread(new TicketSeller(ticket), "售票员B").start();
            new Thread(new TicketSeller(ticket), "售票员C").start();
        }
    }
}
