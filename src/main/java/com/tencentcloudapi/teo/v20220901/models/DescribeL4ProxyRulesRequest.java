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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeL4ProxyRulesRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Layer 4 proxy instance ID.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Paginated query offset. Defaults to 0 when not specified.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Paginated query limit. Default value: 20. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria. The upper limit of Filters.Values is 20. If it is not filled in, all rule information under the current layer-4 instance will be returned. The detailed filter criteria are as follows: <li>rule-id: filter as per the rules under the layer-4 proxy instance by Rule ID. Rule ID is in the form: rule-31vv7qig0vjy;</li> <li>rule-tag: filter as per the rules under the layer-4 proxy instance by Rule Tag.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Layer 4 proxy instance ID. 
     * @return ProxyId Layer 4 proxy instance ID.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Layer 4 proxy instance ID.
     * @param ProxyId Layer 4 proxy instance ID.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Paginated query offset. Defaults to 0 when not specified. 
     * @return Offset Paginated query offset. Defaults to 0 when not specified.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paginated query offset. Defaults to 0 when not specified.
     * @param Offset Paginated query offset. Defaults to 0 when not specified.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Paginated query limit. Default value: 20. Maximum value: 1000. 
     * @return Limit Paginated query limit. Default value: 20. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Paginated query limit. Default value: 20. Maximum value: 1000.
     * @param Limit Paginated query limit. Default value: 20. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. The upper limit of Filters.Values is 20. If it is not filled in, all rule information under the current layer-4 instance will be returned. The detailed filter criteria are as follows: <li>rule-id: filter as per the rules under the layer-4 proxy instance by Rule ID. Rule ID is in the form: rule-31vv7qig0vjy;</li> <li>rule-tag: filter as per the rules under the layer-4 proxy instance by Rule Tag.</li> 
     * @return Filters Filter criteria. The upper limit of Filters.Values is 20. If it is not filled in, all rule information under the current layer-4 instance will be returned. The detailed filter criteria are as follows: <li>rule-id: filter as per the rules under the layer-4 proxy instance by Rule ID. Rule ID is in the form: rule-31vv7qig0vjy;</li> <li>rule-tag: filter as per the rules under the layer-4 proxy instance by Rule Tag.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The upper limit of Filters.Values is 20. If it is not filled in, all rule information under the current layer-4 instance will be returned. The detailed filter criteria are as follows: <li>rule-id: filter as per the rules under the layer-4 proxy instance by Rule ID. Rule ID is in the form: rule-31vv7qig0vjy;</li> <li>rule-tag: filter as per the rules under the layer-4 proxy instance by Rule Tag.</li>
     * @param Filters Filter criteria. The upper limit of Filters.Values is 20. If it is not filled in, all rule information under the current layer-4 instance will be returned. The detailed filter criteria are as follows: <li>rule-id: filter as per the rules under the layer-4 proxy instance by Rule ID. Rule ID is in the form: rule-31vv7qig0vjy;</li> <li>rule-tag: filter as per the rules under the layer-4 proxy instance by Rule Tag.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeL4ProxyRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL4ProxyRulesRequest(DescribeL4ProxyRulesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

