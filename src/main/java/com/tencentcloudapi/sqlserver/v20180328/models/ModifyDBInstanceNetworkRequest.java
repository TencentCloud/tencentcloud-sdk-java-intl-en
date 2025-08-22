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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceNetworkRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ID of the new VPC.
    */
    @SerializedName("NewVpcId")
    @Expose
    private String NewVpcId;

    /**
    * ID of the new subnet.
    */
    @SerializedName("NewSubnetId")
    @Expose
    private String NewSubnetId;

    /**
    * Retention period (in hours) of the original VIP. Value range: `0-168`. Default value: `0`, indicating the original VIP is released immediately.
    */
    @SerializedName("OldIpRetainTime")
    @Expose
    private Long OldIpRetainTime;

    /**
    * New VIP.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Target node. 0 - modify the primary node network; 1 - modify the secondary node network. The default value is 0.

    */
    @SerializedName("DRNetwork")
    @Expose
    private Long DRNetwork;

    /**
    * Secondary server resource ID. It is required when DRNetwork = 1.
    */
    @SerializedName("DrInstanceId")
    @Expose
    private String DrInstanceId;

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
     * Get ID of the new VPC. 
     * @return NewVpcId ID of the new VPC.
     */
    public String getNewVpcId() {
        return this.NewVpcId;
    }

    /**
     * Set ID of the new VPC.
     * @param NewVpcId ID of the new VPC.
     */
    public void setNewVpcId(String NewVpcId) {
        this.NewVpcId = NewVpcId;
    }

    /**
     * Get ID of the new subnet. 
     * @return NewSubnetId ID of the new subnet.
     */
    public String getNewSubnetId() {
        return this.NewSubnetId;
    }

    /**
     * Set ID of the new subnet.
     * @param NewSubnetId ID of the new subnet.
     */
    public void setNewSubnetId(String NewSubnetId) {
        this.NewSubnetId = NewSubnetId;
    }

    /**
     * Get Retention period (in hours) of the original VIP. Value range: `0-168`. Default value: `0`, indicating the original VIP is released immediately. 
     * @return OldIpRetainTime Retention period (in hours) of the original VIP. Value range: `0-168`. Default value: `0`, indicating the original VIP is released immediately.
     */
    public Long getOldIpRetainTime() {
        return this.OldIpRetainTime;
    }

    /**
     * Set Retention period (in hours) of the original VIP. Value range: `0-168`. Default value: `0`, indicating the original VIP is released immediately.
     * @param OldIpRetainTime Retention period (in hours) of the original VIP. Value range: `0-168`. Default value: `0`, indicating the original VIP is released immediately.
     */
    public void setOldIpRetainTime(Long OldIpRetainTime) {
        this.OldIpRetainTime = OldIpRetainTime;
    }

    /**
     * Get New VIP. 
     * @return Vip New VIP.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set New VIP.
     * @param Vip New VIP.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Target node. 0 - modify the primary node network; 1 - modify the secondary node network. The default value is 0.
 
     * @return DRNetwork Target node. 0 - modify the primary node network; 1 - modify the secondary node network. The default value is 0.

     */
    public Long getDRNetwork() {
        return this.DRNetwork;
    }

    /**
     * Set Target node. 0 - modify the primary node network; 1 - modify the secondary node network. The default value is 0.

     * @param DRNetwork Target node. 0 - modify the primary node network; 1 - modify the secondary node network. The default value is 0.

     */
    public void setDRNetwork(Long DRNetwork) {
        this.DRNetwork = DRNetwork;
    }

    /**
     * Get Secondary server resource ID. It is required when DRNetwork = 1. 
     * @return DrInstanceId Secondary server resource ID. It is required when DRNetwork = 1.
     */
    public String getDrInstanceId() {
        return this.DrInstanceId;
    }

    /**
     * Set Secondary server resource ID. It is required when DRNetwork = 1.
     * @param DrInstanceId Secondary server resource ID. It is required when DRNetwork = 1.
     */
    public void setDrInstanceId(String DrInstanceId) {
        this.DrInstanceId = DrInstanceId;
    }

    public ModifyDBInstanceNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceNetworkRequest(ModifyDBInstanceNetworkRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NewVpcId != null) {
            this.NewVpcId = new String(source.NewVpcId);
        }
        if (source.NewSubnetId != null) {
            this.NewSubnetId = new String(source.NewSubnetId);
        }
        if (source.OldIpRetainTime != null) {
            this.OldIpRetainTime = new Long(source.OldIpRetainTime);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.DRNetwork != null) {
            this.DRNetwork = new Long(source.DRNetwork);
        }
        if (source.DrInstanceId != null) {
            this.DrInstanceId = new String(source.DrInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NewVpcId", this.NewVpcId);
        this.setParamSimple(map, prefix + "NewSubnetId", this.NewSubnetId);
        this.setParamSimple(map, prefix + "OldIpRetainTime", this.OldIpRetainTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "DRNetwork", this.DRNetwork);
        this.setParamSimple(map, prefix + "DrInstanceId", this.DrInstanceId);

    }
}

