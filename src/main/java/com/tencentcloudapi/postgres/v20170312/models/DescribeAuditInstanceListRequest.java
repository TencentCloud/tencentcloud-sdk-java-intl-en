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

public class DescribeAuditInstanceListRequest extends AbstractModel {

    /**
    * <p>Product name: postgres</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>Whether to enable</p><p>Enumeration value:</p><ul><li>0: Not enabled</li><li>1: Enabled</li></ul>
    */
    @SerializedName("AuditSwitch")
    @Expose
    private Long AuditSwitch;

    /**
    * <p>Pagination limit</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Page offset amount</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Instance filtering parameters</p><p>Input parameter limitation: Supported filter criteria: InstanceId-instance ID, InstanceName-instance name</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>Product name: postgres</p> 
     * @return Product <p>Product name: postgres</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>Product name: postgres</p>
     * @param Product <p>Product name: postgres</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>Whether to enable</p><p>Enumeration value:</p><ul><li>0: Not enabled</li><li>1: Enabled</li></ul> 
     * @return AuditSwitch <p>Whether to enable</p><p>Enumeration value:</p><ul><li>0: Not enabled</li><li>1: Enabled</li></ul>
     */
    public Long getAuditSwitch() {
        return this.AuditSwitch;
    }

    /**
     * Set <p>Whether to enable</p><p>Enumeration value:</p><ul><li>0: Not enabled</li><li>1: Enabled</li></ul>
     * @param AuditSwitch <p>Whether to enable</p><p>Enumeration value:</p><ul><li>0: Not enabled</li><li>1: Enabled</li></ul>
     */
    public void setAuditSwitch(Long AuditSwitch) {
        this.AuditSwitch = AuditSwitch;
    }

    /**
     * Get <p>Pagination limit</p> 
     * @return Limit <p>Pagination limit</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Pagination limit</p>
     * @param Limit <p>Pagination limit</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Page offset amount</p> 
     * @return Offset <p>Page offset amount</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Page offset amount</p>
     * @param Offset <p>Page offset amount</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Instance filtering parameters</p><p>Input parameter limitation: Supported filter criteria: InstanceId-instance ID, InstanceName-instance name</p> 
     * @return Filters <p>Instance filtering parameters</p><p>Input parameter limitation: Supported filter criteria: InstanceId-instance ID, InstanceName-instance name</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Instance filtering parameters</p><p>Input parameter limitation: Supported filter criteria: InstanceId-instance ID, InstanceName-instance name</p>
     * @param Filters <p>Instance filtering parameters</p><p>Input parameter limitation: Supported filter criteria: InstanceId-instance ID, InstanceName-instance name</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAuditInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditInstanceListRequest(DescribeAuditInstanceListRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.AuditSwitch != null) {
            this.AuditSwitch = new Long(source.AuditSwitch);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "AuditSwitch", this.AuditSwitch);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

