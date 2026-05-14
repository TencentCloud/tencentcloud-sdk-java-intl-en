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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowPackageInfo extends AbstractModel {

    /**
    * Unique resource ID of the data transfer plan
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * User AppId belonging to the data transfer plan
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Traffic package specification type. Values are as follows:
DEVICE_1_FLOW_20G,DEVICE_2_FLOW_50G,
DEVICE_3_FLOW_100G,
DEVICE_5_FLOW_500G represents traffic packages of 20G, 50G, 100G, and 500G gear selection.
Gear selection also impacts the bandwidth cap of the data transfer plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Traffic packet status. 0: Inactive, 1: Within validity period, 2: Expired.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Purchase time, Unix timestamp format, unit: second
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Effective time, Unix Timestamp Format, unit: second
    */
    @SerializedName("ActiveTime")
    @Expose
    private Long ActiveTime;

    /**
    * Expiration time, Unix Timestamp Format, unit: second
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Device ID list bound to the data transfer plan
    */
    @SerializedName("DeviceList")
    @Expose
    private String [] DeviceList;

    /**
    * Total traffic plan capacity (unit: MB)
    */
    @SerializedName("CapacitySize")
    @Expose
    private Long CapacitySize;

    /**
    * Remaining data transfer plan, unit: MB
    */
    @SerializedName("CapacityRemain")
    @Expose
    private Long CapacityRemain;

    /**
    * Auto-renewal flag. true represents auto-renewal, false represents no auto-renewal.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
    * Resource package change status: 0: No change; 1: Changing; 2: Changed or renewed
    */
    @SerializedName("ModifyStatus")
    @Expose
    private Long ModifyStatus;

    /**
    * Traffic truncation flag. true to enable traffic truncation, false to disable traffic truncation.
    */
    @SerializedName("TruncFlag")
    @Expose
    private Boolean TruncFlag;

    /**
    * Precise remaining data transfer plan, unit: MB
    */
    @SerializedName("CapacityRemainPrecise")
    @Expose
    private Long CapacityRemainPrecise;

    /**
     * Get Unique resource ID of the data transfer plan 
     * @return ResourceId Unique resource ID of the data transfer plan
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Unique resource ID of the data transfer plan
     * @param ResourceId Unique resource ID of the data transfer plan
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get User AppId belonging to the data transfer plan 
     * @return AppId User AppId belonging to the data transfer plan
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppId belonging to the data transfer plan
     * @param AppId User AppId belonging to the data transfer plan
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Traffic package specification type. Values are as follows:
DEVICE_1_FLOW_20G,DEVICE_2_FLOW_50G,
DEVICE_3_FLOW_100G,
DEVICE_5_FLOW_500G represents traffic packages of 20G, 50G, 100G, and 500G gear selection.
Gear selection also impacts the bandwidth cap of the data transfer plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices. 
     * @return PackageType Traffic package specification type. Values are as follows:
DEVICE_1_FLOW_20G,DEVICE_2_FLOW_50G,
DEVICE_3_FLOW_100G,
DEVICE_5_FLOW_500G represents traffic packages of 20G, 50G, 100G, and 500G gear selection.
Gear selection also impacts the bandwidth cap of the data transfer plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Traffic package specification type. Values are as follows:
DEVICE_1_FLOW_20G,DEVICE_2_FLOW_50G,
DEVICE_3_FLOW_100G,
DEVICE_5_FLOW_500G represents traffic packages of 20G, 50G, 100G, and 500G gear selection.
Gear selection also impacts the bandwidth cap of the data transfer plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
     * @param PackageType Traffic package specification type. Values are as follows:
DEVICE_1_FLOW_20G,DEVICE_2_FLOW_50G,
DEVICE_3_FLOW_100G,
DEVICE_5_FLOW_500G represents traffic packages of 20G, 50G, 100G, and 500G gear selection.
Gear selection also impacts the bandwidth cap of the data transfer plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Traffic packet status. 0: Inactive, 1: Within validity period, 2: Expired. 
     * @return Status Traffic packet status. 0: Inactive, 1: Within validity period, 2: Expired.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Traffic packet status. 0: Inactive, 1: Within validity period, 2: Expired.
     * @param Status Traffic packet status. 0: Inactive, 1: Within validity period, 2: Expired.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Purchase time, Unix timestamp format, unit: second 
     * @return CreateTime Purchase time, Unix timestamp format, unit: second
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Purchase time, Unix timestamp format, unit: second
     * @param CreateTime Purchase time, Unix timestamp format, unit: second
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Effective time, Unix Timestamp Format, unit: second 
     * @return ActiveTime Effective time, Unix Timestamp Format, unit: second
     */
    public Long getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set Effective time, Unix Timestamp Format, unit: second
     * @param ActiveTime Effective time, Unix Timestamp Format, unit: second
     */
    public void setActiveTime(Long ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get Expiration time, Unix Timestamp Format, unit: second 
     * @return ExpireTime Expiration time, Unix Timestamp Format, unit: second
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time, Unix Timestamp Format, unit: second
     * @param ExpireTime Expiration time, Unix Timestamp Format, unit: second
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Device ID list bound to the data transfer plan 
     * @return DeviceList Device ID list bound to the data transfer plan
     */
    public String [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set Device ID list bound to the data transfer plan
     * @param DeviceList Device ID list bound to the data transfer plan
     */
    public void setDeviceList(String [] DeviceList) {
        this.DeviceList = DeviceList;
    }

    /**
     * Get Total traffic plan capacity (unit: MB) 
     * @return CapacitySize Total traffic plan capacity (unit: MB)
     */
    public Long getCapacitySize() {
        return this.CapacitySize;
    }

    /**
     * Set Total traffic plan capacity (unit: MB)
     * @param CapacitySize Total traffic plan capacity (unit: MB)
     */
    public void setCapacitySize(Long CapacitySize) {
        this.CapacitySize = CapacitySize;
    }

    /**
     * Get Remaining data transfer plan, unit: MB 
     * @return CapacityRemain Remaining data transfer plan, unit: MB
     */
    public Long getCapacityRemain() {
        return this.CapacityRemain;
    }

    /**
     * Set Remaining data transfer plan, unit: MB
     * @param CapacityRemain Remaining data transfer plan, unit: MB
     */
    public void setCapacityRemain(Long CapacityRemain) {
        this.CapacityRemain = CapacityRemain;
    }

    /**
     * Get Auto-renewal flag. true represents auto-renewal, false represents no auto-renewal. 
     * @return RenewFlag Auto-renewal flag. true represents auto-renewal, false represents no auto-renewal.
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal flag. true represents auto-renewal, false represents no auto-renewal.
     * @param RenewFlag Auto-renewal flag. true represents auto-renewal, false represents no auto-renewal.
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Resource package change status: 0: No change; 1: Changing; 2: Changed or renewed 
     * @return ModifyStatus Resource package change status: 0: No change; 1: Changing; 2: Changed or renewed
     */
    public Long getModifyStatus() {
        return this.ModifyStatus;
    }

    /**
     * Set Resource package change status: 0: No change; 1: Changing; 2: Changed or renewed
     * @param ModifyStatus Resource package change status: 0: No change; 1: Changing; 2: Changed or renewed
     */
    public void setModifyStatus(Long ModifyStatus) {
        this.ModifyStatus = ModifyStatus;
    }

    /**
     * Get Traffic truncation flag. true to enable traffic truncation, false to disable traffic truncation. 
     * @return TruncFlag Traffic truncation flag. true to enable traffic truncation, false to disable traffic truncation.
     */
    public Boolean getTruncFlag() {
        return this.TruncFlag;
    }

    /**
     * Set Traffic truncation flag. true to enable traffic truncation, false to disable traffic truncation.
     * @param TruncFlag Traffic truncation flag. true to enable traffic truncation, false to disable traffic truncation.
     */
    public void setTruncFlag(Boolean TruncFlag) {
        this.TruncFlag = TruncFlag;
    }

    /**
     * Get Precise remaining data transfer plan, unit: MB 
     * @return CapacityRemainPrecise Precise remaining data transfer plan, unit: MB
     */
    public Long getCapacityRemainPrecise() {
        return this.CapacityRemainPrecise;
    }

    /**
     * Set Precise remaining data transfer plan, unit: MB
     * @param CapacityRemainPrecise Precise remaining data transfer plan, unit: MB
     */
    public void setCapacityRemainPrecise(Long CapacityRemainPrecise) {
        this.CapacityRemainPrecise = CapacityRemainPrecise;
    }

    public FlowPackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowPackageInfo(FlowPackageInfo source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new Long(source.ActiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.DeviceList != null) {
            this.DeviceList = new String[source.DeviceList.length];
            for (int i = 0; i < source.DeviceList.length; i++) {
                this.DeviceList[i] = new String(source.DeviceList[i]);
            }
        }
        if (source.CapacitySize != null) {
            this.CapacitySize = new Long(source.CapacitySize);
        }
        if (source.CapacityRemain != null) {
            this.CapacityRemain = new Long(source.CapacityRemain);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Boolean(source.RenewFlag);
        }
        if (source.ModifyStatus != null) {
            this.ModifyStatus = new Long(source.ModifyStatus);
        }
        if (source.TruncFlag != null) {
            this.TruncFlag = new Boolean(source.TruncFlag);
        }
        if (source.CapacityRemainPrecise != null) {
            this.CapacityRemainPrecise = new Long(source.CapacityRemainPrecise);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArraySimple(map, prefix + "DeviceList.", this.DeviceList);
        this.setParamSimple(map, prefix + "CapacitySize", this.CapacitySize);
        this.setParamSimple(map, prefix + "CapacityRemain", this.CapacityRemain);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ModifyStatus", this.ModifyStatus);
        this.setParamSimple(map, prefix + "TruncFlag", this.TruncFlag);
        this.setParamSimple(map, prefix + "CapacityRemainPrecise", this.CapacityRemainPrecise);

    }
}

