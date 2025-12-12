class ScopeAll {
    int field = 100;

    void checkScope() {
        int local = 200;
        System.out.println("start: field=" + field 
        + ", local=" + local);

        if (true) {
            int local = 300;               
            int block = 400;
            System.out.println(local + block);
        }

        System.out.println(block);        

        for (int j = 0; j < 2; j++) {
            int temp = j * 10;
            System.out.println("loop: j=" + j + ", temp=" + temp);
        }

        System.out.println(j);            
        System.out.println(temp);         

        int x = 1;
        {                                 
            int x = 2;                    
            System.out.println(x);
        }
    }

    void anotherMethod() {
        System.out.println(local);        
        System.out.println(block);        
        System.out.println("field=" + field);
    }
}
