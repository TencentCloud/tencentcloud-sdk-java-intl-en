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

public class BaselineItemRiskRecord extends AbstractModel {

    /**
    * <p>Risk record primary key ID.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Risk-hit host asset information. If no data is available, this field is null.</p>
    */
    @SerializedName("HostInfo")
    @Expose
    private BaselineHostAsset HostInfo;

    /**
    * <p>Cluster asset information. The value is null if no data is available.</p>
    */
    @SerializedName("ClusterInfo")
    @Expose
    private BaselineClusterAsset ClusterInfo;

    /**
    * <p>Asset type of the hit asset. Value:</p><ul><li>HOST: host</li><li>CLUSTER: cluster</li><li>POD: Pod</li><li>CONTAINER: container</li><li>IMAGE: mirror</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Risk detection result status. Parameter values:</p><ul><li>CHECKING: in-progress detection</li><li>PASS: passed</li><li>NOT_PASS: failed</li><li>CHECK_FAILED: detection failed</li><li>NOT_INVOLVED: not involved</li><li>IGNORED: ignored</li></ul>
    */
    @SerializedName("ResultStatus")
    @Expose
    private String ResultStatus;

    /**
    * <p>Latest check time.</p>
    */
    @SerializedName("LatestCheckTime")
    @Expose
    private String LatestCheckTime;

    /**
    * <p>Baseline detection item ID.</p>
    */
    @SerializedName("ItemID")
    @Expose
    private Long ItemID;

    /**
    * <p>Risk event ID, used for uniquely identifying this risk record.</p>
    */
    @SerializedName("RiskID")
    @Expose
    private String RiskID;

    /**
    * <p>Global JobID of this scan.</p>
    */
    @SerializedName("JobID")
    @Expose
    private String JobID;

    /**
     * Get <p>Risk record primary key ID.</p> 
     * @return ID <p>Risk record primary key ID.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Risk record primary key ID.</p>
     * @param ID <p>Risk record primary key ID.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Risk-hit host asset information. If no data is available, this field is null.</p> 
     * @return HostInfo <p>Risk-hit host asset information. If no data is available, this field is null.</p>
     */
    public BaselineHostAsset getHostInfo() {
        return this.HostInfo;
    }

    /**
     * Set <p>Risk-hit host asset information. If no data is available, this field is null.</p>
     * @param HostInfo <p>Risk-hit host asset information. If no data is available, this field is null.</p>
     */
    public void setHostInfo(BaselineHostAsset HostInfo) {
        this.HostInfo = HostInfo;
    }

