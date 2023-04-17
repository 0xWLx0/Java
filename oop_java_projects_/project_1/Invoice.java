package project_1;

public class Invoice {
    
   private String num;
   private String des;
   private int Q;
   private double price;

   Invoice(String num, String des, int Q, double price) {

      this.num = (num != null)? num: "0";
      this.des = (des != null)? des: "0";
      this.Q = (Q > 0)? Q: 0;
      this.price = (price > 0.0)? price: 0.0;

   }

   public String getNum() {

      return num;

   }

   public void setNum(String num) {

      this.num = (num != null)? num: "0";

   }

   public String getDes() {

      return des;

   }

   public void setDes(String des) {

      this.des = (des != null)? des: "0";

   }
   public int getQ() {

      return Q;

   }

   public void setQ(int Q) {

      this.Q = (Q > 0)? Q: 0;

   }

   public double getPrice() {

      return price;

   }

   public void setPrice(double price) {

      this.price = (price > 0.0)? price: 0.0;

   }

   public double getInvoice() {

      return Q * price;

   }
    
}
