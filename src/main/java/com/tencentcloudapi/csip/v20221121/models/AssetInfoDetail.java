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
    * AppID of the user
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * CVE number
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVEId")
    @Expose
    private String CVEId;

    /**
    * Whether the asset is scanned. Values: `0`: (default) Not scanned; `1`: Scanning; `2`: Scan completed; `3`: Error while scanning
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsScan")
    @Expose
    private Long IsScan;

    /**
    * Number of affected assets
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("InfluenceAsset")
    @Expose
    private Long InfluenceAsset;

    /**
    * Number of not fixed assets
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotRepairAsset")
    @Expose
    private Long NotRepairAsset;

    /**
    * Number of not protected assets
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotProtectAsset")
    @Expose
    private Long NotProtectAsset;

    /**
    * Task ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task progress in terms of percentage
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskPercent")
    @Expose
    private Long TaskPercent;

    /**
    * Task creation time
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskTime")
    @Expose
    private Long TaskTime;

    /**
    * Scan start time
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
     * Get AppID of the user
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AppID AppID of the user
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set AppID of the user
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AppID AppID of the user
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get CVE number
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CVEId CVE number
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getCVEId() {
        return this.CVEId;
    }

    /**
     * Set CVE number
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CVEId CVE number
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCVEId(String CVEId) {
        this.CVEId = CVEId;
    }

    /**
     * Get Whether the asset is scanned. Values: `0`: (default) Not scanned; `1`: Scanning; `2`: Scan completed; `3`: Error while scanning
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IsScan Whether the asset is scanned. Values: `0`: (default) Not scanned; `1`: Scanning; `2`: Scan completed; `3`: Error while scanning
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIsScan() {
        return this.IsScan;
    }

    /**
     * Set Whether the asset is scanned. Values: `0`: (default) Not scanned; `1`: Scanning; `2`: Scan completed; `3`: Error while scanning
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IsScan Whether the asset is scanned. Values: `0`: (default) Not scanned; `1`: Scanning; `2`: Scan completed; `3`: Error while scanning
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIsScan(Long IsScan) {
        this.IsScan = IsScan;
    }

    /**
     * Get Number of affected assets
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return InfluenceAsset Number of affected assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getInfluenceAsset() {
        return this.InfluenceAsset;
    }

    /**
     * Set Number of affected assets
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param InfluenceAsset Number of affected assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setInfluenceAsset(Long InfluenceAsset) {
        this.InfluenceAsset = InfluenceAsset;
    }

    /**
     * Get Number of not fixed assets
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return NotRepairAsset Number of not fixed assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getNotRepairAsset() {
        return this.NotRepairAsset;
    }

    /**
     * Set Number of not fixed assets
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param NotRepairAsset Number of not fixed assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setNotRepairAsset(Long NotRepairAsset) {
        this.NotRepairAsset = NotRepairAsset;
    }

    /**
     * Get Number of not protected assets
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return NotProtectAsset Number of not protected assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getNotProtectAsset() {
        return this.NotProtectAsset;
    }

    /**
     * Set Number of not protected assets
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param NotProtectAsset Number of not protected assets
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setNotProtectAsset(Long NotProtectAsset) {
        this.NotProtectAsset = NotProtectAsset;
    }

    /**
     * Get Task ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param TaskId Task ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task progress in terms of percentage
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return TaskPercent Task progress in terms of percentage
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getTaskPercent() {
        return this.TaskPercent;
    }

    /**
     * Set Task progress in terms of percentage
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param TaskPercent Task progress in terms of percentage
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTaskPercent(Long TaskPercent) {
        this.TaskPercent = TaskPercent;
    }

    /**
     * Get Task creation time
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return TaskTime Task creation time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getTaskTime() {
        return this.TaskTime;
    }

    /**
     * Set Task creation time
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param TaskTime Task creation time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTaskTime(Long TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * Get Scan start time
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ScanTime Scan start time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Scan start time
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ScanTime Scan start time
Note: This field may return·null, indicating that no valid values can be obtained.
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

