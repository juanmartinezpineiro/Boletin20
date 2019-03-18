package boletin20_1;

import javax.swing.JOptionPane;

public class Futbol {
 /**
 *
 * @author jmartinezpineiro
 */
String []jornadas = new String[5]; 
String []equipos = {"Celta","Depor","Malaga","Getafe"};
int [][]goles = new int [equipos.length][jornadas.length];
int [] mediaGoles = new int[goles.length];


public String[] darValorJornadas(String []jornadas){
    for (int i = 0; i < jornadas.length; i++){
        jornadas[i]="X"+(i+1);
        }
    return jornadas;
    }

public void enseñar(String []jornadas){
    for (int i=0; i< jornadas.length; i++)
        System.out.print(jornadas[i] + "  ");
}

public int[][] darValorGoles (int [][]goles){
    for (int i =0; i < goles.length; i++){
        for (int j=0; j< goles[0].length; j++){
            goles[i][j] = (int)(Math.random() * 8);
        }
    }
    return goles;
}

public void visualizarTodo(String []jornadas, String []equipos, int [][]goles){
       for (int j=0; j<jornadas.length; j++){
               System.out.print("   " + jornadas[j]+ "   ");
       }
       System.out.print("\n");
       for (int i=0; i<goles.length; i++){
           System.out.print(equipos[i]);System.out.print("     | ");
           for(int j=0; j<goles[i].length; j++){
               System.out.print(goles[i][j]+"  ");
           }
           System.out.println(" |  media de goles: " +mediaGoles[i]);   
       }
   }

public void mediaEquipo(int [][]lista){
        int ac;
        for (int i = 0; i< lista.length; i++){
            ac = 0;
            for (int j=0; j < lista[i].length;j++){
                ac = ac + lista[i][j];
        }
        mediaGoles[i] = ac/goles[i].length;
        }    
    }

public void ordenarMedias(int []lista, String []nombres, int [][] matriz){
    int aux = 0; String aux1;// int aux2 = 0;
    int []aux2 = {0,0,0};   
    for (int i=0;i<lista.length-1;i++){
        for (int j=i+1; j < lista.length; j++){
            if (lista [i] > lista [j]){
                aux = lista[i]; aux1 = nombres[i];
                lista [i] = lista [j]; nombres[i] = nombres[j];
                lista [j] = aux; nombres[j] = aux1;
                //for (int k=0; k<matriz[0].length; k++){
                    aux2 = matriz[i];
                    matriz[i] = matriz [j];
                    matriz [j] = aux2;
                    }   
                }
            }
    }

public void equipoGoleadorPorJornada(){
    int aux;
    for (int i = 0; i<jornadas.length; i++){ //Recorre las jornadas
        aux = 0;
        for (int j = 0; j < goles.length; j++){ // Recorre goles por columnas
            if (aux < goles[j][i]){ //identifica maxNumGoles
              aux = goles[j][i];
            }
        }
        for (int j = 0; j <goles.length; j++){ // Recorre goles por columnas
            if (aux == goles[j][i]) // identifica la posición en la que se encuentra el mayor numero de goles
                System.out.print("El equipo goleador de la jornada " +jornadas[i]+ " es el " +equipos[j]+ "\n");
        }    
    }
    
}

public void mayorCantidadDeGoles(){
    int auxG =0;
    for (int i = 0; i<goles.length; i++){ //Recorren la matriz goles para buscar el mayor numero de goles
        for (int j=0; j<goles[i].length; j++){
            if (auxG < goles[i][j])
                auxG = goles[i][j];
        }
    }
    for (int i = 0; i<goles.length; i++){
        for (int j = 0; j < goles[i].length; j++){
            if (auxG == goles[i][j]){
                System.out.println("El mayor numero de goles los metió el " +equipos[i]+ " en la jornada " +jornadas[j]);
            }
        }
    }
    
}

public void consultas(){ //WTF?
    String auxE = JOptionPane.showInputDialog("Introduce el nombre del equipo que quieras consultar: ");
    String auxJ = JOptionPane.showInputDialog("Introduce la jornada que quieras consultar: ");
        for (int i = 0; i < equipos.length; i++){
            if (auxE == null ? equipos[i] == null : auxE.equals(equipos[i]))
            for (int j = 0; j < jornadas.length; j++){
            if (auxJ == null ? jornadas[j] == null : auxJ.equals(jornadas[j]))
                System.out.println("El numero de goles del " + auxE + " en la jornada " + auxJ + " es de: " +goles[i][j]);
            }
        }
    }

}