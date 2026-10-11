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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceSchedulerRequest extends AbstractModel {

    /**
    * English ID of the EMR cluster.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Old scheduler: fair.
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * New scheduler: capacity.
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
     * Get English ID of the EMR cluster. 
     * @return InstanceId English ID of the EMR cluster.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set English ID of the EMR cluster.
     * @param InstanceId English ID of the EMR cluster.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Old scheduler: fair. 
     * @return OldValue Old scheduler: fair.
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set Old scheduler: fair.
     * @param OldValue Old scheduler: fair.
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get New scheduler: capacity. 
     * @return NewValue New scheduler: capacity.
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set New scheduler: capacity.
     * @param NewValue New scheduler: capacity.
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    public ModifyResourceSchedulerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceSchedulerRequest(ModifyResourceSchedulerRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OldValue != null) {
            this.OldValue = new String(source.OldValue);
        }
        if (source.NewValue != null) {
            this.NewValue = new String(source.NewValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);
        this.setParamSimple(map, prefix + "NewValue", this.NewValue);

    }
}

