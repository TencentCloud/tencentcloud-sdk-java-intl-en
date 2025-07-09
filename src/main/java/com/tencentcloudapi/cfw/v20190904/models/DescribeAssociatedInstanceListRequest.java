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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssociatedInstanceListRequest extends AbstractModel {

    /**
    * List offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of records per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Region code (e.g. ap-guangzhou). All Tencent Cloud regions are supported.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Additional search criteria (JSON string)
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sort order. asc: ascending; desc: descending
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Security group ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Instance type. '3': CVM instance; '4': CLB instance; '5': ENI instance; '6': Cloud database
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get List offset 
     * @return Offset List offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set List offset
     * @param Offset List offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of records per page 
     * @return Limit Number of records per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of records per page
     * @param Limit Number of records per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Region code (e.g. ap-guangzhou). All Tencent Cloud regions are supported. 
     * @return Area Region code (e.g. ap-guangzhou). All Tencent Cloud regions are supported.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region code (e.g. ap-guangzhou). All Tencent Cloud regions are supported.
     * @param Area Region code (e.g. ap-guangzhou). All Tencent Cloud regions are supported.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Additional search criteria (JSON string) 
     * @return SearchValue Additional search criteria (JSON string)
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set Additional search criteria (JSON string)
     * @param SearchValue Additional search criteria (JSON string)
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get Sorting field 
     * @return By Sorting field
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
     * @param By Sorting field
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sort order. asc: ascending; desc: descending 
     * @return Order Sort order. asc: ascending; desc: descending
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort order. asc: ascending; desc: descending
     * @param Order Sort order. asc: ascending; desc: descending
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Security group ID 
     * @return SecurityGroupId Security group ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group ID
     * @param SecurityGroupId Security group ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Instance type. '3': CVM instance; '4': CLB instance; '5': ENI instance; '6': Cloud database 
     * @return Type Instance type. '3': CVM instance; '4': CLB instance; '5': ENI instance; '6': Cloud database
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Instance type. '3': CVM instance; '4': CLB instance; '5': ENI instance; '6': Cloud database
     * @param Type Instance type. '3': CVM instance; '4': CLB instance; '5': ENI instance; '6': Cloud database
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeAssociatedInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssociatedInstanceListRequest(DescribeAssociatedInstanceListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

