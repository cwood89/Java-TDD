public class HelloWorld {
  private String message;

  HelloWorld() {
    this.message = "Hello, World!";
  }

  public String getMessage() {
    return message;
  }

  public String getMessageWithName(String name) {
    return String.format("Hello, %s!", name);
  }

}