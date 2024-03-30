public class Main {
    public static void main(String[] args) {

        ArbolHabilidadesDinamico<Habilidad> troll = new ArbolHabilidadesDinamico(new Habilidad("Troll", "Personaje"));
        ArbolHabilidadesDinamico<Habilidad> elfo = new ArbolHabilidadesDinamico<>(new Habilidad("Elfo", "Personaje"));
        troll.imprimirArbol();
        elfo.imprimirArbol();

        int max_turnos = 10;
        int turnos = 0;

        while(turnos < max_turnos){

            if(turnos%2==0){
                // Ataca un jugador (Por ejemplo troll)
            }else{
                //Ataca el otro jugador (Por ejemplo Elfo)
            }

        }

        //Al finalizar la partida imprimir los arboles de cada jugador
    }
}