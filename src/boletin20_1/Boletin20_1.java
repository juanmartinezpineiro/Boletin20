package boletin20_1;

import Utils.PedirValor;

public class Boletin20_1 {
 /**
 *
 * @author jmartinezpineiro
 */

    public static void main(String[] args) {
        
        Futbol obx = new Futbol();
        int op;
        
        obx.darValorGoles(obx.goles);
        obx.mediaEquipo(obx.goles);
        do{
            
        op = PedirValor.enteiro("Introduce la opcion que quieras:\n1 -> Mostrar tabla\n2 -> Ordenar de menor a mayor"
                + "\n3 -> Equipo mas goleador por jornada\n4 -> Mayor cantidad de goles\n5 Consultas del equipo");
        obx.darValorJornadas(obx.jornadas);
            System.out.println("\n********\n");
        switch(op){
            case 1: obx.visualizarTodo(obx.jornadas, obx.equipos, obx.goles);     
                break;
            case 2: obx.ordenarMedias(obx.mediaGoles, obx.equipos, obx.goles);
                    obx.visualizarTodo(obx.jornadas, obx.equipos, obx.goles);
                break;
            case 3: obx.equipoGoleadorPorJornada();
                break;
            case 4: obx.mayorCantidadDeGoles();
                break;
            case 5: obx.consultas();
                break;
        }
    }while(op < 6);
        }
}
