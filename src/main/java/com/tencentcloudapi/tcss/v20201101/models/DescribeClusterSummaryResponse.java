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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterSummaryResponse extends AbstractModel {

    /**
    * Total number of clusters
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Number of clusters at risk
    */
    @SerializedName("RiskClusterCount")
    @Expose
    private Long RiskClusterCount;

    /**
    * Number of clusters not checked
    */
    @SerializedName("UncheckClusterCount")
    @Expose
    private Long UncheckClusterCount;

    /**
    * Number of managed clusters
    */
    @SerializedName("ManagedClusterCount")
    @Expose
    private Long ManagedClusterCount;

    /**
    * Number of self-deployed clusters
    */
    @SerializedName("IndependentClusterCount")
    @Expose
    private Long IndependentClusterCount;

    /**
    * Number of clusters involving no risks
    */
    @SerializedName("NoRiskClusterCount")
    @Expose
    private Long NoRiskClusterCount;

    /**
    * Number of checked clusters
    */
    @SerializedName("CheckedClusterCount")
    @Expose
    private Long CheckedClusterCount;

    /**
    * Number of clusters automatically checked
    */
    @SerializedName("AutoCheckClusterCount")
    @Expose
    private Long AutoCheckClusterCount;

    /**
    * Number of clusters manually checked
    */
    @SerializedName("ManualCheckClusterCount")
    @Expose
    private Long ManualCheckClusterCount;

    /**
    * Number of clusters that failed the check
    */
    @SerializedName("FailedClusterCount")
    @Expose
    private Long FailedClusterCount;

    /**
    * Number of clusters not imported
    */
    @SerializedName("NotImportedClusterCount")
    @Expose
    private Long NotImportedClusterCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of clusters 
     * @return TotalCount Total number of clusters
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of clusters
     * @param TotalCount Total number of clusters
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Number of clusters at risk 
     * @return RiskClusterCount Number of clusters at risk
     */
    public Long getRiskClusterCount() {
        return this.RiskClusterCount;
    }

    /**
     * Set Number of clusters at risk
     * @param RiskClusterCount Number of clusters at risk
     */
    public void setRiskClusterCount(Long RiskClusterCount) {
        this.RiskClusterCount = RiskClusterCount;
    }

    /**
     * Get Number of clusters not checked 
     * @return UncheckClusterCount Number of clusters not checked
     */
    public Long getUncheckClusterCount() {
        return this.UncheckClusterCount;
    }

    /**
     * Set Number of clusters not checked
     * @param UncheckClusterCount Number of clusters not checked
     */
    public void setUncheckClusterCount(Long UncheckClusterCount) {
        this.UncheckClusterCount = UncheckClusterCount;
    }

    /**
     * Get Number of managed clusters 
     * @return ManagedClusterCount Number of managed clusters
     */
    public Long getManagedClusterCount() {
        return this.ManagedClusterCount;
    }

    /**
     * Set Number of managed clusters
     * @param ManagedClusterCount Number of managed clusters
     */
    public void setManagedClusterCount(Long ManagedClusterCount) {
        this.ManagedClusterCount = ManagedClusterCount;
    }

    /**
     * Get Number of self-deployed clusters 
     * @return IndependentClusterCount Number of self-deployed clusters
     */
    public Long getIndependentClusterCount() {
        return this.IndependentClusterCount;
    }

    /**
     * Set Number of self-deployed clusters
     * @param IndependentClusterCount Number of self-deployed clusters
     */
    public void setIndependentClusterCount(Long IndependentClusterCount) {
        this.IndependentClusterCount = IndependentClusterCount;
    }

    /**
     * Get Number of clusters involving no risks 
     * @return NoRiskClusterCount Number of clusters involving no risks
     */
    public Long getNoRiskClusterCount() {
        return this.NoRiskClusterCount;
    }

    /**
     * Set Number of clusters involving no risks
     * @param NoRiskClusterCount Number of clusters involving no risks
     */
    public void setNoRiskClusterCount(Long NoRiskClusterCount) {
        this.NoRiskClusterCount = NoRiskClusterCount;
    }

    /**
     * Get Number of checked clusters 
     * @return CheckedClusterCount Number of checked clusters
     */
    public Long getCheckedClusterCount() {
        return this.CheckedClusterCount;
    }

    /**
     * Set Number of checked clusters
     * @param CheckedClusterCount Number of checked clusters
     */
    public void setCheckedClusterCount(Long CheckedClusterCount) {
        this.CheckedClusterCount = CheckedClusterCount;
    }

    /**
     * Get Number of clusters automatically checked 
     * @return AutoCheckClusterCount Number of clusters automatically checked
     */
    public Long getAutoCheckClusterCount() {
        return this.AutoCheckClusterCount;
    }

    /**
     * Set Number of clusters automatically checked
     * @param AutoCheckClusterCount Number of clusters automatically checked
     */
    public void setAutoCheckClusterCount(Long AutoCheckClusterCount) {
        this.AutoCheckClusterCount = AutoCheckClusterCount;
    }

    /**
     * Get Number of clusters manually checked 
     * @return ManualCheckClusterCount Number of clusters manually checked
     */
    public Long getManualCheckClusterCount() {
        return this.ManualCheckClusterCount;
    }

    /**
     * Set Number of clusters manually checked
     * @param ManualCheckClusterCount Number of clusters manually checked
     */
    public void setManualCheckClusterCount(Long ManualCheckClusterCount) {
        this.ManualCheckClusterCount = ManualCheckClusterCount;
    }

    /**
     * Get Number of clusters that failed the check 
     * @return FailedClusterCount Number of clusters that failed the check
     */
    public Long getFailedClusterCount() {
        return this.FailedClusterCount;
    }

    /**
     * Set Number of clusters that failed the check
     * @param FailedClusterCount Number of clusters that failed the check
     */
    public void setFailedClusterCount(Long FailedClusterCount) {
        this.FailedClusterCount = FailedClusterCount;
    }

    /**
     * Get Number of clusters not imported 
     * @return NotImportedClusterCount Number of clusters not imported
     */
    public Long getNotImportedClusterCount() {
        return this.NotImportedClusterCount;
    }

    /**
     * Set Number of clusters not imported
     * @param NotImportedClusterCount Number of clusters not imported
     */
    public void setNotImportedClusterCount(Long NotImportedClusterCount) {
        this.NotImportedClusterCount = NotImportedClusterCount;
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

    public DescribeClusterSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterSummaryResponse(DescribeClusterSummaryResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RiskClusterCount != null) {
            this.RiskClusterCount = new Long(source.RiskClusterCount);
        }
        if (source.UncheckClusterCount != null) {
            this.UncheckClusterCount = new Long(source.UncheckClusterCount);
        }
        if (source.ManagedClusterCount != null) {
            this.ManagedClusterCount = new Long(source.ManagedClusterCount);
        }
        if (source.IndependentClusterCount != null) {
            this.IndependentClusterCount = new Long(source.IndependentClusterCount);
        }
        if (source.NoRiskClusterCount != null) {
            this.NoRiskClusterCount = new Long(source.NoRiskClusterCount);
        }
        if (source.CheckedClusterCount != null) {
            this.CheckedClusterCount = new Long(source.CheckedClusterCount);
        }
        if (source.AutoCheckClusterCount != null) {
            this.AutoCheckClusterCount = new Long(source.AutoCheckClusterCount);
        }
        if (source.ManualCheckClusterCount != null) {
            this.ManualCheckClusterCount = new Long(source.ManualCheckClusterCount);
        }
        if (source.FailedClusterCount != null) {
            this.FailedClusterCount = new Long(source.FailedClusterCount);
        }
        if (source.NotImportedClusterCount != null) {
            this.NotImportedClusterCount = new Long(source.NotImportedClusterCount);
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
        this.setParamSimple(map, prefix + "RiskClusterCount", this.RiskClusterCount);
        this.setParamSimple(map, prefix + "UncheckClusterCount", this.UncheckClusterCount);
        this.setParamSimple(map, prefix + "ManagedClusterCount", this.ManagedClusterCount);
        this.setParamSimple(map, prefix + "IndependentClusterCount", this.IndependentClusterCount);
        this.setParamSimple(map, prefix + "NoRiskClusterCount", this.NoRiskClusterCount);
        this.setParamSimple(map, prefix + "CheckedClusterCount", this.CheckedClusterCount);
        this.setParamSimple(map, prefix + "AutoCheckClusterCount", this.AutoCheckClusterCount);
        this.setParamSimple(map, prefix + "ManualCheckClusterCount", this.ManualCheckClusterCount);
        this.setParamSimple(map, prefix + "FailedClusterCount", this.FailedClusterCount);
        this.setParamSimple(map, prefix + "NotImportedClusterCount", this.NotImportedClusterCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

