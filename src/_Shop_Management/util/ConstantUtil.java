package _Shop_Management.util;



public interface ConstantUtil {
    String Prefix = "P";
    String SuffixDomestic = "D";
    String SuffixImported = "I";

    enum ProductStatus{
        preparing,
        shipping,
        arrived
    }
}
