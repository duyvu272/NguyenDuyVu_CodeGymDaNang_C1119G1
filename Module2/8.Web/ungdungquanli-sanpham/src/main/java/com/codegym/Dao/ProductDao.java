package com.codegym.Dao;

import com.codegym.model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDao {
    public static Map<Integer, Product> productMap  = new HashMap<>();

    static{
        productMap.put(1,new Product(1,"SmartTV SamSung","US","TV 4K","https://vnreview.vn/image/19/41/51/1941511.jpg"));
        productMap.put(2,new Product(2,"Air Condition","US","Use when it's Hot","https://lh3.googleusercontent.com/proxy/ncSGzpMBs7_PqVhTAFAuif2FNs1xibmlLy8QoHV37JO07JqJq_LMgypxlkzwwkUhAHHlCHEeSZMlVrBiAJKgJc19c6APXAxB07hY3909J54GBYwaqk2r6ojFT5TBF82HdZHPVDlfk2BFiPnatwvQLAmSUjD4dfjBf0KmJobbXj8"));
        productMap.put(3,new Product(3,"Iphone xsMax","China","for rick kid","https://cdn.tgdd.vn/Products/Images/42/190322/iphone-xs-max-256gb-white-600x600.jpg"));
        productMap.put(4,new Product(4,"iFan 1000","VietNam","Use one time","https://quatdvn.com/wp-content/uploads/2016/06/quat-dien-panasonic-f308nhp.jpg"));
        productMap.put(5,new Product(5,"SamSung Note 11","US","For fashion star","https://cdn.fptshop.com.vn/Uploads/Originals/2019/5/17/636936844242568724_samsung-galaxy-note-10-pro-1.png"));
    }
}
