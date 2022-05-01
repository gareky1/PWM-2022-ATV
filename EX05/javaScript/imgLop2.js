let time2 = 4000,
  currentImageIndex2 = 0,
  images2 = document.querySelectorAll("#slider2 img");
max = images2.length;

function nextImage2() {
  images2[currentImageIndex2].classList.remove("selected2");

  currentImageIndex2++;

  if (currentImageIndex2 >= max) currentImageIndex2 = 0;

  images2[currentImageIndex2].classList.add("selected2");
}

function start2() {
  setInterval(() => {
    // troca de image
    nextImage2();
  }, time2);
}

window.addEventListener("load", start2);
