package test.AutomatizacionBanistmo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import test.Banistmo.task.OpenUp;

public class DescargarDocumento {
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^usuario consulta documentos$")
    public void usuarioConsultaDocumentos() {
        OnStage.theActorCalled("Milca").wasAbleTo(OpenUp.ThePage());
    }


    @Cuando("^el usuario selecciona opciones de pagina$")
    public void elUsuarioSeleccionaOpcionesDePagina() {
    }

    @Entonces("^la opcion seleeccionada despliega un documento de visualizacion al usuario$")
    public void laOpcionSeleeccionadaDespliegaUnDocumentoDeVisualizacionAlUsuario() {
    }
}
