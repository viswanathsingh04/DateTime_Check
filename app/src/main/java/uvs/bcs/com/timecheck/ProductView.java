package uvs.bcs.com.timecheck;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import uvs.bcs.com.timecheck.Ord.CreateOrder;
import uvs.bcs.com.timecheck.pro.SingleProduct;

public class ProductView extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnOrder;
    private Button mBtnProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_view);
        initView();
    }

    private void initView() {
        mBtnOrder = (Button) findViewById(R.id.btn_order);
        mBtnOrder.setOnClickListener(this);
        mBtnProduct = (Button) findViewById(R.id.btn_product);
        mBtnProduct.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn_order:
                GetOrderfromapi();
                break;
            case R.id.btn_product:
                GetProductfromapi();
                break;
        }
    }

    private void GetProductfromapi() {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<SingleProduct> call = apiInterface.GetProducts();
        call.enqueue(new Callback<SingleProduct>() {
            @Override
            public void onResponse(@NonNull Call<SingleProduct> call, @NonNull Response<SingleProduct> response) {
                if (response.isSuccessful()) {
                    SingleProduct cc = response.body();
                    Toast.makeText(ProductView.this, cc.getId().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<SingleProduct> call, @NonNull Throwable t) {
                t.printStackTrace();
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void GetOrderfromapi() {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<CreateOrder> call = apiInterface.GetOrders();
        call.enqueue(new Callback<CreateOrder>() {
            @Override
            public void onResponse(@NonNull Call<CreateOrder> call, @NonNull Response<CreateOrder> response) {
                if (response.isSuccessful()) {
                    CreateOrder cc = response.body();
                    Toast.makeText(ProductView.this, cc.getId().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<CreateOrder> call, @NonNull Throwable t) {
                t.printStackTrace();
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
