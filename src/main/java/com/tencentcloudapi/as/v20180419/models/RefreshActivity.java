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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefreshActivity extends AbstractModel {

    /**
    * Scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Refresh activity ID.
    */
    @SerializedName("RefreshActivityId")
    @Expose
    private String RefreshActivityId;

    /**
    * Original refresh activity ID, which exists only in the rollback refresh activity.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginRefreshActivityId")
    @Expose
    private String OriginRefreshActivityId;

    /**
    * Refresh batch information list.
    */
    @SerializedName("RefreshBatchSet")
    @Expose
    private RefreshBatch [] RefreshBatchSet;

    /**
    * Refresh mode.
    */
    @SerializedName("RefreshMode")
    @Expose
    private String RefreshMode;

    /**
    * Instance update setting parameters.
    */
    @SerializedName("RefreshSettings")
    @Expose
    private RefreshSettings RefreshSettings;

    /**
    * Refresh activity type. Valid values:
<li>NORMAL: normal refresh activity.</li>
<li>ROLLBACK: rollback refresh activity.</li>
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * Refresh activity status. Valid values:
<li>INIT: initializing.</li>
<li>RUNNING: running.</li>
<li>SUCCESSFUL: successful.</li>
<li>FAILED_PAUSE: paused due to the failure of a refresh batch.</li>
<li>AUTO_PAUSE: automatically paused due to the pause policy.</li>
<li>MANUAL_PAUSE: manually paused.</li>
<li>CANCELLED: canceled.</li>
<li>FAILED: failed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Current refresh batch number. For example, a value of 2 indicates that the current activity is refreshing the second batch of instances.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CurrentRefreshBatchNum")
    @Expose
    private Long CurrentRefreshBatchNum;

    /**
    * Refresh activity start time.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Refresh activity end time.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Refresh activity creation time.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Scaling group ID. 
     * @return AutoScalingGroupId Scaling group ID.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID.
     * @param AutoScalingGroupId Scaling group ID.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Refresh activity ID. 
     * @return RefreshActivityId Refresh activity ID.
     */
    public String getRefreshActivityId() {
        return this.RefreshActivityId;
    }

    /**
     * Set Refresh activity ID.
     * @param RefreshActivityId Refresh activity ID.
     */
    public void setRefreshActivityId(String RefreshActivityId) {
        this.RefreshActivityId = RefreshActivityId;
    }

    /**
     * Get Original refresh activity ID, which exists only in the rollback refresh activity.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OriginRefreshActivityId Original refresh activity ID, which exists only in the rollback refresh activity.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOriginRefreshActivityId() {
        return this.OriginRefreshActivityId;
    }

    /**
     * Set Original refresh activity ID, which exists only in the rollback refresh activity.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OriginRefreshActivityId Original refresh activity ID, which exists only in the rollback refresh activity.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOriginRefreshActivityId(String OriginRefreshActivityId) {
        this.OriginRefreshActivityId = OriginRefreshActivityId;
    }

    /**
     * Get Refresh batch information list. 
     * @return RefreshBatchSet Refresh batch information list.
     */
    public RefreshBatch [] getRefreshBatchSet() {
        return this.RefreshBatchSet;
    }

    /**
     * Set Refresh batch information list.
     * @param RefreshBatchSet Refresh batch information list.
     */
    public void setRefreshBatchSet(RefreshBatch [] RefreshBatchSet) {
        this.RefreshBatchSet = RefreshBatchSet;
    }

    /**
     * Get Refresh mode. 
     * @return RefreshMode Refresh mode.
     */
    public String getRefreshMode() {
        return this.RefreshMode;
    }

    /**
     * Set Refresh mode.
     * @param RefreshMode Refresh mode.
     */
    public void setRefreshMode(String RefreshMode) {
        this.RefreshMode = RefreshMode;
    }

    /**
     * Get Instance update setting parameters. 
     * @return RefreshSettings Instance update setting parameters.
     */
    public RefreshSettings getRefreshSettings() {
        return this.RefreshSettings;
    }

    /**
     * Set Instance update setting parameters.
     * @param RefreshSettings Instance update setting parameters.
     */
    public void setRefreshSettings(RefreshSettings RefreshSettings) {
        this.RefreshSettings = RefreshSettings;
    }

    /**
     * Get Refresh activity type. Valid values:
<li>NORMAL: normal refresh activity.</li>
<li>ROLLBACK: rollback refresh activity.</li> 
     * @return ActivityType Refresh activity type. Valid values:
<li>NORMAL: normal refresh activity.</li>
<li>ROLLBACK: rollback refresh activity.</li>
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set Refresh activity type. Valid values:
<li>NORMAL: normal refresh activity.</li>
<li>ROLLBACK: rollback refresh activity.</li>
     * @param ActivityType Refresh activity type. Valid values:
<li>NORMAL: normal refresh activity.</li>
<li>ROLLBACK: rollback refresh activity.</li>
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get Refresh activity status. Valid values:
<li>INIT: initializing.</li>
<li>RUNNING: running.</li>
<li>SUCCESSFUL: successful.</li>
<li>FAILED_PAUSE: paused due to the failure of a refresh batch.</li>
<li>AUTO_PAUSE: automatically paused due to the pause policy.</li>
<li>MANUAL_PAUSE: manually paused.</li>
<li>CANCELLED: canceled.</li>
<li>FAILED: failed.</li> 
     * @return Status Refresh activity status. Valid values:
<li>INIT: initializing.</li>
<li>RUNNING: running.</li>
<li>SUCCESSFUL: successful.</li>
<li>FAILED_PAUSE: paused due to the failure of a refresh batch.</li>
<li>AUTO_PAUSE: automatically paused due to the pause policy.</li>
<li>MANUAL_PAUSE: manually paused.</li>
<li>CANCELLED: canceled.</li>
<li>FAILED: failed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Refresh activity status. Valid values:
<li>INIT: initializing.</li>
<li>RUNNING: running.</li>
<li>SUCCESSFUL: successful.</li>
<li>FAILED_PAUSE: paused due to the failure of a refresh batch.</li>
<li>AUTO_PAUSE: automatically paused due to the pause policy.</li>
<li>MANUAL_PAUSE: manually paused.</li>
<li>CANCELLED: canceled.</li>
<li>FAILED: failed.</li>
     * @param Status Refresh activity status. Valid values:
<li>INIT: initializing.</li>
<li>RUNNING: running.</li>
<li>SUCCESSFUL: successful.</li>
<li>FAILED_PAUSE: paused due to the failure of a refresh batch.</li>
<li>AUTO_PAUSE: automatically paused due to the pause policy.</li>
<li>MANUAL_PAUSE: manually paused.</li>
<li>CANCELLED: canceled.</li>
<li>FAILED: failed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Current refresh batch number. For example, a value of 2 indicates that the current activity is refreshing the second batch of instances.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CurrentRefreshBatchNum Current refresh batch number. For example, a value of 2 indicates that the current activity is refreshing the second batch of instances.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCurrentRefreshBatchNum() {
        return this.CurrentRefreshBatchNum;
    }

    /**
     * Set Current refresh batch number. For example, a value of 2 indicates that the current activity is refreshing the second batch of instances.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CurrentRefreshBatchNum Current refresh batch number. For example, a value of 2 indicates that the current activity is refreshing the second batch of instances.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCurrentRefreshBatchNum(Long CurrentRefreshBatchNum) {
        this.CurrentRefreshBatchNum = CurrentRefreshBatchNum;
    }

    /**
     * Get Refresh activity start time.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Refresh activity start time.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Refresh activity start time.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Refresh activity start time.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Refresh activity end time.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime Refresh activity end time.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Refresh activity end time.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime Refresh activity end time.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Refresh activity creation time.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreatedTime Refresh activity creation time.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Refresh activity creation time.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreatedTime Refresh activity creation time.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public RefreshActivity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefreshActivity(RefreshActivity source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.RefreshActivityId != null) {
            this.RefreshActivityId = new String(source.RefreshActivityId);
        }
        if (source.OriginRefreshActivityId != null) {
            this.OriginRefreshActivityId = new String(source.OriginRefreshActivityId);
        }
        if (source.RefreshBatchSet != null) {
            this.RefreshBatchSet = new RefreshBatch[source.RefreshBatchSet.length];
            for (int i = 0; i < source.RefreshBatchSet.length; i++) {
                this.RefreshBatchSet[i] = new RefreshBatch(source.RefreshBatchSet[i]);
            }
        }
        if (source.RefreshMode != null) {
            this.RefreshMode = new String(source.RefreshMode);
        }
        if (source.RefreshSettings != null) {
            this.RefreshSettings = new RefreshSettings(source.RefreshSettings);
        }
        if (source.ActivityType != null) {
            this.ActivityType = new String(source.ActivityType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CurrentRefreshBatchNum != null) {
            this.CurrentRefreshBatchNum = new Long(source.CurrentRefreshBatchNum);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "RefreshActivityId", this.RefreshActivityId);
        this.setParamSimple(map, prefix + "OriginRefreshActivityId", this.OriginRefreshActivityId);
        this.setParamArrayObj(map, prefix + "RefreshBatchSet.", this.RefreshBatchSet);
        this.setParamSimple(map, prefix + "RefreshMode", this.RefreshMode);
        this.setParamObj(map, prefix + "RefreshSettings.", this.RefreshSettings);
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CurrentRefreshBatchNum", this.CurrentRefreshBatchNum);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

