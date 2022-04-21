let id = 0;
let n;

function creatDiv() {
  if (document.querySelector("#write").value === "") {
    alert("Insira um nome para seu contador");
  } else {
    let n = id;

    const barra = document.querySelector("#write").value;
    const dives = document.createElement("div");
    const parg = document.createElement("h3");
    const parg1 = document.createElement("p");
    const button = document.createElement("button");
    const btColor = document.createElement("button");
    const btdelet = document.createElement("button");
    dives.classList.add("contador");
    button.innerHTML = "Clear";
    btColor.innerHTML = "Color";
    btdelet.innerHTML = "Delet";
    parg.innerHTML = 0;
    parg1.innerHTML = barra;

    dives.id = id;

    dives.onclick = function () {
      cont(n);
    };

    btColor.onclick = function () {
      cor(n);
    };

    button.onclick = function () {
      clear(n);
    };
    btdelet.onclick = function () {
      dives.style = "display: none";
    };

    id++;
    parg1.id = id;
    parg.id = id;
    id++;

    dives.appendChild(parg);
    dives.appendChild(parg1);
    dives.appendChild(button);
    dives.appendChild(btColor);
    dives.appendChild(btdelet);

    document.querySelector(".divs").appendChild(dives);
  }
}
function cont(id) {
  var i = id + 1;
  document.getElementById(i).innerHTML++;

  console.log(n);
}
function cor(id) {
  let i = id + 1;
  document.getElementById(i).style.backgroundColor = generateColor();
}

function clear(id) {
  var i = id + 1;
  document.getElementById(i).innerHTML = -1;
}
const generateColor = () => {
  const possibilities = "0123456789ABCDEF";
  let color = "#";

  for (let i = 0; i < 6; i++) {
    color += possibilities[Math.floor(Math.random() * 16)];
  }
  return color;
};
