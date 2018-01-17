package nl.hanze.research.mutual;

public abstract class Test {

    public long test() {
        long start = System.nanoTime();

        execute();

        return System.nanoTime() - start;
    }

    protected abstract void execute();

}
