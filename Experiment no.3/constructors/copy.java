public class copy        //Rohit waghmare Rill no:213
{ 
    int id;  
    String name;  
       
        copy(int i,String n)
        {  
            id = i;  
            name = n;  
        }  
        
       copy(copy s)
        {  
            id = s.id;  
            name =s.name;  
        }  
        void display()
        {
            System.out.println("id :"+id+" "+"name :"+name);
        }  
       
        public static void main(String args[]){  
        copy s1 = new copy(213,"Rohit");  
        copy s2 = new copy(s1);  
        s1.display();  
        s2.display();  
       }  
    }