package metier;

public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException(val);
        } else {
            this.val = val;
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException{
        if (val < 0){
            throw new NombreNegatifException(val);
        } else {
            this.val = val;
        }
    }

    public void decrementer() throws NombreNegatifException{
        if (this.val <= 0){
            throw new NombreNegatifException(val);
        } else {
            this.val -= 1;
        }
    }
}
