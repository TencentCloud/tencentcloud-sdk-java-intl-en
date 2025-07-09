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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterAsGroup extends AbstractModel {

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Scaling group status (`enabled`, `enabling`, `disabled`, `disabling`, `updating`, `deleting`, `scaleDownEnabling`, `scaleDownDisabling`)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether the node is set to unschedulable
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("IsUnschedulable")
    @Expose
    private Boolean IsUnschedulable;

    /**
    * Scaling group label list
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Scaling group ID 
     * @return AutoScalingGroupId Scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID
     * @param AutoScalingGroupId Scaling group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Scaling group status (`enabled`, `enabling`, `disabled`, `disabling`, `updating`, `deleting`, `scaleDownEnabling`, `scaleDownDisabling`) 
     * @return Status Scaling group status (`enabled`, `enabling`, `disabled`, `disabling`, `updating`, `deleting`, `scaleDownEnabling`, `scaleDownDisabling`)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Scaling group status (`enabled`, `enabling`, `disabled`, `disabling`, `updating`, `deleting`, `scaleDownEnabling`, `scaleDownDisabling`)
     * @param Status Scaling group status (`enabled`, `enabling`, `disabled`, `disabling`, `updating`, `deleting`, `scaleDownEnabling`, `scaleDownDisabling`)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether the node is set to unschedulable
Note: this field may return null, indicating that no valid value was found. 
     * @return IsUnschedulable Whether the node is set to unschedulable
Note: this field may return null, indicating that no valid value was found.
     */
    public Boolean getIsUnschedulable() {
        return this.IsUnschedulable;
    }

    /**
     * Set Whether the node is set to unschedulable
Note: this field may return null, indicating that no valid value was found.
     * @param IsUnschedulable Whether the node is set to unschedulable
Note: this field may return null, indicating that no valid value was found.
     */
    public void setIsUnschedulable(Boolean IsUnschedulable) {
        this.IsUnschedulable = IsUnschedulable;
    }

    /**
     * Get Scaling group label list
Note: this field may return null, indicating that no valid value was found. 
     * @return Labels Scaling group label list
Note: this field may return null, indicating that no valid value was found.
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Scaling group label list
Note: this field may return null, indicating that no valid value was found.
     * @param Labels Scaling group label list
Note: this field may return null, indicating that no valid value was found.
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Creation time 
     * @return CreatedTime Creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
     * @param CreatedTime Creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public ClusterAsGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterAsGroup(ClusterAsGroup source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsUnschedulable != null) {
            this.IsUnschedulable = new Boolean(source.IsUnschedulable);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsUnschedulable", this.IsUnschedulable);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

