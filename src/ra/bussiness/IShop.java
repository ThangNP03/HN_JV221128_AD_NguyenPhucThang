package ra.bussiness;

import ra.bussinessImp.Catalog;
import ra.bussinessImp.Product;

import java.util.List;
import java.util.Scanner;

public interface IShop {
    public static final float RATE = 1.3F;
    public void inputData(Scanner sc, List<Catalog> list);
    public void displayData();

    int sortInterest(Product o);
}
