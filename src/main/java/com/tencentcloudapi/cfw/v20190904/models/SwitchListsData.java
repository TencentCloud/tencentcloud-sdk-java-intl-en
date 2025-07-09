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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchListsData extends AbstractModel {

    /**
    * Public IP
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Private IP
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("IntranetIp")
    @Expose
    private String IntranetIp;

    /**
    * Instance name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Region
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Firewall toggle
    */
    @SerializedName("Switch")
    @Expose
    private Long Switch;

    /**
    * ID value
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Public IP type
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PublicIpType")
    @Expose
    private Long PublicIpType;

    /**
    * Number of risky ports
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PortTimes")
    @Expose
    private Long PortTimes;

    /**
    * Last scan time
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Scan mode
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ScanMode")
    @Expose
    private String ScanMode;

    /**
    * Scan status
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
     * Get Public IP
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PublicIp Public IP
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
Note: This field may return `null`, indicating that no valid value was found.
     * @param PublicIp Public IP
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Private IP
Note: This field may return `null`, indicating that no valid value was found. 
     * @return IntranetIp Private IP
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getIntranetIp() {
        return this.IntranetIp;
    }

    /**
     * Set Private IP
Note: This field may return `null`, indicating that no valid value was found.
     * @param IntranetIp Private IP
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setIntranetIp(String IntranetIp) {
        this.IntranetIp = IntranetIp;
    }

    /**
     * Get Instance name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return InstanceName Instance name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
Note: This field may return `null`, indicating that no valid value was found.
     * @param InstanceName Instance name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return InstanceId Instance ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param InstanceId Instance ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Region
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Area Region
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region
Note: This field may return `null`, indicating that no valid value was found.
     * @param Area Region
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Firewall toggle 
     * @return Switch Firewall toggle
     */
    public Long getSwitch() {
        return this.Switch;
    }

    /**
     * Set Firewall toggle
     * @param Switch Firewall toggle
     */
    public void setSwitch(Long Switch) {
        this.Switch = Switch;
    }

    /**
     * Get ID value 
     * @return Id ID value
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID value
     * @param Id ID value
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Public IP type
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PublicIpType Public IP type
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getPublicIpType() {
        return this.PublicIpType;
    }

    /**
     * Set Public IP type
Note: This field may return `null`, indicating that no valid value was found.
     * @param PublicIpType Public IP type
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPublicIpType(Long PublicIpType) {
        this.PublicIpType = PublicIpType;
    }

    /**
     * Get Number of risky ports
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PortTimes Number of risky ports
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getPortTimes() {
        return this.PortTimes;
    }

    /**
     * Set Number of risky ports
Note: This field may return `null`, indicating that no valid value was found.
     * @param PortTimes Number of risky ports
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPortTimes(Long PortTimes) {
        this.PortTimes = PortTimes;
    }

    /**
     * Get Last scan time
Note: This field may return `null`, indicating that no valid value was found. 
     * @return LastTime Last scan time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last scan time
Note: This field may return `null`, indicating that no valid value was found.
     * @param LastTime Last scan time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Scan mode
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ScanMode Scan mode
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getScanMode() {
        return this.ScanMode;
    }

    /**
     * Set Scan mode
Note: This field may return `null`, indicating that no valid value was found.
     * @param ScanMode Scan mode
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setScanMode(String ScanMode) {
        this.ScanMode = ScanMode;
    }

    /**
     * Get Scan status
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ScanStatus Scan status
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Scan status
Note: This field may return `null`, indicating that no valid value was found.
     * @param ScanStatus Scan status
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    public SwitchListsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchListsData(SwitchListsData source) {
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.IntranetIp != null) {
            this.IntranetIp = new String(source.IntranetIp);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Switch != null) {
            this.Switch = new Long(source.Switch);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.PublicIpType != null) {
            this.PublicIpType = new Long(source.PublicIpType);
        }
        if (source.PortTimes != null) {
            this.PortTimes = new Long(source.PortTimes);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.ScanMode != null) {
            this.ScanMode = new String(source.ScanMode);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new Long(source.ScanStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "IntranetIp", this.IntranetIp);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PublicIpType", this.PublicIpType);
        this.setParamSimple(map, prefix + "PortTimes", this.PortTimes);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "ScanMode", this.ScanMode);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);

    }
}

