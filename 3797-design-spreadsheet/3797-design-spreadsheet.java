class Spreadsheet {
    HashMap<String, Integer> grid = new HashMap<>();

    public Spreadsheet(int rows) {
    }
    
    public void setCell(String cell, int value) {
        grid.put(cell, value);
    }
    
    public void resetCell(String cell) {
        grid.put(cell, 0);
    }
    
    public int getValue(String formula) {
        formula = formula.substring(1);
        String[] parts = formula.split("\\+");
        String left = parts[0];
        String right = parts[1];
        int val1= isNumber(left)?Integer.parseInt(left):grid.getOrDefault(left,0);
        int val2 = isNumber(right)?Integer.parseInt(right):grid.getOrDefault(right,0);
        return val1 + val2;
    }

    private boolean isNumber(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */