class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int c=m+n;
        int d=0;
        for(int i=m;i<c;i++)
        {
            if(d<n)
            { nums1[i]=nums2[d];  }
            d++;
                
        }
        int tem;
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(nums1[i]<nums1[j])
                {
                    tem=nums1[j];
                    nums1[j]=nums1[i];
                    nums1[i]=tem;
                }
                    
            }
                
        }
    }
}