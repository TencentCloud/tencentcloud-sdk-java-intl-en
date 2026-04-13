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

public class DescribeAccountsRequest extends AbstractModel {

    /**
    * Instance ID, such as postgres-6fego161. can be obtained through the DescribeDBInstances api (https://www.tencentcloud.com/document/product/409/16773?lang=en).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Pagination return. maximum return per page. default 20. value range 1-100.
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
    * Return data is sorted by creation time or username. valid values: createTime, name, updateTime. createTime - sort by creation time; name - sort by username; updateTime - sort by update time.
Default value: createTime.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Specifies whether the returned results are in ascending or descending order. valid values: desc or asc. desc - descending order; asc - ascending order.
Default value: desc.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Instance ID, such as postgres-6fego161. can be obtained through the DescribeDBInstances api (https://www.tencentcloud.com/document/product/409/16773?lang=en). 
     * @return DBInstanceId Instance ID, such as postgres-6fego161. can be obtained through the DescribeDBInstances api (https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID, such as postgres-6fego161. can be obtained through the DescribeDBInstances api (https://www.tencentcloud.com/document/product/409/16773?lang=en).
     * @param DBInstanceId Instance ID, such as postgres-6fego161. can be obtained through the DescribeDBInstances api (https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Pagination return. maximum return per page. default 20. value range 1-100. 
     * @return Limit Pagination return. maximum return per page. default 20. value range 1-100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination return. maximum return per page. default 20. value range 1-100.
     * @param Limit Pagination return. maximum return per page. default 20. value range 1-100.
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
     * Get Return data is sorted by creation time or username. valid values: createTime, name, updateTime. createTime - sort by creation time; name - sort by username; updateTime - sort by update time.
Default value: createTime. 
     * @return OrderBy Return data is sorted by creation time or username. valid values: createTime, name, updateTime. createTime - sort by creation time; name - sort by username; updateTime - sort by update time.
Default value: createTime.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Return data is sorted by creation time or username. valid values: createTime, name, updateTime. createTime - sort by creation time; name - sort by username; updateTime - sort by update time.
Default value: createTime.
     * @param OrderBy Return data is sorted by creation time or username. valid values: createTime, name, updateTime. createTime - sort by creation time; name - sort by username; updateTime - sort by update time.
Default value: createTime.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Specifies whether the returned results are in ascending or descending order. valid values: desc or asc. desc - descending order; asc - ascending order.
Default value: desc. 
     * @return OrderByType Specifies whether the returned results are in ascending or descending order. valid values: desc or asc. desc - descending order; asc - ascending order.
Default value: desc.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Specifies whether the returned results are in ascending or descending order. valid values: desc or asc. desc - descending order; asc - ascending order.
Default value: desc.
     * @param OrderByType Specifies whether the returned results are in ascending or descending order. valid values: desc or asc. desc - descending order; asc - ascending order.
Default value: desc.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountsRequest(DescribeAccountsRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
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
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

