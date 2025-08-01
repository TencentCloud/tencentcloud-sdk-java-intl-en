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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSourceAssetResponse extends AbstractModel {

    /**
    * Region collection
    */
    @SerializedName("ZoneList")
    @Expose
    private AssetZone [] ZoneList;

    /**
    * Data
    */
    @SerializedName("Data")
    @Expose
    private InstanceInfo [] Data;

    /**
    * Total number of returned data
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Region collection 
     * @return ZoneList Region collection
     */
    public AssetZone [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set Region collection
     * @param ZoneList Region collection
     */
    public void setZoneList(AssetZone [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get Data 
     * @return Data Data
     */
    public InstanceInfo [] getData() {
        return this.Data;
    }

    /**
     * Set Data
     * @param Data Data
     */
    public void setData(InstanceInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get Total number of returned data 
     * @return Total Total number of returned data
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of returned data
     * @param Total Total number of returned data
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeSourceAssetResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSourceAssetResponse(DescribeSourceAssetResponse source) {
        if (source.ZoneList != null) {
            this.ZoneList = new AssetZone[source.ZoneList.length];
            for (int i = 0; i < source.ZoneList.length; i++) {
                this.ZoneList[i] = new AssetZone(source.ZoneList[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new InstanceInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new InstanceInfo(source.Data[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

