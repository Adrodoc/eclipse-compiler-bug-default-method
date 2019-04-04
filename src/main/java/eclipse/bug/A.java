package eclipse.bug;

public interface A {
  default Object method() {
    return null;
  }
}
