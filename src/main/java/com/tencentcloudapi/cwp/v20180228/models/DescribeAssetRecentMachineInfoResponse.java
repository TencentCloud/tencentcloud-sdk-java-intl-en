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

public class DescribeAssetRecentMachineInfoResponse extends AbstractModel {

    /**
    * List of total assets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalList")
    @Expose
    private AssetKeyVal [] TotalList;

    /**
    * List of online assets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LiveList")
    @Expose
    private AssetKeyVal [] LiveList;

    /**
    * List of offline assets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OfflineList")
    @Expose
    private AssetKeyVal [] OfflineList;

    /**
    * List of risky assets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskList")
    @Expose
    private AssetKeyVal [] RiskList;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of total assets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalList List of total assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AssetKeyVal [] getTotalList() {
        return this.TotalList;
    }

    /**
     * Set List of total assets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalList List of total assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalList(AssetKeyVal [] TotalList) {
        this.TotalList = TotalList;
    }

    /**
     * Get List of online assets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LiveList List of online assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AssetKeyVal [] getLiveList() {
        return this.LiveList;
    }

    /**
     * Set List of online assets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LiveList List of online assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLiveList(AssetKeyVal [] LiveList) {
        this.LiveList = LiveList;
    }

    /**
     * Get List of offline assets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OfflineList List of offline assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AssetKeyVal [] getOfflineList() {
        return this.OfflineList;
    }

    /**
     * Set List of offline assets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OfflineList List of offline assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOfflineList(AssetKeyVal [] OfflineList) {
        this.OfflineList = OfflineList;
    }

    /**
     * Get List of risky assets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskList List of risky assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AssetKeyVal [] getRiskList() {
        return this.RiskList;
    }

    /**
     * Set List of risky assets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskList List of risky assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskList(AssetKeyVal [] RiskList) {
        this.RiskList = RiskList;
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

    public DescribeAssetRecentMachineInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetRecentMachineInfoResponse(DescribeAssetRecentMachineInfoResponse source) {
        if (source.TotalList != null) {
            this.TotalList = new AssetKeyVal[source.TotalList.length];
            for (int i = 0; i < source.TotalList.length; i++) {
                this.TotalList[i] = new AssetKeyVal(source.TotalList[i]);
            }
        }
        if (source.LiveList != null) {
            this.LiveList = new AssetKeyVal[source.LiveList.length];
            for (int i = 0; i < source.LiveList.length; i++) {
                this.LiveList[i] = new AssetKeyVal(source.LiveList[i]);
            }
        }
        if (source.OfflineList != null) {
            this.OfflineList = new AssetKeyVal[source.OfflineList.length];
            for (int i = 0; i < source.OfflineList.length; i++) {
                this.OfflineList[i] = new AssetKeyVal(source.OfflineList[i]);
            }
        }
        if (source.RiskList != null) {
            this.RiskList = new AssetKeyVal[source.RiskList.length];
            for (int i = 0; i < source.RiskList.length; i++) {
                this.RiskList[i] = new AssetKeyVal(source.RiskList[i]);
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
        this.setParamArrayObj(map, prefix + "TotalList.", this.TotalList);
        this.setParamArrayObj(map, prefix + "LiveList.", this.LiveList);
        this.setParamArrayObj(map, prefix + "OfflineList.", this.OfflineList);
        this.setParamArrayObj(map, prefix + "RiskList.", this.RiskList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

