import org.json.*;
import org.json.JSONArray;



public class Serie {

static JSONObject fseriesKey(String keyFamilyId ,
                        Boolean lastModifiedSpecified ,
                        String lastModifiedUser,
                        String seriesId,
                        String dataStage,
                        Boolean exists,
                        String description,
                        String descripIng,
                        String descripEsp)
{

    JSONObject seriesKey = new JSONObject();
    seriesKey.put("keyFamilyId",keyFamilyId);
    seriesKey.put("lastModifiedSpecified",lastModifiedSpecified);
    seriesKey.put("lastModifiedUser",lastModifiedUser == null ? JSONObject.NULL : lastModifiedUser);
    seriesKey.put("seriesId",seriesId);
    seriesKey.put("dataStage",dataStage);
    seriesKey.put("exists",exists);
    
    seriesKey.put("Description",description == null ? JSONObject.NULL : description); //description);
    seriesKey.put("descripIng",descripIng == null ? JSONObject.NULL : descripIng);//descripIng);
    seriesKey.put("descripEsp",descripEsp == null ? JSONObject.NULL : descripEsp);  

    return seriesKey;
}
    
        /**
         * Generando un objeto JSON
         * 
         * @param args 
         */
        public static void main(String[] args) {
            
            //Serie
            JSONObject serie = new JSONObject();
    
            // REQUEST
            JSONObject request = new JSONObject();
            request.put("startDate", "01-11-2019");
            request.put("endDate", "01-12-2021");
            request.put("frequencyCode", "MONTHLY");
            request.put("fechaBase", "01-01-2012");
            request.put("observedCode", "UNDEFINED");

            // seriesKeys
            //JSONArray  calculos = new JSONArray();
            JSONObject seriesKey = new JSONObject();
            
            //elemnto del array


           //Llamamos a la funcion de series key

           seriesKey=fseriesKey("POC02",
                     new Boolean(false),
                     null,
                     "POC02.DEV",
                     "INTERNAL",
                     new Boolean(false),
                     null,
                     null,
                     null
                        );

            JSONArray  seriesKeys = new JSONArray();
            seriesKeys.put(seriesKey);
            //Se agrega el array al elemento Response
            request.put("seriesKeys", seriesKeys);

            // Matrices
            double[] calculations = {5};
            request.put("calculations", calculations);                


            serie.put("request",request);

/******************************************************************/            
             
// Response
            JSONObject response = new JSONObject();
            
            // seriesKeys
            JSONObject seriesKeyresp = new JSONObject();
            
            seriesKeyresp=fseriesKey("POC02",
                     new Boolean(false),
                     null,
                     "POC02.DEV",
                     "INTERNAL",
                     new Boolean(false),
                     null,
                     null,
                     null
                        );
            

            response.put("seriesKeys", seriesKeyresp);

            //Elemento abajo de SeriesKey
            response.put("value", new Double(2));

            // obs
            JSONObject obs = new JSONObject();
            obs.put("indexDateString", "01-01-2004");
            //Series key de obs
            JSONObject seriesKeyObs = new JSONObject();
            
            seriesKeyObs=fseriesKey("POC02",
                     new Boolean(false),
                     null,
                     "POC02.DEV",
                     "INTERNAL",
                     new Boolean(true),
                     null,
                     null,
                     null
                        );
            obs.put("seriesKey",seriesKeyObs); 

            //Campos abajo de serieskey
            obs.put("statusCode", "01-01-2004");
            obs.put("value", new Double(4.0943073687412568));                       
            
            

            JSONArray  obss = new JSONArray();
            obss.put(obs);
            //Se agrega el array al elemento Response
            response.put("obs", obss);

            //Elementos abajo del array obs
            response.put("nodeLevel", JSONObject.NULL);
            response.put("groupDimension", JSONObject.NULL);
            response.put("header", "POC02.DEV");
            response.put("root", JSONObject.NULL);


            //Se arma Response como Array
            JSONArray  responses = new JSONArray();
            responses.put(response);
            
            //Se agrega el array al elemento Serie
            serie.put("response", responses);


            // Generar cadena de texto JSON
            System.out.print(serie);

            
        }
    

}
