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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeL7AccRulesRequest extends AbstractModel {

    /**
    * Zone id.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Filter conditions. the upper limit for filters.values is 20. if this parameter is not filled in, the rules under the site are returned in order by default. detailed filtering conditions are as follows:.
<Li>Rule-Id: filter by rule id.</li>.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number limit of paginated query. default value: 20. maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset of paginated query. default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Zone id. 
     * @return ZoneId Zone id.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone id.
     * @param ZoneId Zone id.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Filter conditions. the upper limit for filters.values is 20. if this parameter is not filled in, the rules under the site are returned in order by default. detailed filtering conditions are as follows:.
<Li>Rule-Id: filter by rule id.</li>. 
     * @return Filters Filter conditions. the upper limit for filters.values is 20. if this parameter is not filled in, the rules under the site are returned in order by default. detailed filtering conditions are as follows:.
<Li>Rule-Id: filter by rule id.</li>.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. the upper limit for filters.values is 20. if this parameter is not filled in, the rules under the site are returned in order by default. detailed filtering conditions are as follows:.
<Li>Rule-Id: filter by rule id.</li>.
     * @param Filters Filter conditions. the upper limit for filters.values is 20. if this parameter is not filled in, the rules under the site are returned in order by default. detailed filtering conditions are as follows:.
<Li>Rule-Id: filter by rule id.</li>.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number limit of paginated query. default value: 20. maximum value: 1000. 
     * @return Limit Number limit of paginated query. default value: 20. maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number limit of paginated query. default value: 20. maximum value: 1000.
     * @param Limit Number limit of paginated query. default value: 20. maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset of paginated query. default value: 0. 
     * @return Offset Offset of paginated query. default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of paginated query. default value: 0.
     * @param Offset Offset of paginated query. default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeL7AccRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL7AccRulesRequest(DescribeL7AccRulesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

