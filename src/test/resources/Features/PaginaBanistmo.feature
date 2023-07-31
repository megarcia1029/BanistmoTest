# language: es
# Author: Milca Morales
# encoding: UTF-8

@NavegarPaginaBanistmo
Característica: Navegacion PDF


  @VerificaciondeDocumento
  Escenario: Verificacion de PDF
    Dado usuario consulta documentos
    Cuando el usuario selecciona opciones de pagina
    Entonces la opcion seleeccionada despliega un documento de visualizacion al usuario