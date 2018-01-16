package nl.hanze.research.mutual;

public abstract class Test {

    public long test() {
        long start = System.currentTimeMillis();

        execute();

        return System.currentTimeMillis() - start;
    }

    protected abstract void execute();

}
