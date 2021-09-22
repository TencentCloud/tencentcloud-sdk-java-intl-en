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
    * Type of the scaling activity. Valid values:<br>
<li>SCALE_OUT: scales out. <li>SCALE_IN: scales in. <li>ATTACH_INSTANCES: adds an instance. <li>REMOVE_INSTANCES: terminates an instance. <li>DETACH_INSTANCES: removes an instance. <li>TERMINATE_INSTANCES_UNEXPECTEDLY: terminates an instance in the CVM console. <li>REPLACE_UNHEALTHY_INSTANCE: replaces an unhealthy instance.
<li>START_INSTANCES: starts an instance.
<li>STOP_INSTANCES: stops an instance.
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
    * Result of the lifecycle hook action in the scaling activity
    */
    @SerializedName("LifecycleActionResultSet")
    @Expose
    private LifecycleActionResultInfo [] LifecycleActionResultSet;

    /**
    * Detailed description of scaling activity status
    */
    @SerializedName("DetailedStatusMessageSet")
    @Expose
    private DetailedStatusMessage [] DetailedStatusMessageSet;

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
     * Get Type of the scaling activity. Valid values:<br>
<li>SCALE_OUT: scales out. <li>SCALE_IN: scales in. <li>ATTACH_INSTANCES: adds an instance. <li>REMOVE_INSTANCES: terminates an instance. <li>DETACH_INSTANCES: removes an instance. <li>TERMINATE_INSTANCES_UNEXPECTEDLY: terminates an instance in the CVM console. <li>REPLACE_UNHEALTHY_INSTANCE: replaces an unhealthy instance.
<li>START_INSTANCES: starts an instance.
<li>STOP_INSTANCES: stops an instance. 
     * @return ActivityType Type of the scaling activity. Valid values:<br>
<li>SCALE_OUT: scales out. <li>SCALE_IN: scales in. <li>ATTACH_INSTANCES: adds an instance. <li>REMOVE_INSTANCES: terminates an instance. <li>DETACH_INSTANCES: removes an instance. <li>TERMINATE_INSTANCES_UNEXPECTEDLY: terminates an instance in the CVM console. <li>REPLACE_UNHEALTHY_INSTANCE: replaces an unhealthy instance.
<li>START_INSTANCES: starts an instance.
<li>STOP_INSTANCES: stops an instance.
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set Type of the scaling activity. Valid values:<br>
<li>SCALE_OUT: scales out. <li>SCALE_IN: scales in. <li>ATTACH_INSTANCES: adds an instance. <li>REMOVE_INSTANCES: terminates an instance. <li>DETACH_INSTANCES: removes an instance. <li>TERMINATE_INSTANCES_UNEXPECTEDLY: terminates an instance in the CVM console. <li>REPLACE_UNHEALTHY_INSTANCE: replaces an unhealthy instance.
<li>START_INSTANCES: starts an instance.
<li>STOP_INSTANCES: stops an instance.
     * @param ActivityType Type of the scaling activity. Valid values:<br>
<li>SCALE_OUT: scales out. <li>SCALE_IN: scales in. <li>ATTACH_INSTANCES: adds an instance. <li>REMOVE_INSTANCES: terminates an instance. <li>DETACH_INSTANCES: removes an instance. <li>TERMINATE_INSTANCES_UNEXPECTEDLY: terminates an instance in the CVM console. <li>REPLACE_UNHEALTHY_INSTANCE: replaces an unhealthy instance.
<li>START_INSTANCES: starts an instance.
<li>STOP_INSTANCES: stops an instance.
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
     * Get Result of the lifecycle hook action in the scaling activity 
     * @return LifecycleActionResultSet Result of the lifecycle hook action in the scaling activity
     */
    public LifecycleActionResultInfo [] getLifecycleActionResultSet() {
        return this.LifecycleActionResultSet;
    }

    /**
     * Set Result of the lifecycle hook action in the scaling activity
     * @param LifecycleActionResultSet Result of the lifecycle hook action in the scaling activity
     */
    public void setLifecycleActionResultSet(LifecycleActionResultInfo [] LifecycleActionResultSet) {
        this.LifecycleActionResultSet = LifecycleActionResultSet;
    }

    /**
     * Get Detailed description of scaling activity status 
     * @return DetailedStatusMessageSet Detailed description of scaling activity status
     */
    public DetailedStatusMessage [] getDetailedStatusMessageSet() {
        return this.DetailedStatusMessageSet;
    }

    /**
     * Set Detailed description of scaling activity status
     * @param DetailedStatusMessageSet Detailed description of scaling activity status
     */
    public void setDetailedStatusMessageSet(DetailedStatusMessage [] DetailedStatusMessageSet) {
        this.DetailedStatusMessageSet = DetailedStatusMessageSet;
    }

    public Activity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Activity(Activity source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new String(source.ActivityId);
        }
        if (source.ActivityType != null) {
            this.ActivityType = new String(source.ActivityType);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new String(source.StatusCode);
        }
        if (source.StatusMessage != null) {
            this.StatusMessage = new String(source.StatusMessage);
        }
        if (source.Cause != null) {
            this.Cause = new String(source.Cause);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.ActivityRelatedInstanceSet != null) {
            this.ActivityRelatedInstanceSet = new ActivtyRelatedInstance[source.ActivityRelatedInstanceSet.length];
            for (int i = 0; i < source.ActivityRelatedInstanceSet.length; i++) {
                this.ActivityRelatedInstanceSet[i] = new ActivtyRelatedInstance(source.ActivityRelatedInstanceSet[i]);
            }
        }
        if (source.StatusMessageSimplified != null) {
            this.StatusMessageSimplified = new String(source.StatusMessageSimplified);
        }
        if (source.LifecycleActionResultSet != null) {
            this.LifecycleActionResultSet = new LifecycleActionResultInfo[source.LifecycleActionResultSet.length];
            for (int i = 0; i < source.LifecycleActionResultSet.length; i++) {
                this.LifecycleActionResultSet[i] = new LifecycleActionResultInfo(source.LifecycleActionResultSet[i]);
            }
        }
        if (source.DetailedStatusMessageSet != null) {
            this.DetailedStatusMessageSet = new DetailedStatusMessage[source.DetailedStatusMessageSet.length];
            for (int i = 0; i < source.DetailedStatusMessageSet.length; i++) {
                this.DetailedStatusMessageSet[i] = new DetailedStatusMessage(source.DetailedStatusMessageSet[i]);
            }
        }
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
        this.setParamArrayObj(map, prefix + "LifecycleActionResultSet.", this.LifecycleActionResultSet);
        this.setParamArrayObj(map, prefix + "DetailedStatusMessageSet.", this.DetailedStatusMessageSet);

    }
}

