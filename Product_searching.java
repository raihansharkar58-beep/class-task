class products{
    
    String category;
    String brand;
    int price;
    products(String category,String brand,int price){
        
        this.category=category;
        this.brand=brand;
        this.price=price;

    }
    void search(products[] arr,String category,boolean f){
        int n=arr.length;
        System.out.println("category : "+category);
        for(int i=0;i<n;i++){
            if(category==arr[i].category){
                
                System.out.println("brand = "+arr[i].brand);
                System.out.println("price = "+ arr[i].price);
            }
        }

    }
    void search(products[] arr,int lwprice,int hghprice){
        int n=arr.length;
        System.out.println("price range : "+lwprice+" to "+hghprice);
        for(int i=0;i<n;i++){
            if(arr[i].price>=lwprice && arr[i].price<=hghprice){
                System.out.println("category = "+arr[i].category);
                System.out.println("brand = "+arr[i].brand);
                System.out.println("price = "+ arr[i].price);
            }
        }
    }
    void search(products[] arr,String brand){
        int n=arr.length;
        System.out.println("brand = "+brand);
        for(int i=0;i<n;i++){
            if(arr[i].brand==brand){
                System.out.println("price = "+arr[i].price);
                System.out.println("category : "+arr[i].category);
            }
        }
    }

    

}

class Search{
    void search(products[] arr,String category,boolean f){
        int n=arr.length;
        System.out.println("category : "+category);
        for(int i=0;i<n;i++){
            if(category==arr[i].category){
                
                System.out.println("brand = "+arr[i].brand);
                System.out.println("price = "+ arr[i].price);
            }
        }

    }
    void search(products[] arr,int lwprice,int hghprice){
        int n=arr.length;
        System.out.println("price range : "+lwprice+" to "+hghprice);
        for(int i=0;i<n;i++){
            if(arr[i].price>=lwprice && arr[i].price<=hghprice){
                System.out.println("category = "+arr[i].category);
                System.out.println("brand = "+arr[i].brand);
                System.out.println("price = "+ arr[i].price);
            }
        }
    }
    void search(products[] arr,String brand){
        int n=arr.length;
        System.out.println("brand = "+brand);
        for(int i=0;i<n;i++){
            if(arr[i].brand==brand){
                System.out.println("price = "+arr[i].price);
                System.out.println("category : "+arr[i].category);
            }
        }
    }
}
public class Product_searching {
    public static void main(String[] args) {
        products[] arr=new products[]{
            new products("electronics","casio",300),
            new products("electronics","apple",500),
            new products("fashion","aarong",200),
            new products("fashon", "nike", 120)
        };
        Search sch=new Search();
        sch.search(arr, "apple");
        System.out.println();
        sch.search(arr,"electronics" ,true);
        System.out.println();
        sch.search(arr,400,500 );

        
    }
    
}
