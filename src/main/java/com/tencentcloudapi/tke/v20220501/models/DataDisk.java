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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataDisk extends AbstractModel {

    /**
    * Cloud disk type
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * File system (ext3/ext4/xfs).

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("FileSystem")
    @Expose
    private String FileSystem;

    /**
    * Cloud disk size (GB)

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Whether to automatically format and mount disks.

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("AutoFormatAndMount")
    @Expose
    private Boolean AutoFormatAndMount;

    /**
    * Mount device name or partition name
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DiskPartition")
    @Expose
    private String DiskPartition;

    /**
    * Mounting directory

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("MountTarget")
    @Expose
    private String MountTarget;

    /**
    * This parameter is used to create an encrypted cloud disk, with the value fixed as ENCRYPT.
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Encrypt")
    @Expose
    private String Encrypt;

    /**
    * Custom key for purchasing encrypted disks. When this parameter is input, the Encrypt input parameter cannot be left empty.
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * Snapshot ID. If it is input, a cloud disk will be created based on this snapshot. The snapshot must be a data disk snapshot.
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Cloud disk performance (unit: MB/s), which can be used to purchase additional performance for cloud disks.
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
     * Get Cloud disk type
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DiskType Cloud disk type
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Cloud disk type
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DiskType Cloud disk type
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get File system (ext3/ext4/xfs).

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return FileSystem File system (ext3/ext4/xfs).

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getFileSystem() {
        return this.FileSystem;
    }

    /**
     * Set File system (ext3/ext4/xfs).

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param FileSystem File system (ext3/ext4/xfs).

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setFileSystem(String FileSystem) {
        this.FileSystem = FileSystem;
    }

    /**
     * Get Cloud disk size (GB)

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DiskSize Cloud disk size (GB)

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Cloud disk size (GB)

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DiskSize Cloud disk size (GB)

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Whether to automatically format and mount disks.

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return AutoFormatAndMount Whether to automatically format and mount disks.

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Boolean getAutoFormatAndMount() {
        return this.AutoFormatAndMount;
    }

    /**
     * Set Whether to automatically format and mount disks.

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param AutoFormatAndMount Whether to automatically format and mount disks.

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setAutoFormatAndMount(Boolean AutoFormatAndMount) {
        this.AutoFormatAndMount = AutoFormatAndMount;
    }

    /**
     * Get Mount device name or partition name
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DiskPartition Mount device name or partition name
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getDiskPartition() {
        return this.DiskPartition;
    }

    /**
     * Set Mount device name or partition name
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DiskPartition Mount device name or partition name
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDiskPartition(String DiskPartition) {
        this.DiskPartition = DiskPartition;
    }

    /**
     * Get Mounting directory

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return MountTarget Mounting directory

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getMountTarget() {
        return this.MountTarget;
    }

    /**
     * Set Mounting directory

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param MountTarget Mounting directory

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMountTarget(String MountTarget) {
        this.MountTarget = MountTarget;
    }

    /**
     * Get This parameter is used to create an encrypted cloud disk, with the value fixed as ENCRYPT.
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Encrypt This parameter is used to create an encrypted cloud disk, with the value fixed as ENCRYPT.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set This parameter is used to create an encrypted cloud disk, with the value fixed as ENCRYPT.
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Encrypt This parameter is used to create an encrypted cloud disk, with the value fixed as ENCRYPT.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setEncrypt(String Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get Custom key for purchasing encrypted disks. When this parameter is input, the Encrypt input parameter cannot be left empty.
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return KmsKeyId Custom key for purchasing encrypted disks. When this parameter is input, the Encrypt input parameter cannot be left empty.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set Custom key for purchasing encrypted disks. When this parameter is input, the Encrypt input parameter cannot be left empty.
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param KmsKeyId Custom key for purchasing encrypted disks. When this parameter is input, the Encrypt input parameter cannot be left empty.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get Snapshot ID. If it is input, a cloud disk will be created based on this snapshot. The snapshot must be a data disk snapshot.
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return SnapshotId Snapshot ID. If it is input, a cloud disk will be created based on this snapshot. The snapshot must be a data disk snapshot.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID. If it is input, a cloud disk will be created based on this snapshot. The snapshot must be a data disk snapshot.
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param SnapshotId Snapshot ID. If it is input, a cloud disk will be created based on this snapshot. The snapshot must be a data disk snapshot.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Cloud disk performance (unit: MB/s), which can be used to purchase additional performance for cloud disks.
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return ThroughputPerformance Cloud disk performance (unit: MB/s), which can be used to purchase additional performance for cloud disks.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set Cloud disk performance (unit: MB/s), which can be used to purchase additional performance for cloud disks.
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param ThroughputPerformance Cloud disk performance (unit: MB/s), which can be used to purchase additional performance for cloud disks.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    public DataDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataDisk(DataDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.FileSystem != null) {
            this.FileSystem = new String(source.FileSystem);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.AutoFormatAndMount != null) {
            this.AutoFormatAndMount = new Boolean(source.AutoFormatAndMount);
        }
        if (source.DiskPartition != null) {
            this.DiskPartition = new String(source.DiskPartition);
        }
        if (source.MountTarget != null) {
            this.MountTarget = new String(source.MountTarget);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new String(source.Encrypt);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "FileSystem", this.FileSystem);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "AutoFormatAndMount", this.AutoFormatAndMount);
        this.setParamSimple(map, prefix + "DiskPartition", this.DiskPartition);
        this.setParamSimple(map, prefix + "MountTarget", this.MountTarget);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);

    }
}

