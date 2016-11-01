package chirp.parser

import chirp.parser.ConsoleCommandResolver.resolve
import chirp.parser.{ReplCommand$, UnknownCommandException}
import org.scalatest.{FlatSpec, Matchers}

class ConsoleReplCommandResolverTest extends FlatSpec with Matchers {

  it should "resolve a valid command" in {
    resolve("help").right.get shouldBe ReplCommand.Help
    resolve("version").right.get shouldBe ReplCommand.Version
  }

  it should "return an exception when it fails to resolve a command" in {
    resolve("foobars") shouldBe Left(UnknownCommandException("foobars"))
  }
}

