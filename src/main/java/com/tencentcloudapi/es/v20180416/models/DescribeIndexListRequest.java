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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIndexListRequest extends AbstractModel {

    /**
    * Index type. auto: autonomous index; normal: general index
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * ES cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Index name. If this parameter is left empty, all indexes are obtained.
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * Cluster access username.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Cluster access password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Paging start position
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items displayed per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting fields, which support the following index names: IndexName, IndexStorage, and IndexCreateTime.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Filter by index status
    */
    @SerializedName("IndexStatusList")
    @Expose
    private String [] IndexStatusList;

    /**
    * Sort order. Supports asc and desc. Defaults to desc. Data format: "asc", "desc"
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Index type. auto: autonomous index; normal: general index 
     * @return IndexType Index type. auto: autonomous index; normal: general index
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set Index type. auto: autonomous index; normal: general index
     * @param IndexType Index type. auto: autonomous index; normal: general index
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get ES cluster ID 
     * @return InstanceId ES cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES cluster ID
     * @param InstanceId ES cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Index name. If this parameter is left empty, all indexes are obtained. 
     * @return IndexName Index name. If this parameter is left empty, all indexes are obtained.
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set Index name. If this parameter is left empty, all indexes are obtained.
     * @param IndexName Index name. If this parameter is left empty, all indexes are obtained.
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get Cluster access username. 
     * @return Username Cluster access username.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Cluster access username.
     * @param Username Cluster access username.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Cluster access password 
     * @return Password Cluster access password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Cluster access password
     * @param Password Cluster access password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Paging start position 
     * @return Offset Paging start position
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging start position
     * @param Offset Paging start position
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items displayed per page 
     * @return Limit Number of items displayed per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items displayed per page
     * @param Limit Number of items displayed per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting fields, which support the following index names: IndexName, IndexStorage, and IndexCreateTime. 
     * @return OrderBy Sorting fields, which support the following index names: IndexName, IndexStorage, and IndexCreateTime.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting fields, which support the following index names: IndexName, IndexStorage, and IndexCreateTime.
     * @param OrderBy Sorting fields, which support the following index names: IndexName, IndexStorage, and IndexCreateTime.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Filter by index status 
     * @return IndexStatusList Filter by index status
     */
    public String [] getIndexStatusList() {
        return this.IndexStatusList;
    }

    /**
     * Set Filter by index status
     * @param IndexStatusList Filter by index status
     */
    public void setIndexStatusList(String [] IndexStatusList) {
        this.IndexStatusList = IndexStatusList;
    }

    /**
     * Get Sort order. Supports asc and desc. Defaults to desc. Data format: "asc", "desc" 
     * @return Order Sort order. Supports asc and desc. Defaults to desc. Data format: "asc", "desc"
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort order. Supports asc and desc. Defaults to desc. Data format: "asc", "desc"
     * @param Order Sort order. Supports asc and desc. Defaults to desc. Data format: "asc", "desc"
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeIndexListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIndexListRequest(DescribeIndexListRequest source) {
        if (source.IndexType != null) {
            this.IndexType = new String(source.IndexType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.IndexStatusList != null) {
            this.IndexStatusList = new String[source.IndexStatusList.length];
            for (int i = 0; i < source.IndexStatusList.length; i++) {
                this.IndexStatusList[i] = new String(source.IndexStatusList[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexType", this.IndexType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamArraySimple(map, prefix + "IndexStatusList.", this.IndexStatusList);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

