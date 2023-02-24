public class commandLineArguments {

    public static void main(String[] args) {

        if( args.length == 1 || args.length > 1 ){
            System.out.println( args[0]);
        }

        if( args.length > 1 ) {
            for( int i = 1; i < args.length; i++ ){
                System.out.println(args[i]);
            }
        }
    }
}