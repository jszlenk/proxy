package com.kodilla.proxy.db;

public class LazyDataRetrieverProxy implements DbDataRetriever {

    private DbDataRetriever retriever;

    @Override
    public int getFirstValue() throws InterruptedException {
        System.out.println(retriever);

        if (retriever == null) {
            System.out.println("first");
            retriever = new PostgresDataRetriever();
        }
        return retriever.getFirstValue();
    }

    @Override
    public int getSecondValue() throws InterruptedException {
        System.out.println(retriever);

        if (retriever == null)
            retriever = new PostgresDataRetriever();
        return retriever.getSecondValue();
    }

    @Override
    public int getThirdValue() throws InterruptedException {
        System.out.println(retriever);

        if (retriever == null)
            retriever = new PostgresDataRetriever();
        return retriever.getThirdValue();
    }

}
