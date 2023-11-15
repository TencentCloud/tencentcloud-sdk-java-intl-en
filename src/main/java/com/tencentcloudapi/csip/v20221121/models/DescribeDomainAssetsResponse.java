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

public class DescribeDomainAssetsResponse extends AbstractModel {

    /**
    * u200c-
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * u200c-
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private DomainAssetVO [] Data;

    /**
    * List of protection status
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenseStatusList")
    @Expose
    private FilterDataObject [] DefenseStatusList;

    /**
    * List of asset locations
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetLocationList")
    @Expose
    private FilterDataObject [] AssetLocationList;

    /**
    * List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceTypeList")
    @Expose
    private FilterDataObject [] SourceTypeList;

    /**
    * List of regions
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionList")
    @Expose
    private FilterDataObject [] RegionList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get u200c-
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Total u200c-
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set u200c-
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Total u200c-
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get u200c-
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Data u200c-
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public DomainAssetVO [] getData() {
        return this.Data;
    }

    /**
     * Set u200c-
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Data u200c-
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setData(DomainAssetVO [] Data) {
        this.Data = Data;
    }

    /**
     * Get List of protection status
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return DefenseStatusList List of protection status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getDefenseStatusList() {
        return this.DefenseStatusList;
    }

    /**
     * Set List of protection status
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param DefenseStatusList List of protection status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDefenseStatusList(FilterDataObject [] DefenseStatusList) {
        this.DefenseStatusList = DefenseStatusList;
    }

    /**
     * Get List of asset locations
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetLocationList List of asset locations
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getAssetLocationList() {
        return this.AssetLocationList;
    }

    /**
     * Set List of asset locations
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetLocationList List of asset locations
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetLocationList(FilterDataObject [] AssetLocationList) {
        this.AssetLocationList = AssetLocationList;
    }

    /**
     * Get List of asset types
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return SourceTypeList List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getSourceTypeList() {
        return this.SourceTypeList;
    }

    /**
     * Set List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param SourceTypeList List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSourceTypeList(FilterDataObject [] SourceTypeList) {
        this.SourceTypeList = SourceTypeList;
    }

    /**
     * Get List of regions
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return RegionList List of regions
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set List of regions
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param RegionList List of regions
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRegionList(FilterDataObject [] RegionList) {
        this.RegionList = RegionList;
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

    public DescribeDomainAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainAssetsResponse(DescribeDomainAssetsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new DomainAssetVO[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DomainAssetVO(source.Data[i]);
            }
        }
        if (source.DefenseStatusList != null) {
            this.DefenseStatusList = new FilterDataObject[source.DefenseStatusList.length];
            for (int i = 0; i < source.DefenseStatusList.length; i++) {
                this.DefenseStatusList[i] = new FilterDataObject(source.DefenseStatusList[i]);
            }
        }
        if (source.AssetLocationList != null) {
            this.AssetLocationList = new FilterDataObject[source.AssetLocationList.length];
            for (int i = 0; i < source.AssetLocationList.length; i++) {
                this.AssetLocationList[i] = new FilterDataObject(source.AssetLocationList[i]);
            }
        }
        if (source.SourceTypeList != null) {
            this.SourceTypeList = new FilterDataObject[source.SourceTypeList.length];
            for (int i = 0; i < source.SourceTypeList.length; i++) {
                this.SourceTypeList[i] = new FilterDataObject(source.SourceTypeList[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new FilterDataObject[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new FilterDataObject(source.RegionList[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "DefenseStatusList.", this.DefenseStatusList);
        this.setParamArrayObj(map, prefix + "AssetLocationList.", this.AssetLocationList);
        this.setParamArrayObj(map, prefix + "SourceTypeList.", this.SourceTypeList);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

