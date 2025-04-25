public class Pelicula {

    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;


//    de esta forma podemos obtener lo que tiene la variable private encpasulamiento
    int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

//     Las funciones tipo Void no sirven por que no van a retornar nada
    void muestraFichaTecnica (){
        System.out.println("El nombre de la pelicula es :  " + nombre);
        System.out.println("La duracion es: " + duracionEnMinutos);
        System.out.println("La fecha de lanzamiento de la pelicula  "+ nombre+"  es : " +  fechaDeLanzamiento );
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDeLasEvaluaciones;
    }

}
