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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskCenterAssetViewPortRiskListResponse extends AbstractModel {

    /**
    * Total number of entries
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of configuration risks
    */
    @SerializedName("Data")
    @Expose
    private AssetViewPortRisk [] Data;

    /**
    * List of risk handling status
    */
    @SerializedName("StatusLists")
    @Expose
    private FilterDataObject [] StatusLists;

    /**
    * List of risk levels
    */
    @SerializedName("LevelLists")
    @Expose
    private FilterDataObject [] LevelLists;

    /**
    * List of fix suggestions 
    */
    @SerializedName("SuggestionLists")
    @Expose
    private FilterDataObject [] SuggestionLists;

    /**
    * List of asset types
    */
    @SerializedName("InstanceTypeLists")
    @Expose
    private FilterDataObject [] InstanceTypeLists;

    /**
    * List of check source
    */
    @SerializedName("FromLists")
    @Expose
    private FilterDataObject [] FromLists;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of entries 
     * @return TotalCount Total number of entries
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of entries
     * @param TotalCount Total number of entries
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of configuration risks 
     * @return Data List of configuration risks
     */
    public AssetViewPortRisk [] getData() {
        return this.Data;
    }

    /**
     * Set List of configuration risks
     * @param Data List of configuration risks
     */
    public void setData(AssetViewPortRisk [] Data) {
        this.Data = Data;
    }

    /**
     * Get List of risk handling status 
     * @return StatusLists List of risk handling status
     */
    public FilterDataObject [] getStatusLists() {
        return this.StatusLists;
    }

    /**
     * Set List of risk handling status
     * @param StatusLists List of risk handling status
     */
    public void setStatusLists(FilterDataObject [] StatusLists) {
        this.StatusLists = StatusLists;
    }

    /**
     * Get List of risk levels 
     * @return LevelLists List of risk levels
     */
    public FilterDataObject [] getLevelLists() {
        return this.LevelLists;
    }

    /**
     * Set List of risk levels
     * @param LevelLists List of risk levels
     */
    public void setLevelLists(FilterDataObject [] LevelLists) {
        this.LevelLists = LevelLists;
    }

    /**
     * Get List of fix suggestions  
     * @return SuggestionLists List of fix suggestions 
     */
    public FilterDataObject [] getSuggestionLists() {
        return this.SuggestionLists;
    }

    /**
     * Set List of fix suggestions 
     * @param SuggestionLists List of fix suggestions 
     */
    public void setSuggestionLists(FilterDataObject [] SuggestionLists) {
        this.SuggestionLists = SuggestionLists;
    }

    /**
     * Get List of asset types 
     * @return InstanceTypeLists List of asset types
     */
    public FilterDataObject [] getInstanceTypeLists() {
        return this.InstanceTypeLists;
    }

    /**
     * Set List of asset types
     * @param InstanceTypeLists List of asset types
     */
    public void setInstanceTypeLists(FilterDataObject [] InstanceTypeLists) {
        this.InstanceTypeLists = InstanceTypeLists;
    }

    /**
     * Get List of check source 
     * @return FromLists List of check source
     */
    public FilterDataObject [] getFromLists() {
        return this.FromLists;
    }

    /**
     * Set List of check source
     * @param FromLists List of check source
     */
    public void setFromLists(FilterDataObject [] FromLists) {
        this.FromLists = FromLists;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRiskCenterAssetViewPortRiskListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskCenterAssetViewPortRiskListResponse(DescribeRiskCenterAssetViewPortRiskListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new AssetViewPortRisk[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new AssetViewPortRisk(source.Data[i]);
            }
        }
        if (source.StatusLists != null) {
            this.StatusLists = new FilterDataObject[source.StatusLists.length];
            for (int i = 0; i < source.StatusLists.length; i++) {
                this.StatusLists[i] = new FilterDataObject(source.StatusLists[i]);
            }
        }
        if (source.LevelLists != null) {
            this.LevelLists = new FilterDataObject[source.LevelLists.length];
            for (int i = 0; i < source.LevelLists.length; i++) {
                this.LevelLists[i] = new FilterDataObject(source.LevelLists[i]);
            }
        }
        if (source.SuggestionLists != null) {
            this.SuggestionLists = new FilterDataObject[source.SuggestionLists.length];
            for (int i = 0; i < source.SuggestionLists.length; i++) {
                this.SuggestionLists[i] = new FilterDataObject(source.SuggestionLists[i]);
            }
        }
        if (source.InstanceTypeLists != null) {
            this.InstanceTypeLists = new FilterDataObject[source.InstanceTypeLists.length];
            for (int i = 0; i < source.InstanceTypeLists.length; i++) {
                this.InstanceTypeLists[i] = new FilterDataObject(source.InstanceTypeLists[i]);
            }
        }
        if (source.FromLists != null) {
            this.FromLists = new FilterDataObject[source.FromLists.length];
            for (int i = 0; i < source.FromLists.length; i++) {
                this.FromLists[i] = new FilterDataObject(source.FromLists[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "StatusLists.", this.StatusLists);
        this.setParamArrayObj(map, prefix + "LevelLists.", this.LevelLists);
        this.setParamArrayObj(map, prefix + "SuggestionLists.", this.SuggestionLists);
        this.setParamArrayObj(map, prefix + "InstanceTypeLists.", this.InstanceTypeLists);
        this.setParamArrayObj(map, prefix + "FromLists.", this.FromLists);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

