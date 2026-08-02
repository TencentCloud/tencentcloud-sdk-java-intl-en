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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateRequest extends AbstractModel {

    /**
    * <p>Availability zone, each region provision best practice</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Number of compute nodes to purchase</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>Instance purchase type, optional values: PREPAID, POSTPAID, SERVERLESS</p>
    */
    @SerializedName("InstancePayMode")
    @Expose
    private String InstancePayMode;

    /**
    * <p>Storage purchase type, optional values: PREPAID, POSTPAID</p>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private String StoragePayMode;

    /**
    * <p>Instance device type. Supported values are as follows:</p><ul><li>common: refers to universal type</li><li>exclusive: refers to dedicated type</li></ul>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>Number of CPU cores. Required for PREPAID and POSTPAID instance types.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Memory size in GB. Required for PREPAID and POSTPAID instance types.</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Ccu size. Required for the serverless type.</p>
    */
    @SerializedName("Ccu")
    @Expose
    private Float Ccu;

    /**
    * <p>Storage size. Required for PREPAID storage type</p>
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * <p>Purchase period, required for PREPAID purchase type</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>Duration unit. Optional values: m, d. Required for PREPAID purchase type.</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>Storage architecture type. Enumeration value: 1.0/2.0 Default value: 1.0</p>
    */
    @SerializedName("StorageVersion")
    @Expose
    private String StorageVersion;

    /**
    * <p>Whether storage spans AZs. Valid for storage architecture 2.0</p>
    */
    @SerializedName("IsMultiAz")
    @Expose
    private Boolean IsMultiAz;

    /**
     * Get <p>Availability zone, each region provision best practice</p> 
     * @return Zone <p>Availability zone, each region provision best practice</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Availability zone, each region provision best practice</p>
     * @param Zone <p>Availability zone, each region provision best practice</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Number of compute nodes to purchase</p> 
     * @return GoodsNum <p>Number of compute nodes to purchase</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>Number of compute nodes to purchase</p>
     * @param GoodsNum <p>Number of compute nodes to purchase</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>Instance purchase type, optional values: PREPAID, POSTPAID, SERVERLESS</p> 
     * @return InstancePayMode <p>Instance purchase type, optional values: PREPAID, POSTPAID, SERVERLESS</p>
     */
    public String getInstancePayMode() {
        return this.InstancePayMode;
    }

    /**
     * Set <p>Instance purchase type, optional values: PREPAID, POSTPAID, SERVERLESS</p>
     * @param InstancePayMode <p>Instance purchase type, optional values: PREPAID, POSTPAID, SERVERLESS</p>
     */
    public void setInstancePayMode(String InstancePayMode) {
        this.InstancePayMode = InstancePayMode;
    }

    /**
     * Get <p>Storage purchase type, optional values: PREPAID, POSTPAID</p> 
     * @return StoragePayMode <p>Storage purchase type, optional values: PREPAID, POSTPAID</p>
     */
    public String getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>Storage purchase type, optional values: PREPAID, POSTPAID</p>
     * @param StoragePayMode <p>Storage purchase type, optional values: PREPAID, POSTPAID</p>
     */
    public void setStoragePayMode(String StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>Instance device type. Supported values are as follows:</p><ul><li>common: refers to universal type</li><li>exclusive: refers to dedicated type</li></ul> 
     * @return DeviceType <p>Instance device type. Supported values are as follows:</p><ul><li>common: refers to universal type</li><li>exclusive: refers to dedicated type</li></ul>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>Instance device type. Supported values are as follows:</p><ul><li>common: refers to universal type</li><li>exclusive: refers to dedicated type</li></ul>
     * @param DeviceType <p>Instance device type. Supported values are as follows:</p><ul><li>common: refers to universal type</li><li>exclusive: refers to dedicated type</li></ul>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>Number of CPU cores. Required for PREPAID and POSTPAID instance types.</p> 
     * @return Cpu <p>Number of CPU cores. Required for PREPAID and POSTPAID instance types.</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Number of CPU cores. Required for PREPAID and POSTPAID instance types.</p>
     * @param Cpu <p>Number of CPU cores. Required for PREPAID and POSTPAID instance types.</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Memory size in GB. Required for PREPAID and POSTPAID instance types.</p> 
     * @return Memory <p>Memory size in GB. Required for PREPAID and POSTPAID instance types.</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory size in GB. Required for PREPAID and POSTPAID instance types.</p>
     * @param Memory <p>Memory size in GB. Required for PREPAID and POSTPAID instance types.</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Ccu size. Required for the serverless type.</p> 
     * @return Ccu <p>Ccu size. Required for the serverless type.</p>
     */
    public Float getCcu() {
        return this.Ccu;
    }

    /**
     * Set <p>Ccu size. Required for the serverless type.</p>
     * @param Ccu <p>Ccu size. Required for the serverless type.</p>
     */
    public void setCcu(Float Ccu) {
        this.Ccu = Ccu;
    }

    /**
     * Get <p>Storage size. Required for PREPAID storage type</p> 
     * @return StorageLimit <p>Storage size. Required for PREPAID storage type</p>
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set <p>Storage size. Required for PREPAID storage type</p>
     * @param StorageLimit <p>Storage size. Required for PREPAID storage type</p>
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get <p>Purchase period, required for PREPAID purchase type</p> 
     * @return TimeSpan <p>Purchase period, required for PREPAID purchase type</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>Purchase period, required for PREPAID purchase type</p>
     * @param TimeSpan <p>Purchase period, required for PREPAID purchase type</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>Duration unit. Optional values: m, d. Required for PREPAID purchase type.</p> 
     * @return TimeUnit <p>Duration unit. Optional values: m, d. Required for PREPAID purchase type.</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>Duration unit. Optional values: m, d. Required for PREPAID purchase type.</p>
     * @param TimeUnit <p>Duration unit. Optional values: m, d. Required for PREPAID purchase type.</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>Storage architecture type. Enumeration value: 1.0/2.0 Default value: 1.0</p> 
     * @return StorageVersion <p>Storage architecture type. Enumeration value: 1.0/2.0 Default value: 1.0</p>
     */
    public String getStorageVersion() {
        return this.StorageVersion;
    }

    /**
     * Set <p>Storage architecture type. Enumeration value: 1.0/2.0 Default value: 1.0</p>
     * @param StorageVersion <p>Storage architecture type. Enumeration value: 1.0/2.0 Default value: 1.0</p>
     */
    public void setStorageVersion(String StorageVersion) {
        this.StorageVersion = StorageVersion;
    }

    /**
     * Get <p>Whether storage spans AZs. Valid for storage architecture 2.0</p> 
     * @return IsMultiAz <p>Whether storage spans AZs. Valid for storage architecture 2.0</p>
     */
    public Boolean getIsMultiAz() {
        return this.IsMultiAz;
    }

    /**
     * Set <p>Whether storage spans AZs. Valid for storage architecture 2.0</p>
     * @param IsMultiAz <p>Whether storage spans AZs. Valid for storage architecture 2.0</p>
     */
    public void setIsMultiAz(Boolean IsMultiAz) {
        this.IsMultiAz = IsMultiAz;
    }

    public InquirePriceCreateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateRequest(InquirePriceCreateRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.InstancePayMode != null) {
            this.InstancePayMode = new String(source.InstancePayMode);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new String(source.StoragePayMode);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Ccu != null) {
            this.Ccu = new Float(source.Ccu);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.StorageVersion != null) {
            this.StorageVersion = new String(source.StorageVersion);
        }
        if (source.IsMultiAz != null) {
            this.IsMultiAz = new Boolean(source.IsMultiAz);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "InstancePayMode", this.InstancePayMode);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Ccu", this.Ccu);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "StorageVersion", this.StorageVersion);
        this.setParamSimple(map, prefix + "IsMultiAz", this.IsMultiAz);

    }
}

