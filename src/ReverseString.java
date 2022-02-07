import java.io.*;
import java.util.*;
import java.lang.*;

public class ReverseString{
    public String reverseString(String _string){
        return new StringBuilder().append(_string).reverse().toString();
    }
}