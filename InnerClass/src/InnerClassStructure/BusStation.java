package InnerClassStructure;


 class BusStation {

    class Bus{
       private int i;

         void setI(int i) {
            this.i = i;
        }

         int getI() {
            return i;
        }
    }

    void print(){
        Bus bus=new Bus();
        bus.setI(16);
        System.out.println(bus.getI());
    }




}
