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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Activity extends AbstractModel {

    /**
    * Activity ID
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * Compute node ID
    */
    @SerializedName("ComputeNodeId")
    @Expose
    private String ComputeNodeId;

    /**
    * Activity type. Values: `CREATE_COMPUTE_NODE`, `TERMINATE_COMPUTE_NODE`
    */
    @SerializedName("ComputeNodeActivityType")
    @Expose
    private String ComputeNodeActivityType;

    /**
    * Compute environment ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Cause of the activity
    */
    @SerializedName("Cause")
    @Expose
    private String Cause;

    /**
    * Activity state
    */
    @SerializedName("ActivityState")
    @Expose
    private String ActivityState;

    /**
    * Reason of going to this state
    */
    @SerializedName("StateReason")
    @Expose
    private String StateReason;

    /**
    * Activity start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Activity end time
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * CVM instance ID
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Activity ID 
     * @return ActivityId Activity ID
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set Activity ID
     * @param ActivityId Activity ID
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get Compute node ID 
     * @return ComputeNodeId Compute node ID
     */
    public String getComputeNodeId() {
        return this.ComputeNodeId;
    }

    /**
     * Set Compute node ID
     * @param ComputeNodeId Compute node ID
     */
    public void setComputeNodeId(String ComputeNodeId) {
        this.ComputeNodeId = ComputeNodeId;
    }

    /**
     * Get Activity type. Values: `CREATE_COMPUTE_NODE`, `TERMINATE_COMPUTE_NODE` 
     * @return ComputeNodeActivityType Activity type. Values: `CREATE_COMPUTE_NODE`, `TERMINATE_COMPUTE_NODE`
     */
    public String getComputeNodeActivityType() {
        return this.ComputeNodeActivityType;
    }

    /**
     * Set Activity type. Values: `CREATE_COMPUTE_NODE`, `TERMINATE_COMPUTE_NODE`
     * @param ComputeNodeActivityType Activity type. Values: `CREATE_COMPUTE_NODE`, `TERMINATE_COMPUTE_NODE`
     */
    public void setComputeNodeActivityType(String ComputeNodeActivityType) {
        this.ComputeNodeActivityType = ComputeNodeActivityType;
    }

    /**
     * Get Compute environment ID 
     * @return EnvId Compute environment ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Compute environment ID
     * @param EnvId Compute environment ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Cause of the activity 
     * @return Cause Cause of the activity
     */
    public String getCause() {
        return this.Cause;
    }

    /**
     * Set Cause of the activity
     * @param Cause Cause of the activity
     */
    public void setCause(String Cause) {
        this.Cause = Cause;
    }

    /**
     * Get Activity state 
     * @return ActivityState Activity state
     */
    public String getActivityState() {
        return this.ActivityState;
    }

    /**
     * Set Activity state
     * @param ActivityState Activity state
     */
    public void setActivityState(String ActivityState) {
        this.ActivityState = ActivityState;
    }

    /**
     * Get Reason of going to this state 
     * @return StateReason Reason of going to this state
     */
    public String getStateReason() {
        return this.StateReason;
    }

    /**
     * Set Reason of going to this state
     * @param StateReason Reason of going to this state
     */
    public void setStateReason(String StateReason) {
        this.StateReason = StateReason;
    }

    /**
     * Get Activity start time 
     * @return StartTime Activity start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Activity start time
     * @param StartTime Activity start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Activity end time
Note: This field may return `null`, indicating that no valid value was found. 
     * @return EndTime Activity end time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Activity end time
Note: This field may return `null`, indicating that no valid value was found.
     * @param EndTime Activity end time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get CVM instance ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return InstanceId CVM instance ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CVM instance ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param InstanceId CVM instance ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public Activity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Activity(Activity source) {
        if (source.ActivityId != null) {
            this.ActivityId = new String(source.ActivityId);
        }
        if (source.ComputeNodeId != null) {
            this.ComputeNodeId = new String(source.ComputeNodeId);
        }
        if (source.ComputeNodeActivityType != null) {
            this.ComputeNodeActivityType = new String(source.ComputeNodeActivityType);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Cause != null) {
            this.Cause = new String(source.Cause);
        }
        if (source.ActivityState != null) {
            this.ActivityState = new String(source.ActivityState);
        }
        if (source.StateReason != null) {
            this.StateReason = new String(source.StateReason);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ComputeNodeId", this.ComputeNodeId);
        this.setParamSimple(map, prefix + "ComputeNodeActivityType", this.ComputeNodeActivityType);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Cause", this.Cause);
        this.setParamSimple(map, prefix + "ActivityState", this.ActivityState);
        this.setParamSimple(map, prefix + "StateReason", this.StateReason);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

