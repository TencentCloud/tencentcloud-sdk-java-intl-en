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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdbInfo extends AbstractModel{

    /**
    * Database instance
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Database IP
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Database port
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Database memory specification
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Database disk specification
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Service flag
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Application time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * Payment type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * Expiration flag
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireFlag")
    @Expose
    private Boolean ExpireFlag;

    /**
    * Database status
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Renewal flag
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Long IsAutoRenew;

    /**
    * Database string
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * ZoneId
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * RegionId
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get Database instance
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Database instance
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Database instance
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Database instance
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Database IP
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Ip Database IP
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Database IP
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Ip Database IP
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Database port
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Port Database port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Database port
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Port Database port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Database memory specification
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MemSize Database memory specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Database memory specification
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MemSize Database memory specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Database disk specification
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Volume Database disk specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Database disk specification
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Volume Database disk specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Service flag
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Service Service flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Service flag
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Service Service flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Expiration time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Application time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplyTime Application time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set Application time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplyTime Application time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get Payment type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PayType Payment type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set Payment type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PayType Payment type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Expiration flag
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpireFlag Expiration flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getExpireFlag() {
        return this.ExpireFlag;
    }

    /**
     * Set Expiration flag
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpireFlag Expiration flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireFlag(Boolean ExpireFlag) {
        this.ExpireFlag = ExpireFlag;
    }

    /**
     * Get Database status
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Database status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Database status
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Database status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Renewal flag
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsAutoRenew Renewal flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set Renewal flag
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsAutoRenew Renewal flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAutoRenew(Long IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get Database string
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SerialNo Database string
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set Database string
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SerialNo Database string
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get ZoneId
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ZoneId ZoneId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ZoneId
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ZoneId ZoneId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get RegionId
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RegionId RegionId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set RegionId
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RegionId RegionId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
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

