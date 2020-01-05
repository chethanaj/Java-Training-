public class Application {

  public static void main(String[] args) {

    if(args.length>0) {
      String input = args[0];

      byte[] inputByteArray = input.getBytes();
      byte[] out = new byte[inputByteArray.length];


      for (int i=0;i<inputByteArray.length;i++){
        out[i] = inputByteArray[inputByteArray.length - i - 1];
	  }
      System.out.println(new String(out));
    }
  }
}
