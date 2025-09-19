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

    public void removeMaior(){
        this.raiz = removeMaiorRec(this.raiz);
    }

    private No removeMaiorRec(No x){
        if(x == null) return null;

        if(x.getDireita() == null){
            return x.getEsquerda();
        }
        x.setDireita(removeMaiorRec(x.getDireita()));
        return x
    }

    public void removeMenor(){
        this.raiz = removeMenorRec(this.raiz);
    }

    private No removeMenorRec(No x){
        if(x == null) return null;

        if(x.getEsquerda() == null){
            return x.getDireita();
        }

        x.setEsquerda(removeMenorRec(x.getEsquerda()));
        return x;
    }

    public void remove(int valor){
        this.raiz = removeRec(this.raiz, valor);
    }

    private No removeRec(No x, int valor){
        if(x == null) return null;

        if(valor < x.getInfo()){
            x.setEsquerda(removeRec(x.getEsquerda(), valor));
        }
        else if(valor > x.getInfo()){
            x.setDireita(removeRec(x.getDireita(), valor));
        }
        else {
            if(x.getEsquerda() == null && x.getDireita() == null){
                return null;
            }
            else if(x.getEsquerda() == null){
                return x.getDireita();
            }
            else if(x.getDireita() == null){
                return x.getEsquerda();
            }
            else{
                No sucessor = encontraMenor(x.getDireita());
                x.setInfo(sucessor.getInfo());
                x.setDireita(removeRec(x.getDireita(), sucessor.getInfo()));
            }
        }
        return x;
    }

    private No encontraMenor(No x){
        while(x.getEsquerda() != null){
            x = x.getEsquerda();
        }
        return x;
    }
}
