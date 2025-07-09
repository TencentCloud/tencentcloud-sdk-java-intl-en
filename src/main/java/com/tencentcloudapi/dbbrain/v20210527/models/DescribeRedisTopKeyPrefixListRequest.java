/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRedisTopKeyPrefixListRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Date for query, such as `2021-05-27`. You can select a date as early as in the last 30 days for query.
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Service type. Valid value: `redis` (TencentDB for Redis).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * The number of queried items. Default value: `20`. Max value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Date for query, such as `2021-05-27`. You can select a date as early as in the last 30 days for query. 
     * @return Date Date for query, such as `2021-05-27`. You can select a date as early as in the last 30 days for query.
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date for query, such as `2021-05-27`. You can select a date as early as in the last 30 days for query.
     * @param Date Date for query, such as `2021-05-27`. You can select a date as early as in the last 30 days for query.
     */
    public void setDate(String Date) {
        this.Date = Date;
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

    /**
     * Get The number of queried items. Default value: `20`. Max value: `100`. 
     * @return Limit The number of queried items. Default value: `20`. Max value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of queried items. Default value: `20`. Max value: `100`.
     * @param Limit The number of queried items. Default value: `20`. Max value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRedisTopKeyPrefixListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisTopKeyPrefixListRequest(DescribeRedisTopKeyPrefixListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

