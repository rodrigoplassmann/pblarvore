public class Main{
    public static void main(String[] args){
        ArvoreBinaria av = new ArvoreBinaria();
        av.insere(14);
        av.insere(15);
        av.insere(4);
        av.insere(9);
        av.insere(7);
        av.insere(18);
        av.insere(3);
        av.insere(5);
        av.insere(16);
        av.insere(20);
        av.insere(17);

        System.out.print("Pré-ordem: ");
        av.preordem(av.getRaiz());
        System.out.println();

        System.out.print("In-ordem: ");
        av.inordem(av.getRaiz());
        System.out.println();

        System.out.print("Pós-ordem: ");
        av.posordem(av.getRaiz());
        System.out.println();

        av.removeMenor();

        av.remove(16);

        System.out.print("\nPós-ordem apos remoçao: ");
        av.posordem(av.getRaiz());
        System.out.println();

        System.out.print("In-ordem apos remoçao: ");
        av.inordem(av.getRaiz());
        System.out.println();

        System.out.print("Pré-ordem apos remoçao: ");
        av.preordem(av.getRaiz());
        System.out.println();
    }
}
