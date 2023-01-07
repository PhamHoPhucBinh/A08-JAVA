package _Shop_Management.util;

import static javafx.scene.input.KeyCode.P;

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
