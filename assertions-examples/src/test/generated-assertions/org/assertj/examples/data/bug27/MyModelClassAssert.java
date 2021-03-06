package org.assertj.examples.data.bug27;

/**
 * {@link MyModelClass} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractMyModelClassAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class MyModelClassAssert extends AbstractMyModelClassAssert<MyModelClassAssert, MyModelClass> {

  /**
   * Creates a new <code>{@link MyModelClassAssert}</code> to make assertions on actual MyModelClass.
   * @param actual the MyModelClass we want to make assertions on.
   */
  public MyModelClassAssert(MyModelClass actual) {
    super(actual, MyModelClassAssert.class);
  }

  /**
   * An entry point for MyModelClassAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myMyModelClass)</code> and get specific assertion with code completion.
   * @param actual the MyModelClass we want to make assertions on.
   * @return a new <code>{@link MyModelClassAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static MyModelClassAssert assertThat(MyModelClass actual) {
    return new MyModelClassAssert(actual);
  }
}
