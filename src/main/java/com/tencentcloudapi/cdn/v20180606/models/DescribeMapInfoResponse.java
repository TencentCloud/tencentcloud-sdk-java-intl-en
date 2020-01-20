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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMapInfoResponse extends AbstractModel{

    /**
    * Array of mappings.
    */
    @SerializedName("MapInfoList")
    @Expose
    private MapInfo [] MapInfoList;

    /**
    * The relationship between server region ID and sub-region ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerRegionRelation")
    @Expose
    private RegionMapRelation [] ServerRegionRelation;

    /**
    * The relationship between client region ID and sub-region ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientRegionRelation")
    @Expose
    private RegionMapRelation [] ClientRegionRelation;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
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
     * Get The relationship between server region ID and sub-region ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServerRegionRelation The relationship between server region ID and sub-region ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RegionMapRelation [] getServerRegionRelation() {
        return this.ServerRegionRelation;
    }

    /**
     * Set The relationship between server region ID and sub-region ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServerRegionRelation The relationship between server region ID and sub-region ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServerRegionRelation(RegionMapRelation [] ServerRegionRelation) {
        this.ServerRegionRelation = ServerRegionRelation;
    }

    /**
     * Get The relationship between client region ID and sub-region ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientRegionRelation The relationship between client region ID and sub-region ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RegionMapRelation [] getClientRegionRelation() {
        return this.ClientRegionRelation;
    }

    /**
     * Set The relationship between client region ID and sub-region ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientRegionRelation The relationship between client region ID and sub-region ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientRegionRelation(RegionMapRelation [] ClientRegionRelation) {
        this.ClientRegionRelation = ClientRegionRelation;
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

