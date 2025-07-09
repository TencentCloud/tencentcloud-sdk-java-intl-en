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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportImagesRequest extends AbstractModel {

    /**
    * COS bucket name
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * List of image IDs
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * Format of the exported image file. Valid values: `RAW`, `QCOW2`, `VHD` and `VMDK`. Default value: `RAW`.
    */
    @SerializedName("ExportFormat")
    @Expose
    private String ExportFormat;

    /**
    * Prefix list of the name of exported files
    */
    @SerializedName("FileNamePrefixList")
    @Expose
    private String [] FileNamePrefixList;

    /**
    * Whether to export only the system disk
    */
    @SerializedName("OnlyExportRootDisk")
    @Expose
    private Boolean OnlyExportRootDisk;

    /**
    * Check whether the image can be exported
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Role name (Default: `CVM_QcsRole`). Before exporting the images, make sure the role exists, and it has write permission to COS.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get COS bucket name 
     * @return BucketName COS bucket name
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set COS bucket name
     * @param BucketName COS bucket name
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get List of image IDs 
     * @return ImageIds List of image IDs
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set List of image IDs
     * @param ImageIds List of image IDs
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get Format of the exported image file. Valid values: `RAW`, `QCOW2`, `VHD` and `VMDK`. Default value: `RAW`. 
     * @return ExportFormat Format of the exported image file. Valid values: `RAW`, `QCOW2`, `VHD` and `VMDK`. Default value: `RAW`.
     */
    public String getExportFormat() {
        return this.ExportFormat;
    }

    /**
     * Set Format of the exported image file. Valid values: `RAW`, `QCOW2`, `VHD` and `VMDK`. Default value: `RAW`.
     * @param ExportFormat Format of the exported image file. Valid values: `RAW`, `QCOW2`, `VHD` and `VMDK`. Default value: `RAW`.
     */
    public void setExportFormat(String ExportFormat) {
        this.ExportFormat = ExportFormat;
    }

    /**
     * Get Prefix list of the name of exported files 
     * @return FileNamePrefixList Prefix list of the name of exported files
     */
    public String [] getFileNamePrefixList() {
        return this.FileNamePrefixList;
    }

    /**
     * Set Prefix list of the name of exported files
     * @param FileNamePrefixList Prefix list of the name of exported files
     */
    public void setFileNamePrefixList(String [] FileNamePrefixList) {
        this.FileNamePrefixList = FileNamePrefixList;
    }

    /**
     * Get Whether to export only the system disk 
     * @return OnlyExportRootDisk Whether to export only the system disk
     */
    public Boolean getOnlyExportRootDisk() {
        return this.OnlyExportRootDisk;
    }

    /**
     * Set Whether to export only the system disk
     * @param OnlyExportRootDisk Whether to export only the system disk
     */
    public void setOnlyExportRootDisk(Boolean OnlyExportRootDisk) {
        this.OnlyExportRootDisk = OnlyExportRootDisk;
    }

    /**
     * Get Check whether the image can be exported 
     * @return DryRun Check whether the image can be exported
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Check whether the image can be exported
     * @param DryRun Check whether the image can be exported
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Role name (Default: `CVM_QcsRole`). Before exporting the images, make sure the role exists, and it has write permission to COS. 
     * @return RoleName Role name (Default: `CVM_QcsRole`). Before exporting the images, make sure the role exists, and it has write permission to COS.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name (Default: `CVM_QcsRole`). Before exporting the images, make sure the role exists, and it has write permission to COS.
     * @param RoleName Role name (Default: `CVM_QcsRole`). Before exporting the images, make sure the role exists, and it has write permission to COS.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public ExportImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportImagesRequest(ExportImagesRequest source) {
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.ExportFormat != null) {
            this.ExportFormat = new String(source.ExportFormat);
        }
        if (source.FileNamePrefixList != null) {
            this.FileNamePrefixList = new String[source.FileNamePrefixList.length];
            for (int i = 0; i < source.FileNamePrefixList.length; i++) {
                this.FileNamePrefixList[i] = new String(source.FileNamePrefixList[i]);
            }
        }
        if (source.OnlyExportRootDisk != null) {
            this.OnlyExportRootDisk = new Boolean(source.OnlyExportRootDisk);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "ExportFormat", this.ExportFormat);
        this.setParamArraySimple(map, prefix + "FileNamePrefixList.", this.FileNamePrefixList);
        this.setParamSimple(map, prefix + "OnlyExportRootDisk", this.OnlyExportRootDisk);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

