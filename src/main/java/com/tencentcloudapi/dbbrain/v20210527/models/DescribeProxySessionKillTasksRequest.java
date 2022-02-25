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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxySessionKillTasksRequest extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The async session killing task ID, which is obtained after the API `CreateProxySessionKillTask` is successfully called.
    */
    @SerializedName("AsyncRequestIds")
    @Expose
    private Long [] AsyncRequestIds;

    /**
    * Service type. Valid value: `redis` (TencentDB for Redis).
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
     * Get The async session killing task ID, which is obtained after the API `CreateProxySessionKillTask` is successfully called. 
     * @return AsyncRequestIds The async session killing task ID, which is obtained after the API `CreateProxySessionKillTask` is successfully called.
     */
    public Long [] getAsyncRequestIds() {
        return this.AsyncRequestIds;
    }

    /**
     * Set The async session killing task ID, which is obtained after the API `CreateProxySessionKillTask` is successfully called.
     * @param AsyncRequestIds The async session killing task ID, which is obtained after the API `CreateProxySessionKillTask` is successfully called.
     */
    public void setAsyncRequestIds(Long [] AsyncRequestIds) {
        this.AsyncRequestIds = AsyncRequestIds;
    }

    /**
     * Get Service type. Valid value: `redis` (TencentDB for Redis). 
     * @return Product Service type. Valid value: `redis` (TencentDB for Redis).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid value: `redis` (TencentDB for Redis).
     * @param Product Service type. Valid value: `redis` (TencentDB for Redis).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeProxySessionKillTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxySessionKillTasksRequest(DescribeProxySessionKillTasksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AsyncRequestIds != null) {
            this.AsyncRequestIds = new Long[source.AsyncRequestIds.length];
            for (int i = 0; i < source.AsyncRequestIds.length; i++) {
                this.AsyncRequestIds[i] = new Long(source.AsyncRequestIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "AsyncRequestIds.", this.AsyncRequestIds);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

