public class TXTReceiptBuilder implements IReceiptBuilder {

    StringBuilder sb = new StringBuilder();


    public void appendHeader(String header) {
        sb.append(header).append("\n");
    }


    public void appendCustomer(CustomerModel customer) {
        sb.append("Customer ID: ").append(customer.mCustomerID).append("\n");
        sb.append("Customer Name: ").append(customer.mName).append("\n");
    }


    public void appendProduct(ProductModel product) {
        sb.append("Product ID: ").append(product.mProductID).append("\n");
        sb.append("Product Name: ").append(product.mName).append("\n");
        sb.append("Product Price: ").append(product.mPrice).append("\n");

    }

    public void appendPurchase(PurchaseModel purchase) {
        sb.append("Purcahse ID: ").append(purchase.mPurchaseID).append("\n");
        sb.append("Purchase Quantity: ").append(purchase.mQuantity).append("\n");
        sb.append("Purchase Cost: ").append(String.format("%8.2f", purchase.mCost)).append("\n");
        sb.append("Purchase Tax: ").append(String.format("%8.2f", purchase.mTax)).append("\n");
        sb.append("Purchase Total: ").append(String.format("%8.2f", purchase.mTotal)).append("\n");

    }


    public void appendFooter(String footer) {
        sb.append(footer).append("\n");
    }
}
