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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMigrationTaskRequest extends AbstractModel {

    /**
    * Migration task name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Migration type. Valid values: `0` (bucket) and `1` (list). Default value: `0`.
    */
    @SerializedName("MigrationType")
    @Expose
    private Long MigrationType;

    /**
    * Migration mode. Default value: `0` (full migration).
    */
    @SerializedName("MigrationMode")
    @Expose
    private Long MigrationMode;

    /**
    * SecretId of the data source account
    */
    @SerializedName("SrcSecretId")
    @Expose
    private String SrcSecretId;

    /**
    * SecretKey of the data source account
    */
    @SerializedName("SrcSecretKey")
    @Expose
    private String SrcSecretKey;

    /**
    * File system instance ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * File system path
    */
    @SerializedName("FsPath")
    @Expose
    private String FsPath;

    /**
    * Overwrite policy for files with the same name. Valid values: `0` (retain the file with the latest modified time), `1` (overwrite); and `2` (not overwrite). Default value: `0`.
    */
    @SerializedName("CoverType")
    @Expose
    private Long CoverType;

    /**
    * Data source service provider. Valid values: `COS` (Tencent Cloud COS), `OSS` (Alibaba Cloud OSS), and `OBS` (Huawei Cloud OBS).
    */
    @SerializedName("SrcService")
    @Expose
    private String SrcService;

    /**
    * Data source bucket name. Specify at least one of the bucket name or address.
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Data source bucket region
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * Data source bucket address. Specify at least one of the bucket name or address.
    */
    @SerializedName("BucketAddress")
    @Expose
    private String BucketAddress;

    /**
    * List address. This parameter is required if `MigrationType` is set to `1` (list).
    */
    @SerializedName("ListAddress")
    @Expose
    private String ListAddress;

    /**
    * Target file system name
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * Source bucket path, which defaults to `/`
    */
    @SerializedName("BucketPath")
    @Expose
    private String BucketPath;

    /**
     * Get Migration task name 
     * @return TaskName Migration task name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Migration task name
     * @param TaskName Migration task name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Migration type. Valid values: `0` (bucket) and `1` (list). Default value: `0`. 
     * @return MigrationType Migration type. Valid values: `0` (bucket) and `1` (list). Default value: `0`.
     */
    public Long getMigrationType() {
        return this.MigrationType;
    }

    /**
     * Set Migration type. Valid values: `0` (bucket) and `1` (list). Default value: `0`.
     * @param MigrationType Migration type. Valid values: `0` (bucket) and `1` (list). Default value: `0`.
     */
    public void setMigrationType(Long MigrationType) {
        this.MigrationType = MigrationType;
    }

    /**
     * Get Migration mode. Default value: `0` (full migration). 
     * @return MigrationMode Migration mode. Default value: `0` (full migration).
     */
    public Long getMigrationMode() {
        return this.MigrationMode;
    }

    /**
     * Set Migration mode. Default value: `0` (full migration).
     * @param MigrationMode Migration mode. Default value: `0` (full migration).
     */
    public void setMigrationMode(Long MigrationMode) {
        this.MigrationMode = MigrationMode;
    }

    /**
     * Get SecretId of the data source account 
     * @return SrcSecretId SecretId of the data source account
     */
    public String getSrcSecretId() {
        return this.SrcSecretId;
    }

    /**
     * Set SecretId of the data source account
     * @param SrcSecretId SecretId of the data source account
     */
    public void setSrcSecretId(String SrcSecretId) {
        this.SrcSecretId = SrcSecretId;
    }

    /**
     * Get SecretKey of the data source account 
     * @return SrcSecretKey SecretKey of the data source account
     */
    public String getSrcSecretKey() {
        return this.SrcSecretKey;
    }

    /**
     * Set SecretKey of the data source account
     * @param SrcSecretKey SecretKey of the data source account
     */
    public void setSrcSecretKey(String SrcSecretKey) {
        this.SrcSecretKey = SrcSecretKey;
    }

    /**
     * Get File system instance ID 
     * @return FileSystemId File system instance ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system instance ID
     * @param FileSystemId File system instance ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get File system path 
     * @return FsPath File system path
     */
    public String getFsPath() {
        return this.FsPath;
    }

    /**
     * Set File system path
     * @param FsPath File system path
     */
    public void setFsPath(String FsPath) {
        this.FsPath = FsPath;
    }

    /**
     * Get Overwrite policy for files with the same name. Valid values: `0` (retain the file with the latest modified time), `1` (overwrite); and `2` (not overwrite). Default value: `0`. 
     * @return CoverType Overwrite policy for files with the same name. Valid values: `0` (retain the file with the latest modified time), `1` (overwrite); and `2` (not overwrite). Default value: `0`.
     */
    public Long getCoverType() {
        return this.CoverType;
    }

    /**
     * Set Overwrite policy for files with the same name. Valid values: `0` (retain the file with the latest modified time), `1` (overwrite); and `2` (not overwrite). Default value: `0`.
     * @param CoverType Overwrite policy for files with the same name. Valid values: `0` (retain the file with the latest modified time), `1` (overwrite); and `2` (not overwrite). Default value: `0`.
     */
    public void setCoverType(Long CoverType) {
        this.CoverType = CoverType;
    }

    /**
     * Get Data source service provider. Valid values: `COS` (Tencent Cloud COS), `OSS` (Alibaba Cloud OSS), and `OBS` (Huawei Cloud OBS). 
     * @return SrcService Data source service provider. Valid values: `COS` (Tencent Cloud COS), `OSS` (Alibaba Cloud OSS), and `OBS` (Huawei Cloud OBS).
     */
    public String getSrcService() {
        return this.SrcService;
    }

    /**
     * Set Data source service provider. Valid values: `COS` (Tencent Cloud COS), `OSS` (Alibaba Cloud OSS), and `OBS` (Huawei Cloud OBS).
     * @param SrcService Data source service provider. Valid values: `COS` (Tencent Cloud COS), `OSS` (Alibaba Cloud OSS), and `OBS` (Huawei Cloud OBS).
     */
    public void setSrcService(String SrcService) {
        this.SrcService = SrcService;
    }

    /**
     * Get Data source bucket name. Specify at least one of the bucket name or address. 
     * @return BucketName Data source bucket name. Specify at least one of the bucket name or address.
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Data source bucket name. Specify at least one of the bucket name or address.
     * @param BucketName Data source bucket name. Specify at least one of the bucket name or address.
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Data source bucket region 
     * @return BucketRegion Data source bucket region
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set Data source bucket region
     * @param BucketRegion Data source bucket region
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get Data source bucket address. Specify at least one of the bucket name or address. 
     * @return BucketAddress Data source bucket address. Specify at least one of the bucket name or address.
     */
    public String getBucketAddress() {
        return this.BucketAddress;
    }

    /**
     * Set Data source bucket address. Specify at least one of the bucket name or address.
     * @param BucketAddress Data source bucket address. Specify at least one of the bucket name or address.
     */
    public void setBucketAddress(String BucketAddress) {
        this.BucketAddress = BucketAddress;
    }

    /**
     * Get List address. This parameter is required if `MigrationType` is set to `1` (list). 
     * @return ListAddress List address. This parameter is required if `MigrationType` is set to `1` (list).
     */
    public String getListAddress() {
        return this.ListAddress;
    }

    /**
     * Set List address. This parameter is required if `MigrationType` is set to `1` (list).
     * @param ListAddress List address. This parameter is required if `MigrationType` is set to `1` (list).
     */
    public void setListAddress(String ListAddress) {
        this.ListAddress = ListAddress;
    }

    /**
     * Get Target file system name 
     * @return FsName Target file system name
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set Target file system name
     * @param FsName Target file system name
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get Source bucket path, which defaults to `/` 
     * @return BucketPath Source bucket path, which defaults to `/`
     */
    public String getBucketPath() {
        return this.BucketPath;
    }

    /**
     * Set Source bucket path, which defaults to `/`
     * @param BucketPath Source bucket path, which defaults to `/`
     */
    public void setBucketPath(String BucketPath) {
        this.BucketPath = BucketPath;
    }

    public CreateMigrationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMigrationTaskRequest(CreateMigrationTaskRequest source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.MigrationType != null) {
            this.MigrationType = new Long(source.MigrationType);
        }
        if (source.MigrationMode != null) {
            this.MigrationMode = new Long(source.MigrationMode);
        }
        if (source.SrcSecretId != null) {
            this.SrcSecretId = new String(source.SrcSecretId);
        }
        if (source.SrcSecretKey != null) {
            this.SrcSecretKey = new String(source.SrcSecretKey);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FsPath != null) {
            this.FsPath = new String(source.FsPath);
        }
        if (source.CoverType != null) {
            this.CoverType = new Long(source.CoverType);
        }
        if (source.SrcService != null) {
            this.SrcService = new String(source.SrcService);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketAddress != null) {
            this.BucketAddress = new String(source.BucketAddress);
        }
        if (source.ListAddress != null) {
            this.ListAddress = new String(source.ListAddress);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.BucketPath != null) {
            this.BucketPath = new String(source.BucketPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "MigrationType", this.MigrationType);
        this.setParamSimple(map, prefix + "MigrationMode", this.MigrationMode);
        this.setParamSimple(map, prefix + "SrcSecretId", this.SrcSecretId);
        this.setParamSimple(map, prefix + "SrcSecretKey", this.SrcSecretKey);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "FsPath", this.FsPath);
        this.setParamSimple(map, prefix + "CoverType", this.CoverType);
        this.setParamSimple(map, prefix + "SrcService", this.SrcService);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketAddress", this.BucketAddress);
        this.setParamSimple(map, prefix + "ListAddress", this.ListAddress);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamSimple(map, prefix + "BucketPath", this.BucketPath);

    }
}

