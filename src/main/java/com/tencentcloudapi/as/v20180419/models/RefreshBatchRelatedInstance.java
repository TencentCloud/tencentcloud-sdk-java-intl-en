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
    * Refresh instance status. If an instance is removed or destroyed during the refresh process, its status will be updated to NOT_FOUND. Valid values: <br><li>WAITING: pending refresh.</li> <li>INIT: Initializing.</li> <li>RUNNING: Refreshing in progress.</li> <li>FAILED: Refresh failed.</li> <li>CANCELLED: Canceled.</li> <li>SUCCESSFUL: Refreshed.</li> <li>NOT_FOUND: Instance not found.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * The most recent scaling activity ID during instance refresh can be queried via the DescribeAutoScalingActivities API.
Please note that scaling activities differ from instance refresh activities; a single instance refresh activity may involve multiple scaling activities.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastActivityId")
    @Expose
    private String LastActivityId;

    /**
    * Instance refresh status information.
Note: This field may return null, indicating that no valid value can be obtained.
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
     * Get Refresh instance status. If an instance is removed or destroyed during the refresh process, its status will be updated to NOT_FOUND. Valid values: <br><li>WAITING: pending refresh.</li> <li>INIT: Initializing.</li> <li>RUNNING: Refreshing in progress.</li> <li>FAILED: Refresh failed.</li> <li>CANCELLED: Canceled.</li> <li>SUCCESSFUL: Refreshed.</li> <li>NOT_FOUND: Instance not found. 
     * @return InstanceStatus Refresh instance status. If an instance is removed or destroyed during the refresh process, its status will be updated to NOT_FOUND. Valid values: <br><li>WAITING: pending refresh.</li> <li>INIT: Initializing.</li> <li>RUNNING: Refreshing in progress.</li> <li>FAILED: Refresh failed.</li> <li>CANCELLED: Canceled.</li> <li>SUCCESSFUL: Refreshed.</li> <li>NOT_FOUND: Instance not found.
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Refresh instance status. If an instance is removed or destroyed during the refresh process, its status will be updated to NOT_FOUND. Valid values: <br><li>WAITING: pending refresh.</li> <li>INIT: Initializing.</li> <li>RUNNING: Refreshing in progress.</li> <li>FAILED: Refresh failed.</li> <li>CANCELLED: Canceled.</li> <li>SUCCESSFUL: Refreshed.</li> <li>NOT_FOUND: Instance not found.
     * @param InstanceStatus Refresh instance status. If an instance is removed or destroyed during the refresh process, its status will be updated to NOT_FOUND. Valid values: <br><li>WAITING: pending refresh.</li> <li>INIT: Initializing.</li> <li>RUNNING: Refreshing in progress.</li> <li>FAILED: Refresh failed.</li> <li>CANCELLED: Canceled.</li> <li>SUCCESSFUL: Refreshed.</li> <li>NOT_FOUND: Instance not found.
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get The most recent scaling activity ID during instance refresh can be queried via the DescribeAutoScalingActivities API.
Please note that scaling activities differ from instance refresh activities; a single instance refresh activity may involve multiple scaling activities.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastActivityId The most recent scaling activity ID during instance refresh can be queried via the DescribeAutoScalingActivities API.
Please note that scaling activities differ from instance refresh activities; a single instance refresh activity may involve multiple scaling activities.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLastActivityId() {
        return this.LastActivityId;
    }

    /**
     * Set The most recent scaling activity ID during instance refresh can be queried via the DescribeAutoScalingActivities API.
Please note that scaling activities differ from instance refresh activities; a single instance refresh activity may involve multiple scaling activities.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastActivityId The most recent scaling activity ID during instance refresh can be queried via the DescribeAutoScalingActivities API.
Please note that scaling activities differ from instance refresh activities; a single instance refresh activity may involve multiple scaling activities.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastActivityId(String LastActivityId) {
        this.LastActivityId = LastActivityId;
    }

    /**
     * Get Instance refresh status information.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceStatusMessage Instance refresh status information.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceStatusMessage() {
        return this.InstanceStatusMessage;
    }

    /**
     * Set Instance refresh status information.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceStatusMessage Instance refresh status information.
Note: This field may return null, indicating that no valid value can be obtained.
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

