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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetServerReservedRequest extends AbstractModel{

    /**
    * ID of the fleet to be bound with the policy
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether the instance is retained. Valid values: 1 (retained), 0 (not retained). Default value: 0.
    */
    @SerializedName("ReserveValue")
    @Expose
    private Long ReserveValue;

    /**
     * Get ID of the fleet to be bound with the policy 
     * @return FleetId ID of the fleet to be bound with the policy
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set ID of the fleet to be bound with the policy
     * @param FleetId ID of the fleet to be bound with the policy
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Whether the instance is retained. Valid values: 1 (retained), 0 (not retained). Default value: 0. 
     * @return ReserveValue Whether the instance is retained. Valid values: 1 (retained), 0 (not retained). Default value: 0.
     */
    public Long getReserveValue() {
        return this.ReserveValue;
    }

    /**
     * Set Whether the instance is retained. Valid values: 1 (retained), 0 (not retained). Default value: 0.
     * @param ReserveValue Whether the instance is retained. Valid values: 1 (retained), 0 (not retained). Default value: 0.
     */
    public void setReserveValue(Long ReserveValue) {
        this.ReserveValue = ReserveValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReserveValue", this.ReserveValue);

    }
}

