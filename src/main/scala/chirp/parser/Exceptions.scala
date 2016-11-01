package chirp.parser

sealed trait ConsoleException extends Exception

case class UnknownCommandException(command: String) extends ConsoleException
