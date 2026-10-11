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

public class AttachDisksRequest extends AbstractModel {

    /**
    * ID of the EMR cluster.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ID of the cloud disk to be mounted.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Mounting mode. Valid values:
AUTO_RENEW: auto-renewal
ALIGN_DEADLINE: automatic alignment with the expiration time
    */
    @SerializedName("AlignType")
    @Expose
    private String AlignType;

    /**
    * ID list of the CVM instances to which disks are to be mounted.
    */
    @SerializedName("CvmInstanceIds")
    @Expose
    private String [] CvmInstanceIds;

    /**
    * Whether to mount newly purchased cloud disks.
    */
    @SerializedName("CreateDisk")
    @Expose
    private Boolean CreateDisk;

    /**
    * Specifications of newly purchased cloud disks.
    */
    @SerializedName("DiskSpec")
    @Expose
    private NodeSpecDiskV2 DiskSpec;

    /**
    * Optional parameter. If this parameter is not passed, only the mounting operation is performed. If True is passed, the cloud disk is set to be terminated with the CVM upon successful mounting. This parameter is applicable only to pay-as-you-go cloud disks.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * Name list of services that can be configured when a new disk is mounted.
    */
    @SerializedName("SelectiveConfServices")
    @Expose
    private String [] SelectiveConfServices;

    /**
    * Disk billing type. Valid values: 1 (monthly subscription) and 3 (committed use).
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * Disk committed use and purchase duration. Valid values: 12, 24, 36, 48, and 60.
    */
    @SerializedName("UnderWriteDuration")
    @Expose
    private Long UnderWriteDuration;

    /**
     * Get ID of the EMR cluster. 
     * @return InstanceId ID of the EMR cluster.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the EMR cluster.
     * @param InstanceId ID of the EMR cluster.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ID of the cloud disk to be mounted. 
     * @return DiskIds ID of the cloud disk to be mounted.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set ID of the cloud disk to be mounted.
     * @param DiskIds ID of the cloud disk to be mounted.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Mounting mode. Valid values:
AUTO_RENEW: auto-renewal
ALIGN_DEADLINE: automatic alignment with the expiration time 
     * @return AlignType Mounting mode. Valid values:
AUTO_RENEW: auto-renewal
ALIGN_DEADLINE: automatic alignment with the expiration time
     */
    public String getAlignType() {
        return this.AlignType;
    }

    /**
     * Set Mounting mode. Valid values:
AUTO_RENEW: auto-renewal
ALIGN_DEADLINE: automatic alignment with the expiration time
     * @param AlignType Mounting mode. Valid values:
AUTO_RENEW: auto-renewal
ALIGN_DEADLINE: automatic alignment with the expiration time
     */
    public void setAlignType(String AlignType) {
        this.AlignType = AlignType;
    }

    /**
     * Get ID list of the CVM instances to which disks are to be mounted. 
     * @return CvmInstanceIds ID list of the CVM instances to which disks are to be mounted.
     */
    public String [] getCvmInstanceIds() {
        return this.CvmInstanceIds;
    }

    /**
     * Set ID list of the CVM instances to which disks are to be mounted.
     * @param CvmInstanceIds ID list of the CVM instances to which disks are to be mounted.
     */
    public void setCvmInstanceIds(String [] CvmInstanceIds) {
        this.CvmInstanceIds = CvmInstanceIds;
    }

    /**
     * Get Whether to mount newly purchased cloud disks. 
     * @return CreateDisk Whether to mount newly purchased cloud disks.
     */
    public Boolean getCreateDisk() {
        return this.CreateDisk;
    }

    /**
     * Set Whether to mount newly purchased cloud disks.
     * @param CreateDisk Whether to mount newly purchased cloud disks.
     */
    public void setCreateDisk(Boolean CreateDisk) {
        this.CreateDisk = CreateDisk;
    }

    /**
     * Get Specifications of newly purchased cloud disks. 
     * @return DiskSpec Specifications of newly purchased cloud disks.
     */
    public NodeSpecDiskV2 getDiskSpec() {
        return this.DiskSpec;
    }

    /**
     * Set Specifications of newly purchased cloud disks.
     * @param DiskSpec Specifications of newly purchased cloud disks.
     */
    public void setDiskSpec(NodeSpecDiskV2 DiskSpec) {
        this.DiskSpec = DiskSpec;
    }

