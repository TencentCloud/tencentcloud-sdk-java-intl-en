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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HaVip extends AbstractModel{

    /**
    * Unique HAVIP ID.
    */
    @SerializedName("HaVipId")
    @Expose
    private String HaVipId;

    /**
    * HAVIP name.
    */
    @SerializedName("HaVipName")
    @Expose
    private String HaVipName;

    /**
    * Virtual IP address.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * VPC ID of the HAVIP.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID of the HAVIP.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * ID of the ENI associated with the HAVIP.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * ID of the bound instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Bound EIP.
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * Status:
AVAILABLE: running.
UNBIND: unbound.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * ID of businesses that use HAVIP.
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
     * Get Unique HAVIP ID. 
     * @return HaVipId Unique HAVIP ID.
     */
    public String getHaVipId() {
        return this.HaVipId;
    }

    /**
     * Set Unique HAVIP ID.
     * @param HaVipId Unique HAVIP ID.
     */
    public void setHaVipId(String HaVipId) {
        this.HaVipId = HaVipId;
    }

    /**
     * Get HAVIP name. 
     * @return HaVipName HAVIP name.
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set HAVIP name.
     * @param HaVipName HAVIP name.
     */
    public void setHaVipName(String HaVipName) {
        this.HaVipName = HaVipName;
    }

    /**
     * Get Virtual IP address. 
     * @return Vip Virtual IP address.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Virtual IP address.
     * @param Vip Virtual IP address.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get VPC ID of the HAVIP. 
     * @return VpcId VPC ID of the HAVIP.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID of the HAVIP.
     * @param VpcId VPC ID of the HAVIP.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID of the HAVIP. 
     * @return SubnetId Subnet ID of the HAVIP.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID of the HAVIP.
     * @param SubnetId Subnet ID of the HAVIP.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get ID of the ENI associated with the HAVIP. 
     * @return NetworkInterfaceId ID of the ENI associated with the HAVIP.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set ID of the ENI associated with the HAVIP.
     * @param NetworkInterfaceId ID of the ENI associated with the HAVIP.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get ID of the bound instance. 
     * @return InstanceId ID of the bound instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the bound instance.
     * @param InstanceId ID of the bound instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Bound EIP. 
     * @return AddressIp Bound EIP.
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set Bound EIP.
     * @param AddressIp Bound EIP.
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Get Status:
AVAILABLE: running.
UNBIND: unbound. 
     * @return State Status:
AVAILABLE: running.
UNBIND: unbound.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Status:
AVAILABLE: running.
UNBIND: unbound.
     * @param State Status:
AVAILABLE: running.
UNBIND: unbound.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Creation time. 
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get ID of businesses that use HAVIP. 
     * @return Business ID of businesses that use HAVIP.
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set ID of businesses that use HAVIP.
     * @param Business ID of businesses that use HAVIP.
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    public HaVip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HaVip(HaVip source) {
        if (source.HaVipId != null) {
            this.HaVipId = new String(source.HaVipId);
        }
        if (source.HaVipName != null) {
            this.HaVipName = new String(source.HaVipName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AddressIp != null) {
            this.AddressIp = new String(source.AddressIp);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HaVipId", this.HaVipId);
        this.setParamSimple(map, prefix + "HaVipName", this.HaVipName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Business", this.Business);

    }
}

