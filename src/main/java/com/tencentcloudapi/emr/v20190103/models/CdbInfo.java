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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdbInfo extends AbstractModel {

    /**
    * Database instance.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Database IP address.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Database port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Database memory specifications.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Database disk specifications.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Service identifier.
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Application time.
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * Billing type.
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * Expiration flag.
    */
    @SerializedName("ExpireFlag")
    @Expose
    private Boolean ExpireFlag;

    /**
    * Database status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Renewal flag.
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Long IsAutoRenew;

    /**
    * Database string.
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * ZoneId
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * RegionId
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get Database instance. 
     * @return InstanceName Database instance.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Database instance.
     * @param InstanceName Database instance.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Database IP address. 
     * @return Ip Database IP address.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Database IP address.
     * @param Ip Database IP address.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Database port. 
     * @return Port Database port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Database port.
     * @param Port Database port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Database memory specifications. 
     * @return MemSize Database memory specifications.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Database memory specifications.
     * @param MemSize Database memory specifications.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Database disk specifications. 
     * @return Volume Database disk specifications.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Database disk specifications.
     * @param Volume Database disk specifications.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Service identifier. 
     * @return Service Service identifier.
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Service identifier.
     * @param Service Service identifier.
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Expiration time. 
     * @return ExpireTime Expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time.
     * @param ExpireTime Expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Application time. 
     * @return ApplyTime Application time.
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set Application time.
     * @param ApplyTime Application time.
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get Billing type. 
     * @return PayType Billing type.
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set Billing type.
     * @param PayType Billing type.
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Expiration flag. 
     * @return ExpireFlag Expiration flag.
     */
    public Boolean getExpireFlag() {
        return this.ExpireFlag;
    }

    /**
     * Set Expiration flag.
     * @param ExpireFlag Expiration flag.
     */
    public void setExpireFlag(Boolean ExpireFlag) {
        this.ExpireFlag = ExpireFlag;
    }

    /**
     * Get Database status. 
     * @return Status Database status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Database status.
     * @param Status Database status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Renewal flag. 
     * @return IsAutoRenew Renewal flag.
     */
    public Long getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set Renewal flag.
     * @param IsAutoRenew Renewal flag.
     */
    public void setIsAutoRenew(Long IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get Database string. 
     * @return SerialNo Database string.
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set Database string.
     * @param SerialNo Database string.
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get ZoneId 
     * @return ZoneId ZoneId
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ZoneId
     * @param ZoneId ZoneId
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get RegionId 
     * @return RegionId RegionId
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set RegionId
     * @param RegionId RegionId
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public CdbInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdbInfo(CdbInfo source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.ExpireFlag != null) {
            this.ExpireFlag = new Boolean(source.ExpireFlag);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsAutoRenew != null) {
            this.IsAutoRenew = new Long(source.IsAutoRenew);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "ExpireFlag", this.ExpireFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsAutoRenew", this.IsAutoRenew);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

