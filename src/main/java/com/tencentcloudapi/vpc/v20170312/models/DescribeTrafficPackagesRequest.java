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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficPackagesRequest extends AbstractModel{

    /**
    * Traffic package IDs. Multiple values can be used.
    */
    @SerializedName("TrafficPackageIds")
    @Expose
    private String [] TrafficPackageIds;

    /**
    * Each request can have up to 10 `Filters`. `TrafficPackageIds` and `Filters` cannot be specified at the same time. The specific filter conditions are as follows:
<li> `traffic-package_id` - String - Optional - Filter by the traffic package ID.</li>
<li> `traffic-package-name` - String - Optional - Filter by the traffic package name. Fuzzy match is not supported.</li>
<li> `status` - String - Optional - Filter by the traffic package status. Values: [AVAILABLE|EXPIRED|EXHAUSTED].</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Pagination parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination parameter
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Traffic package IDs. Multiple values can be used. 
     * @return TrafficPackageIds Traffic package IDs. Multiple values can be used.
     */
    public String [] getTrafficPackageIds() {
        return this.TrafficPackageIds;
    }

    /**
     * Set Traffic package IDs. Multiple values can be used.
     * @param TrafficPackageIds Traffic package IDs. Multiple values can be used.
     */
    public void setTrafficPackageIds(String [] TrafficPackageIds) {
        this.TrafficPackageIds = TrafficPackageIds;
    }

    /**
     * Get Each request can have up to 10 `Filters`. `TrafficPackageIds` and `Filters` cannot be specified at the same time. The specific filter conditions are as follows:
<li> `traffic-package_id` - String - Optional - Filter by the traffic package ID.</li>
<li> `traffic-package-name` - String - Optional - Filter by the traffic package name. Fuzzy match is not supported.</li>
<li> `status` - String - Optional - Filter by the traffic package status. Values: [AVAILABLE|EXPIRED|EXHAUSTED].</li> 
     * @return Filters Each request can have up to 10 `Filters`. `TrafficPackageIds` and `Filters` cannot be specified at the same time. The specific filter conditions are as follows:
<li> `traffic-package_id` - String - Optional - Filter by the traffic package ID.</li>
<li> `traffic-package-name` - String - Optional - Filter by the traffic package name. Fuzzy match is not supported.</li>
<li> `status` - String - Optional - Filter by the traffic package status. Values: [AVAILABLE|EXPIRED|EXHAUSTED].</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Each request can have up to 10 `Filters`. `TrafficPackageIds` and `Filters` cannot be specified at the same time. The specific filter conditions are as follows:
<li> `traffic-package_id` - String - Optional - Filter by the traffic package ID.</li>
<li> `traffic-package-name` - String - Optional - Filter by the traffic package name. Fuzzy match is not supported.</li>
<li> `status` - String - Optional - Filter by the traffic package status. Values: [AVAILABLE|EXPIRED|EXHAUSTED].</li>
     * @param Filters Each request can have up to 10 `Filters`. `TrafficPackageIds` and `Filters` cannot be specified at the same time. The specific filter conditions are as follows:
<li> `traffic-package_id` - String - Optional - Filter by the traffic package ID.</li>
<li> `traffic-package-name` - String - Optional - Filter by the traffic package name. Fuzzy match is not supported.</li>
<li> `status` - String - Optional - Filter by the traffic package status. Values: [AVAILABLE|EXPIRED|EXHAUSTED].</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Pagination parameter 
     * @return Offset Pagination parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter
     * @param Offset Pagination parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination parameter 
     * @return Limit Pagination parameter
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter
     * @param Limit Pagination parameter
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTrafficPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrafficPackagesRequest(DescribeTrafficPackagesRequest source) {
        if (source.TrafficPackageIds != null) {
            this.TrafficPackageIds = new String[source.TrafficPackageIds.length];
            for (int i = 0; i < source.TrafficPackageIds.length; i++) {
                this.TrafficPackageIds[i] = new String(source.TrafficPackageIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TrafficPackageIds.", this.TrafficPackageIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

