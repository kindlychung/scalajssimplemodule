package simple

object Simple{
  def formatTimes(timestamps: Seq[Long]): Seq[String] = {
    // intellij cannot resolve Platform, ignore it, everything is fine
    timestamps.map(Platform.format).map(_.dropRight(5))
  }
}
