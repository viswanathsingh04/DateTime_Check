package uvs.bcs.com.timecheck;

import retrofit2.Call;
import retrofit2.http.GET;
import uvs.bcs.com.timecheck.Ord.CreateOrder;
import uvs.bcs.com.timecheck.pro.SingleProduct;

public interface ApiInterface {

    @GET("chocho/order.json")
    Call<CreateOrder> GetOrders();

    @GET("chocho/sproduct.json")
    Call<SingleProduct> GetProducts();

}