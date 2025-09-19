public class ArvoreBinaria {
    private No raiz;

    public void insere(int info){
        this.raiz = inserearvore(this.raiz, info);
    }

    public No inserearvore(No x, int info){
        if(this.raiz == null){
            this.raiz = new No(info);
        }
        else if(info < this.raiz.getInfo()){
            this.raiz.setEsquerda(inserearvore(this.raiz.getEsquerda(), info));
        }
        else if(info >= this.raiz.getInfo()){
            this.raiz.setDireita(inserearvore(this.raiz.getDireita(), info));
        }

        return this.raiz;
    }

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
