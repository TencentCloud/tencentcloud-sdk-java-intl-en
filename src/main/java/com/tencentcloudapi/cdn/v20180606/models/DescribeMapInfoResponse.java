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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMapInfoResponse extends AbstractModel {

    /**
    * Array of mappings.
    */
    @SerializedName("MapInfoList")
    @Expose
    private MapInfo [] MapInfoList;

    /**
    * Mapping relationship between server region ID and sub-region ID
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ServerRegionRelation")
    @Expose
    private RegionMapRelation [] ServerRegionRelation;

    /**
    * Mapping relationship between client region ID and sub-region ID
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ClientRegionRelation")
    @Expose
    private RegionMapRelation [] ClientRegionRelation;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Array of mappings. 
     * @return MapInfoList Array of mappings.
     */
    public MapInfo [] getMapInfoList() {
        return this.MapInfoList;
    }

    /**
     * Set Array of mappings.
     * @param MapInfoList Array of mappings.
     */
    public void setMapInfoList(MapInfo [] MapInfoList) {
        this.MapInfoList = MapInfoList;
    }

    /**
     * Get Mapping relationship between server region ID and sub-region ID
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ServerRegionRelation Mapping relationship between server region ID and sub-region ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RegionMapRelation [] getServerRegionRelation() {
        return this.ServerRegionRelation;
    }

    /**
     * Set Mapping relationship between server region ID and sub-region ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ServerRegionRelation Mapping relationship between server region ID and sub-region ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setServerRegionRelation(RegionMapRelation [] ServerRegionRelation) {
        this.ServerRegionRelation = ServerRegionRelation;
    }

    /**
     * Get Mapping relationship between client region ID and sub-region ID
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ClientRegionRelation Mapping relationship between client region ID and sub-region ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RegionMapRelation [] getClientRegionRelation() {
        return this.ClientRegionRelation;
    }

    /**
     * Set Mapping relationship between client region ID and sub-region ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ClientRegionRelation Mapping relationship between client region ID and sub-region ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setClientRegionRelation(RegionMapRelation [] ClientRegionRelation) {
        this.ClientRegionRelation = ClientRegionRelation;
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

    public DescribeMapInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMapInfoResponse(DescribeMapInfoResponse source) {
        if (source.MapInfoList != null) {
            this.MapInfoList = new MapInfo[source.MapInfoList.length];
            for (int i = 0; i < source.MapInfoList.length; i++) {
                this.MapInfoList[i] = new MapInfo(source.MapInfoList[i]);
            }
        }
        if (source.ServerRegionRelation != null) {
            this.ServerRegionRelation = new RegionMapRelation[source.ServerRegionRelation.length];
            for (int i = 0; i < source.ServerRegionRelation.length; i++) {
                this.ServerRegionRelation[i] = new RegionMapRelation(source.ServerRegionRelation[i]);
            }
        }
        if (source.ClientRegionRelation != null) {
            this.ClientRegionRelation = new RegionMapRelation[source.ClientRegionRelation.length];
            for (int i = 0; i < source.ClientRegionRelation.length; i++) {
                this.ClientRegionRelation[i] = new RegionMapRelation(source.ClientRegionRelation[i]);
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
        this.setParamArrayObj(map, prefix + "MapInfoList.", this.MapInfoList);
        this.setParamArrayObj(map, prefix + "ServerRegionRelation.", this.ServerRegionRelation);
        this.setParamArrayObj(map, prefix + "ClientRegionRelation.", this.ClientRegionRelation);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

