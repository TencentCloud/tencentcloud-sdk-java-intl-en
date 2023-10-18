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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Address extends AbstractModel {

    /**
    * Unique EIP ID.
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * EIP name.
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * EIP status, including 'CREATING' (creating), 'BINDING' (binding), 'BIND' (bound), 'UNBINDING' (unbinding), 'UNBIND' (unbound), 'OFFLINING' (releasing), and 'BIND_ENI' (binding dangling ENI)
    */
    @SerializedName("AddressStatus")
    @Expose
    private String AddressStatus;

    /**
    * Public IP address
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * ID of the bound resource instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Creation time in ISO 8601 format (YYYY-MM-DDTHH:mm:ss.sssZ)
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * ID of the bound ENI
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * Private IP of the bound resource
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateAddressIp")
    @Expose
    private String PrivateAddressIp;

    /**
    * Isolation status of the resource. true: isolated; false: not isolated.
    */
    @SerializedName("IsArrears")
    @Expose
    private Boolean IsArrears;

    /**
    * Blockage status of the EIP resource. true: blocked; false: not blocked
    */
    @SerializedName("IsBlocked")
    @Expose
    private Boolean IsBlocked;

    /**
    * Whether the EIP supports direct access mode. true: yes; false: no.
    */
    @SerializedName("IsEipDirectConnection")
    @Expose
    private Boolean IsEipDirectConnection;

    /**
    * Resource type of the EIP, including `CalcIP` (device IP), `WanIP` (general public IP), `EIP` (elastic IP), and `AnycastEip` (accelerated EIP).
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * Whether the EIP is automatically released after being unbound. true: yes; false: no
    */
    @SerializedName("CascadeRelease")
    @Expose
    private Boolean CascadeRelease;

    /**
    * ISP. CTCC: China Telecom; CUCC: China Unicom; CMCC: China Mobile
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * Bandwidth cap
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
     * Get Unique EIP ID. 
     * @return AddressId Unique EIP ID.
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set Unique EIP ID.
     * @param AddressId Unique EIP ID.
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get EIP name. 
     * @return AddressName EIP name.
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set EIP name.
     * @param AddressName EIP name.
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get EIP status, including 'CREATING' (creating), 'BINDING' (binding), 'BIND' (bound), 'UNBINDING' (unbinding), 'UNBIND' (unbound), 'OFFLINING' (releasing), and 'BIND_ENI' (binding dangling ENI) 
     * @return AddressStatus EIP status, including 'CREATING' (creating), 'BINDING' (binding), 'BIND' (bound), 'UNBINDING' (unbinding), 'UNBIND' (unbound), 'OFFLINING' (releasing), and 'BIND_ENI' (binding dangling ENI)
     */
    public String getAddressStatus() {
        return this.AddressStatus;
    }

    /**
     * Set EIP status, including 'CREATING' (creating), 'BINDING' (binding), 'BIND' (bound), 'UNBINDING' (unbinding), 'UNBIND' (unbound), 'OFFLINING' (releasing), and 'BIND_ENI' (binding dangling ENI)
     * @param AddressStatus EIP status, including 'CREATING' (creating), 'BINDING' (binding), 'BIND' (bound), 'UNBINDING' (unbinding), 'UNBIND' (unbound), 'OFFLINING' (releasing), and 'BIND_ENI' (binding dangling ENI)
     */
    public void setAddressStatus(String AddressStatus) {
        this.AddressStatus = AddressStatus;
    }

    /**
     * Get Public IP address 
     * @return AddressIp Public IP address
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set Public IP address
     * @param AddressIp Public IP address
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Get ID of the bound resource instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId ID of the bound resource instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the bound resource instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceId ID of the bound resource instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Creation time in ISO 8601 format (YYYY-MM-DDTHH:mm:ss.sssZ) 
     * @return CreatedTime Creation time in ISO 8601 format (YYYY-MM-DDTHH:mm:ss.sssZ)
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time in ISO 8601 format (YYYY-MM-DDTHH:mm:ss.sssZ)
     * @param CreatedTime Creation time in ISO 8601 format (YYYY-MM-DDTHH:mm:ss.sssZ)
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get ID of the bound ENI
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NetworkInterfaceId ID of the bound ENI
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set ID of the bound ENI
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NetworkInterfaceId ID of the bound ENI
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get Private IP of the bound resource
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PrivateAddressIp Private IP of the bound resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivateAddressIp() {
        return this.PrivateAddressIp;
    }

    /**
     * Set Private IP of the bound resource
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PrivateAddressIp Private IP of the bound resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateAddressIp(String PrivateAddressIp) {
        this.PrivateAddressIp = PrivateAddressIp;
    }

    /**
     * Get Isolation status of the resource. true: isolated; false: not isolated. 
     * @return IsArrears Isolation status of the resource. true: isolated; false: not isolated.
     */
    public Boolean getIsArrears() {
        return this.IsArrears;
    }

    /**
     * Set Isolation status of the resource. true: isolated; false: not isolated.
     * @param IsArrears Isolation status of the resource. true: isolated; false: not isolated.
     */
    public void setIsArrears(Boolean IsArrears) {
        this.IsArrears = IsArrears;
    }

    /**
     * Get Blockage status of the EIP resource. true: blocked; false: not blocked 
     * @return IsBlocked Blockage status of the EIP resource. true: blocked; false: not blocked
     */
    public Boolean getIsBlocked() {
        return this.IsBlocked;
    }

    /**
     * Set Blockage status of the EIP resource. true: blocked; false: not blocked
     * @param IsBlocked Blockage status of the EIP resource. true: blocked; false: not blocked
     */
    public void setIsBlocked(Boolean IsBlocked) {
        this.IsBlocked = IsBlocked;
    }

    /**
     * Get Whether the EIP supports direct access mode. true: yes; false: no. 
     * @return IsEipDirectConnection Whether the EIP supports direct access mode. true: yes; false: no.
     */
    public Boolean getIsEipDirectConnection() {
        return this.IsEipDirectConnection;
    }

    /**
     * Set Whether the EIP supports direct access mode. true: yes; false: no.
     * @param IsEipDirectConnection Whether the EIP supports direct access mode. true: yes; false: no.
     */
    public void setIsEipDirectConnection(Boolean IsEipDirectConnection) {
        this.IsEipDirectConnection = IsEipDirectConnection;
    }

    /**
     * Get Resource type of the EIP, including `CalcIP` (device IP), `WanIP` (general public IP), `EIP` (elastic IP), and `AnycastEip` (accelerated EIP). 
     * @return AddressType Resource type of the EIP, including `CalcIP` (device IP), `WanIP` (general public IP), `EIP` (elastic IP), and `AnycastEip` (accelerated EIP).
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set Resource type of the EIP, including `CalcIP` (device IP), `WanIP` (general public IP), `EIP` (elastic IP), and `AnycastEip` (accelerated EIP).
     * @param AddressType Resource type of the EIP, including `CalcIP` (device IP), `WanIP` (general public IP), `EIP` (elastic IP), and `AnycastEip` (accelerated EIP).
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get Whether the EIP is automatically released after being unbound. true: yes; false: no 
     * @return CascadeRelease Whether the EIP is automatically released after being unbound. true: yes; false: no
     */
    public Boolean getCascadeRelease() {
        return this.CascadeRelease;
    }

    /**
     * Set Whether the EIP is automatically released after being unbound. true: yes; false: no
     * @param CascadeRelease Whether the EIP is automatically released after being unbound. true: yes; false: no
     */
    public void setCascadeRelease(Boolean CascadeRelease) {
        this.CascadeRelease = CascadeRelease;
    }

    /**
     * Get ISP. CTCC: China Telecom; CUCC: China Unicom; CMCC: China Mobile
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InternetServiceProvider ISP. CTCC: China Telecom; CUCC: China Unicom; CMCC: China Mobile
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set ISP. CTCC: China Telecom; CUCC: China Unicom; CMCC: China Mobile
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InternetServiceProvider ISP. CTCC: China Telecom; CUCC: China Unicom; CMCC: China Mobile
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get Bandwidth cap
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Bandwidth Bandwidth cap
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth cap
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Bandwidth Bandwidth cap
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Billing mode
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PayMode Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PayMode Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    public Address() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Address(Address source) {
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.AddressName != null) {
            this.AddressName = new String(source.AddressName);
        }
        if (source.AddressStatus != null) {
            this.AddressStatus = new String(source.AddressStatus);
        }
        if (source.AddressIp != null) {
            this.AddressIp = new String(source.AddressIp);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.PrivateAddressIp != null) {
            this.PrivateAddressIp = new String(source.PrivateAddressIp);
        }
        if (source.IsArrears != null) {
            this.IsArrears = new Boolean(source.IsArrears);
        }
        if (source.IsBlocked != null) {
            this.IsBlocked = new Boolean(source.IsBlocked);
        }
        if (source.IsEipDirectConnection != null) {
            this.IsEipDirectConnection = new Boolean(source.IsEipDirectConnection);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.CascadeRelease != null) {
            this.CascadeRelease = new Boolean(source.CascadeRelease);
        }
        if (source.InternetServiceProvider != null) {
            this.InternetServiceProvider = new String(source.InternetServiceProvider);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);
        this.setParamSimple(map, prefix + "AddressStatus", this.AddressStatus);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "PrivateAddressIp", this.PrivateAddressIp);
        this.setParamSimple(map, prefix + "IsArrears", this.IsArrears);
        this.setParamSimple(map, prefix + "IsBlocked", this.IsBlocked);
        this.setParamSimple(map, prefix + "IsEipDirectConnection", this.IsEipDirectConnection);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "CascadeRelease", this.CascadeRelease);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

