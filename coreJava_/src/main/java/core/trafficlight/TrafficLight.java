package core.trafficlight;

/**
 * date: 02.12.17
 * author: nevernew
 * объектно-ориентированный подход к решению задачи
 * работы светофора
 *
 */


class TrafficLight {

    public static void main(String[] args) {
        Instance red = new Instance("red");
        Instance jellow = new Instance("jellow");
        Instance green = new Instance("green");

        Engine engine = new Engine(red,jellow,green);

    }
}
