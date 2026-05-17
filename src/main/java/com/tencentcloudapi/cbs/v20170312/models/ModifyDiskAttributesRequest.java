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

public class ModifyDiskAttributesRequest extends AbstractModel {

    /**
    * One or more cloud disk ids to be operated, which can be queried through the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. if multiple cloud disk ids are passed in, only modifying all cloud disks to the same attribute is supported.

    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Name of new cloud disk.
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * Whether it is an elastic cloud disk. FALSE: non-elastic cloud disk; TRUE: elastic cloud disk. You can only modify non-elastic cloud disks to elastic cloud disks.
    */
    @SerializedName("Portable")
    @Expose
    private Boolean Portable;

    /**
    * The new project ID of the cloud disk. Only the project ID of elastic cloud disk can be modified. The available projects and their IDs can be queried via the API [DescribeProject](https://www.tencentcloud.com/document/api/651/54679).
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Whether the cloud disk is terminated with the CVM after it has been successfully mounted. `TRUE` indicates that it is terminated with the CVM. `FALSE` indicates that it is not terminated with the CVM. This is only supported for cloud disks and data disks that are pay-as-you-go.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * When changing the CLOUD disk type, you can input this parameter to indicate the target type. valid values:<br><li>CLOUD_PREMIUM: refers to high-performance CLOUD block storage</li><li>CLOUD_SSD: refers to SSD CLOUD disk.</li>batch type change is not supported. when inputting DiskType, DiskIds only supports entering one CLOUD disk id.<br>changing the CLOUD disk type does not support changing other attributes at the same time.
For details, see [adjust cloud disk type](https://www.tencentcloud.com/document/product/362/32540?from_cn_redirect=1).
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Enable/Disable cloud disk performance burst feature. valid values:. 
CREATE: enable.
Specifies to CANCEL and close.
    */
    @SerializedName("BurstPerformanceOperation")
    @Expose
    private String BurstPerformanceOperation;

    /**
     * Get One or more cloud disk ids to be operated, which can be queried through the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. if multiple cloud disk ids are passed in, only modifying all cloud disks to the same attribute is supported.
 
     * @return DiskIds One or more cloud disk ids to be operated, which can be queried through the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. if multiple cloud disk ids are passed in, only modifying all cloud disks to the same attribute is supported.

     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set One or more cloud disk ids to be operated, which can be queried through the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. if multiple cloud disk ids are passed in, only modifying all cloud disks to the same attribute is supported.

     * @param DiskIds One or more cloud disk ids to be operated, which can be queried through the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. if multiple cloud disk ids are passed in, only modifying all cloud disks to the same attribute is supported.

     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Name of new cloud disk. 
     * @return DiskName Name of new cloud disk.
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set Name of new cloud disk.
     * @param DiskName Name of new cloud disk.
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get Whether it is an elastic cloud disk. FALSE: non-elastic cloud disk; TRUE: elastic cloud disk. You can only modify non-elastic cloud disks to elastic cloud disks. 
     * @return Portable Whether it is an elastic cloud disk. FALSE: non-elastic cloud disk; TRUE: elastic cloud disk. You can only modify non-elastic cloud disks to elastic cloud disks.
     */
    public Boolean getPortable() {
        return this.Portable;
    }

    /**
     * Set Whether it is an elastic cloud disk. FALSE: non-elastic cloud disk; TRUE: elastic cloud disk. You can only modify non-elastic cloud disks to elastic cloud disks.
     * @param Portable Whether it is an elastic cloud disk. FALSE: non-elastic cloud disk; TRUE: elastic cloud disk. You can only modify non-elastic cloud disks to elastic cloud disks.
     */
    public void setPortable(Boolean Portable) {
        this.Portable = Portable;
    }

