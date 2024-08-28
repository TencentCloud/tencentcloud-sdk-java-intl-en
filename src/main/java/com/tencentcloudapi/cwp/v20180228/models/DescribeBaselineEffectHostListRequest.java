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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineEffectHostListRequest extends AbstractModel {

    /**
    * Pagination parameters (The maximum number is 100.)
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Baseline ID
    */
    @SerializedName("BaselineId")
    @Expose
    private Long BaselineId;

    /**
    * Filter criteria
<li>AliasName - String - host alias</li>
<li>Status- Uint: 1 - passed; 0 - failed; 5 - under detection</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Policy ID
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Host UUID array
    */
    @SerializedName("UuidList")
    @Expose
    private String [] UuidList;

    /**
     * Get Pagination parameters (The maximum number is 100.) 
     * @return Limit Pagination parameters (The maximum number is 100.)
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameters (The maximum number is 100.)
     * @param Limit Pagination parameters (The maximum number is 100.)
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get Baseline ID 
     * @return BaselineId Baseline ID
     */
    public Long getBaselineId() {
        return this.BaselineId;
    }

    /**
     * Set Baseline ID
     * @param BaselineId Baseline ID
     */
    public void setBaselineId(Long BaselineId) {
        this.BaselineId = BaselineId;
    }

    /**
     * Get Filter criteria
<li>AliasName - String - host alias</li>
<li>Status- Uint: 1 - passed; 0 - failed; 5 - under detection</li> 
     * @return Filters Filter criteria
<li>AliasName - String - host alias</li>
<li>Status- Uint: 1 - passed; 0 - failed; 5 - under detection</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>AliasName - String - host alias</li>
<li>Status- Uint: 1 - passed; 0 - failed; 5 - under detection</li>
     * @param Filters Filter criteria
<li>AliasName - String - host alias</li>
<li>Status- Uint: 1 - passed; 0 - failed; 5 - under detection</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Policy ID 
     * @return StrategyId Policy ID
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID
     * @param StrategyId Policy ID
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Host UUID array 
     * @return UuidList Host UUID array
     */
    public String [] getUuidList() {
        return this.UuidList;
    }

    /**
     * Set Host UUID array
     * @param UuidList Host UUID array
     */
    public void setUuidList(String [] UuidList) {
        this.UuidList = UuidList;
    }

    public DescribeBaselineEffectHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineEffectHostListRequest(DescribeBaselineEffectHostListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.BaselineId != null) {
            this.BaselineId = new Long(source.BaselineId);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.UuidList != null) {
            this.UuidList = new String[source.UuidList.length];
            for (int i = 0; i < source.UuidList.length; i++) {
                this.UuidList[i] = new String(source.UuidList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BaselineId", this.BaselineId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamArraySimple(map, prefix + "UuidList.", this.UuidList);

    }
}

