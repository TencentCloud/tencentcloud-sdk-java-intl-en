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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HaVip extends AbstractModel{

    /**
    * The `ID` of the `HAVIP`. This is the unique identifier of the `HAVIP`.
    */
    @SerializedName("HaVipId")
    @Expose
    private String HaVipId;

    /**
    * The name of the `HAVIP`.
    */
    @SerializedName("HaVipName")
    @Expose
    private String HaVipName;

    /**
    * The virtual IP address.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * The `ID` of the VPC to which the `HAVIP` belongs.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The `ID` of the subnet to which the `HAVIP` belongs.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The `ID` of the ENI associated with the `HAVIP`.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * The `ID` of the bound instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Bound `EIP`.
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * Status:
<li>`AVAILABLE`: Operating</li>
<li>`UNBIND`: Not bound</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Creation Time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Identifier for businesses that use HAVIP.
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
     * Get The `ID` of the `HAVIP`. This is the unique identifier of the `HAVIP`. 
     * @return HaVipId The `ID` of the `HAVIP`. This is the unique identifier of the `HAVIP`.
     */
    public String getHaVipId() {
        return this.HaVipId;
    }

    /**
     * Set The `ID` of the `HAVIP`. This is the unique identifier of the `HAVIP`.
     * @param HaVipId The `ID` of the `HAVIP`. This is the unique identifier of the `HAVIP`.
     */
    public void setHaVipId(String HaVipId) {
        this.HaVipId = HaVipId;
    }

    /**
     * Get The name of the `HAVIP`. 
     * @return HaVipName The name of the `HAVIP`.
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set The name of the `HAVIP`.
     * @param HaVipName The name of the `HAVIP`.
     */
    public void setHaVipName(String HaVipName) {
        this.HaVipName = HaVipName;
    }

    /**
     * Get The virtual IP address. 
     * @return Vip The virtual IP address.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set The virtual IP address.
     * @param Vip The virtual IP address.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get The `ID` of the VPC to which the `HAVIP` belongs. 
     * @return VpcId The `ID` of the VPC to which the `HAVIP` belongs.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The `ID` of the VPC to which the `HAVIP` belongs.
     * @param VpcId The `ID` of the VPC to which the `HAVIP` belongs.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The `ID` of the subnet to which the `HAVIP` belongs. 
     * @return SubnetId The `ID` of the subnet to which the `HAVIP` belongs.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The `ID` of the subnet to which the `HAVIP` belongs.
     * @param SubnetId The `ID` of the subnet to which the `HAVIP` belongs.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The `ID` of the ENI associated with the `HAVIP`. 
     * @return NetworkInterfaceId The `ID` of the ENI associated with the `HAVIP`.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set The `ID` of the ENI associated with the `HAVIP`.
     * @param NetworkInterfaceId The `ID` of the ENI associated with the `HAVIP`.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get The `ID` of the bound instance. 
     * @return InstanceId The `ID` of the bound instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The `ID` of the bound instance.
     * @param InstanceId The `ID` of the bound instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Bound `EIP`. 
     * @return AddressIp Bound `EIP`.
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set Bound `EIP`.
     * @param AddressIp Bound `EIP`.
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Get Status:
<li>`AVAILABLE`: Operating</li>
<li>`UNBIND`: Not bound</li> 
     * @return State Status:
<li>`AVAILABLE`: Operating</li>
<li>`UNBIND`: Not bound</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Status:
<li>`AVAILABLE`: Operating</li>
<li>`UNBIND`: Not bound</li>
     * @param State Status:
<li>`AVAILABLE`: Operating</li>
<li>`UNBIND`: Not bound</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Creation Time. 
     * @return CreatedTime Creation Time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation Time.
     * @param CreatedTime Creation Time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Identifier for businesses that use HAVIP. 
     * @return Business Identifier for businesses that use HAVIP.
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Identifier for businesses that use HAVIP.
     * @param Business Identifier for businesses that use HAVIP.
     */
    public void setBusiness(String Business) {
        this.Business = Business;
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

