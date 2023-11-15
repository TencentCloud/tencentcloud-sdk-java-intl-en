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

public class DescribeVULRiskAdvanceCFGListResponse extends AbstractModel {

    /**
    * List of configuration items
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private VULRiskAdvanceCFGList [] Data;

    /**
    * Total number of results
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of risk levels
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskLevelLists")
    @Expose
    private FilterDataObject [] RiskLevelLists;

    /**
    * List of vulnerabilities types
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VULTypeLists")
    @Expose
    private FilterDataObject [] VULTypeLists;

    /**
    * List of check source
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckFromLists")
    @Expose
    private FilterDataObject [] CheckFromLists;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of configuration items
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Data List of configuration items
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public VULRiskAdvanceCFGList [] getData() {
        return this.Data;
    }

    /**
     * Set List of configuration items
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Data List of configuration items
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setData(VULRiskAdvanceCFGList [] Data) {
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
     * Get List of risk levels
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return RiskLevelLists List of risk levels
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getRiskLevelLists() {
        return this.RiskLevelLists;
    }

    /**
     * Set List of risk levels
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param RiskLevelLists List of risk levels
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRiskLevelLists(FilterDataObject [] RiskLevelLists) {
        this.RiskLevelLists = RiskLevelLists;
    }

    /**
     * Get List of vulnerabilities types
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VULTypeLists List of vulnerabilities types
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getVULTypeLists() {
        return this.VULTypeLists;
    }

    /**
     * Set List of vulnerabilities types
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VULTypeLists List of vulnerabilities types
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVULTypeLists(FilterDataObject [] VULTypeLists) {
        this.VULTypeLists = VULTypeLists;
    }

    /**
     * Get List of check source
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CheckFromLists List of check source
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public FilterDataObject [] getCheckFromLists() {
        return this.CheckFromLists;
    }

    /**
     * Set List of check source
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CheckFromLists List of check source
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCheckFromLists(FilterDataObject [] CheckFromLists) {
        this.CheckFromLists = CheckFromLists;
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

    public DescribeVULRiskAdvanceCFGListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVULRiskAdvanceCFGListResponse(DescribeVULRiskAdvanceCFGListResponse source) {
        if (source.Data != null) {
            this.Data = new VULRiskAdvanceCFGList[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new VULRiskAdvanceCFGList(source.Data[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RiskLevelLists != null) {
            this.RiskLevelLists = new FilterDataObject[source.RiskLevelLists.length];
            for (int i = 0; i < source.RiskLevelLists.length; i++) {
                this.RiskLevelLists[i] = new FilterDataObject(source.RiskLevelLists[i]);
            }
        }
        if (source.VULTypeLists != null) {
            this.VULTypeLists = new FilterDataObject[source.VULTypeLists.length];
            for (int i = 0; i < source.VULTypeLists.length; i++) {
                this.VULTypeLists[i] = new FilterDataObject(source.VULTypeLists[i]);
            }
        }
        if (source.CheckFromLists != null) {
            this.CheckFromLists = new FilterDataObject[source.CheckFromLists.length];
            for (int i = 0; i < source.CheckFromLists.length; i++) {
                this.CheckFromLists[i] = new FilterDataObject(source.CheckFromLists[i]);
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
        this.setParamArrayObj(map, prefix + "RiskLevelLists.", this.RiskLevelLists);
        this.setParamArrayObj(map, prefix + "VULTypeLists.", this.VULTypeLists);
        this.setParamArrayObj(map, prefix + "CheckFromLists.", this.CheckFromLists);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

