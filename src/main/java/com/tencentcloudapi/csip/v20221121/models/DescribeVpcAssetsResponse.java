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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcAssetsResponse extends AbstractModel {

    /**
    * Data list
    */
    @SerializedName("Data")
    @Expose
    private Vpc [] Data;

    /**
    * Total number of results
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of VPCs
    */
    @SerializedName("VpcList")
    @Expose
    private FilterDataObject [] VpcList;

    /**
    * List of regions
    */
    @SerializedName("RegionList")
    @Expose
    private FilterDataObject [] RegionList;

    /**
    * List of AppIds
    */
    @SerializedName("AppIdList")
    @Expose
    private FilterDataObject [] AppIdList;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Data list 
     * @return Data Data list
     */
    public Vpc [] getData() {
        return this.Data;
    }

    /**
     * Set Data list
     * @param Data Data list
     */
    public void setData(Vpc [] Data) {
        this.Data = Data;
    }

    /**
     * Get Total number of results 
     * @return TotalCount Total number of results
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of results
     * @param TotalCount Total number of results
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of VPCs 
     * @return VpcList List of VPCs
     */
    public FilterDataObject [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set List of VPCs
     * @param VpcList List of VPCs
     */
    public void setVpcList(FilterDataObject [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get List of regions 
     * @return RegionList List of regions
     */
    public FilterDataObject [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set List of regions
     * @param RegionList List of regions
     */
    public void setRegionList(FilterDataObject [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get List of AppIds 
     * @return AppIdList List of AppIds
     */
    public FilterDataObject [] getAppIdList() {
        return this.AppIdList;
    }

    /**
     * Set List of AppIds
     * @param AppIdList List of AppIds
     */
    public void setAppIdList(FilterDataObject [] AppIdList) {
        this.AppIdList = AppIdList;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVpcAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcAssetsResponse(DescribeVpcAssetsResponse source) {
        if (source.Data != null) {
            this.Data = new Vpc[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new Vpc(source.Data[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VpcList != null) {
            this.VpcList = new FilterDataObject[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new FilterDataObject(source.VpcList[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new FilterDataObject[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new FilterDataObject(source.RegionList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "VpcList.", this.VpcList);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamArrayObj(map, prefix + "AppIdList.", this.AppIdList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

