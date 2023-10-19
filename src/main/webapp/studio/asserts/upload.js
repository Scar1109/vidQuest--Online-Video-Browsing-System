// Function to remove an uploaded file
function removeFile(event) {
  const fileRow = event.target.closest('.row');
  if (fileRow) {
      fileRow.remove();
  }
}

// Attach a click event listener to all remove buttons
const removeButtons = document.querySelectorAll('.remove-button');
removeButtons.forEach(button => {
  button.addEventListener('click', removeFile);
});

const form = document.querySelector("form"),
  fileInput = document.querySelector(".file-input"),
  progressArea = document.querySelector(".progress-area"),
  uploadedArea = document.querySelector(".uploaded-area"),
  videoSection = document.querySelector(".video-section"); // Target the "Video upload section"

videoSection.addEventListener("click", () => { // Attach the event listener to the "Video upload section"
  fileInput.click();
});

fileInput.onchange = ({ target }) => {
  let file = target.files[0];
  if (file) {
      let fileName = file.name;
      if (fileName.length >= 12) {
          let splitName = fileName.split('.');
          fileName = splitName[0].substring(0, 13) + "... ." + splitName[1];
      }
      uploadFile(fileName);
  }
}


  
  function uploadFile(name) {
    let xhr = new XMLHttpRequest();
    xhr.open("POST", "php/upload.php");
    xhr.upload.addEventListener("progress", ({ loaded, total }) => {
        let fileLoaded = Math.floor((loaded / total) * 100);
        let fileTotal = Math.floor(total / 1000);
        let fileSize;
        (fileTotal < 1024) ? fileSize = fileTotal + " KB" : fileSize = (loaded / (1024 * 1024)).toFixed(2) + " MB";
        let progressHTML = `<li class="row">
                          <i class="fas fa-file-alt"></i>
                          <div class="content">
                            <div class="details">
                              <span class="name">${name} • Uploading</span>
                              <span class="percent">${fileLoaded}%</span>
                            </div>
                            <div class="progress-bar">
                              <div class="progress" style="width: ${fileLoaded}%"></div>
                            </div>
                          </div>
                        </li>`;
        uploadedArea.classList.add("onprogress");
        progressArea.innerHTML = progressHTML;
        if (loaded == total) {
            progressArea.innerHTML = "";
            let uploadedHTML = `<li class="row">
                            <div class="content upload">
                              <i class="fas fa-file-alt"></i>
                              <div class="details">
                                <span class="name">${name} • Uploaded</span>
                                <span class="size">${fileSize}</span>
                              </div>
                            </div>
                            <button class="remove-button"><ion-icon name="close" style="color:#6990F2;"></ion-icon></button>
                          </li>`;
            uploadedArea.classList.remove("onprogress");
            uploadedArea.insertAdjacentHTML("afterbegin", uploadedHTML);
  
            // Attach a click event listener to the newly added remove button
            const removeButton = uploadedArea.querySelector('.remove-button');
            removeButton.addEventListener('click', removeFile);
        }
    });
    let data = new FormData(form);
    xhr.send(data);
  }
  