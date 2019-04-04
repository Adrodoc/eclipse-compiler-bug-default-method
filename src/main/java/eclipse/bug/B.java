package eclipse.bug;

public interface B extends A {
  @Override
  default String method() {
    return "";
  }
}
