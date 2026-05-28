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
    * Filter parameters.
    */
    @SerializedName("Filters")
    @Expose
    private InstanceFilter [] Filters;

    /**
    * Maximum return count, defaults to 20, maximum 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is an integer multiple of Limit.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Filter parameters. 
     * @return Filters Filter parameters.
     */
    public InstanceFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters.
     * @param Filters Filter parameters.
     */
    public void setFilters(InstanceFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Maximum return count, defaults to 20, maximum 100 
     * @return Limit Maximum return count, defaults to 20, maximum 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum return count, defaults to 20, maximum 100
     * @param Limit Maximum return count, defaults to 20, maximum 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is an integer multiple of Limit. 
     * @return Offset Offset, which is an integer multiple of Limit.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is an integer multiple of Limit.
     * @param Offset Offset, which is an integer multiple of Limit.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