    /**
     * Get <p>Cluster asset information. The value is null if no data is available.</p> 
     * @return ClusterInfo <p>Cluster asset information. The value is null if no data is available.</p>
     */
    public BaselineClusterAsset getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set <p>Cluster asset information. The value is null if no data is available.</p>
     * @param ClusterInfo <p>Cluster asset information. The value is null if no data is available.</p>
     */
    public void setClusterInfo(BaselineClusterAsset ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get <p>Asset type of the hit asset. Value:</p><ul><li>HOST: host</li><li>CLUSTER: cluster</li><li>POD: Pod</li><li>CONTAINER: container</li><li>IMAGE: mirror</li></ul> 
     * @return AssetType <p>Asset type of the hit asset. Value:</p><ul><li>HOST: host</li><li>CLUSTER: cluster</li><li>POD: Pod</li><li>CONTAINER: container</li><li>IMAGE: mirror</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset type of the hit asset. Value:</p><ul><li>HOST: host</li><li>CLUSTER: cluster</li><li>POD: Pod</li><li>CONTAINER: container</li><li>IMAGE: mirror</li></ul>
     * @param AssetType <p>Asset type of the hit asset. Value:</p><ul><li>HOST: host</li><li>CLUSTER: cluster</li><li>POD: Pod</li><li>CONTAINER: container</li><li>IMAGE: mirror</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Risk detection result status. Parameter values:</p><ul><li>CHECKING: in-progress detection</li><li>PASS: passed</li><li>NOT_PASS: failed</li><li>CHECK_FAILED: detection failed</li><li>NOT_INVOLVED: not involved</li><li>IGNORED: ignored</li></ul> 
     * @return ResultStatus <p>Risk detection result status. Parameter values:</p><ul><li>CHECKING: in-progress detection</li><li>PASS: passed</li><li>NOT_PASS: failed</li><li>CHECK_FAILED: detection failed</li><li>NOT_INVOLVED: not involved</li><li>IGNORED: ignored</li></ul>
     */
    public String getResultStatus() {
        return this.ResultStatus;
    }

    /**
     * Set <p>Risk detection result status. Parameter values:</p><ul><li>CHECKING: in-progress detection</li><li>PASS: passed</li><li>NOT_PASS: failed</li><li>CHECK_FAILED: detection failed</li><li>NOT_INVOLVED: not involved</li><li>IGNORED: ignored</li></ul>
     * @param ResultStatus <p>Risk detection result status. Parameter values:</p><ul><li>CHECKING: in-progress detection</li><li>PASS: passed</li><li>NOT_PASS: failed</li><li>CHECK_FAILED: detection failed</li><li>NOT_INVOLVED: not involved</li><li>IGNORED: ignored</li></ul>
     */
    public void setResultStatus(String ResultStatus) {
        this.ResultStatus = ResultStatus;
    }

    /**
     * Get <p>Latest check time.</p> 
     * @return LatestCheckTime <p>Latest check time.</p>
     */
    public String getLatestCheckTime() {
        return this.LatestCheckTime;
    }

    /**
     * Set <p>Latest check time.</p>
     * @param LatestCheckTime <p>Latest check time.</p>
     */
    public void setLatestCheckTime(String LatestCheckTime) {
        this.LatestCheckTime = LatestCheckTime;
    }

    /**
     * Get <p>Baseline detection item ID.</p> 
     * @return ItemID <p>Baseline detection item ID.</p>
     */
    public Long getItemID() {
        return this.ItemID;
    }

    /**
     * Set <p>Baseline detection item ID.</p>
     * @param ItemID <p>Baseline detection item ID.</p>
     */
    public void setItemID(Long ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * Get <p>Risk event ID, used for uniquely identifying this risk record.</p> 
     * @return RiskID <p>Risk event ID, used for uniquely identifying this risk record.</p>
     */
    public String getRiskID() {
        return this.RiskID;
    }

    /**
     * Set <p>Risk event ID, used for uniquely identifying this risk record.</p>
     * @param RiskID <p>Risk event ID, used for uniquely identifying this risk record.</p>
     */
    public void setRiskID(String RiskID) {
        this.RiskID = RiskID;
    }

    /**
     * Get <p>Global JobID of this scan.</p> 
     * @return JobID <p>Global JobID of this scan.</p>
     */
    public String getJobID() {
        return this.JobID;
    }

    /**
     * Set <p>Global JobID of this scan.</p>
     * @param JobID <p>Global JobID of this scan.</p>
     */
    public void setJobID(String JobID) {
        this.JobID = JobID;
    }

    public BaselineItemRiskRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItemRiskRecord(BaselineItemRiskRecord source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.HostInfo != null) {
            this.HostInfo = new BaselineHostAsset(source.HostInfo);
        }
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new BaselineClusterAsset(source.ClusterInfo);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ResultStatus != null) {
            this.ResultStatus = new String(source.ResultStatus);
        }
        if (source.LatestCheckTime != null) {
            this.LatestCheckTime = new String(source.LatestCheckTime);
        }
        if (source.ItemID != null) {
            this.ItemID = new Long(source.ItemID);
        }
        if (source.RiskID != null) {
            this.RiskID = new String(source.RiskID);
        }
        if (source.JobID != null) {
            this.JobID = new String(source.JobID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamObj(map, prefix + "HostInfo.", this.HostInfo);
        this.setParamObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "ResultStatus", this.ResultStatus);
        this.setParamSimple(map, prefix + "LatestCheckTime", this.LatestCheckTime);
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);
        this.setParamSimple(map, prefix + "RiskID", this.RiskID);
        this.setParamSimple(map, prefix + "JobID", this.JobID);

    }
}

