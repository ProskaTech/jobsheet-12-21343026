
package js12;

/**
 *
 * @author Indah Chania 21343026
 */
class Bank {
    float sukuBunga(){
        return 0;
    }
}

class BRI extends Bank{
    // overriding sukuBunga method
    float sukuBunga(){
        return 5.5f;
    }
}

class BNI extends Bank{
    //overriding sukuBunga method
    float sukuBunga(){
        return 10.6f;
    }
}

class Mandiri extends Bank{
    //overriding sukuBunga method
    float sukuBunga(){
        return 9.4f;
    }
}
