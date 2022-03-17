class Solution
{
    public void setZeroes(int[][] matrix) 
    {
        boolean first_row=false;
        boolean first_column=false;
        
        for(int i=0;i<matrix.length;i++)
        {
               if(matrix[i][0]==0)
               {
                   first_column=true;
               }
            
        }
        
         for(int i=0;i<matrix[0].length;i++)
        {
               if(matrix[0][i]==0)
               {
                   first_row=true;
               }
            
        }
           
          for(int i=1;i<matrix.length;i++)
          {
              for(int j=1;j<matrix[i].length;j++)
              {
                  if(matrix[i][j]==0)
                  {
                      matrix[0][j]=0;//upper row ko 0 set krdo 
                      matrix[i][0]=0;//left column ko 0 set krdo
                  }
              }
          }
        
        //fir ab inner matrix kome desired places pe 0 set krdo 
        
        for(int i=matrix.length-1;i>=1;i--)
        {
            for(int j=matrix[i].length-1;j>=1;j--)
            {
                if(matrix[i][0]==0||matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        if(first_row==true)
        {
          for(int i=0;i<matrix[0].length;i++)
            {
                   
               matrix[0][i]=0;
            }
        
        }
         if(first_column==true)
        {
          for(int i=0;i<matrix.length;i++)
            {
                   
               matrix[i][0]=0;
            }
        
        }
    }
}
