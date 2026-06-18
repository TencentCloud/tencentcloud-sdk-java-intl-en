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

public class AssetInfoDetail extends AbstractModel {

    /**
    * User appid.
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * CVE id
    */
    @SerializedName("CVEId")
    @Expose
    private String CVEId;

    /**
    * Scan Status. 0-Not Scanned by Default; 1-Scanning; 2-Scan Completed; 3-Scan Error.
    */
    @SerializedName("IsScan")
    @Expose
    private Long IsScan;

    /**
    * Number of Affected Assets
    */
    @SerializedName("InfluenceAsset")
    @Expose
    private Long InfluenceAsset;

    /**
    * Number of Unfixed Assets
    */
    @SerializedName("NotRepairAsset")
    @Expose
    private Long NotRepairAsset;

    /**
    * Unprotected Asset Count
    */
    @SerializedName("NotProtectAsset")
    @Expose
    private Long NotProtectAsset;

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task Percentage
    */
    @SerializedName("TaskPercent")
    @Expose
    private Long TaskPercent;

    /**
    * Task Time
    */
    @SerializedName("TaskTime")
    @Expose
    private Long TaskTime;

    /**
    * Scan time
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
     * Get User appid. 
     * @return AppID User appid.
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set User appid.
     * @param AppID User appid.
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get CVE id 
     * @return CVEId CVE id
     */
    public String getCVEId() {
        return this.CVEId;
    }

    /**
     * Set CVE id
     * @param CVEId CVE id
     */
    public void setCVEId(String CVEId) {
        this.CVEId = CVEId;
    }

    /**
     * Get Scan Status. 0-Not Scanned by Default; 1-Scanning; 2-Scan Completed; 3-Scan Error. 
     * @return IsScan Scan Status. 0-Not Scanned by Default; 1-Scanning; 2-Scan Completed; 3-Scan Error.
     */
    public Long getIsScan() {
        return this.IsScan;
    }

    /**
     * Set Scan Status. 0-Not Scanned by Default; 1-Scanning; 2-Scan Completed; 3-Scan Error.
     * @param IsScan Scan Status. 0-Not Scanned by Default; 1-Scanning; 2-Scan Completed; 3-Scan Error.
     */
    public void setIsScan(Long IsScan) {
        this.IsScan = IsScan;
    }

    /**
     * Get Number of Affected Assets 
     * @return InfluenceAsset Number of Affected Assets
     */
    public Long getInfluenceAsset() {
        return this.InfluenceAsset;
    }

    /**
     * Set Number of Affected Assets
     * @param InfluenceAsset Number of Affected Assets
     */
    public void setInfluenceAsset(Long InfluenceAsset) {
        this.InfluenceAsset = InfluenceAsset;
    }

    /**
     * Get Number of Unfixed Assets 
     * @return NotRepairAsset Number of Unfixed Assets
     */
    public Long getNotRepairAsset() {
        return this.NotRepairAsset;
    }

    /**
     * Set Number of Unfixed Assets
     * @param NotRepairAsset Number of Unfixed Assets
     */
    public void setNotRepairAsset(Long NotRepairAsset) {
        this.NotRepairAsset = NotRepairAsset;
    }

    /**
     * Get Unprotected Asset Count 
     * @return NotProtectAsset Unprotected Asset Count
     */
    public Long getNotProtectAsset() {
        return this.NotProtectAsset;
    }

    /**
     * Set Unprotected Asset Count
     * @param NotProtectAsset Unprotected Asset Count
     */
    public void setNotProtectAsset(Long NotProtectAsset) {
        this.NotProtectAsset = NotProtectAsset;
    }

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task Percentage 
     * @return TaskPercent Task Percentage
     */
    public Long getTaskPercent() {
        return this.TaskPercent;
    }

    /**
     * Set Task Percentage
     * @param TaskPercent Task Percentage
     */
    public void setTaskPercent(Long TaskPercent) {
        this.TaskPercent = TaskPercent;
    }

    /**
     * Get Task Time 
     * @return TaskTime Task Time
     */
    public Long getTaskTime() {
        return this.TaskTime;
    }

    /**
     * Set Task Time
     * @param TaskTime Task Time
     */
    public void setTaskTime(Long TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * Get Scan time 
     * @return ScanTime Scan time
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Scan time
     * @param ScanTime Scan time
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    public AssetInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetInfoDetail(AssetInfoDetail source) {
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.CVEId != null) {
            this.CVEId = new String(source.CVEId);
        }
        if (source.IsScan != null) {
            this.IsScan = new Long(source.IsScan);
        }
        if (source.InfluenceAsset != null) {
            this.InfluenceAsset = new Long(source.InfluenceAsset);
        }
        if (source.NotRepairAsset != null) {
            this.NotRepairAsset = new Long(source.NotRepairAsset);
        }
        if (source.NotProtectAsset != null) {
            this.NotProtectAsset = new Long(source.NotProtectAsset);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskPercent != null) {
            this.TaskPercent = new Long(source.TaskPercent);
        }
        if (source.TaskTime != null) {
            this.TaskTime = new Long(source.TaskTime);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "CVEId", this.CVEId);
        this.setParamSimple(map, prefix + "IsScan", this.IsScan);
        this.setParamSimple(map, prefix + "InfluenceAsset", this.InfluenceAsset);
        this.setParamSimple(map, prefix + "NotRepairAsset", this.NotRepairAsset);
        this.setParamSimple(map, prefix + "NotProtectAsset", this.NotProtectAsset);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskPercent", this.TaskPercent);
        this.setParamSimple(map, prefix + "TaskTime", this.TaskTime);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);

    }
}

