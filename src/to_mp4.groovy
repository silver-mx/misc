#! /home/diego/.sdkman/candidates/groovy/current/bin/groovy

def dirPath = '/home/diego/Downloads/American.Horror.Story.Season.5.Complete.720p.WEB-DL.x264-[MULVAcoded]'
def dir = new File(dirPath)

dir.eachFile { file ->
    def extension = file.name.substring(file.name.lastIndexOf('.'))
    if (extension.equals('.mkv')) {
        def newName = file.name.substring(0, file.name.lastIndexOf('.')) + '.mp4'
        def process = "avconv -i ${dirPath}/${file.name} -codec copy ${dirPath}/${newName}".execute()
    }
}





