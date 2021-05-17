//Delegation


class FileDownloader(private val file:String):Downloading{
    override fun downloading() {
        println("$file downloaded")
    }
}

class FilePlayer(private val file:String): Playing{
    override fun playing() {
        println("$file playing")
    }

}

class MediaFile(
    private val downloader:Downloading,
    private val player: Playing
):Downloading by downloader, Playing by player
fun main(){

    val file:String = "File.mkv"
    val mediaFile = MediaFile(FileDownloader(file),FilePlayer(file))
    mediaFile.downloading()
    mediaFile.playing()

}