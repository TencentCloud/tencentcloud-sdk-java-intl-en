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

public class PrivateNetworkInstanceInfo extends AbstractModel {

    /**
    * Private network instance ID
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * Private network instance name
    */
    @SerializedName("NetworkInstanceName")
    @Expose
    private String NetworkInstanceName;

    /**
    * Availability zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Network address.
    */
    @SerializedName("Network")
    @Expose
    private String Network;

    /**
    * Network mask
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
    * Number of associated physical machines
    */
    @SerializedName("ServerCount")
    @Expose
    private Long ServerCount;

    /**
    * Available Ip quantity
    */
    @SerializedName("AvailableIpCount")
    @Expose
    private Long AvailableIpCount;

    /**
    * Creation time.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Update time
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get Private network instance ID 
     * @return NetworkInstanceId Private network instance ID
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set Private network instance ID
     * @param NetworkInstanceId Private network instance ID
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get Private network instance name 
     * @return NetworkInstanceName Private network instance name
     */
    public String getNetworkInstanceName() {
        return this.NetworkInstanceName;
    }

    /**
     * Set Private network instance name
     * @param NetworkInstanceName Private network instance name
     */
    public void setNetworkInstanceName(String NetworkInstanceName) {
        this.NetworkInstanceName = NetworkInstanceName;
    }

    /**
     * Get Availability zone ID. 
     * @return ZoneId Availability zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Availability zone ID.
     * @param ZoneId Availability zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Network address. 
     * @return Network Network address.
     */
    public String getNetwork() {
        return this.Network;
    }

    /**
     * Set Network address.
     * @param Network Network address.
     */
    public void setNetwork(String Network) {
        this.Network = Network;
    }

    /**
     * Get Network mask 
     * @return Mask Network mask
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set Network mask
     * @param Mask Network mask
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    /**
     * Get Number of associated physical machines 
     * @return ServerCount Number of associated physical machines
     */
    public Long getServerCount() {
        return this.ServerCount;
    }

    /**
     * Set Number of associated physical machines
     * @param ServerCount Number of associated physical machines
     */
    public void setServerCount(Long ServerCount) {
        this.ServerCount = ServerCount;
    }

    /**
     * Get Available Ip quantity 
     * @return AvailableIpCount Available Ip quantity
     */
    public Long getAvailableIpCount() {
        return this.AvailableIpCount;
    }

    /**
     * Set Available Ip quantity
     * @param AvailableIpCount Available Ip quantity
     */
    public void setAvailableIpCount(Long AvailableIpCount) {
        this.AvailableIpCount = AvailableIpCount;
    }

    /**
     * Get Creation time. 
     * @return CreatedAt Creation time.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time.
     * @param CreatedAt Creation time.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Update time 
     * @return UpdatedAt Update time
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time
     * @param UpdatedAt Update time
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public PrivateNetworkInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateNetworkInstanceInfo(PrivateNetworkInstanceInfo source) {
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String(source.NetworkInstanceId);
        }
        if (source.NetworkInstanceName != null) {
            this.NetworkInstanceName = new String(source.NetworkInstanceName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Network != null) {
            this.Network = new String(source.Network);
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
        if (source.ServerCount != null) {
            this.ServerCount = new Long(source.ServerCount);
        }
        if (source.AvailableIpCount != null) {
            this.AvailableIpCount = new Long(source.AvailableIpCount);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "NetworkInstanceName", this.NetworkInstanceName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Network", this.Network);
        this.setParamSimple(map, prefix + "Mask", this.Mask);
        this.setParamSimple(map, prefix + "ServerCount", this.ServerCount);
        this.setParamSimple(map, prefix + "AvailableIpCount", this.AvailableIpCount);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

