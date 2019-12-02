package core.trafficlight;

/**
 * date: 02.12.17
 * author: nevernew
 */


class Engine {
    Engine(Instance ... x){

        for(int i=0; i< x.length; i++){
            System.out.println(x[i].color);

        }
    }

}
