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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BreakStandbyDBInstanceRelationRequest extends AbstractModel {

    /**
    * Disaster Recovery instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether to force disconnection
    */
    @SerializedName("IsForce")
    @Expose
    private Boolean IsForce;

    /**
    * Latency in seconds. 0 means do not check.
    */
    @SerializedName("SyncDelay")
    @Expose
    private Long SyncDelay;

    /**
     * Get Disaster Recovery instance ID 
     * @return InstanceId Disaster Recovery instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Disaster Recovery instance ID
     * @param InstanceId Disaster Recovery instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Whether to force disconnection 
     * @return IsForce Whether to force disconnection
     */
    public Boolean getIsForce() {
        return this.IsForce;
    }

    /**
     * Set Whether to force disconnection
     * @param IsForce Whether to force disconnection
     */
    public void setIsForce(Boolean IsForce) {
        this.IsForce = IsForce;
    }

    /**
     * Get Latency in seconds. 0 means do not check. 
     * @return SyncDelay Latency in seconds. 0 means do not check.
     */
    public Long getSyncDelay() {
        return this.SyncDelay;
    }

    /**
     * Set Latency in seconds. 0 means do not check.
     * @param SyncDelay Latency in seconds. 0 means do not check.
     */
    public void setSyncDelay(Long SyncDelay) {
        this.SyncDelay = SyncDelay;
    }

    public BreakStandbyDBInstanceRelationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BreakStandbyDBInstanceRelationRequest(BreakStandbyDBInstanceRelationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IsForce != null) {
            this.IsForce = new Boolean(source.IsForce);
        }
        if (source.SyncDelay != null) {
            this.SyncDelay = new Long(source.SyncDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IsForce", this.IsForce);
        this.setParamSimple(map, prefix + "SyncDelay", this.SyncDelay);

    }
}

