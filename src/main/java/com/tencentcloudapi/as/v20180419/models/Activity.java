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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Activity extends AbstractModel{

    /**
    * Auto scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Scaling activity ID.
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * Scaling activity type. Value range:<br>
<li>SCALE_OUT: scale-out <li>SCALE_IN: scale-in <li>ATTACH_INSTANCES: adding an instance <li>REMOVE_INSTANCES: terminating an instance <li>DETACH_INSTANCES: removing an instance <li>TERMINATE_INSTANCES_UNEXPECTEDLY: terminating an instance in the CVM console <li>REPLACE_UNHEALTHY_INSTANCE: replacing an unhealthy instance
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * Scaling activity status. Value range:<br>
<li>INIT: initializing
<li>RUNNING: running
<li>SUCCESSFUL: succeeded
<li>PARTIALLY_SUCCESSFUL: partially succeeded
<li>FAILED: failed
<li>CANCELLED: canceled
    */
    @SerializedName("StatusCode")
    @Expose
    private String StatusCode;

    /**
    * Description of the scaling activity status.
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
    * Cause of the scaling activity.
    */
    @SerializedName("Cause")
    @Expose
    private String Cause;

    /**
    * Description of the scaling activity.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Start time of the scaling activity.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the scaling activity.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Creation time of the scaling activity.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Information set of the instances related to the scaling activity.
    */
    @SerializedName("ActivityRelatedInstanceSet")
    @Expose
    private ActivtyRelatedInstance [] ActivityRelatedInstanceSet;

    /**
    * Brief description of the scaling activity status.
    */
    @SerializedName("StatusMessageSimplified")
    @Expose
    private String StatusMessageSimplified;

    /**
     * Get Auto scaling group ID. 
     * @return AutoScalingGroupId Auto scaling group ID.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Auto scaling group ID.
     * @param AutoScalingGroupId Auto scaling group ID.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Scaling activity ID. 
     * @return ActivityId Scaling activity ID.
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set Scaling activity ID.
     * @param ActivityId Scaling activity ID.
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get Scaling activity type. Value range:<br>
<li>SCALE_OUT: scale-out <li>SCALE_IN: scale-in <li>ATTACH_INSTANCES: adding an instance <li>REMOVE_INSTANCES: terminating an instance <li>DETACH_INSTANCES: removing an instance <li>TERMINATE_INSTANCES_UNEXPECTEDLY: terminating an instance in the CVM console <li>REPLACE_UNHEALTHY_INSTANCE: replacing an unhealthy instance 
     * @return ActivityType Scaling activity type. Value range:<br>
<li>SCALE_OUT: scale-out <li>SCALE_IN: scale-in <li>ATTACH_INSTANCES: adding an instance <li>REMOVE_INSTANCES: terminating an instance <li>DETACH_INSTANCES: removing an instance <li>TERMINATE_INSTANCES_UNEXPECTEDLY: terminating an instance in the CVM console <li>REPLACE_UNHEALTHY_INSTANCE: replacing an unhealthy instance
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set Scaling activity type. Value range:<br>
<li>SCALE_OUT: scale-out <li>SCALE_IN: scale-in <li>ATTACH_INSTANCES: adding an instance <li>REMOVE_INSTANCES: terminating an instance <li>DETACH_INSTANCES: removing an instance <li>TERMINATE_INSTANCES_UNEXPECTEDLY: terminating an instance in the CVM console <li>REPLACE_UNHEALTHY_INSTANCE: replacing an unhealthy instance
     * @param ActivityType Scaling activity type. Value range:<br>
<li>SCALE_OUT: scale-out <li>SCALE_IN: scale-in <li>ATTACH_INSTANCES: adding an instance <li>REMOVE_INSTANCES: terminating an instance <li>DETACH_INSTANCES: removing an instance <li>TERMINATE_INSTANCES_UNEXPECTEDLY: terminating an instance in the CVM console <li>REPLACE_UNHEALTHY_INSTANCE: replacing an unhealthy instance
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get Scaling activity status. Value range:<br>
<li>INIT: initializing
<li>RUNNING: running
<li>SUCCESSFUL: succeeded
<li>PARTIALLY_SUCCESSFUL: partially succeeded
<li>FAILED: failed
<li>CANCELLED: canceled 
     * @return StatusCode Scaling activity status. Value range:<br>
<li>INIT: initializing
<li>RUNNING: running
<li>SUCCESSFUL: succeeded
<li>PARTIALLY_SUCCESSFUL: partially succeeded
<li>FAILED: failed
<li>CANCELLED: canceled
     */
    public String getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Scaling activity status. Value range:<br>
<li>INIT: initializing
<li>RUNNING: running
<li>SUCCESSFUL: succeeded
<li>PARTIALLY_SUCCESSFUL: partially succeeded
<li>FAILED: failed
<li>CANCELLED: canceled
     * @param StatusCode Scaling activity status. Value range:<br>
<li>INIT: initializing
<li>RUNNING: running
<li>SUCCESSFUL: succeeded
<li>PARTIALLY_SUCCESSFUL: partially succeeded
<li>FAILED: failed
<li>CANCELLED: canceled
     */
    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get Description of the scaling activity status. 
     * @return StatusMessage Description of the scaling activity status.
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set Description of the scaling activity status.
     * @param StatusMessage Description of the scaling activity status.
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    /**
     * Get Cause of the scaling activity. 
     * @return Cause Cause of the scaling activity.
     */
    public String getCause() {
        return this.Cause;
    }

    /**
     * Set Cause of the scaling activity.
     * @param Cause Cause of the scaling activity.
     */
    public void setCause(String Cause) {
        this.Cause = Cause;
    }

    /**
     * Get Description of the scaling activity. 
     * @return Description Description of the scaling activity.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the scaling activity.
     * @param Description Description of the scaling activity.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Start time of the scaling activity. 
     * @return StartTime Start time of the scaling activity.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the scaling activity.
     * @param StartTime Start time of the scaling activity.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the scaling activity. 
     * @return EndTime End time of the scaling activity.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the scaling activity.
     * @param EndTime End time of the scaling activity.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Creation time of the scaling activity. 
     * @return CreatedTime Creation time of the scaling activity.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time of the scaling activity.
     * @param CreatedTime Creation time of the scaling activity.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Information set of the instances related to the scaling activity. 
     * @return ActivityRelatedInstanceSet Information set of the instances related to the scaling activity.
     */
    public ActivtyRelatedInstance [] getActivityRelatedInstanceSet() {
        return this.ActivityRelatedInstanceSet;
    }

    /**
     * Set Information set of the instances related to the scaling activity.
     * @param ActivityRelatedInstanceSet Information set of the instances related to the scaling activity.
     */
    public void setActivityRelatedInstanceSet(ActivtyRelatedInstance [] ActivityRelatedInstanceSet) {
        this.ActivityRelatedInstanceSet = ActivityRelatedInstanceSet;
    }

    /**
     * Get Brief description of the scaling activity status. 
     * @return StatusMessageSimplified Brief description of the scaling activity status.
     */
    public String getStatusMessageSimplified() {
        return this.StatusMessageSimplified;
    }

    /**
     * Set Brief description of the scaling activity status.
     * @param StatusMessageSimplified Brief description of the scaling activity status.
     */
    public void setStatusMessageSimplified(String StatusMessageSimplified) {
        this.StatusMessageSimplified = StatusMessageSimplified;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);
        this.setParamSimple(map, prefix + "Cause", this.Cause);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "ActivityRelatedInstanceSet.", this.ActivityRelatedInstanceSet);
        this.setParamSimple(map, prefix + "StatusMessageSimplified", this.StatusMessageSimplified);

    }
}

