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

public class DescribePublicIpAssetsResponse extends AbstractModel {

    /**
    * Data list
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private IpAssetListVO [] Data;

    /**
    * Total number of results
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * List of asset locations
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetLocationList")
    @Expose
    private FilterDataObject [] AssetLocationList;

    /**
    * List of IPs
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpTypeList")
    @Expose
    private FilterDataObject [] IpTypeList;

    /**
    * List of regions
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionList")
    @Expose
    private FilterDataObject [] RegionList;

    /**
    * List of protection status
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenseStatusList")
    @Expose
    private FilterDataObject [] DefenseStatusList;

    /**
    * List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetTypeList")
    @Expose
    private FilterDataObject [] AssetTypeList;

    /**
    * List of AppIds 
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppIdList")
    @Expose
    private FilterDataObject [] AppIdList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Data list
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Data Data list
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public IpAssetListVO [] getData() {
        return this.Data;
    }

    /**
     * Set Data list
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Data Data list
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setData(IpAssetListVO [] Data) {
        this.Data = Data;
    }

    /**
     * Get Total number of results 
     * @return Total Total number of results
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of results
     * @param Total Total number of results
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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
     * Get List of IPs
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IpTypeList List of IPs
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getIpTypeList() {
        return this.IpTypeList;
    }

    /**
     * Set List of IPs
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IpTypeList List of IPs
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIpTypeList(FilterDataObject [] IpTypeList) {
        this.IpTypeList = IpTypeList;
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
     * Get List of asset types
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetTypeList List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getAssetTypeList() {
        return this.AssetTypeList;
    }

    /**
     * Set List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetTypeList List of asset types
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetTypeList(FilterDataObject [] AssetTypeList) {
        this.AssetTypeList = AssetTypeList;
    }

    /**
     * Get List of AppIds 
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AppIdList List of AppIds 
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getAppIdList() {
        return this.AppIdList;
    }

    /**
     * Set List of AppIds 
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AppIdList List of AppIds 
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAppIdList(FilterDataObject [] AppIdList) {
        this.AppIdList = AppIdList;
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

    public DescribePublicIpAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicIpAssetsResponse(DescribePublicIpAssetsResponse source) {
        if (source.Data != null) {
            this.Data = new IpAssetListVO[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new IpAssetListVO(source.Data[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AssetLocationList != null) {
            this.AssetLocationList = new FilterDataObject[source.AssetLocationList.length];
            for (int i = 0; i < source.AssetLocationList.length; i++) {
                this.AssetLocationList[i] = new FilterDataObject(source.AssetLocationList[i]);
            }
        }
        if (source.IpTypeList != null) {
            this.IpTypeList = new FilterDataObject[source.IpTypeList.length];
            for (int i = 0; i < source.IpTypeList.length; i++) {
                this.IpTypeList[i] = new FilterDataObject(source.IpTypeList[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new FilterDataObject[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new FilterDataObject(source.RegionList[i]);
            }
        }
        if (source.DefenseStatusList != null) {
            this.DefenseStatusList = new FilterDataObject[source.DefenseStatusList.length];
            for (int i = 0; i < source.DefenseStatusList.length; i++) {
                this.DefenseStatusList[i] = new FilterDataObject(source.DefenseStatusList[i]);
            }
        }
        if (source.AssetTypeList != null) {
            this.AssetTypeList = new FilterDataObject[source.AssetTypeList.length];
            for (int i = 0; i < source.AssetTypeList.length; i++) {
                this.AssetTypeList[i] = new FilterDataObject(source.AssetTypeList[i]);
            }
        }
        if (source.AppIdList != null) {
            this.AppIdList = new FilterDataObject[source.AppIdList.length];
            for (int i = 0; i < source.AppIdList.length; i++) {
                this.AppIdList[i] = new FilterDataObject(source.AppIdList[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "AssetLocationList.", this.AssetLocationList);
        this.setParamArrayObj(map, prefix + "IpTypeList.", this.IpTypeList);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamArrayObj(map, prefix + "DefenseStatusList.", this.DefenseStatusList);
        this.setParamArrayObj(map, prefix + "AssetTypeList.", this.AssetTypeList);
        this.setParamArrayObj(map, prefix + "AppIdList.", this.AppIdList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

