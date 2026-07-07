class Solution {
    public boolean isValidSudoku(char[][] boards) {
        //row & column
        for(int i=0; i<9; i++)
        {
            int cr=0, cc=0;
            HashSet<Character> row=new HashSet<>();
            HashSet<Character> column= new HashSet<>();
            for(int j=0; j<9; j++)
            {
                if(boards[j][i]!='.')
                {
                    cc++;
                    column.add(boards[j][i]);
                }
                if(boards[i][j]!='.')
                {
                    cr++;
                    row.add(boards[i][j]);
                }
            }
            if(!(cc==column.size() && cr==row.size()))
                return false;
        }
        for(int i=0; i<8; i+=3)
        {
            for(int j=0; j<8; j+=3)
            {
                HashSet<Character> c1=new HashSet<>();
                int c11=0;
                if(boards[i][j]!='.')
                {
                    c1.add(boards[i][j]);
                    c11++;
                }
                if(boards[i][j+1]!='.')
                {
                    c1.add(boards[i][j+1]);
                    c11++;
                }
                if(boards[i][j+2]!='.')
                {
                    c1.add(boards[i][j+2]);
                    c11++;
                }
                if(boards[i+1][j]!='.')
                {
                    c1.add(boards[i+1][j]);
                    c11++;
                }
                if(boards[i+1][j+1]!='.')
                {
                    c1.add(boards[i+1][j+1]);
                    c11++;
                }
                if(boards[i+1][j+2]!='.')
                {
                    c1.add(boards[i+1][j+2]);
                    c11++;
                }
                if(boards[i+2][j]!='.')
                {
                    c1.add(boards[i+2][j]);
                    c11++;
                }
                if(boards[i+2][j+1]!='.')
                {
                    c1.add(boards[i+2][j+1]);
                    c11++;
                }
                if(boards[i+2][j+2]!='.')
                {
                    c1.add(boards[i+2][j+2]);
                    c11++;
                }
                if(c11!=c1.size())
                    return false;
            }
        }
        return true;
    }
}