    /**
     * Get Optional parameter. If this parameter is not passed, only the mounting operation is performed. If True is passed, the cloud disk is set to be terminated with the CVM upon successful mounting. This parameter is applicable only to pay-as-you-go cloud disks. 
     * @return DeleteWithInstance Optional parameter. If this parameter is not passed, only the mounting operation is performed. If True is passed, the cloud disk is set to be terminated with the CVM upon successful mounting. This parameter is applicable only to pay-as-you-go cloud disks.
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Optional parameter. If this parameter is not passed, only the mounting operation is performed. If True is passed, the cloud disk is set to be terminated with the CVM upon successful mounting. This parameter is applicable only to pay-as-you-go cloud disks.
     * @param DeleteWithInstance Optional parameter. If this parameter is not passed, only the mounting operation is performed. If True is passed, the cloud disk is set to be terminated with the CVM upon successful mounting. This parameter is applicable only to pay-as-you-go cloud disks.
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get Name list of services that can be configured when a new disk is mounted. 
     * @return SelectiveConfServices Name list of services that can be configured when a new disk is mounted.
     */
    public String [] getSelectiveConfServices() {
        return this.SelectiveConfServices;
    }

    /**
     * Set Name list of services that can be configured when a new disk is mounted.
     * @param SelectiveConfServices Name list of services that can be configured when a new disk is mounted.
     */
    public void setSelectiveConfServices(String [] SelectiveConfServices) {
        this.SelectiveConfServices = SelectiveConfServices;
    }

    /**
     * Get Disk billing type. Valid values: 1 (monthly subscription) and 3 (committed use). 
     * @return ChargeType Disk billing type. Valid values: 1 (monthly subscription) and 3 (committed use).
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Disk billing type. Valid values: 1 (monthly subscription) and 3 (committed use).
     * @param ChargeType Disk billing type. Valid values: 1 (monthly subscription) and 3 (committed use).
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Disk committed use and purchase duration. Valid values: 12, 24, 36, 48, and 60. 
     * @return UnderWriteDuration Disk committed use and purchase duration. Valid values: 12, 24, 36, 48, and 60.
     */
    public Long getUnderWriteDuration() {
        return this.UnderWriteDuration;
    }

    /**
     * Set Disk committed use and purchase duration. Valid values: 12, 24, 36, 48, and 60.
     * @param UnderWriteDuration Disk committed use and purchase duration. Valid values: 12, 24, 36, 48, and 60.
     */
    public void setUnderWriteDuration(Long UnderWriteDuration) {
        this.UnderWriteDuration = UnderWriteDuration;
    }

    public AttachDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachDisksRequest(AttachDisksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.AlignType != null) {
            this.AlignType = new String(source.AlignType);
        }
        if (source.CvmInstanceIds != null) {
            this.CvmInstanceIds = new String[source.CvmInstanceIds.length];
            for (int i = 0; i < source.CvmInstanceIds.length; i++) {
                this.CvmInstanceIds[i] = new String(source.CvmInstanceIds[i]);
            }
        }
        if (source.CreateDisk != null) {
            this.CreateDisk = new Boolean(source.CreateDisk);
        }
        if (source.DiskSpec != null) {
            this.DiskSpec = new NodeSpecDiskV2(source.DiskSpec);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.SelectiveConfServices != null) {
            this.SelectiveConfServices = new String[source.SelectiveConfServices.length];
            for (int i = 0; i < source.SelectiveConfServices.length; i++) {
                this.SelectiveConfServices[i] = new String(source.SelectiveConfServices[i]);
            }
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.UnderWriteDuration != null) {
            this.UnderWriteDuration = new Long(source.UnderWriteDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "AlignType", this.AlignType);
        this.setParamArraySimple(map, prefix + "CvmInstanceIds.", this.CvmInstanceIds);
        this.setParamSimple(map, prefix + "CreateDisk", this.CreateDisk);
        this.setParamObj(map, prefix + "DiskSpec.", this.DiskSpec);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamArraySimple(map, prefix + "SelectiveConfServices.", this.SelectiveConfServices);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "UnderWriteDuration", this.UnderWriteDuration);

    }
}

