package chirp.parser

object ConsoleCommandResolver {
  def resolve(command: String): Either[ConsoleException, ReplCommand] = {
    command match {
      case "help" => Right(ReplCommand.Help)
      case "version" => Right(ReplCommand.Version)
      case a => Left(UnknownCommandException(a))
    }
  }
}

