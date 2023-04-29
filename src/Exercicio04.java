public class Exercicio04 {
    public static void main(String[] args) {

        double velocidadeCaminhao = 80.0 , velocidadeCarro = 110.0 ;
        double distanciaTotal = 100.0;
        double tempoEncontro;

        tempoEncontro = distanciaTotal / (velocidadeCarro + velocidadeCaminhao);

        double distanciaCarro, distanciaCaminhao; //Distância dos veículos da cidade de Ribeirão Preto

        distanciaCarro = velocidadeCarro * tempoEncontro;
        distanciaCaminhao = velocidadeCaminhao * (tempoEncontro + (10 / 60)); //Conversão em horas
        //dos 10 minutos acrescidos no trajeto do caminhão por causa dos pedágios

        System.out.printf("%.2f %.2f", distanciaCarro, distanciaCaminhao);
        //No momento em que eles se cruzarem, ambos estarão à 57,89 Km da cidade de Ribeirão Preto

        /* Lógica: O primeiro passo foi calcular o tempo em que eles se encontravam nesse trajeto
           então utilizei uma equação física de deslocamento e igualei o espaço de ambos os veículos
           pois para eles se cruzarem na rodovia eles devem estar no mesmo local, assim a fórmula ficou

                    Tempo de encontro = DistânciaTotal (entre as cidades) / somaDasVelocidades (Dos dois veículos)

           Após isso eu calculei a distância percorrida por cada veículo usando a fórmula

                    DistanciaPercorrida = VelocidadeVeiculo + Tempo (incrementando os 10 minutos de pedágio na equação
                                                                     do caminhão)

           E por último eu subtraí a distância percorrida pelo caminhão (que saia de Franca em direção a Ribeirão Preto)
           e vi que a distância dele para a cidade de Ribeirão era igual à distância do carro
         */
    }
}
