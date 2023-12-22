package ru.mirea.lab24.exs2;


interface Chair {
    void sit();
}


class VictorianChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидите на викторианском стуле.");
    }
}


class MultifunctionalChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидите на многофункциональном стуле.");
    }
}


class MagicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидите на магическом стуле.");
    }
}


interface ChairFactory {
    Chair createChair();
}


class VictorianChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}


class MultifunctionalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}


class MagicChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}


class Client {
    public void sit(Chair chair) {
        chair.sit();
    }
}


public class Main {
    public static void main(String[] args) {
        ChairFactory victorianChairFactory = new VictorianChairFactory();
        Chair victorianChair = victorianChairFactory.createChair();

        ChairFactory multifunctionalChairFactory = new MultifunctionalChairFactory();
        Chair multifunctionalChair = multifunctionalChairFactory.createChair();

        ChairFactory magicChairFactory = new MagicChairFactory();
        Chair magicChair = magicChairFactory.createChair();

        Client client = new Client();
        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }
}