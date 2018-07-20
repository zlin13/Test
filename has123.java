public boolean has123(int[] nums) {
    boolean found1 = false;
    boolean found2 = false;
    boolean found3 = false;
    
    
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 1)
            found1 = true;

        if(nums[i] == 2)
            found2 = true;

        if(nums[i] == 3)
            found3 = true;
        if(found1 && found2 && found3)
            return true;
    }
                                  
    return false;  
}
