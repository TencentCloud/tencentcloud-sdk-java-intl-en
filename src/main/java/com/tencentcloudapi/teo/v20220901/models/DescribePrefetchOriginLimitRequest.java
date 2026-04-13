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

public class DescribePrefetchOriginLimitRequest extends AbstractModel {

    /**
    * Specifies the site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Specifies the paginated query limit. default value: 20. upper limit: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter condition. specifies the maximum number of Filters.Values is 20. detailed filter criteria:.
<Li>Domain-Name: specifies domain filtering. the domain-name format is like www.qq.com. fuzzy queries are not supported.</li>.
<li>area: specifies the acceleration region to filter by limit. fuzzy queries are not supported. valid values:<br> Overseas: global availability zone (excludes chinese mainland);<br> MainlandChina: chinese mainland availability zone.</li>.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Specifies the site ID. 
     * @return ZoneId Specifies the site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies the site ID.
     * @param ZoneId Specifies the site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Offset of paginated query. Default value: 0. 
     * @return Offset Offset of paginated query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of paginated query. Default value: 0.
     * @param Offset Offset of paginated query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Specifies the paginated query limit. default value: 20. upper limit: 100. 
     * @return Limit Specifies the paginated query limit. default value: 20. upper limit: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Specifies the paginated query limit. default value: 20. upper limit: 100.
     * @param Limit Specifies the paginated query limit. default value: 20. upper limit: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter condition. specifies the maximum number of Filters.Values is 20. detailed filter criteria:.
<Li>Domain-Name: specifies domain filtering. the domain-name format is like www.qq.com. fuzzy queries are not supported.</li>.
<li>area: specifies the acceleration region to filter by limit. fuzzy queries are not supported. valid values:<br> Overseas: global availability zone (excludes chinese mainland);<br> MainlandChina: chinese mainland availability zone.</li>. 
     * @return Filters Filter condition. specifies the maximum number of Filters.Values is 20. detailed filter criteria:.
<Li>Domain-Name: specifies domain filtering. the domain-name format is like www.qq.com. fuzzy queries are not supported.</li>.
<li>area: specifies the acceleration region to filter by limit. fuzzy queries are not supported. valid values:<br> Overseas: global availability zone (excludes chinese mainland);<br> MainlandChina: chinese mainland availability zone.</li>.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. specifies the maximum number of Filters.Values is 20. detailed filter criteria:.
<Li>Domain-Name: specifies domain filtering. the domain-name format is like www.qq.com. fuzzy queries are not supported.</li>.
<li>area: specifies the acceleration region to filter by limit. fuzzy queries are not supported. valid values:<br> Overseas: global availability zone (excludes chinese mainland);<br> MainlandChina: chinese mainland availability zone.</li>.
     * @param Filters Filter condition. specifies the maximum number of Filters.Values is 20. detailed filter criteria:.
<Li>Domain-Name: specifies domain filtering. the domain-name format is like www.qq.com. fuzzy queries are not supported.</li>.
<li>area: specifies the acceleration region to filter by limit. fuzzy queries are not supported. valid values:<br> Overseas: global availability zone (excludes chinese mainland);<br> MainlandChina: chinese mainland availability zone.</li>.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePrefetchOriginLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrefetchOriginLimitRequest(DescribePrefetchOriginLimitRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

