function actualizarReloj() {
    var reloj = document.getElementById("clockDisplay");
    var fechaActual = new Date();
    var hora = fechaActual.getHours();
    var minutos = fechaActual.getMinutes();
    var segundos = fechaActual.getSeconds();
    hora = hora < 10 ? "0" + hora : hora;
    minutos = minutos < 10 ? "0" + minutos : minutos;
    segundos = segundos < 10 ? "0" + segundos : segundos;
    reloj.innerHTML = hora + ":" + minutos + ":" + segundos;
    setTimeout(actualizarReloj, 1000);
}

actualizarReloj();
