import org.json.*;
import org.json.JSONArray;



public class Cuadro {


    
        /**
         * Generando un objeto JSON
         * 
         * @param args 
         */
        public static void main(String[] args) {
            
            //Cuadro
            JSONObject cuadro = new JSONObject();
    
            // REQUEST
            JSONObject request = new JSONObject();
            request.put("CuadroId", "MOV_POC_DEV2");
            request.put("NivelPermisoSpecified", new Boolean(false));
            cuadro.put("request",request);
            
            // Response
            JSONObject response = new JSONObject();
            response.put("allowEmptyColumns","NO");
            response.put("calculoDefecto", "YTYPCT");
                       
            
            // Calculos
            //JSONArray  calculos = new JSONArray();
            JSONObject calculo = new JSONObject();
            
            calculo.put("codCalculo","YTYPCT");
            calculo.put("descripcionCalculo","Prueba de desarrollo");
            calculo.put("numDecimales",new Integer(21));
            calculo.put("numDecimalesSpecified",new Boolean(true));
            
            JSONArray  calculos = new JSONArray();
            calculos.put(calculo);
            response.put("calculos", calculos);
    
            
            //Campos despues de calulos
            response.put("descripcionCuadro", "Prueba de desarrollo");
            response.put("descripcionCuadroIngles", "Prueba de desarrollo");
            response.put("fechaFin", "01-09-2022");
            response.put("fechaInicio", "01-01-2010");
            response.put("fechaValidaFin", "01-09-2019");
            response.put("fechaValidaInicio", "01-01-2001");
            response.put("frecuenciaDefecto", "MONTHLY");
            
            // Frecuencias
            JSONObject frecuencia = new JSONObject();
            
            frecuencia.put("codFrecuencia","MONTHLY");
            frecuencia.put("descripcionFrecuencia","MENSUAL");
            frecuencia.put("descripcion","null");
            frecuencia.put("description","null");
            frecuencia.put("value","null");
            
            JSONArray  frecuencias = new JSONArray();
            frecuencias.put(frecuencia);
            response.put("frecuencias", frecuencias);

            //Campos despues de frecuencia
            response.put("id", "MOV_POC_DEV");

            //Armar campo compuesto Metadatos
            JSONObject metadatos = new JSONObject();

            //Obejeto del array
            JSONObject metadato = new JSONObject();            
            
            metadato.put("codMetadato","NOMBRE_CUADRO");
            metadato.put("codValor","null");
            metadato.put("codeList","null");
            metadato.put("descMetadato","Nombre y/o definición");
            metadato.put("descMetadatoIng","Name");
            metadato.put("numFila",new Integer(1));
            metadato.put("numFilaSpecified",new Boolean(true));
            metadato.put("tipoMetadato","auto");
            metadato.put("valor","Prueba de desarrollo");
            metadato.put("valorIng","Prueba de desarrollo");
            
            ///Aca agregar más objetos del cuadro, o armar un ciclo donde se vayan completando 
            //...


            //Agregar elementos al array
            JSONArray  metadatosArray = new JSONArray();
            metadatosArray.put(metadato);
            metadatos.put("Metadatos", frecuencias);
            
            //NOTAS

            //Obejeto del array
            JSONObject nota = new JSONObject();            
            
            nota.put("descNota","Notas POC1");
            nota.put("descNotaIng","POC-DEV");
            nota.put("numFila",new Integer(0));
            nota.put("numFilaSpecified",new Boolean(true));
            nota.put("numFilaStr","0");
            nota.put("tipoNota","detalle POC-DEV");
            
            
            ///Aca agregar más objetos del cuadro, o armar un ciclo donde se vayan completando 
            //...

            //Agregar elementos al array
            JSONArray  notas = new JSONArray();
            notas.put(nota);
            metadatos.put("Metadatos", notas);
            
            //Agregar los elementos abajo de Notas
            metadatos.put("firstObservation", new String());
            metadatos.put("lastObservation", new String());
            metadatos.put("updatedAt", new String());
            metadatos.put("createdAt", new String());
            //params.put(KEY_TOKEN, token == null ? JSONObject.NULL : token); //Los nulos se ponen asi
            metadatos.put("frecuencia",JSONObject.NULL);
                        
            //Agregar el campo metadatos a response
            response.put("metadatos", metadatos);
            
            //ABAJO DE METADATOS
            response.put("observedDefecto", "UNDEFINED");
            response.put("sequenceId", new Double(6686.0));
            response.put("sequenceIdSpecified", new Boolean(true));

            //SERIES
            //Obejeto del array
            JSONObject serie = new JSONObject();
            serie.put("dataClass",new Integer(5));
            serie.put("dataClassSpecified",new Boolean(true));
            serie.put("descripcion","Descripción POC-DEV");
            serie.put("descripcionIngles","Description POC-DEV");
            serie.put("englishTitle","English tittle POC-DEV");
            serie.put("estilo","&lt;B>");
            serie.put("firstObservation","01-01-1996");
            serie.put("frequency",new Integer(4));
            serie.put("frequencySpecified",new Boolean(true));
            serie.put("lastObservation","01-09-2020");
            serie.put("nivel",new Integer(1));
            serie.put("nivelSpecified",new Boolean(true));
            serie.put("nivelStr",new Integer(1));
            serie.put("numeroFila",new Integer(0));
            serie.put("numeroFilaSpecified",new Boolean(true));
            serie.put("numeroFilaStr","0");
            serie.put("padreKeyId",JSONObject.NULL);

            //Obejeto del array
            JSONObject seriesKeyId = new JSONObject();            
            
            seriesKeyId.put("keyFamilyId","POC01");
            seriesKeyId.put("lastModifiedSpecified","false");
            seriesKeyId.put("lastModifiedUser",JSONObject.NULL);
            seriesKeyId.put("seriesId","POC02.DEV");
            seriesKeyId.put("dataStage","INTERNAL");
            seriesKeyId.put("exists",new Boolean(false));
            seriesKeyId.put("Description",JSONObject.NULL);
            seriesKeyId.put("descripIng",JSONObject.NULL);
            seriesKeyId.put("descripEsp",JSONObject.NULL);
                        
            ///Aca agregar más objetos del cuadro, o armar un ciclo donde se vayan completando 
            //....

            //Agregar elementos al array
            JSONArray  seriesKeyIds = new JSONArray();
            seriesKeyIds.put(seriesKeyId);
            serie.put("seriesKeyId", seriesKeyIds);            

            //Ultimo elemento de Serie
            serie.put("spanishTitle","Imacec empalmado, serie original (índice 2013=100)");






            //Agregar elementos al array
            JSONArray  series = new JSONArray();
            series.put(serie);
            response.put("series", series);
            
            //ULTIMOS 2 ELEMENTOS
            response.put("statusMetadatos", "visible");
            response.put("totalNivelesSpecified", new Boolean(true));






            //Agrega response al json final
            cuadro.put("response",response);
            // Generar cadena de texto JSON
            System.out.print(cuadro);
        }
    

}
