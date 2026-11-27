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
    * <p>Migration task name.</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>Migration mode flag. Default value: 0. 0: Bucket migration; 1: Inventory migration.</p>
    */
    @SerializedName("MigrationType")
    @Expose
    private Long MigrationType;

    /**
    * <p>Migration mode. Default value: 0. 0: Full migration.</p>
    */
    @SerializedName("MigrationMode")
    @Expose
    private Long MigrationMode;

    /**
    * <p>SecretId of the data source account.</p>
    */
    @SerializedName("SrcSecretId")
    @Expose
    private String SrcSecretId;

    /**
    * <p>SecretKey of the data source account.</p>
    */
    @SerializedName("SrcSecretKey")
    @Expose
    private String SrcSecretKey;

    /**
    * <p>File system instance ID, which can be obtained through <a href="https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1">DescribeCfsFileSystems</a>.</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>Directory path in the file system. It does not involve the actual mounted subdirectory or root directory, and does not need to be prefixed with /cfs/.</p>
    */
    @SerializedName("FsPath")
    @Expose
    private String FsPath;

    /**
    * <p>Overwrite policy for files with the same name during migration. Default value: 0. 0: The file with the latest modification time takes precedence; 1: Full overwrite; 2: No overwrite.</p>
    */
    @SerializedName("CoverType")
    @Expose
    private Long CoverType;

    /**
    * <p>Data source service provider.</p><p>Valid values:</p><ul><li>COS: Tencent Cloud COS</li><li>OSS: Alibaba Cloud OSS</li><li>OBS: Huawei Cloud OBS</li><li>BOS: Baidu Cloud BOS</li><li>TOS: Volcano Engine TOS</li></ul>
    */
    @SerializedName("SrcService")
    @Expose
    private String SrcService;

    /**
    * <p>Name of the data source bucket. For bucket migration, either BucketName or BucketAddress is required. For inventory migration, this parameter is not required.</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>Region of the data source bucket.</p>
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * <p>Address of the data source bucket. For bucket migration, either BucketName or BucketAddress is required. For inventory migration, this parameter is not required.</p>
    */
    @SerializedName("BucketAddress")
    @Expose
    private String BucketAddress;

    /**
    * <p>Inventory address. Required when the migration mode is inventory migration.</p>
    */
    @SerializedName("ListAddress")
    @Expose
    private String ListAddress;

    /**
    * <p>Name of the destination file system.</p>
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * <p>Source bucket path. Default value: /.</p>
    */
    @SerializedName("BucketPath")
    @Expose
    private String BucketPath;

    /**
    * <p>Migration direction. 0: Migrate from object storage to file system. 1: Migrate from file system to object storage. Default value: 0.</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get <p>Migration task name.</p> 
     * @return TaskName <p>Migration task name.</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>Migration task name.</p>
     * @param TaskName <p>Migration task name.</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>Migration mode flag. Default value: 0. 0: Bucket migration; 1: Inventory migration.</p> 
     * @return MigrationType <p>Migration mode flag. Default value: 0. 0: Bucket migration; 1: Inventory migration.</p>
     */
    public Long getMigrationType() {
        return this.MigrationType;
    }

    /**
     * Set <p>Migration mode flag. Default value: 0. 0: Bucket migration; 1: Inventory migration.</p>
     * @param MigrationType <p>Migration mode flag. Default value: 0. 0: Bucket migration; 1: Inventory migration.</p>
     */
    public void setMigrationType(Long MigrationType) {
        this.MigrationType = MigrationType;
    }

    /**
     * Get <p>Migration mode. Default value: 0. 0: Full migration.</p> 
     * @return MigrationMode <p>Migration mode. Default value: 0. 0: Full migration.</p>
     */
    public Long getMigrationMode() {
        return this.MigrationMode;
    }

    /**
     * Set <p>Migration mode. Default value: 0. 0: Full migration.</p>
     * @param MigrationMode <p>Migration mode. Default value: 0. 0: Full migration.</p>
     */
    public void setMigrationMode(Long MigrationMode) {
        this.MigrationMode = MigrationMode;
    }

    /**
     * Get <p>SecretId of the data source account.</p> 
     * @return SrcSecretId <p>SecretId of the data source account.</p>
     */
    public String getSrcSecretId() {
        return this.SrcSecretId;
    }

    /**
     * Set <p>SecretId of the data source account.</p>
     * @param SrcSecretId <p>SecretId of the data source account.</p>
     */
    public void setSrcSecretId(String SrcSecretId) {
        this.SrcSecretId = SrcSecretId;
    }

    /**
     * Get <p>SecretKey of the data source account.</p> 
     * @return SrcSecretKey <p>SecretKey of the data source account.</p>
     */
    public String getSrcSecretKey() {
        return this.SrcSecretKey;
    }

    /**
     * Set <p>SecretKey of the data source account.</p>
     * @param SrcSecretKey <p>SecretKey of the data source account.</p>
     */
    public void setSrcSecretKey(String SrcSecretKey) {
        this.SrcSecretKey = SrcSecretKey;
    }

    /**
     * Get <p>File system instance ID, which can be obtained through <a href="https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1">DescribeCfsFileSystems</a>.</p> 
     * @return FileSystemId <p>File system instance ID, which can be obtained through <a href="https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1">DescribeCfsFileSystems</a>.</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>File system instance ID, which can be obtained through <a href="https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1">DescribeCfsFileSystems</a>.</p>
     * @param FileSystemId <p>File system instance ID, which can be obtained through <a href="https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1">DescribeCfsFileSystems</a>.</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>Directory path in the file system. It does not involve the actual mounted subdirectory or root directory, and does not need to be prefixed with /cfs/.</p> 
     * @return FsPath <p>Directory path in the file system. It does not involve the actual mounted subdirectory or root directory, and does not need to be prefixed with /cfs/.</p>
     */
    public String getFsPath() {
        return this.FsPath;
    }

    /**
     * Set <p>Directory path in the file system. It does not involve the actual mounted subdirectory or root directory, and does not need to be prefixed with /cfs/.</p>
     * @param FsPath <p>Directory path in the file system. It does not involve the actual mounted subdirectory or root directory, and does not need to be prefixed with /cfs/.</p>
     */
    public void setFsPath(String FsPath) {
        this.FsPath = FsPath;
    }

    /**
     * Get <p>Overwrite policy for files with the same name during migration. Default value: 0. 0: The file with the latest modification time takes precedence; 1: Full overwrite; 2: No overwrite.</p> 
     * @return CoverType <p>Overwrite policy for files with the same name during migration. Default value: 0. 0: The file with the latest modification time takes precedence; 1: Full overwrite; 2: No overwrite.</p>
     */
    public Long getCoverType() {
        return this.CoverType;
    }

    /**
     * Set <p>Overwrite policy for files with the same name during migration. Default value: 0. 0: The file with the latest modification time takes precedence; 1: Full overwrite; 2: No overwrite.</p>
     * @param CoverType <p>Overwrite policy for files with the same name during migration. Default value: 0. 0: The file with the latest modification time takes precedence; 1: Full overwrite; 2: No overwrite.</p>
     */
    public void setCoverType(Long CoverType) {
        this.CoverType = CoverType;
    }

    /**
     * Get <p>Data source service provider.</p><p>Valid values:</p><ul><li>COS: Tencent Cloud COS</li><li>OSS: Alibaba Cloud OSS</li><li>OBS: Huawei Cloud OBS</li><li>BOS: Baidu Cloud BOS</li><li>TOS: Volcano Engine TOS</li></ul> 
     * @return SrcService <p>Data source service provider.</p><p>Valid values:</p><ul><li>COS: Tencent Cloud COS</li><li>OSS: Alibaba Cloud OSS</li><li>OBS: Huawei Cloud OBS</li><li>BOS: Baidu Cloud BOS</li><li>TOS: Volcano Engine TOS</li></ul>
     */
    public String getSrcService() {
        return this.SrcService;
    }

    /**
     * Set <p>Data source service provider.</p><p>Valid values:</p><ul><li>COS: Tencent Cloud COS</li><li>OSS: Alibaba Cloud OSS</li><li>OBS: Huawei Cloud OBS</li><li>BOS: Baidu Cloud BOS</li><li>TOS: Volcano Engine TOS</li></ul>
     * @param SrcService <p>Data source service provider.</p><p>Valid values:</p><ul><li>COS: Tencent Cloud COS</li><li>OSS: Alibaba Cloud OSS</li><li>OBS: Huawei Cloud OBS</li><li>BOS: Baidu Cloud BOS</li><li>TOS: Volcano Engine TOS</li></ul>
     */
    public void setSrcService(String SrcService) {
        this.SrcService = SrcService;
    }

    /**
     * Get <p>Name of the data source bucket. For bucket migration, either BucketName or BucketAddress is required. For inventory migration, this parameter is not required.</p> 
     * @return BucketName <p>Name of the data source bucket. For bucket migration, either BucketName or BucketAddress is required. For inventory migration, this parameter is not required.</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>Name of the data source bucket. For bucket migration, either BucketName or BucketAddress is required. For inventory migration, this parameter is not required.</p>
     * @param BucketName <p>Name of the data source bucket. For bucket migration, either BucketName or BucketAddress is required. For inventory migration, this parameter is not required.</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>Region of the data source bucket.</p> 
     * @return BucketRegion <p>Region of the data source bucket.</p>
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set <p>Region of the data source bucket.</p>
     * @param BucketRegion <p>Region of the data source bucket.</p>
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get <p>Address of the data source bucket. For bucket migration, either BucketName or BucketAddress is required. For inventory migration, this parameter is not required.</p> 
     * @return BucketAddress <p>Address of the data source bucket. For bucket migration, either BucketName or BucketAddress is required. For inventory migration, this parameter is not required.</p>
     */
    public String getBucketAddress() {
        return this.BucketAddress;
    }

    /**
     * Set <p>Address of the data source bucket. For bucket migration, either BucketName or BucketAddress is required. For inventory migration, this parameter is not required.</p>
     * @param BucketAddress <p>Address of the data source bucket. For bucket migration, either BucketName or BucketAddress is required. For inventory migration, this parameter is not required.</p>
     */
    public void setBucketAddress(String BucketAddress) {
        this.BucketAddress = BucketAddress;
    }

    /**
     * Get <p>Inventory address. Required when the migration mode is inventory migration.</p> 
     * @return ListAddress <p>Inventory address. Required when the migration mode is inventory migration.</p>
     */
    public String getListAddress() {
        return this.ListAddress;
    }

    /**
     * Set <p>Inventory address. Required when the migration mode is inventory migration.</p>
     * @param ListAddress <p>Inventory address. Required when the migration mode is inventory migration.</p>
     */
    public void setListAddress(String ListAddress) {
        this.ListAddress = ListAddress;
    }

    /**
     * Get <p>Name of the destination file system.</p> 
     * @return FsName <p>Name of the destination file system.</p>
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set <p>Name of the destination file system.</p>
     * @param FsName <p>Name of the destination file system.</p>
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get <p>Source bucket path. Default value: /.</p> 
     * @return BucketPath <p>Source bucket path. Default value: /.</p>
     */
    public String getBucketPath() {
        return this.BucketPath;
    }

    /**
     * Set <p>Source bucket path. Default value: /.</p>
     * @param BucketPath <p>Source bucket path. Default value: /.</p>
     */
    public void setBucketPath(String BucketPath) {
        this.BucketPath = BucketPath;
    }

    /**
     * Get <p>Migration direction. 0: Migrate from object storage to file system. 1: Migrate from file system to object storage. Default value: 0.</p> 
     * @return Direction <p>Migration direction. 0: Migrate from object storage to file system. 1: Migrate from file system to object storage. Default value: 0.</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>Migration direction. 0: Migrate from object storage to file system. 1: Migrate from file system to object storage. Default value: 0.</p>
     * @param Direction <p>Migration direction. 0: Migrate from object storage to file system. 1: Migrate from file system to object storage. Default value: 0.</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
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
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
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
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

