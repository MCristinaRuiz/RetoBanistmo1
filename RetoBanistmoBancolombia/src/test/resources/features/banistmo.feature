#language: es



Característica: Calcular tasa de interes

  como usuario de Bancolombia
  quiero ingresar a la aplicacion
  para calcular tasa de interes


  @testBanistmo
  Escenario: Calcular tasa de interes exitosamente
    Dado que Cristina ingresa a la aplicacion de Bancolombia
    Cuando calcule la tase de interes
    |Interes|Capitalizacion|Periodicidad|
    |2      |Anual       |Mensual       |
    Entonces puede visualizar la tasa de interes calculada







