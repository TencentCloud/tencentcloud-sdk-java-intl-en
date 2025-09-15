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

public class ModifyYarnDeployRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Scheduler after switching. The values are fair and capacity.
    */
    @SerializedName("NewScheduler")
    @Expose
    private String NewScheduler;

    /**
    * Currently used scheduler. The values are fair and capacity.
    */
    @SerializedName("OldScheduler")
    @Expose
    private String OldScheduler;

    /**
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Scheduler after switching. The values are fair and capacity. 
     * @return NewScheduler Scheduler after switching. The values are fair and capacity.
     */
    public String getNewScheduler() {
        return this.NewScheduler;
    }

    /**
     * Set Scheduler after switching. The values are fair and capacity.
     * @param NewScheduler Scheduler after switching. The values are fair and capacity.
     */
    public void setNewScheduler(String NewScheduler) {
        this.NewScheduler = NewScheduler;
    }

    /**
     * Get Currently used scheduler. The values are fair and capacity. 
     * @return OldScheduler Currently used scheduler. The values are fair and capacity.
     */
    public String getOldScheduler() {
        return this.OldScheduler;
    }

    /**
     * Set Currently used scheduler. The values are fair and capacity.
     * @param OldScheduler Currently used scheduler. The values are fair and capacity.
     */
    public void setOldScheduler(String OldScheduler) {
        this.OldScheduler = OldScheduler;
    }

    public ModifyYarnDeployRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyYarnDeployRequest(ModifyYarnDeployRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NewScheduler != null) {
            this.NewScheduler = new String(source.NewScheduler);
        }
        if (source.OldScheduler != null) {
            this.OldScheduler = new String(source.OldScheduler);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NewScheduler", this.NewScheduler);
        this.setParamSimple(map, prefix + "OldScheduler", this.OldScheduler);

    }
}

