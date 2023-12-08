public interface Q2Pile {
    <T> void push(T valeur);
    boolean isEmpty(void);
    <T> T pop(void);
}