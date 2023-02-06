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

public class DescribeProxyProcessStatisticsRequest extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The proxy ID you want to query under the instance
    */
    @SerializedName("InstanceProxyId")
    @Expose
    private String InstanceProxyId;

    /**
    * Number of returned results.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Service type. Valid value: `redis` (TencentDB for Redis).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sort by field. Valid values: `AllConn`, `ActiveConn`, `Ip`.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Sorting order. Valid values: `DESC`, `ASC`.
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

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
     * Get The proxy ID you want to query under the instance 
     * @return InstanceProxyId The proxy ID you want to query under the instance
     */
    public String getInstanceProxyId() {
        return this.InstanceProxyId;
    }

    /**
     * Set The proxy ID you want to query under the instance
     * @param InstanceProxyId The proxy ID you want to query under the instance
     */
    public void setInstanceProxyId(String InstanceProxyId) {
        this.InstanceProxyId = InstanceProxyId;
    }

    /**
     * Get Number of returned results. 
     * @return Limit Number of returned results.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results.
     * @param Limit Number of returned results.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sort by field. Valid values: `AllConn`, `ActiveConn`, `Ip`. 
     * @return SortBy Sort by field. Valid values: `AllConn`, `ActiveConn`, `Ip`.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sort by field. Valid values: `AllConn`, `ActiveConn`, `Ip`.
     * @param SortBy Sort by field. Valid values: `AllConn`, `ActiveConn`, `Ip`.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Sorting order. Valid values: `DESC`, `ASC`. 
     * @return OrderDirection Sorting order. Valid values: `DESC`, `ASC`.
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Sorting order. Valid values: `DESC`, `ASC`.
     * @param OrderDirection Sorting order. Valid values: `DESC`, `ASC`.
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeProxyProcessStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyProcessStatisticsRequest(DescribeProxyProcessStatisticsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceProxyId != null) {
            this.InstanceProxyId = new String(source.InstanceProxyId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceProxyId", this.InstanceProxyId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

