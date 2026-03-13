// Last updated: 13/03/2026, 20:34:17
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        double med=0;
4        int l=nums1.length+nums2.length;
5
6        int arr[]=new int[l];
7        for(int i=0;i<nums1.length;i++){
8                arr[i]=nums1[i];
9        }
10        for(int j=0;j<nums2.length;j++){
11            arr[nums1.length+j]=nums2[j];
12        }
13        Arrays.sort(arr);
14        if(l%2==0){
15              double ans=(double)(arr[(l/2)]+arr[(l/2)-1])/2;
16            return ans;
17        }
18        else{
19            double ans=arr[l/2];
20            return ans;
21        }
22    }
23}