
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfCategoria;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfPaciente;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfPacientePacienteUltimaReceta;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfProductoProductoPorCategoriaActiva;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfRelPacientePacienteTutor;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfTutor;
import org.datacontract.schemas._2004._07.cesfamnegocio.Usuario;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VerificarUsuarioUsuario_QNAME = new QName("http://tempuri.org/", "usuario");
    private final static QName _VerificarUsuarioClave_QNAME = new QName("http://tempuri.org/", "clave");
    private final static QName _RecueprarNombreResponseRecueprarNombreResult_QNAME = new QName("http://tempuri.org/", "recueprarNombreResult");
    private final static QName _EnviarDatosUsuarioResponseEnviarDatosUsuarioResult_QNAME = new QName("http://tempuri.org/", "enviarDatosUsuarioResult");
    private final static QName _CrearTutorFechaNacimiento_QNAME = new QName("http://tempuri.org/", "fechaNacimiento");
    private final static QName _CrearTutorNombre_QNAME = new QName("http://tempuri.org/", "nombre");
    private final static QName _CrearTutorApPaterno_QNAME = new QName("http://tempuri.org/", "apPaterno");
    private final static QName _CrearTutorApMaterno_QNAME = new QName("http://tempuri.org/", "apMaterno");
    private final static QName _CrearTutorCorreo_QNAME = new QName("http://tempuri.org/", "correo");
    private final static QName _CrearTutorParentesco_QNAME = new QName("http://tempuri.org/", "parentesco");
    private final static QName _ListarTutorResponseListarTutorResult_QNAME = new QName("http://tempuri.org/", "listarTutorResult");
    private final static QName _ListarCategoriaActResponseListarCategoriaActResult_QNAME = new QName("http://tempuri.org/", "listarCategoriaActResult");
    private final static QName _ListarPacientesResponseListarPacientesResult_QNAME = new QName("http://tempuri.org/", "listarPacientesResult");
    private final static QName _ListarPacienteUltimaRecetaResponseListarPacienteUltimaRecetaResult_QNAME = new QName("http://tempuri.org/", "listarPacienteUltimaRecetaResult");
    private final static QName _ListarPacientesPorIdResponseListarPacientesPorIdResult_QNAME = new QName("http://tempuri.org/", "listarPacientesPorIdResult");
    private final static QName _CrearPacienteCodigoLibreta_QNAME = new QName("http://tempuri.org/", "codigoLibreta");
    private final static QName _CrearPacienteRut_QNAME = new QName("http://tempuri.org/", "rut");
    private final static QName _CrearPacienteDireccion_QNAME = new QName("http://tempuri.org/", "direccion");
    private final static QName _ActualizarPacienteFechaNac_QNAME = new QName("http://tempuri.org/", "fechaNac");
    private final static QName _ListarProductosPorCategoriaActivaResponseListarProductosPorCategoriaActivaResult_QNAME = new QName("http://tempuri.org/", "listarProductosPorCategoriaActivaResult");
    private final static QName _IngresarRecetaEstadoReceta_QNAME = new QName("http://tempuri.org/", "estadoReceta");
    private final static QName _IngresarRecetaFechaReceta_QNAME = new QName("http://tempuri.org/", "fechaReceta");
    private final static QName _IngresarRecetaDiagnostico_QNAME = new QName("http://tempuri.org/", "diagnostico");
    private final static QName _IngresarRecetaDetalleReceta_QNAME = new QName("http://tempuri.org/", "DetalleReceta");
    private final static QName _ListarPacienteTutorResponseListarPacienteTutorResult_QNAME = new QName("http://tempuri.org/", "listarPacienteTutorResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerificarUsuario }
     * 
     */
    public VerificarUsuario createVerificarUsuario() {
        return new VerificarUsuario();
    }

    /**
     * Create an instance of {@link VerificarUsuarioResponse }
     * 
     */
    public VerificarUsuarioResponse createVerificarUsuarioResponse() {
        return new VerificarUsuarioResponse();
    }

    /**
     * Create an instance of {@link RecueprarNombre }
     * 
     */
    public RecueprarNombre createRecueprarNombre() {
        return new RecueprarNombre();
    }

    /**
     * Create an instance of {@link RecueprarNombreResponse }
     * 
     */
    public RecueprarNombreResponse createRecueprarNombreResponse() {
        return new RecueprarNombreResponse();
    }

    /**
     * Create an instance of {@link EnviarDatosUsuario }
     * 
     */
    public EnviarDatosUsuario createEnviarDatosUsuario() {
        return new EnviarDatosUsuario();
    }

    /**
     * Create an instance of {@link EnviarDatosUsuarioResponse }
     * 
     */
    public EnviarDatosUsuarioResponse createEnviarDatosUsuarioResponse() {
        return new EnviarDatosUsuarioResponse();
    }

    /**
     * Create an instance of {@link CrearTutor }
     * 
     */
    public CrearTutor createCrearTutor() {
        return new CrearTutor();
    }

    /**
     * Create an instance of {@link CrearTutorResponse }
     * 
     */
    public CrearTutorResponse createCrearTutorResponse() {
        return new CrearTutorResponse();
    }

    /**
     * Create an instance of {@link ListarTutor }
     * 
     */
    public ListarTutor createListarTutor() {
        return new ListarTutor();
    }

    /**
     * Create an instance of {@link ListarTutorResponse }
     * 
     */
    public ListarTutorResponse createListarTutorResponse() {
        return new ListarTutorResponse();
    }

    /**
     * Create an instance of {@link ActualizarTutor }
     * 
     */
    public ActualizarTutor createActualizarTutor() {
        return new ActualizarTutor();
    }

    /**
     * Create an instance of {@link ActualizarTutorResponse }
     * 
     */
    public ActualizarTutorResponse createActualizarTutorResponse() {
        return new ActualizarTutorResponse();
    }

    /**
     * Create an instance of {@link ListarCategoriaAct }
     * 
     */
    public ListarCategoriaAct createListarCategoriaAct() {
        return new ListarCategoriaAct();
    }

    /**
     * Create an instance of {@link ListarCategoriaActResponse }
     * 
     */
    public ListarCategoriaActResponse createListarCategoriaActResponse() {
        return new ListarCategoriaActResponse();
    }

    /**
     * Create an instance of {@link ListarPacientes }
     * 
     */
    public ListarPacientes createListarPacientes() {
        return new ListarPacientes();
    }

    /**
     * Create an instance of {@link ListarPacientesResponse }
     * 
     */
    public ListarPacientesResponse createListarPacientesResponse() {
        return new ListarPacientesResponse();
    }

    /**
     * Create an instance of {@link ListarPacienteUltimaReceta }
     * 
     */
    public ListarPacienteUltimaReceta createListarPacienteUltimaReceta() {
        return new ListarPacienteUltimaReceta();
    }

    /**
     * Create an instance of {@link ListarPacienteUltimaRecetaResponse }
     * 
     */
    public ListarPacienteUltimaRecetaResponse createListarPacienteUltimaRecetaResponse() {
        return new ListarPacienteUltimaRecetaResponse();
    }

    /**
     * Create an instance of {@link ListarPacientesPorId }
     * 
     */
    public ListarPacientesPorId createListarPacientesPorId() {
        return new ListarPacientesPorId();
    }

    /**
     * Create an instance of {@link ListarPacientesPorIdResponse }
     * 
     */
    public ListarPacientesPorIdResponse createListarPacientesPorIdResponse() {
        return new ListarPacientesPorIdResponse();
    }

    /**
     * Create an instance of {@link CrearPaciente }
     * 
     */
    public CrearPaciente createCrearPaciente() {
        return new CrearPaciente();
    }

    /**
     * Create an instance of {@link CrearPacienteResponse }
     * 
     */
    public CrearPacienteResponse createCrearPacienteResponse() {
        return new CrearPacienteResponse();
    }

    /**
     * Create an instance of {@link ActualizarPaciente }
     * 
     */
    public ActualizarPaciente createActualizarPaciente() {
        return new ActualizarPaciente();
    }

    /**
     * Create an instance of {@link ActualizarPacienteResponse }
     * 
     */
    public ActualizarPacienteResponse createActualizarPacienteResponse() {
        return new ActualizarPacienteResponse();
    }

    /**
     * Create an instance of {@link ListarProductosPorCategoriaActiva }
     * 
     */
    public ListarProductosPorCategoriaActiva createListarProductosPorCategoriaActiva() {
        return new ListarProductosPorCategoriaActiva();
    }

    /**
     * Create an instance of {@link ListarProductosPorCategoriaActivaResponse }
     * 
     */
    public ListarProductosPorCategoriaActivaResponse createListarProductosPorCategoriaActivaResponse() {
        return new ListarProductosPorCategoriaActivaResponse();
    }

    /**
     * Create an instance of {@link ObtenerStockActual }
     * 
     */
    public ObtenerStockActual createObtenerStockActual() {
        return new ObtenerStockActual();
    }

    /**
     * Create an instance of {@link ObtenerStockActualResponse }
     * 
     */
    public ObtenerStockActualResponse createObtenerStockActualResponse() {
        return new ObtenerStockActualResponse();
    }

    /**
     * Create an instance of {@link IngresarReceta }
     * 
     */
    public IngresarReceta createIngresarReceta() {
        return new IngresarReceta();
    }

    /**
     * Create an instance of {@link IngresarRecetaResponse }
     * 
     */
    public IngresarRecetaResponse createIngresarRecetaResponse() {
        return new IngresarRecetaResponse();
    }

    /**
     * Create an instance of {@link CrearRelacionPacienteTutor }
     * 
     */
    public CrearRelacionPacienteTutor createCrearRelacionPacienteTutor() {
        return new CrearRelacionPacienteTutor();
    }

    /**
     * Create an instance of {@link CrearRelacionPacienteTutorResponse }
     * 
     */
    public CrearRelacionPacienteTutorResponse createCrearRelacionPacienteTutorResponse() {
        return new CrearRelacionPacienteTutorResponse();
    }

    /**
     * Create an instance of {@link ListarPacienteTutor }
     * 
     */
    public ListarPacienteTutor createListarPacienteTutor() {
        return new ListarPacienteTutor();
    }

    /**
     * Create an instance of {@link ListarPacienteTutorResponse }
     * 
     */
    public ListarPacienteTutorResponse createListarPacienteTutorResponse() {
        return new ListarPacienteTutorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usuario", scope = VerificarUsuario.class)
    public JAXBElement<String> createVerificarUsuarioUsuario(String value) {
        return new JAXBElement<String>(_VerificarUsuarioUsuario_QNAME, String.class, VerificarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "clave", scope = VerificarUsuario.class)
    public JAXBElement<String> createVerificarUsuarioClave(String value) {
        return new JAXBElement<String>(_VerificarUsuarioClave_QNAME, String.class, VerificarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usuario", scope = RecueprarNombre.class)
    public JAXBElement<String> createRecueprarNombreUsuario(String value) {
        return new JAXBElement<String>(_VerificarUsuarioUsuario_QNAME, String.class, RecueprarNombre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "recueprarNombreResult", scope = RecueprarNombreResponse.class)
    public JAXBElement<String> createRecueprarNombreResponseRecueprarNombreResult(String value) {
        return new JAXBElement<String>(_RecueprarNombreResponseRecueprarNombreResult_QNAME, String.class, RecueprarNombreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usuario", scope = EnviarDatosUsuario.class)
    public JAXBElement<String> createEnviarDatosUsuarioUsuario(String value) {
        return new JAXBElement<String>(_VerificarUsuarioUsuario_QNAME, String.class, EnviarDatosUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "enviarDatosUsuarioResult", scope = EnviarDatosUsuarioResponse.class)
    public JAXBElement<Usuario> createEnviarDatosUsuarioResponseEnviarDatosUsuarioResult(Usuario value) {
        return new JAXBElement<Usuario>(_EnviarDatosUsuarioResponseEnviarDatosUsuarioResult_QNAME, Usuario.class, EnviarDatosUsuarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fechaNacimiento", scope = CrearTutor.class)
    public JAXBElement<String> createCrearTutorFechaNacimiento(String value) {
        return new JAXBElement<String>(_CrearTutorFechaNacimiento_QNAME, String.class, CrearTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = CrearTutor.class)
    public JAXBElement<String> createCrearTutorNombre(String value) {
        return new JAXBElement<String>(_CrearTutorNombre_QNAME, String.class, CrearTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apPaterno", scope = CrearTutor.class)
    public JAXBElement<String> createCrearTutorApPaterno(String value) {
        return new JAXBElement<String>(_CrearTutorApPaterno_QNAME, String.class, CrearTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apMaterno", scope = CrearTutor.class)
    public JAXBElement<String> createCrearTutorApMaterno(String value) {
        return new JAXBElement<String>(_CrearTutorApMaterno_QNAME, String.class, CrearTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correo", scope = CrearTutor.class)
    public JAXBElement<String> createCrearTutorCorreo(String value) {
        return new JAXBElement<String>(_CrearTutorCorreo_QNAME, String.class, CrearTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parentesco", scope = CrearTutor.class)
    public JAXBElement<String> createCrearTutorParentesco(String value) {
        return new JAXBElement<String>(_CrearTutorParentesco_QNAME, String.class, CrearTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarTutorResult", scope = ListarTutorResponse.class)
    public JAXBElement<ArrayOfTutor> createListarTutorResponseListarTutorResult(ArrayOfTutor value) {
        return new JAXBElement<ArrayOfTutor>(_ListarTutorResponseListarTutorResult_QNAME, ArrayOfTutor.class, ListarTutorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fechaNacimiento", scope = ActualizarTutor.class)
    public JAXBElement<String> createActualizarTutorFechaNacimiento(String value) {
        return new JAXBElement<String>(_CrearTutorFechaNacimiento_QNAME, String.class, ActualizarTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = ActualizarTutor.class)
    public JAXBElement<String> createActualizarTutorNombre(String value) {
        return new JAXBElement<String>(_CrearTutorNombre_QNAME, String.class, ActualizarTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apPaterno", scope = ActualizarTutor.class)
    public JAXBElement<String> createActualizarTutorApPaterno(String value) {
        return new JAXBElement<String>(_CrearTutorApPaterno_QNAME, String.class, ActualizarTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apMaterno", scope = ActualizarTutor.class)
    public JAXBElement<String> createActualizarTutorApMaterno(String value) {
        return new JAXBElement<String>(_CrearTutorApMaterno_QNAME, String.class, ActualizarTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correo", scope = ActualizarTutor.class)
    public JAXBElement<String> createActualizarTutorCorreo(String value) {
        return new JAXBElement<String>(_CrearTutorCorreo_QNAME, String.class, ActualizarTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parentesco", scope = ActualizarTutor.class)
    public JAXBElement<String> createActualizarTutorParentesco(String value) {
        return new JAXBElement<String>(_CrearTutorParentesco_QNAME, String.class, ActualizarTutor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCategoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarCategoriaActResult", scope = ListarCategoriaActResponse.class)
    public JAXBElement<ArrayOfCategoria> createListarCategoriaActResponseListarCategoriaActResult(ArrayOfCategoria value) {
        return new JAXBElement<ArrayOfCategoria>(_ListarCategoriaActResponseListarCategoriaActResult_QNAME, ArrayOfCategoria.class, ListarCategoriaActResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaciente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarPacientesResult", scope = ListarPacientesResponse.class)
    public JAXBElement<ArrayOfPaciente> createListarPacientesResponseListarPacientesResult(ArrayOfPaciente value) {
        return new JAXBElement<ArrayOfPaciente>(_ListarPacientesResponseListarPacientesResult_QNAME, ArrayOfPaciente.class, ListarPacientesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPacientePacienteUltimaReceta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarPacienteUltimaRecetaResult", scope = ListarPacienteUltimaRecetaResponse.class)
    public JAXBElement<ArrayOfPacientePacienteUltimaReceta> createListarPacienteUltimaRecetaResponseListarPacienteUltimaRecetaResult(ArrayOfPacientePacienteUltimaReceta value) {
        return new JAXBElement<ArrayOfPacientePacienteUltimaReceta>(_ListarPacienteUltimaRecetaResponseListarPacienteUltimaRecetaResult_QNAME, ArrayOfPacientePacienteUltimaReceta.class, ListarPacienteUltimaRecetaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaciente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarPacientesPorIdResult", scope = ListarPacientesPorIdResponse.class)
    public JAXBElement<ArrayOfPaciente> createListarPacientesPorIdResponseListarPacientesPorIdResult(ArrayOfPaciente value) {
        return new JAXBElement<ArrayOfPaciente>(_ListarPacientesPorIdResponseListarPacientesPorIdResult_QNAME, ArrayOfPaciente.class, ListarPacientesPorIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fechaNacimiento", scope = CrearPaciente.class)
    public JAXBElement<String> createCrearPacienteFechaNacimiento(String value) {
        return new JAXBElement<String>(_CrearTutorFechaNacimiento_QNAME, String.class, CrearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = CrearPaciente.class)
    public JAXBElement<String> createCrearPacienteNombre(String value) {
        return new JAXBElement<String>(_CrearTutorNombre_QNAME, String.class, CrearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apPaterno", scope = CrearPaciente.class)
    public JAXBElement<String> createCrearPacienteApPaterno(String value) {
        return new JAXBElement<String>(_CrearTutorApPaterno_QNAME, String.class, CrearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apMaterno", scope = CrearPaciente.class)
    public JAXBElement<String> createCrearPacienteApMaterno(String value) {
        return new JAXBElement<String>(_CrearTutorApMaterno_QNAME, String.class, CrearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correo", scope = CrearPaciente.class)
    public JAXBElement<String> createCrearPacienteCorreo(String value) {
        return new JAXBElement<String>(_CrearTutorCorreo_QNAME, String.class, CrearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codigoLibreta", scope = CrearPaciente.class)
    public JAXBElement<String> createCrearPacienteCodigoLibreta(String value) {
        return new JAXBElement<String>(_CrearPacienteCodigoLibreta_QNAME, String.class, CrearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = CrearPaciente.class)
    public JAXBElement<String> createCrearPacienteRut(String value) {
        return new JAXBElement<String>(_CrearPacienteRut_QNAME, String.class, CrearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "direccion", scope = CrearPaciente.class)
    public JAXBElement<String> createCrearPacienteDireccion(String value) {
        return new JAXBElement<String>(_CrearPacienteDireccion_QNAME, String.class, CrearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apMaterno", scope = ActualizarPaciente.class)
    public JAXBElement<String> createActualizarPacienteApMaterno(String value) {
        return new JAXBElement<String>(_CrearTutorApMaterno_QNAME, String.class, ActualizarPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apPaterno", scope = ActualizarPaciente.class)
    public JAXBElement<String> createActualizarPacienteApPaterno(String value) {
        return new JAXBElement<String>(_CrearTutorApPaterno_QNAME, String.class, ActualizarPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codigoLibreta", scope = ActualizarPaciente.class)
    public JAXBElement<String> createActualizarPacienteCodigoLibreta(String value) {
        return new JAXBElement<String>(_CrearPacienteCodigoLibreta_QNAME, String.class, ActualizarPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correo", scope = ActualizarPaciente.class)
    public JAXBElement<String> createActualizarPacienteCorreo(String value) {
        return new JAXBElement<String>(_CrearTutorCorreo_QNAME, String.class, ActualizarPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fechaNac", scope = ActualizarPaciente.class)
    public JAXBElement<String> createActualizarPacienteFechaNac(String value) {
        return new JAXBElement<String>(_ActualizarPacienteFechaNac_QNAME, String.class, ActualizarPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = ActualizarPaciente.class)
    public JAXBElement<String> createActualizarPacienteNombre(String value) {
        return new JAXBElement<String>(_CrearTutorNombre_QNAME, String.class, ActualizarPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rut", scope = ActualizarPaciente.class)
    public JAXBElement<String> createActualizarPacienteRut(String value) {
        return new JAXBElement<String>(_CrearPacienteRut_QNAME, String.class, ActualizarPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "direccion", scope = ActualizarPaciente.class)
    public JAXBElement<String> createActualizarPacienteDireccion(String value) {
        return new JAXBElement<String>(_CrearPacienteDireccion_QNAME, String.class, ActualizarPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductoProductoPorCategoriaActiva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarProductosPorCategoriaActivaResult", scope = ListarProductosPorCategoriaActivaResponse.class)
    public JAXBElement<ArrayOfProductoProductoPorCategoriaActiva> createListarProductosPorCategoriaActivaResponseListarProductosPorCategoriaActivaResult(ArrayOfProductoProductoPorCategoriaActiva value) {
        return new JAXBElement<ArrayOfProductoProductoPorCategoriaActiva>(_ListarProductosPorCategoriaActivaResponseListarProductosPorCategoriaActivaResult_QNAME, ArrayOfProductoProductoPorCategoriaActiva.class, ListarProductosPorCategoriaActivaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "estadoReceta", scope = IngresarReceta.class)
    public JAXBElement<String> createIngresarRecetaEstadoReceta(String value) {
        return new JAXBElement<String>(_IngresarRecetaEstadoReceta_QNAME, String.class, IngresarReceta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fechaReceta", scope = IngresarReceta.class)
    public JAXBElement<String> createIngresarRecetaFechaReceta(String value) {
        return new JAXBElement<String>(_IngresarRecetaFechaReceta_QNAME, String.class, IngresarReceta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "diagnostico", scope = IngresarReceta.class)
    public JAXBElement<String> createIngresarRecetaDiagnostico(String value) {
        return new JAXBElement<String>(_IngresarRecetaDiagnostico_QNAME, String.class, IngresarReceta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DetalleReceta", scope = IngresarReceta.class)
    public JAXBElement<ArrayOfstring> createIngresarRecetaDetalleReceta(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_IngresarRecetaDetalleReceta_QNAME, ArrayOfstring.class, IngresarReceta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelPacientePacienteTutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listarPacienteTutorResult", scope = ListarPacienteTutorResponse.class)
    public JAXBElement<ArrayOfRelPacientePacienteTutor> createListarPacienteTutorResponseListarPacienteTutorResult(ArrayOfRelPacientePacienteTutor value) {
        return new JAXBElement<ArrayOfRelPacientePacienteTutor>(_ListarPacienteTutorResponseListarPacienteTutorResult_QNAME, ArrayOfRelPacientePacienteTutor.class, ListarPacienteTutorResponse.class, value);
    }

}
