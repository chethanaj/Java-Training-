package MemberClassStructure;

 class BusStation {

     void print(){

        class Bus{
           private int i;

             void setI(int i) {
                this.i = i;
            }

             int getI() {
                return i;
            }
        }

        Bus bus=new Bus();
        bus.setI(20);
        System.out.println(bus.getI());
    }
}
