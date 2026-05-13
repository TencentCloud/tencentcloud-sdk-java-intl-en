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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskConfigQuotaRequest extends AbstractModel {

    /**
    * INQUIRY type. valid values:<br>INQUIRY_CBS_CONFIG: query the cloud disk configuration list<br>INQUIRY_CVM_CONFIG: query the configuration list of cloud disks with instances.
    */
    @SerializedName("InquiryType")
    @Expose
    private String InquiryType;

    /**
    * Billing mode. Value range: <br><li>POSTPAID_BY_HOUR: postpaid.
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * Filter by the instance model series, such as S1, I1 and M1. For more information, please see [Instance Types](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1)
    */
    @SerializedName("InstanceFamilies")
    @Expose
    private String [] InstanceFamilies;

    /**
    * Hard disk media type. valid values: <br> CLOUD_BASIC: BASIC CLOUD disk <br> CLOUD_PREMIUM: high-performance CLOUD block storage <br> CLOUD_SSD: SSD CLOUD disk <br> CLOUD_HSSD: enhanced SSD CLOUD disk.
    */
    @SerializedName("DiskTypes")
    @Expose
    private String [] DiskTypes;

    /**
    * Query configuration under one or more [availability zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo).
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Instance memory size in GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * SYSTEM DISK or DATA DISK. valid values:<br>SYSTEM_DISK: SYSTEM DISK<br>DATA_DISK: DATA DISK.
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Instance CPU cores.
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Dedicated cluster ID.
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
     * Get INQUIRY type. valid values:<br>INQUIRY_CBS_CONFIG: query the cloud disk configuration list<br>INQUIRY_CVM_CONFIG: query the configuration list of cloud disks with instances. 
     * @return InquiryType INQUIRY type. valid values:<br>INQUIRY_CBS_CONFIG: query the cloud disk configuration list<br>INQUIRY_CVM_CONFIG: query the configuration list of cloud disks with instances.
     */
    public String getInquiryType() {
        return this.InquiryType;
    }

    /**
     * Set INQUIRY type. valid values:<br>INQUIRY_CBS_CONFIG: query the cloud disk configuration list<br>INQUIRY_CVM_CONFIG: query the configuration list of cloud disks with instances.
     * @param InquiryType INQUIRY type. valid values:<br>INQUIRY_CBS_CONFIG: query the cloud disk configuration list<br>INQUIRY_CVM_CONFIG: query the configuration list of cloud disks with instances.
     */
    public void setInquiryType(String InquiryType) {
        this.InquiryType = InquiryType;
    }

    /**
     * Get Billing mode. Value range: <br><li>POSTPAID_BY_HOUR: postpaid. 
     * @return DiskChargeType Billing mode. Value range: <br><li>POSTPAID_BY_HOUR: postpaid.
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set Billing mode. Value range: <br><li>POSTPAID_BY_HOUR: postpaid.
     * @param DiskChargeType Billing mode. Value range: <br><li>POSTPAID_BY_HOUR: postpaid.
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get Filter by the instance model series, such as S1, I1 and M1. For more information, please see [Instance Types](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1) 
     * @return InstanceFamilies Filter by the instance model series, such as S1, I1 and M1. For more information, please see [Instance Types](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1)
     */
    public String [] getInstanceFamilies() {
        return this.InstanceFamilies;
    }

    /**
     * Set Filter by the instance model series, such as S1, I1 and M1. For more information, please see [Instance Types](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1)
     * @param InstanceFamilies Filter by the instance model series, such as S1, I1 and M1. For more information, please see [Instance Types](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1)
     */
    public void setInstanceFamilies(String [] InstanceFamilies) {
        this.InstanceFamilies = InstanceFamilies;
    }

    /**
     * Get Hard disk media type. valid values: <br> CLOUD_BASIC: BASIC CLOUD disk <br> CLOUD_PREMIUM: high-performance CLOUD block storage <br> CLOUD_SSD: SSD CLOUD disk <br> CLOUD_HSSD: enhanced SSD CLOUD disk. 
     * @return DiskTypes Hard disk media type. valid values: <br> CLOUD_BASIC: BASIC CLOUD disk <br> CLOUD_PREMIUM: high-performance CLOUD block storage <br> CLOUD_SSD: SSD CLOUD disk <br> CLOUD_HSSD: enhanced SSD CLOUD disk.
     */
    public String [] getDiskTypes() {
        return this.DiskTypes;
    }

    /**
     * Set Hard disk media type. valid values: <br> CLOUD_BASIC: BASIC CLOUD disk <br> CLOUD_PREMIUM: high-performance CLOUD block storage <br> CLOUD_SSD: SSD CLOUD disk <br> CLOUD_HSSD: enhanced SSD CLOUD disk.
     * @param DiskTypes Hard disk media type. valid values: <br> CLOUD_BASIC: BASIC CLOUD disk <br> CLOUD_PREMIUM: high-performance CLOUD block storage <br> CLOUD_SSD: SSD CLOUD disk <br> CLOUD_HSSD: enhanced SSD CLOUD disk.
     */
    public void setDiskTypes(String [] DiskTypes) {
        this.DiskTypes = DiskTypes;
    }

    /**
     * Get Query configuration under one or more [availability zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo). 
     * @return Zones Query configuration under one or more [availability zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo).
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Query configuration under one or more [availability zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo).
     * @param Zones Query configuration under one or more [availability zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo).
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Instance memory size in GB. 
     * @return Memory Instance memory size in GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GB.
     * @param Memory Instance memory size in GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get SYSTEM DISK or DATA DISK. valid values:<br>SYSTEM_DISK: SYSTEM DISK<br>DATA_DISK: DATA DISK. 
     * @return DiskUsage SYSTEM DISK or DATA DISK. valid values:<br>SYSTEM_DISK: SYSTEM DISK<br>DATA_DISK: DATA DISK.
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set SYSTEM DISK or DATA DISK. valid values:<br>SYSTEM_DISK: SYSTEM DISK<br>DATA_DISK: DATA DISK.
     * @param DiskUsage SYSTEM DISK or DATA DISK. valid values:<br>SYSTEM_DISK: SYSTEM DISK<br>DATA_DISK: DATA DISK.
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Instance CPU cores. 
     * @return CPU Instance CPU cores.
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Instance CPU cores.
     * @param CPU Instance CPU cores.
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Dedicated cluster ID. 
     * @return DedicatedClusterId Dedicated cluster ID.
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set Dedicated cluster ID.
     * @param DedicatedClusterId Dedicated cluster ID.
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    public DescribeDiskConfigQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskConfigQuotaRequest(DescribeDiskConfigQuotaRequest source) {
        if (source.InquiryType != null) {
            this.InquiryType = new String(source.InquiryType);
        }
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.InstanceFamilies != null) {
            this.InstanceFamilies = new String[source.InstanceFamilies.length];
            for (int i = 0; i < source.InstanceFamilies.length; i++) {
                this.InstanceFamilies[i] = new String(source.InstanceFamilies[i]);
            }
        }
        if (source.DiskTypes != null) {
            this.DiskTypes = new String[source.DiskTypes.length];
            for (int i = 0; i < source.DiskTypes.length; i++) {
                this.DiskTypes[i] = new String(source.DiskTypes[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InquiryType", this.InquiryType);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamArraySimple(map, prefix + "InstanceFamilies.", this.InstanceFamilies);
        this.setParamArraySimple(map, prefix + "DiskTypes.", this.DiskTypes);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);

    }
}

