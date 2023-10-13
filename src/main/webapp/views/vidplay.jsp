<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Custom Video Player</title>
    <link rel="icon" type="image/png" href="favicon.png" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.2/css/all.min.css"/>
    <link rel="stylesheet" href="../css/vidplay.css" />
  </head>
  <body>
    <!-- Car Racing (1080P)-->
    <!-- https://pixabay.com/videos/download/video-41758_source.mp4?attachment -->
    <!-- Lake (4K) -->
    <!-- https://pixabay.com/videos/download/video-28745_source.mp4?attachment -->
    <!-- Ocean (720P)-->
    <!-- https://pixabay.com/videos/download/video-31377_tiny.mp4?attachment -->
    <section class="layout">
      <div class="grow2by3 vid"><div class="player">
        <div class="videoContainer">
        <video
          src="https://pixabay.com/videos/download/video-31377_tiny.mp4?attachment"
          class="video"
          playsinline
        ></video>
        <div class="show-controls">
          <div class="controls-container">
            <div class="progress-range" title="Seek">
              <div class="progress-bar"></div>
            </div>
            <div class="control-group">
              <div class="controls-left">
                <div class="play-controls">
                  <i class="fas fa-play" title="Play" id="play-btn"></i>
                </div>
                <div class="volume">
                  <div class="volume-icon">
                    <i class="fas fa-volume-up" title="Mute" id="volume-icon"></i>
                  </div>
                  <div class="volume-range" title="Change volume">
                    <div class="volume-bar"></div>
                  </div>
                </div>
              </div>
              <div class="controls-right">
                <div class="speed" title="Playback rate">
                  <select name="playbackRate" class="player-speed">
                    <option value="0.5">0.5x</option>
                    <option value="0.75">0.75x</option>
                    <option value="1" selected>1x</option>
                    <option value="1.5">1.5x</option>
                    <option value="2">2x</option>
                  </select>
                </div>
                <div class="time">
                  <span class="time-elapsed">00:00 /</span>
                  <span class="time-duration">2:38</span>
                </div>
                <div class="fullscreen">
                  <i class="fas fa-expand" id="expand-icon"></i>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div></div></div>
      <div class="grow1by3"><div class="box1">
        <div class="container">
          
        </div>
      </div></div>
    </section>
    <!-- Script -->
    <script src="../script/vidplay.js"></script>
  </body>
</html>
