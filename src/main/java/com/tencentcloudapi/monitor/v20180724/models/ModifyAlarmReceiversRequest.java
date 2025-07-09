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

public class ModifyAlarmReceiversRequest extends AbstractModel {

    /**
    * ID of a policy group whose recipient needs to be modified.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Required. The value is fixed to monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * New recipient information. If this parameter is not configured, all recipients will be deleted.
    */
    @SerializedName("ReceiverInfos")
    @Expose
    private ReceiverInfo [] ReceiverInfos;

    /**
     * Get ID of a policy group whose recipient needs to be modified. 
     * @return GroupId ID of a policy group whose recipient needs to be modified.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set ID of a policy group whose recipient needs to be modified.
     * @param GroupId ID of a policy group whose recipient needs to be modified.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Required. The value is fixed to monitor. 
     * @return Module Required. The value is fixed to monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Required. The value is fixed to monitor.
     * @param Module Required. The value is fixed to monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get New recipient information. If this parameter is not configured, all recipients will be deleted. 
     * @return ReceiverInfos New recipient information. If this parameter is not configured, all recipients will be deleted.
     */
    public ReceiverInfo [] getReceiverInfos() {
        return this.ReceiverInfos;
    }

    /**
     * Set New recipient information. If this parameter is not configured, all recipients will be deleted.
     * @param ReceiverInfos New recipient information. If this parameter is not configured, all recipients will be deleted.
     */
    public void setReceiverInfos(ReceiverInfo [] ReceiverInfos) {
        this.ReceiverInfos = ReceiverInfos;
    }

    public ModifyAlarmReceiversRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmReceiversRequest(ModifyAlarmReceiversRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ReceiverInfos != null) {
            this.ReceiverInfos = new ReceiverInfo[source.ReceiverInfos.length];
            for (int i = 0; i < source.ReceiverInfos.length; i++) {
                this.ReceiverInfos[i] = new ReceiverInfo(source.ReceiverInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArrayObj(map, prefix + "ReceiverInfos.", this.ReceiverInfos);

    }
}

