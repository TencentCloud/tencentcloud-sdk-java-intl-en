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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePackingQuotaGroupRequest extends AbstractModel {

    /**
    * Filter. Zone: AZ; InstanceType: instance type; DataDiskSize: data disk size.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Filter. Zone: AZ; InstanceType: instance type; DataDiskSize: data disk size. 
     * @return Filters Filter. Zone: AZ; InstanceType: instance type; DataDiskSize: data disk size.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Zone: AZ; InstanceType: instance type; DataDiskSize: data disk size.
     * @param Filters Filter. Zone: AZ; InstanceType: instance type; DataDiskSize: data disk size.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePackingQuotaGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePackingQuotaGroupRequest(DescribePackingQuotaGroupRequest source) {
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

