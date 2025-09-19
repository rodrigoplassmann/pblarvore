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

    public void remove(int valor){
        this.raiz = removearvore(this.raiz, valor);
    }

    public No removearvore(No y, int valor){
        if(y == null){
            return null;
        }

        if(valor < y.getInfo()){
            y.setEsquerda(removearvore(y.getEsquerda(), valor));
        }
        else if(valor >= y.getInfo()){
            y.setDireita(removearvore(y.getDireita(), valor));
        }
        else{
            if(y.getEsquerda() == null && y.getDireita() == null){
                return null;
            }
            else if(y.getEsquerda() == null){
                return y.getDireita();
            }
            else if(y.getDireita() == null){
                return y.getEsquerda();
            }
            else{
                No temp = y.getDireita();
                while(temp.getEsquerda() != null){
                    temp = temp.getEsquerda();
                }
                y.setInfo(temp.getInfo());
                y.setDireita(removearvore(y.getDireita(), temp.getInfo()));
            }
        }

        return y;
    }
}
