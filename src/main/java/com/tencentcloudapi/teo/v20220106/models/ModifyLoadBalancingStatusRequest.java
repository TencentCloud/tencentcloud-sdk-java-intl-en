/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoadBalancingStatusRequest extends AbstractModel {

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancingId")
    @Expose
    private String LoadBalancingId;

    /**
    * Status.
`online`: Enabled
`offline`: Disabled
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Site ID 
     * @return ZoneId Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
     * @param ZoneId Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get CLB instance ID 
     * @return LoadBalancingId CLB instance ID
     */
    public String getLoadBalancingId() {
        return this.LoadBalancingId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancingId CLB instance ID
     */
    public void setLoadBalancingId(String LoadBalancingId) {
        this.LoadBalancingId = LoadBalancingId;
    }

    /**
     * Get Status.
`online`: Enabled
`offline`: Disabled 
     * @return Status Status.
`online`: Enabled
`offline`: Disabled
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
`online`: Enabled
`offline`: Disabled
     * @param Status Status.
`online`: Enabled
`offline`: Disabled
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyLoadBalancingStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancingStatusRequest(ModifyLoadBalancingStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.LoadBalancingId != null) {
            this.LoadBalancingId = new String(source.LoadBalancingId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "LoadBalancingId", this.LoadBalancingId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

