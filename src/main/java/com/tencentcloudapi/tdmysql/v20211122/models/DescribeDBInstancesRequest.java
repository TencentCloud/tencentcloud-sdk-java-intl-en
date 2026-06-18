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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel {

    /**
    * <p>Filter parameters</p>
    */
    @SerializedName("Filters")
    @Expose
    private InstanceFilter [] Filters;

    /**
    * <p>Maximum return count, defaults to 20, maximum 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset, which is an integer multiple of Limit.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Specified query engine type</p><p>Enumeration value:</p><ul><li>libra: Column storage engine</li></ul>
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
     * Get <p>Filter parameters</p> 
     * @return Filters <p>Filter parameters</p>
     */
    public InstanceFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter parameters</p>
     * @param Filters <p>Filter parameters</p>
     */
    public void setFilters(InstanceFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Maximum return count, defaults to 20, maximum 100</p> 
     * @return Limit <p>Maximum return count, defaults to 20, maximum 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Maximum return count, defaults to 20, maximum 100</p>
     * @param Limit <p>Maximum return count, defaults to 20, maximum 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset, which is an integer multiple of Limit.</p> 
     * @return Offset <p>Offset, which is an integer multiple of Limit.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset, which is an integer multiple of Limit.</p>
     * @param Offset <p>Offset, which is an integer multiple of Limit.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Specified query engine type</p><p>Enumeration value:</p><ul><li>libra: Column storage engine</li></ul> 
     * @return EngineType <p>Specified query engine type</p><p>Enumeration value:</p><ul><li>libra: Column storage engine</li></ul>
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set <p>Specified query engine type</p><p>Enumeration value:</p><ul><li>libra: Column storage engine</li></ul>
     * @param EngineType <p>Specified query engine type</p><p>Enumeration value:</p><ul><li>libra: Column storage engine</li></ul>
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public DescribeDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesRequest(DescribeDBInstancesRequest source) {
        if (source.Filters != null) {
            this.Filters = new InstanceFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new InstanceFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

