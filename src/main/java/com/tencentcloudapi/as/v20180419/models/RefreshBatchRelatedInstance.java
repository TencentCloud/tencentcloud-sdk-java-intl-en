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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefreshBatchRelatedInstance extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Refresh instance status. if the instance is removed or terminated during refresh, the status will be updated to NOT_FOUND. valid values: <li>WAITING: pending refresh;</li> <li>INIT: initializing;</li> <li>RUNNING: refreshing;</li> <li>FAILED: refresh FAILED;</li> <li>CANCELLED: CANCELLED;</li> <li>SUCCESSFUL: refresh SUCCESSFUL;</li> <li>NOT_FOUND: instance does NOT exist.</li>.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * The most recent scaling activity ID during instance refresh can be queried via the DescribeAutoScalingActivities api.
Please note that scaling activities differ from instance refresh activities; a single instance refresh activity may involve multiple scaling activities.
    */
    @SerializedName("LastActivityId")
    @Expose
    private String LastActivityId;

    /**
    * Describes the instance refresh status.
    */
    @SerializedName("InstanceStatusMessage")
    @Expose
    private String InstanceStatusMessage;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Refresh instance status. if the instance is removed or terminated during refresh, the status will be updated to NOT_FOUND. valid values: <li>WAITING: pending refresh;</li> <li>INIT: initializing;</li> <li>RUNNING: refreshing;</li> <li>FAILED: refresh FAILED;</li> <li>CANCELLED: CANCELLED;</li> <li>SUCCESSFUL: refresh SUCCESSFUL;</li> <li>NOT_FOUND: instance does NOT exist.</li>. 
     * @return InstanceStatus Refresh instance status. if the instance is removed or terminated during refresh, the status will be updated to NOT_FOUND. valid values: <li>WAITING: pending refresh;</li> <li>INIT: initializing;</li> <li>RUNNING: refreshing;</li> <li>FAILED: refresh FAILED;</li> <li>CANCELLED: CANCELLED;</li> <li>SUCCESSFUL: refresh SUCCESSFUL;</li> <li>NOT_FOUND: instance does NOT exist.</li>.
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Refresh instance status. if the instance is removed or terminated during refresh, the status will be updated to NOT_FOUND. valid values: <li>WAITING: pending refresh;</li> <li>INIT: initializing;</li> <li>RUNNING: refreshing;</li> <li>FAILED: refresh FAILED;</li> <li>CANCELLED: CANCELLED;</li> <li>SUCCESSFUL: refresh SUCCESSFUL;</li> <li>NOT_FOUND: instance does NOT exist.</li>.
     * @param InstanceStatus Refresh instance status. if the instance is removed or terminated during refresh, the status will be updated to NOT_FOUND. valid values: <li>WAITING: pending refresh;</li> <li>INIT: initializing;</li> <li>RUNNING: refreshing;</li> <li>FAILED: refresh FAILED;</li> <li>CANCELLED: CANCELLED;</li> <li>SUCCESSFUL: refresh SUCCESSFUL;</li> <li>NOT_FOUND: instance does NOT exist.</li>.
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get The most recent scaling activity ID during instance refresh can be queried via the DescribeAutoScalingActivities api.
Please note that scaling activities differ from instance refresh activities; a single instance refresh activity may involve multiple scaling activities. 
     * @return LastActivityId The most recent scaling activity ID during instance refresh can be queried via the DescribeAutoScalingActivities api.
Please note that scaling activities differ from instance refresh activities; a single instance refresh activity may involve multiple scaling activities.
     */
    public String getLastActivityId() {
        return this.LastActivityId;
    }

    /**
     * Set The most recent scaling activity ID during instance refresh can be queried via the DescribeAutoScalingActivities api.
Please note that scaling activities differ from instance refresh activities; a single instance refresh activity may involve multiple scaling activities.
     * @param LastActivityId The most recent scaling activity ID during instance refresh can be queried via the DescribeAutoScalingActivities api.
Please note that scaling activities differ from instance refresh activities; a single instance refresh activity may involve multiple scaling activities.
     */
    public void setLastActivityId(String LastActivityId) {
        this.LastActivityId = LastActivityId;
    }

    /**
     * Get Describes the instance refresh status. 
     * @return InstanceStatusMessage Describes the instance refresh status.
     */
    public String getInstanceStatusMessage() {
        return this.InstanceStatusMessage;
    }

    /**
     * Set Describes the instance refresh status.
     * @param InstanceStatusMessage Describes the instance refresh status.
     */
    public void setInstanceStatusMessage(String InstanceStatusMessage) {
        this.InstanceStatusMessage = InstanceStatusMessage;
    }

    public RefreshBatchRelatedInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefreshBatchRelatedInstance(RefreshBatchRelatedInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.LastActivityId != null) {
            this.LastActivityId = new String(source.LastActivityId);
        }
        if (source.InstanceStatusMessage != null) {
            this.InstanceStatusMessage = new String(source.InstanceStatusMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "LastActivityId", this.LastActivityId);
        this.setParamSimple(map, prefix + "InstanceStatusMessage", this.InstanceStatusMessage);

    }
}

