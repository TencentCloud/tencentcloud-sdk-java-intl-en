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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAttributeRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * New instance name, 1-60 characters. Import at least one with NewPublicIp.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * New public IP address (select from available IP addresses of the public network instance bound to the instance). Provide at least one of this or InstanceName.
    */
    @SerializedName("NewPublicIp")
    @Expose
    private String NewPublicIp;

    /**
    * IP type, ipv4 or ipv6. Default is ipv4. Valid only when NewPublicIp is specified.
    */
    @SerializedName("IpType")
    @Expose
    private String IpType;

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
     * Get New instance name, 1-60 characters. Import at least one with NewPublicIp. 
     * @return InstanceName New instance name, 1-60 characters. Import at least one with NewPublicIp.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set New instance name, 1-60 characters. Import at least one with NewPublicIp.
     * @param InstanceName New instance name, 1-60 characters. Import at least one with NewPublicIp.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get New public IP address (select from available IP addresses of the public network instance bound to the instance). Provide at least one of this or InstanceName. 
     * @return NewPublicIp New public IP address (select from available IP addresses of the public network instance bound to the instance). Provide at least one of this or InstanceName.
     */
    public String getNewPublicIp() {
        return this.NewPublicIp;
    }

    /**
     * Set New public IP address (select from available IP addresses of the public network instance bound to the instance). Provide at least one of this or InstanceName.
     * @param NewPublicIp New public IP address (select from available IP addresses of the public network instance bound to the instance). Provide at least one of this or InstanceName.
     */
    public void setNewPublicIp(String NewPublicIp) {
        this.NewPublicIp = NewPublicIp;
    }

    /**
     * Get IP type, ipv4 or ipv6. Default is ipv4. Valid only when NewPublicIp is specified. 
     * @return IpType IP type, ipv4 or ipv6. Default is ipv4. Valid only when NewPublicIp is specified.
     */
    public String getIpType() {
        return this.IpType;
    }

    /**
     * Set IP type, ipv4 or ipv6. Default is ipv4. Valid only when NewPublicIp is specified.
     * @param IpType IP type, ipv4 or ipv6. Default is ipv4. Valid only when NewPublicIp is specified.
     */
    public void setIpType(String IpType) {
        this.IpType = IpType;
    }

    public ModifyInstanceAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceAttributeRequest(ModifyInstanceAttributeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NewPublicIp != null) {
            this.NewPublicIp = new String(source.NewPublicIp);
        }
        if (source.IpType != null) {
            this.IpType = new String(source.IpType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NewPublicIp", this.NewPublicIp);
        this.setParamSimple(map, prefix + "IpType", this.IpType);

    }
}

