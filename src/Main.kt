


fun main(){
    val downloader = Downloader()
    downloader.downloadListener = object : DownloadListener {

        override fun onDownloadStarted() {
            println("Download Started...")
        }

        override fun onDownloadCompleted(file: String) {
            println("$file Downloded..")
        }

        override fun onProgressUpdate(progress: Int) {
            println("$progress% Downloaded...")
        }
    }
    downloader.downloadFile("FIle.mkv")
}