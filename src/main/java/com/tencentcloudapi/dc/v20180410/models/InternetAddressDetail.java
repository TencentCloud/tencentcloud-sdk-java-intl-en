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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAddressDetail extends AbstractModel {

    /**
    * Internet tunnel’s IP address ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Internet tunnel’s network address
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Subnet")
    @Expose
    private String Subnet;

    /**
    * Mask length of a network address
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaskLen")
    @Expose
    private Long MaskLen;

    /**
    * Address type. Valid values: 0: BGP
1: China Telecom
2: China Mobile
3: China Unicom
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AddrType")
    @Expose
    private Long AddrType;

    /**
    * Address status. Valid values: 0: in use
1: disabled
2: returned
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Applied at
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * Disabled at
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StopTime")
    @Expose
    private String StopTime;

    /**
    * Returned at
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * Region
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * User ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Address protocol. Valid values: 0: IPv4; 1: IPv6
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AddrProto")
    @Expose
    private Long AddrProto;

    /**
    * Retention period of a released IP address, in days
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ReserveTime")
    @Expose
    private Long ReserveTime;

    /**
     * Get Internet tunnel’s IP address ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return InstanceId Internet tunnel’s IP address ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Internet tunnel’s IP address ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param InstanceId Internet tunnel’s IP address ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Internet tunnel’s network address
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Subnet Internet tunnel’s network address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSubnet() {
        return this.Subnet;
    }

    /**
     * Set Internet tunnel’s network address
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Subnet Internet tunnel’s network address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSubnet(String Subnet) {
        this.Subnet = Subnet;
    }

    /**
     * Get Mask length of a network address
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MaskLen Mask length of a network address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaskLen() {
        return this.MaskLen;
    }

    /**
     * Set Mask length of a network address
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MaskLen Mask length of a network address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaskLen(Long MaskLen) {
        this.MaskLen = MaskLen;
    }

    /**
     * Get Address type. Valid values: 0: BGP
1: China Telecom
2: China Mobile
3: China Unicom
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AddrType Address type. Valid values: 0: BGP
1: China Telecom
2: China Mobile
3: China Unicom
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getAddrType() {
        return this.AddrType;
    }

    /**
     * Set Address type. Valid values: 0: BGP
1: China Telecom
2: China Mobile
3: China Unicom
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AddrType Address type. Valid values: 0: BGP
1: China Telecom
2: China Mobile
3: China Unicom
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAddrType(Long AddrType) {
        this.AddrType = AddrType;
    }

    /**
     * Get Address status. Valid values: 0: in use
1: disabled
2: returned 
     * @return Status Address status. Valid values: 0: in use
1: disabled
2: returned
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Address status. Valid values: 0: in use
1: disabled
2: returned
     * @param Status Address status. Valid values: 0: in use
1: disabled
2: returned
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Applied at
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplyTime Applied at
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set Applied at
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ApplyTime Applied at
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get Disabled at
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return StopTime Disabled at
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getStopTime() {
        return this.StopTime;
    }

    /**
     * Set Disabled at
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param StopTime Disabled at
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStopTime(String StopTime) {
        this.StopTime = StopTime;
    }

    /**
     * Get Returned at
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ReleaseTime Returned at
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set Returned at
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ReleaseTime Returned at
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get Region
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Region Region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Region Region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get User ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AppId User ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AppId User ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Address protocol. Valid values: 0: IPv4; 1: IPv6
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AddrProto Address protocol. Valid values: 0: IPv4; 1: IPv6
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getAddrProto() {
        return this.AddrProto;
    }

    /**
     * Set Address protocol. Valid values: 0: IPv4; 1: IPv6
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AddrProto Address protocol. Valid values: 0: IPv4; 1: IPv6
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAddrProto(Long AddrProto) {
        this.AddrProto = AddrProto;
    }

    /**
     * Get Retention period of a released IP address, in days
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ReserveTime Retention period of a released IP address, in days
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getReserveTime() {
        return this.ReserveTime;
    }

    /**
     * Set Retention period of a released IP address, in days
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ReserveTime Retention period of a released IP address, in days
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReserveTime(Long ReserveTime) {
        this.ReserveTime = ReserveTime;
    }

    public InternetAddressDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternetAddressDetail(InternetAddressDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Subnet != null) {
            this.Subnet = new String(source.Subnet);
        }
        if (source.MaskLen != null) {
            this.MaskLen = new Long(source.MaskLen);
        }
        if (source.AddrType != null) {
            this.AddrType = new Long(source.AddrType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.StopTime != null) {
            this.StopTime = new String(source.StopTime);
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AddrProto != null) {
            this.AddrProto = new Long(source.AddrProto);
        }
        if (source.ReserveTime != null) {
            this.ReserveTime = new Long(source.ReserveTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Subnet", this.Subnet);
        this.setParamSimple(map, prefix + "MaskLen", this.MaskLen);
        this.setParamSimple(map, prefix + "AddrType", this.AddrType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "StopTime", this.StopTime);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AddrProto", this.AddrProto);
        this.setParamSimple(map, prefix + "ReserveTime", this.ReserveTime);

    }
}

