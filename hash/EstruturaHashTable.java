package hash;
public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {
        int keyHash = hash(chave);

        if (tabela[keyHash] != null) {
            return false;
        } else {
            tabela[keyHash] = chave;
            return true;
        }
    }

    @Override
    public boolean delete(int chave) {
        int keyHash = hash(chave);

        if (tabela[keyHash] != null) {
            tabela[keyHash] = null;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean search(int chave) {
        int keyHash = hash(chave);

        if (tabela[keyHash] != null && tabela[keyHash] == chave) {
            return true;
        } else {
            return false;
        }
    }

    private int hash(int key) {
        return key % 1000;
    }
    
}
