public class ArvoreBinaria {
    private No raiz;

    public No getRaiz(){
        return this.raiz;
    }

    public void insere(int info){
        this.raiz = inserearvore(this.raiz, info);
    }

    public No inserearvore(No x, int info){
        if(x == null){
            x = new No(info);
        }
        else if(info < x.getInfo()){
            x.setEsquerda(inserearvore(x.getEsquerda(), info));
        }
        else if(info >= x.getInfo()){
            x.setDireita(inserearvore(x.getDireita(), info));
        }

        return x;
    }

    public void preordem(No y){
        if (y != null) {
            System.out.print(y.getInfo() + " ");
            preordem(y.getEsquerda());
            preordem(y.getDireita());
        }
    }

    public void inordem(No y){
        if (y != null) {
            inordem(y.getEsquerda());
            System.out.print(y.getInfo() + " ");
            inordem(y.getDireita());
        }
    }

    public void posordem(No y){
        if (y != null) {
            posordem(y.getEsquerda());
            posordem(y.getDireita());
            System.out.print(y.getInfo() + " ");
        }
    }
}
