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
    * EMR cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The original scheduler: `fair`
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * The new scheduler: `capacity`
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
     * Get EMR cluster ID 
     * @return InstanceId EMR cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR cluster ID
     * @param InstanceId EMR cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The original scheduler: `fair` 
     * @return OldValue The original scheduler: `fair`
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set The original scheduler: `fair`
     * @param OldValue The original scheduler: `fair`
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get The new scheduler: `capacity` 
     * @return NewValue The new scheduler: `capacity`
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set The new scheduler: `capacity`
     * @param NewValue The new scheduler: `capacity`
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

