package chirp.parser

import org.scalatest.{FlatSpec, Matchers}


class ReplCommandParserTest extends FlatSpec with Matchers {

  it should "parse command and arguments" in {
    val x = "foo".r
    CommandParser.parse("follow Alice").right.get shouldBe Command.Follow("Alice")
  }

  it should "return an exception when passing unknown command" in {
    CommandParser.parse("foobars") shouldBe Left(UnknownCommandException("foobars"))
  }
}

object CommandParser {
  def parse(command: String): Either[ConsoleException, Command] = {
    command match {
      case r"follow (\w*)${name}" => Right(Command.Follow(name))
      case unknownCommand => Left(UnknownCommandException(unknownCommand))
    }
  }

  implicit class Regex(stringContext: StringContext) {
    println(stringContext.parts)
    def r = new util.matching.Regex(stringContext.parts.mkString, stringContext.parts.tail.map {_ => "x"}: _*)
  }
}

sealed trait Command

object Command {

  case class Follow(user: String) extends Command

}
