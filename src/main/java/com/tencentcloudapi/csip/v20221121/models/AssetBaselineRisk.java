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

public class AssetBaselineRisk extends AbstractModel {

    /**
    * <p>Unique identifier of a risk record.</p>
    */
    @SerializedName("RiskID")
    @Expose
    private String RiskID;

    /**
    * <p>Detection item details.</p>
    */
    @SerializedName("Item")
    @Expose
    private BaselineItem Item;

    /**
    * <p>Most recent detection time (ISO 8601 format).</p>
    */
    @SerializedName("LatestCheckTime")
    @Expose
    private String LatestCheckTime;

    /**
    * <p>Detection result status. Parameter values:</p><ul><li>NOT_PASS: failed</li><li>PASS: passed</li><li>CHECKING: in-progress detection</li></ul><p></p>
    */
    @SerializedName("ResultStatus")
    @Expose
    private String ResultStatus;

    /**
    * <p>Brief information of the associated baseline policy.</p>
    */
    @SerializedName("PolicyInfo")
    @Expose
    private BaselinePolicyBrief PolicyInfo;

    /**
     * Get <p>Unique identifier of a risk record.</p> 
     * @return RiskID <p>Unique identifier of a risk record.</p>
     */
    public String getRiskID() {
        return this.RiskID;
    }

    /**
     * Set <p>Unique identifier of a risk record.</p>
     * @param RiskID <p>Unique identifier of a risk record.</p>
     */
    public void setRiskID(String RiskID) {
        this.RiskID = RiskID;
    }

    /**
     * Get <p>Detection item details.</p> 
     * @return Item <p>Detection item details.</p>
     */
    public BaselineItem getItem() {
        return this.Item;
    }

    /**
     * Set <p>Detection item details.</p>
     * @param Item <p>Detection item details.</p>
     */
    public void setItem(BaselineItem Item) {
        this.Item = Item;
    }

    /**
     * Get <p>Most recent detection time (ISO 8601 format).</p> 
     * @return LatestCheckTime <p>Most recent detection time (ISO 8601 format).</p>
     */
    public String getLatestCheckTime() {
        return this.LatestCheckTime;
    }

    /**
     * Set <p>Most recent detection time (ISO 8601 format).</p>
     * @param LatestCheckTime <p>Most recent detection time (ISO 8601 format).</p>
     */
    public void setLatestCheckTime(String LatestCheckTime) {
        this.LatestCheckTime = LatestCheckTime;
    }

    /**
     * Get <p>Detection result status. Parameter values:</p><ul><li>NOT_PASS: failed</li><li>PASS: passed</li><li>CHECKING: in-progress detection</li></ul><p></p> 
     * @return ResultStatus <p>Detection result status. Parameter values:</p><ul><li>NOT_PASS: failed</li><li>PASS: passed</li><li>CHECKING: in-progress detection</li></ul><p></p>
     */
    public String getResultStatus() {
        return this.ResultStatus;
    }

    /**
     * Set <p>Detection result status. Parameter values:</p><ul><li>NOT_PASS: failed</li><li>PASS: passed</li><li>CHECKING: in-progress detection</li></ul><p></p>
     * @param ResultStatus <p>Detection result status. Parameter values:</p><ul><li>NOT_PASS: failed</li><li>PASS: passed</li><li>CHECKING: in-progress detection</li></ul><p></p>
     */
    public void setResultStatus(String ResultStatus) {
        this.ResultStatus = ResultStatus;
    }

    /**
     * Get <p>Brief information of the associated baseline policy.</p> 
     * @return PolicyInfo <p>Brief information of the associated baseline policy.</p>
     */
    public BaselinePolicyBrief getPolicyInfo() {
        return this.PolicyInfo;
    }

    /**
     * Set <p>Brief information of the associated baseline policy.</p>
     * @param PolicyInfo <p>Brief information of the associated baseline policy.</p>
     */
    public void setPolicyInfo(BaselinePolicyBrief PolicyInfo) {
        this.PolicyInfo = PolicyInfo;
    }

    public AssetBaselineRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetBaselineRisk(AssetBaselineRisk source) {
        if (source.RiskID != null) {
            this.RiskID = new String(source.RiskID);
        }
        if (source.Item != null) {
            this.Item = new BaselineItem(source.Item);
        }
        if (source.LatestCheckTime != null) {
            this.LatestCheckTime = new String(source.LatestCheckTime);
        }
        if (source.ResultStatus != null) {
            this.ResultStatus = new String(source.ResultStatus);
        }
        if (source.PolicyInfo != null) {
            this.PolicyInfo = new BaselinePolicyBrief(source.PolicyInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskID", this.RiskID);
        this.setParamObj(map, prefix + "Item.", this.Item);
        this.setParamSimple(map, prefix + "LatestCheckTime", this.LatestCheckTime);
        this.setParamSimple(map, prefix + "ResultStatus", this.ResultStatus);
        this.setParamObj(map, prefix + "PolicyInfo.", this.PolicyInfo);

    }
}

