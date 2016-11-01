package chirp.parser

sealed trait ReplCommand
object ReplCommand {
  case object Help extends ReplCommand
  case object Version extends ReplCommand
}
