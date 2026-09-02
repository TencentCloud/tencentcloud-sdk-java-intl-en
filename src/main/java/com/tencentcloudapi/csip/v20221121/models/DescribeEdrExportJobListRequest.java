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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdrExportJobListRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>PolicyType - int - required: no - policy typePolicyName - string - required: no - Policy NameDomain - string - required: no - Domain name (URL-encode the Domain name first, then encode it with base64)PolicyAction- int - required: no - policy actionIsEnabled - int - required: no - whether it takes effect</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

    /**
    * <p>Limit number. Default value: 10. Maximum value: 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset. Default: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sort direction by task creation time. Only <code>ASC</code> / <code>DESC</code> is supported.</p><p>Enumeration values:</p><ul><li>ASC: ascending order</li><li>DESC: descending order</li></ul>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field. Currently only supports InsertTime (time order by task issuance). Default is InsertTime if not passed. Importing other values will return InvalidParameter.</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>PolicyType - int - required: no - policy typePolicyName - string - required: no - Policy NameDomain - string - required: no - Domain name (URL-encode the Domain name first, then encode it with base64)PolicyAction- int - required: no - policy actionIsEnabled - int - required: no - whether it takes effect</p> 
     * @return Filters <p>PolicyType - int - required: no - policy typePolicyName - string - required: no - Policy NameDomain - string - required: no - Domain name (URL-encode the Domain name first, then encode it with base64)PolicyAction- int - required: no - policy actionIsEnabled - int - required: no - whether it takes effect</p>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>PolicyType - int - required: no - policy typePolicyName - string - required: no - Policy NameDomain - string - required: no - Domain name (URL-encode the Domain name first, then encode it with base64)PolicyAction- int - required: no - policy actionIsEnabled - int - required: no - whether it takes effect</p>
     * @param Filters <p>PolicyType - int - required: no - policy typePolicyName - string - required: no - Policy NameDomain - string - required: no - Domain name (URL-encode the Domain name first, then encode it with base64)PolicyAction- int - required: no - policy actionIsEnabled - int - required: no - whether it takes effect</p>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Limit number. Default value: 10. Maximum value: 100</p> 
     * @return Limit <p>Limit number. Default value: 10. Maximum value: 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Limit number. Default value: 10. Maximum value: 100</p>
     * @param Limit <p>Limit number. Default value: 10. Maximum value: 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset. Default: 0</p> 
     * @return Offset <p>Offset. Default: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default: 0</p>
     * @param Offset <p>Offset. Default: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sort direction by task creation time. Only <code>ASC</code> / <code>DESC</code> is supported.</p><p>Enumeration values:</p><ul><li>ASC: ascending order</li><li>DESC: descending order</li></ul> 
     * @return Order <p>Sort direction by task creation time. Only <code>ASC</code> / <code>DESC</code> is supported.</p><p>Enumeration values:</p><ul><li>ASC: ascending order</li><li>DESC: descending order</li></ul>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sort direction by task creation time. Only <code>ASC</code> / <code>DESC</code> is supported.</p><p>Enumeration values:</p><ul><li>ASC: ascending order</li><li>DESC: descending order</li></ul>
     * @param Order <p>Sort direction by task creation time. Only <code>ASC</code> / <code>DESC</code> is supported.</p><p>Enumeration values:</p><ul><li>ASC: ascending order</li><li>DESC: descending order</li></ul>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field. Currently only supports InsertTime (time order by task issuance). Default is InsertTime if not passed. Importing other values will return InvalidParameter.</p> 
     * @return By <p>Sorting field. Currently only supports InsertTime (time order by task issuance). Default is InsertTime if not passed. Importing other values will return InvalidParameter.</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field. Currently only supports InsertTime (time order by task issuance). Default is InsertTime if not passed. Importing other values will return InvalidParameter.</p>
     * @param By <p>Sorting field. Currently only supports InsertTime (time order by task issuance). Default is InsertTime if not passed. Importing other values will return InvalidParameter.</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeEdrExportJobListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdrExportJobListRequest(DescribeEdrExportJobListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

