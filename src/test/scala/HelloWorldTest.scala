
import org.scalatest.{FlatSpec, Matchers}

class HelloWorldTest extends FlatSpec with Matchers with DockerMongodbService{
  behavior of "Hello"

  it should "test nothing" in {
    true shouldBe true
  }
}
