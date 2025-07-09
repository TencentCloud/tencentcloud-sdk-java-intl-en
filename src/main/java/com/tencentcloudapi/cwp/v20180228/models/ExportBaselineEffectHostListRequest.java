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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportBaselineEffectHostListRequest extends AbstractModel {

    /**
    * Baseline ID
    */
    @SerializedName("BaselineId")
    @Expose
    private Long BaselineId;

    /**
    * Filtering criteria
<li>AliasName - String - host alias</li>
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
    * Baseline name
    */
    @SerializedName("BaselineName")
    @Expose
    private String BaselineName;

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
     * Get Filtering criteria
<li>AliasName - String - host alias</li> 
     * @return Filters Filtering criteria
<li>AliasName - String - host alias</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>AliasName - String - host alias</li>
     * @param Filters Filtering criteria
<li>AliasName - String - host alias</li>
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

    /**
     * Get Baseline name 
     * @return BaselineName Baseline name
     */
    public String getBaselineName() {
        return this.BaselineName;
    }

    /**
     * Set Baseline name
     * @param BaselineName Baseline name
     */
    public void setBaselineName(String BaselineName) {
        this.BaselineName = BaselineName;
    }

    public ExportBaselineEffectHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportBaselineEffectHostListRequest(ExportBaselineEffectHostListRequest source) {
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
        if (source.BaselineName != null) {
            this.BaselineName = new String(source.BaselineName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BaselineId", this.BaselineId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamArraySimple(map, prefix + "UuidList.", this.UuidList);
        this.setParamSimple(map, prefix + "BaselineName", this.BaselineName);

    }
}

