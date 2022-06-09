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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIndexListRequest extends AbstractModel{

    /**
    * Index type. `auto`: Automated; `normal`: General.
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
    * Index name. `null` indicates that all indexes are requested.
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * Username for cluster access
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Password for cluster access
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * The starting position of paging
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of results per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting condition field, which can be `IndexName`, `IndexStorage`, or `IndexCreateTime`.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Filtering by index status
    */
    @SerializedName("IndexStatusList")
    @Expose
    private String [] IndexStatusList;

    /**
    * Sorting mode, which can be `asc` and `desc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Index type. `auto`: Automated; `normal`: General. 
     * @return IndexType Index type. `auto`: Automated; `normal`: General.
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set Index type. `auto`: Automated; `normal`: General.
     * @param IndexType Index type. `auto`: Automated; `normal`: General.
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
     * Get Index name. `null` indicates that all indexes are requested. 
     * @return IndexName Index name. `null` indicates that all indexes are requested.
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set Index name. `null` indicates that all indexes are requested.
     * @param IndexName Index name. `null` indicates that all indexes are requested.
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get Username for cluster access 
     * @return Username Username for cluster access
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username for cluster access
     * @param Username Username for cluster access
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Password for cluster access 
     * @return Password Password for cluster access
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password for cluster access
     * @param Password Password for cluster access
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get The starting position of paging 
     * @return Offset The starting position of paging
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The starting position of paging
     * @param Offset The starting position of paging
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of results per page 
     * @return Limit The number of results per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of results per page
     * @param Limit The number of results per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting condition field, which can be `IndexName`, `IndexStorage`, or `IndexCreateTime`. 
     * @return OrderBy Sorting condition field, which can be `IndexName`, `IndexStorage`, or `IndexCreateTime`.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting condition field, which can be `IndexName`, `IndexStorage`, or `IndexCreateTime`.
     * @param OrderBy Sorting condition field, which can be `IndexName`, `IndexStorage`, or `IndexCreateTime`.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Filtering by index status 
     * @return IndexStatusList Filtering by index status
     */
    public String [] getIndexStatusList() {
        return this.IndexStatusList;
    }

    /**
     * Set Filtering by index status
     * @param IndexStatusList Filtering by index status
     */
    public void setIndexStatusList(String [] IndexStatusList) {
        this.IndexStatusList = IndexStatusList;
    }

    /**
     * Get Sorting mode, which can be `asc` and `desc`. 
     * @return Order Sorting mode, which can be `asc` and `desc`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting mode, which can be `asc` and `desc`.
     * @param Order Sorting mode, which can be `asc` and `desc`.
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

