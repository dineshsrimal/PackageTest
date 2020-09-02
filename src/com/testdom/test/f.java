package com.testdom.test;

/**
 * Created by dineshs on 6/7/2019.
 */
public class f {

    public class DocumentCounter {

        public static abstract class AbstractDocumentCounter {
            private int count = 0;
            private int increment;

            public AbstractDocumentCounter(int increment) {
                this.increment = increment;
            }

            protected int getAndIncrement() {
                int countBeforeIncrement = count;
                count += increment;
                return countBeforeIncrement;
            }

            public abstract String getNewDocumentName();
        }

        public static class DocumentNameCreator extends AbstractDocumentCounter {
            private String prefix;

            public DocumentNameCreator(int increment, String prefix) {
                super(increment);
                this.prefix = prefix;
            }

            public String getNewDocumentName() {
                return prefix + getAndIncrement();
            }
        }
    }

    Shelf shelf1 = new Shelf();
    shelf1.put(null || "");
    Assert.assertNull(shelf1);
}
