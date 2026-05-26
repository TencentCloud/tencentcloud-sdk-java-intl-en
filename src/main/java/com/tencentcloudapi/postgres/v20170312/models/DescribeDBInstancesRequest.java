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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel {

    /**
    * Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: Filter by instance ID, type string
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-project-id: Filter by project ID, type integer
db-pay-mode: filter by instance billing mode (prepaid - prepayment; postpaid - postpayment). string type.
db-tag-key: specifies the tag key to filter by (string type).
db-private-ip: Filter by instance Private Cloud IP, type string
db-public-address: filter by instance public network address (in string format)
db-dedicated-cluster-id: Filter by private cluster Id, type string
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of results displayed per page. value range: 0-100. input 0 to use the default configuration. default is 10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data offset, which starts from 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Specifies the sorting index, such as instance Name and creation time. supports DBInstanceId, CreateTime, Name, and EndTime. default value: CreateTime.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method, including ascending: `asc` and descending: `desc`. the default value is `asc`.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: Filter by instance ID, type string
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-project-id: Filter by project ID, type integer
db-pay-mode: filter by instance billing mode (prepaid - prepayment; postpaid - postpayment). string type.
db-tag-key: specifies the tag key to filter by (string type).
db-private-ip: Filter by instance Private Cloud IP, type string
db-public-address: filter by instance public network address (in string format)
db-dedicated-cluster-id: Filter by private cluster Id, type string 
     * @return Filters Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: Filter by instance ID, type string
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-project-id: Filter by project ID, type integer
db-pay-mode: filter by instance billing mode (prepaid - prepayment; postpaid - postpayment). string type.
db-tag-key: specifies the tag key to filter by (string type).
db-private-ip: Filter by instance Private Cloud IP, type string
db-public-address: filter by instance public network address (in string format)
db-dedicated-cluster-id: Filter by private cluster Id, type string
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: Filter by instance ID, type string
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-project-id: Filter by project ID, type integer
db-pay-mode: filter by instance billing mode (prepaid - prepayment; postpaid - postpayment). string type.
db-tag-key: specifies the tag key to filter by (string type).
db-private-ip: Filter by instance Private Cloud IP, type string
db-public-address: filter by instance public network address (in string format)
db-dedicated-cluster-id: Filter by private cluster Id, type string
     * @param Filters Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: Filter by instance ID, type string
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-project-id: Filter by project ID, type integer
db-pay-mode: filter by instance billing mode (prepaid - prepayment; postpaid - postpayment). string type.
db-tag-key: specifies the tag key to filter by (string type).
db-private-ip: Filter by instance Private Cloud IP, type string
db-public-address: filter by instance public network address (in string format)
db-dedicated-cluster-id: Filter by private cluster Id, type string
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of results displayed per page. value range: 0-100. input 0 to use the default configuration. default is 10. 
     * @return Limit Number of results displayed per page. value range: 0-100. input 0 to use the default configuration. default is 10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results displayed per page. value range: 0-100. input 0 to use the default configuration. default is 10.
     * @param Limit Number of results displayed per page. value range: 0-100. input 0 to use the default configuration. default is 10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Data offset, which starts from 0. 
     * @return Offset Data offset, which starts from 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset, which starts from 0.
     * @param Offset Data offset, which starts from 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Specifies the sorting index, such as instance Name and creation time. supports DBInstanceId, CreateTime, Name, and EndTime. default value: CreateTime. 
     * @return OrderBy Specifies the sorting index, such as instance Name and creation time. supports DBInstanceId, CreateTime, Name, and EndTime. default value: CreateTime.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Specifies the sorting index, such as instance Name and creation time. supports DBInstanceId, CreateTime, Name, and EndTime. default value: CreateTime.
     * @param OrderBy Specifies the sorting index, such as instance Name and creation time. supports DBInstanceId, CreateTime, Name, and EndTime. default value: CreateTime.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method, including ascending: `asc` and descending: `desc`. the default value is `asc`. 
     * @return OrderByType Sorting method, including ascending: `asc` and descending: `desc`. the default value is `asc`.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method, including ascending: `asc` and descending: `desc`. the default value is `asc`.
     * @param OrderByType Sorting method, including ascending: `asc` and descending: `desc`. the default value is `asc`.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesRequest(DescribeDBInstancesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

