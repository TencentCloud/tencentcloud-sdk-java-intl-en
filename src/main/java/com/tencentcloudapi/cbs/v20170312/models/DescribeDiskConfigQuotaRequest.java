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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskConfigQuotaRequest extends AbstractModel{

    /**
    * Inquiry type. Value range: INQUIRY_CBS_CONFIG: query the configuration list of cloud disks <br><li>INQUIRY_CVM_CONFIG: query the configuration list of cloud disks and instances.
    */
    @SerializedName("InquiryType")
    @Expose
    private String InquiryType;

    /**
    * Query configuration under one or more [availability zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo).
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Billing mode. Value range: <br><li>POSTPAID_BY_HOUR: postpaid.
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * Type of hard disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
    */
    @SerializedName("DiskTypes")
    @Expose
    private String [] DiskTypes;

    /**
    * The system disk or data disk. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Filter by the instance model series, such as S1, I1 and M1. For more information, please see [Instance Types](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1)
    */
    @SerializedName("InstanceFamilies")
    @Expose
    private String [] InstanceFamilies;

    /**
    * Instance CPU cores.
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Instance memory size.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
     * Get Inquiry type. Value range: INQUIRY_CBS_CONFIG: query the configuration list of cloud disks <br><li>INQUIRY_CVM_CONFIG: query the configuration list of cloud disks and instances. 
     * @return InquiryType Inquiry type. Value range: INQUIRY_CBS_CONFIG: query the configuration list of cloud disks <br><li>INQUIRY_CVM_CONFIG: query the configuration list of cloud disks and instances.
     */
    public String getInquiryType() {
        return this.InquiryType;
    }

    /**
     * Set Inquiry type. Value range: INQUIRY_CBS_CONFIG: query the configuration list of cloud disks <br><li>INQUIRY_CVM_CONFIG: query the configuration list of cloud disks and instances.
     * @param InquiryType Inquiry type. Value range: INQUIRY_CBS_CONFIG: query the configuration list of cloud disks <br><li>INQUIRY_CVM_CONFIG: query the configuration list of cloud disks and instances.
     */
    public void setInquiryType(String InquiryType) {
        this.InquiryType = InquiryType;
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
     * Get Type of hard disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk. 
     * @return DiskTypes Type of hard disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
     */
    public String [] getDiskTypes() {
        return this.DiskTypes;
    }

    /**
     * Set Type of hard disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
     * @param DiskTypes Type of hard disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
     */
    public void setDiskTypes(String [] DiskTypes) {
        this.DiskTypes = DiskTypes;
    }

    /**
     * Get The system disk or data disk. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk. 
     * @return DiskUsage The system disk or data disk. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set The system disk or data disk. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
     * @param DiskUsage The system disk or data disk. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
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
     * Get Instance memory size. 
     * @return Memory Instance memory size.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size.
     * @param Memory Instance memory size.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InquiryType", this.InquiryType);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamArraySimple(map, prefix + "DiskTypes.", this.DiskTypes);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamArraySimple(map, prefix + "InstanceFamilies.", this.InstanceFamilies);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

