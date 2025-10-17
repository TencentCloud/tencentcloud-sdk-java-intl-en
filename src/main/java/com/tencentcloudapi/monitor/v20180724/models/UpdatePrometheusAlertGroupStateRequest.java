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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePrometheusAlertGroupStateRequest extends AbstractModel {

    /**
    * TMP instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Alarm group ID list, such as alert-xxxx.
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * Describes the group status of the alarm.
2 - enable.
3 - disabled.
    */
    @SerializedName("GroupState")
    @Expose
    private Long GroupState;

    /**
     * Get TMP instance ID 
     * @return InstanceId TMP instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TMP instance ID
     * @param InstanceId TMP instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Alarm group ID list, such as alert-xxxx. 
     * @return GroupIds Alarm group ID list, such as alert-xxxx.
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set Alarm group ID list, such as alert-xxxx.
     * @param GroupIds Alarm group ID list, such as alert-xxxx.
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get Describes the group status of the alarm.
2 - enable.
3 - disabled. 
     * @return GroupState Describes the group status of the alarm.
2 - enable.
3 - disabled.
     */
    public Long getGroupState() {
        return this.GroupState;
    }

    /**
     * Set Describes the group status of the alarm.
2 - enable.
3 - disabled.
     * @param GroupState Describes the group status of the alarm.
2 - enable.
3 - disabled.
     */
    public void setGroupState(Long GroupState) {
        this.GroupState = GroupState;
    }

    public UpdatePrometheusAlertGroupStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePrometheusAlertGroupStateRequest(UpdatePrometheusAlertGroupStateRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.GroupState != null) {
            this.GroupState = new Long(source.GroupState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "GroupState", this.GroupState);

    }
}

