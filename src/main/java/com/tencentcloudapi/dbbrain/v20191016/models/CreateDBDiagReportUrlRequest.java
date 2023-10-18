/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBDiagReportUrlRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The health report task ID, which can be queried through `DescribeDBDiagReportTasks`.
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The health report task ID, which can be queried through `DescribeDBDiagReportTasks`. 
     * @return AsyncRequestId The health report task ID, which can be queried through `DescribeDBDiagReportTasks`.
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set The health report task ID, which can be queried through `DescribeDBDiagReportTasks`.
     * @param AsyncRequestId The health report task ID, which can be queried through `DescribeDBDiagReportTasks`.
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`. 
     * @return Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     * @param Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public CreateDBDiagReportUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBDiagReportUrlRequest(CreateDBDiagReportUrlRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

