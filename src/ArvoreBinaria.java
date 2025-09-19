public class ArvoreBinaria {
    private No raiz;

    public void preordem(No y){
        System.out.print(this.raiz.getInfo() + " ");
        preordem(this.raiz.getEsquerda());
        preordem(this.raiz.getDireita());
    }

    public void inordem(No y){
        inordem(this.raiz.getEsquerda());
        System.out.print(this.raiz.getInfo() + " ");
        inordem(this.raiz.getDireita());
    }

    public void posordem(No y){
        posordem(this.raiz.getEsquerda());
        posordem(this.raiz.getDireita());
        System.out.print(this.raiz.getInfo() + " ");
    }
}