    /**
     * Get The new project ID of the cloud disk. Only the project ID of elastic cloud disk can be modified. The available projects and their IDs can be queried via the API [DescribeProject](https://www.tencentcloud.com/document/api/651/54679). 
     * @return ProjectId The new project ID of the cloud disk. Only the project ID of elastic cloud disk can be modified. The available projects and their IDs can be queried via the API [DescribeProject](https://www.tencentcloud.com/document/api/651/54679).
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set The new project ID of the cloud disk. Only the project ID of elastic cloud disk can be modified. The available projects and their IDs can be queried via the API [DescribeProject](https://www.tencentcloud.com/document/api/651/54679).
     * @param ProjectId The new project ID of the cloud disk. Only the project ID of elastic cloud disk can be modified. The available projects and their IDs can be queried via the API [DescribeProject](https://www.tencentcloud.com/document/api/651/54679).
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Whether the cloud disk is terminated with the CVM after it has been successfully mounted. `TRUE` indicates that it is terminated with the CVM. `FALSE` indicates that it is not terminated with the CVM. This is only supported for cloud disks and data disks that are pay-as-you-go. 
     * @return DeleteWithInstance Whether the cloud disk is terminated with the CVM after it has been successfully mounted. `TRUE` indicates that it is terminated with the CVM. `FALSE` indicates that it is not terminated with the CVM. This is only supported for cloud disks and data disks that are pay-as-you-go.
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Whether the cloud disk is terminated with the CVM after it has been successfully mounted. `TRUE` indicates that it is terminated with the CVM. `FALSE` indicates that it is not terminated with the CVM. This is only supported for cloud disks and data disks that are pay-as-you-go.
     * @param DeleteWithInstance Whether the cloud disk is terminated with the CVM after it has been successfully mounted. `TRUE` indicates that it is terminated with the CVM. `FALSE` indicates that it is not terminated with the CVM. This is only supported for cloud disks and data disks that are pay-as-you-go.
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get When changing the CLOUD disk type, you can input this parameter to indicate the target type. valid values:<br><li>CLOUD_PREMIUM: refers to high-performance CLOUD block storage</li><li>CLOUD_SSD: refers to SSD CLOUD disk.</li>batch type change is not supported. when inputting DiskType, DiskIds only supports entering one CLOUD disk id.<br>changing the CLOUD disk type does not support changing other attributes at the same time.
For details, see [adjust cloud disk type](https://www.tencentcloud.com/document/product/362/32540?from_cn_redirect=1). 
     * @return DiskType When changing the CLOUD disk type, you can input this parameter to indicate the target type. valid values:<br><li>CLOUD_PREMIUM: refers to high-performance CLOUD block storage</li><li>CLOUD_SSD: refers to SSD CLOUD disk.</li>batch type change is not supported. when inputting DiskType, DiskIds only supports entering one CLOUD disk id.<br>changing the CLOUD disk type does not support changing other attributes at the same time.
For details, see [adjust cloud disk type](https://www.tencentcloud.com/document/product/362/32540?from_cn_redirect=1).
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set When changing the CLOUD disk type, you can input this parameter to indicate the target type. valid values:<br><li>CLOUD_PREMIUM: refers to high-performance CLOUD block storage</li><li>CLOUD_SSD: refers to SSD CLOUD disk.</li>batch type change is not supported. when inputting DiskType, DiskIds only supports entering one CLOUD disk id.<br>changing the CLOUD disk type does not support changing other attributes at the same time.
For details, see [adjust cloud disk type](https://www.tencentcloud.com/document/product/362/32540?from_cn_redirect=1).
     * @param DiskType When changing the CLOUD disk type, you can input this parameter to indicate the target type. valid values:<br><li>CLOUD_PREMIUM: refers to high-performance CLOUD block storage</li><li>CLOUD_SSD: refers to SSD CLOUD disk.</li>batch type change is not supported. when inputting DiskType, DiskIds only supports entering one CLOUD disk id.<br>changing the CLOUD disk type does not support changing other attributes at the same time.
For details, see [adjust cloud disk type](https://www.tencentcloud.com/document/product/362/32540?from_cn_redirect=1).
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Enable/Disable cloud disk performance burst feature. valid values:. 
CREATE: enable.
Specifies to CANCEL and close. 
     * @return BurstPerformanceOperation Enable/Disable cloud disk performance burst feature. valid values:. 
CREATE: enable.
Specifies to CANCEL and close.
     */
    public String getBurstPerformanceOperation() {
        return this.BurstPerformanceOperation;
    }

    /**
     * Set Enable/Disable cloud disk performance burst feature. valid values:. 
CREATE: enable.
Specifies to CANCEL and close.
     * @param BurstPerformanceOperation Enable/Disable cloud disk performance burst feature. valid values:. 
CREATE: enable.
Specifies to CANCEL and close.
     */
    public void setBurstPerformanceOperation(String BurstPerformanceOperation) {
        this.BurstPerformanceOperation = BurstPerformanceOperation;
    }

    public ModifyDiskAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDiskAttributesRequest(ModifyDiskAttributesRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.Portable != null) {
            this.Portable = new Boolean(source.Portable);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.BurstPerformanceOperation != null) {
            this.BurstPerformanceOperation = new String(source.BurstPerformanceOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "Portable", this.Portable);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "BurstPerformanceOperation", this.BurstPerformanceOperation);

    }
}

