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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancingRequest extends AbstractModel{

    /**
    * Offset for paginated queries. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paginated queries. Value range: 1-1000. Default value: 10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria. Each filter criteria can have up to 20 entries.
<li>`zone-id`:<br>   Filter by <strong>site ID</strong>, such as zone-1a8df68z<br>   Type: String<br>   Required: No<br>   Fuzzy query: Not supported
</li><li>`load-balancing-id`<br>   Filter by <strong>load balancer ID</strong>, such as lb-d21bfaf7-8d72-11ec-841d-00ff977fb3c8<br>   Type: String<br>   Required: No<br>   Fuzzy query: Not supported
</li><li>`host`:<br>   Filter by <strong>load balancing hostname</strong>, such as lb.tencent.com<br>   Type: String<br>   Required: No<br>   Fuzzy query: Supported (only one hostname allowed in a query)</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get Offset for paginated queries. Default value: 0. 
     * @return Offset Offset for paginated queries. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for paginated queries. Default value: 0.
     * @param Offset Offset for paginated queries. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paginated queries. Value range: 1-1000. Default value: 10. 
     * @return Limit Limit on paginated queries. Value range: 1-1000. Default value: 10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. Value range: 1-1000. Default value: 10.
     * @param Limit Limit on paginated queries. Value range: 1-1000. Default value: 10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. Each filter criteria can have up to 20 entries.
<li>`zone-id`:<br>   Filter by <strong>site ID</strong>, such as zone-1a8df68z<br>   Type: String<br>   Required: No<br>   Fuzzy query: Not supported
</li><li>`load-balancing-id`<br>   Filter by <strong>load balancer ID</strong>, such as lb-d21bfaf7-8d72-11ec-841d-00ff977fb3c8<br>   Type: String<br>   Required: No<br>   Fuzzy query: Not supported
</li><li>`host`:<br>   Filter by <strong>load balancing hostname</strong>, such as lb.tencent.com<br>   Type: String<br>   Required: No<br>   Fuzzy query: Supported (only one hostname allowed in a query)</li> 
     * @return Filters Filter criteria. Each filter criteria can have up to 20 entries.
<li>`zone-id`:<br>   Filter by <strong>site ID</strong>, such as zone-1a8df68z<br>   Type: String<br>   Required: No<br>   Fuzzy query: Not supported
</li><li>`load-balancing-id`<br>   Filter by <strong>load balancer ID</strong>, such as lb-d21bfaf7-8d72-11ec-841d-00ff977fb3c8<br>   Type: String<br>   Required: No<br>   Fuzzy query: Not supported
</li><li>`host`:<br>   Filter by <strong>load balancing hostname</strong>, such as lb.tencent.com<br>   Type: String<br>   Required: No<br>   Fuzzy query: Supported (only one hostname allowed in a query)</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. Each filter criteria can have up to 20 entries.
<li>`zone-id`:<br>   Filter by <strong>site ID</strong>, such as zone-1a8df68z<br>   Type: String<br>   Required: No<br>   Fuzzy query: Not supported
</li><li>`load-balancing-id`<br>   Filter by <strong>load balancer ID</strong>, such as lb-d21bfaf7-8d72-11ec-841d-00ff977fb3c8<br>   Type: String<br>   Required: No<br>   Fuzzy query: Not supported
</li><li>`host`:<br>   Filter by <strong>load balancing hostname</strong>, such as lb.tencent.com<br>   Type: String<br>   Required: No<br>   Fuzzy query: Supported (only one hostname allowed in a query)</li>
     * @param Filters Filter criteria. Each filter criteria can have up to 20 entries.
<li>`zone-id`:<br>   Filter by <strong>site ID</strong>, such as zone-1a8df68z<br>   Type: String<br>   Required: No<br>   Fuzzy query: Not supported
</li><li>`load-balancing-id`<br>   Filter by <strong>load balancer ID</strong>, such as lb-d21bfaf7-8d72-11ec-841d-00ff977fb3c8<br>   Type: String<br>   Required: No<br>   Fuzzy query: Not supported
</li><li>`host`:<br>   Filter by <strong>load balancing hostname</strong>, such as lb.tencent.com<br>   Type: String<br>   Required: No<br>   Fuzzy query: Supported (only one hostname allowed in a query)</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeLoadBalancingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancingRequest(DescribeLoadBalancingRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

