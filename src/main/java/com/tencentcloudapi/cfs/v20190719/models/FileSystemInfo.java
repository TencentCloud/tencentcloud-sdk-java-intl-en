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

public class FileSystemInfo extends AbstractModel {

    /**
    * Creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Custom name
    */
    @SerializedName("CreationToken")
    @Expose
    private String CreationToken;

    /**
    * File system ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * File system status. Valid values:
- creating
- mounting
- create_failed
- available
- unserviced
- upgrading
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * Used capacity of the file system, in Byte.
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * File system space limit, in GiB.
    */
    @SerializedName("SizeLimit")
    @Expose
    private Long SizeLimit;

    /**
    * Region ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Region name
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * File system protocol type. Valid values: NFS, CIFS, and TURBO.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Storage type. HP: high-performance; SD: standard; TP: high-performance Turbo; TB: standard Turbo; THP: throughput.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Prepaid storage pack bound with the file system
    */
    @SerializedName("StorageResourcePkg")
    @Expose
    private String StorageResourcePkg;

    /**
    * Prepaid bandwidth pack bound to a file system (not supported currently)
    */
    @SerializedName("BandwidthResourcePkg")
    @Expose
    private String BandwidthResourcePkg;

    /**
    * Information of permission groups bound to a file system
    */
    @SerializedName("PGroup")
    @Expose
    private PGroup PGroup;

    /**
    * Custom name
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * Is the file system encrypted. true: encrypted. false: non-encrypted.
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
    * Key used for encryption, which can be the key ID or ARN
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * Application ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Upper limit of the file system throughput, in MiB/s. The upper limit is determined based on the current storage used of the file system, bound storage resource packages, and throughput resource packages.
    */
    @SerializedName("BandwidthLimit")
    @Expose
    private Float BandwidthLimit;

    /**
    * Snapshot policy associated with the file system.
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * File system processes snapshot status, snapping: in snapshot, normal: in normal status.
    */
    @SerializedName("SnapStatus")
    @Expose
    private String SnapStatus;

    /**
    * Upper limit of file system capacity.
Unit: GiB.
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * File system tag list
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Status of file system lifecycle management.
NotAvailable: unavailable.
Available.
    */
    @SerializedName("TieringState")
    @Expose
    private String TieringState;

    /**
    * Layered storage detail.
    */
    @SerializedName("TieringDetail")
    @Expose
    private TieringDetailInfo TieringDetail;

    /**
    * File system auto scale-out policy.
    */
    @SerializedName("AutoScaleUpRule")
    @Expose
    private AutoScaleUpRule AutoScaleUpRule;

    /**
    * File System Version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Additional performance info.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExstraPerformanceInfo")
    @Expose
    private ExstraPerformanceInfo [] ExstraPerformanceInfo;

    /**
    * basic: standard version metadata type.
enhanced: additional metadata type.
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
     * Get Creation time 
     * @return CreationTime Creation time
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Creation time
     * @param CreationTime Creation time
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Custom name 
     * @return CreationToken Custom name
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set Custom name
     * @param CreationToken Custom name
     */
    public void setCreationToken(String CreationToken) {
        this.CreationToken = CreationToken;
    }

    /**
     * Get File system ID 
     * @return FileSystemId File system ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID
     * @param FileSystemId File system ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get File system status. Valid values:
- creating
- mounting
- create_failed
- available
- unserviced
- upgrading 
     * @return LifeCycleState File system status. Valid values:
- creating
- mounting
- create_failed
- available
- unserviced
- upgrading
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set File system status. Valid values:
- creating
- mounting
- create_failed
- available
- unserviced
- upgrading
     * @param LifeCycleState File system status. Valid values:
- creating
- mounting
- create_failed
- available
- unserviced
- upgrading
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get Used capacity of the file system, in Byte. 
     * @return SizeByte Used capacity of the file system, in Byte.
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set Used capacity of the file system, in Byte.
     * @param SizeByte Used capacity of the file system, in Byte.
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get File system space limit, in GiB. 
     * @return SizeLimit File system space limit, in GiB.
     */
    public Long getSizeLimit() {
        return this.SizeLimit;
    }

    /**
     * Set File system space limit, in GiB.
     * @param SizeLimit File system space limit, in GiB.
     */
    public void setSizeLimit(Long SizeLimit) {
        this.SizeLimit = SizeLimit;
    }

    /**
     * Get Region ID 
     * @return ZoneId Region ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Region ID
     * @param ZoneId Region ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Region name 
     * @return Zone Region name
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region name
     * @param Zone Region name
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get File system protocol type. Valid values: NFS, CIFS, and TURBO. 
     * @return Protocol File system protocol type. Valid values: NFS, CIFS, and TURBO.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set File system protocol type. Valid values: NFS, CIFS, and TURBO.
     * @param Protocol File system protocol type. Valid values: NFS, CIFS, and TURBO.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Storage type. HP: high-performance; SD: standard; TP: high-performance Turbo; TB: standard Turbo; THP: throughput. 
     * @return StorageType Storage type. HP: high-performance; SD: standard; TP: high-performance Turbo; TB: standard Turbo; THP: throughput.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage type. HP: high-performance; SD: standard; TP: high-performance Turbo; TB: standard Turbo; THP: throughput.
     * @param StorageType Storage type. HP: high-performance; SD: standard; TP: high-performance Turbo; TB: standard Turbo; THP: throughput.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Prepaid storage pack bound with the file system 
     * @return StorageResourcePkg Prepaid storage pack bound with the file system
     */
    public String getStorageResourcePkg() {
        return this.StorageResourcePkg;
    }

    /**
     * Set Prepaid storage pack bound with the file system
     * @param StorageResourcePkg Prepaid storage pack bound with the file system
     */
    public void setStorageResourcePkg(String StorageResourcePkg) {
        this.StorageResourcePkg = StorageResourcePkg;
    }

    /**
     * Get Prepaid bandwidth pack bound to a file system (not supported currently) 
     * @return BandwidthResourcePkg Prepaid bandwidth pack bound to a file system (not supported currently)
     */
    public String getBandwidthResourcePkg() {
        return this.BandwidthResourcePkg;
    }

    /**
     * Set Prepaid bandwidth pack bound to a file system (not supported currently)
     * @param BandwidthResourcePkg Prepaid bandwidth pack bound to a file system (not supported currently)
     */
    public void setBandwidthResourcePkg(String BandwidthResourcePkg) {
        this.BandwidthResourcePkg = BandwidthResourcePkg;
    }

    /**
     * Get Information of permission groups bound to a file system 
     * @return PGroup Information of permission groups bound to a file system
     */
    public PGroup getPGroup() {
        return this.PGroup;
    }

    /**
     * Set Information of permission groups bound to a file system
     * @param PGroup Information of permission groups bound to a file system
     */
    public void setPGroup(PGroup PGroup) {
        this.PGroup = PGroup;
    }

    /**
     * Get Custom name 
     * @return FsName Custom name
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set Custom name
     * @param FsName Custom name
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get Is the file system encrypted. true: encrypted. false: non-encrypted. 
     * @return Encrypted Is the file system encrypted. true: encrypted. false: non-encrypted.
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set Is the file system encrypted. true: encrypted. false: non-encrypted.
     * @param Encrypted Is the file system encrypted. true: encrypted. false: non-encrypted.
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    /**
     * Get Key used for encryption, which can be the key ID or ARN 
     * @return KmsKeyId Key used for encryption, which can be the key ID or ARN
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set Key used for encryption, which can be the key ID or ARN
     * @param KmsKeyId Key used for encryption, which can be the key ID or ARN
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get Application ID 
     * @return AppId Application ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID
     * @param AppId Application ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Upper limit of the file system throughput, in MiB/s. The upper limit is determined based on the current storage used of the file system, bound storage resource packages, and throughput resource packages. 
     * @return BandwidthLimit Upper limit of the file system throughput, in MiB/s. The upper limit is determined based on the current storage used of the file system, bound storage resource packages, and throughput resource packages.
     */
    public Float getBandwidthLimit() {
        return this.BandwidthLimit;
    }

    /**
     * Set Upper limit of the file system throughput, in MiB/s. The upper limit is determined based on the current storage used of the file system, bound storage resource packages, and throughput resource packages.
     * @param BandwidthLimit Upper limit of the file system throughput, in MiB/s. The upper limit is determined based on the current storage used of the file system, bound storage resource packages, and throughput resource packages.
     */
    public void setBandwidthLimit(Float BandwidthLimit) {
        this.BandwidthLimit = BandwidthLimit;
    }

    /**
     * Get Snapshot policy associated with the file system. 
     * @return AutoSnapshotPolicyId Snapshot policy associated with the file system.
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set Snapshot policy associated with the file system.
     * @param AutoSnapshotPolicyId Snapshot policy associated with the file system.
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get File system processes snapshot status, snapping: in snapshot, normal: in normal status. 
     * @return SnapStatus File system processes snapshot status, snapping: in snapshot, normal: in normal status.
     */
    public String getSnapStatus() {
        return this.SnapStatus;
    }

    /**
     * Set File system processes snapshot status, snapping: in snapshot, normal: in normal status.
     * @param SnapStatus File system processes snapshot status, snapping: in snapshot, normal: in normal status.
     */
    public void setSnapStatus(String SnapStatus) {
        this.SnapStatus = SnapStatus;
    }

    /**
     * Get Upper limit of file system capacity.
Unit: GiB. 
     * @return Capacity Upper limit of file system capacity.
Unit: GiB.
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set Upper limit of file system capacity.
Unit: GiB.
     * @param Capacity Upper limit of file system capacity.
Unit: GiB.
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get File system tag list 
     * @return Tags File system tag list
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set File system tag list
     * @param Tags File system tag list
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Status of file system lifecycle management.
NotAvailable: unavailable.
Available. 
     * @return TieringState Status of file system lifecycle management.
NotAvailable: unavailable.
Available.
     */
    public String getTieringState() {
        return this.TieringState;
    }

    /**
     * Set Status of file system lifecycle management.
NotAvailable: unavailable.
Available.
     * @param TieringState Status of file system lifecycle management.
NotAvailable: unavailable.
Available.
     */
    public void setTieringState(String TieringState) {
        this.TieringState = TieringState;
    }

    /**
     * Get Layered storage detail. 
     * @return TieringDetail Layered storage detail.
     */
    public TieringDetailInfo getTieringDetail() {
        return this.TieringDetail;
    }

    /**
     * Set Layered storage detail.
     * @param TieringDetail Layered storage detail.
     */
    public void setTieringDetail(TieringDetailInfo TieringDetail) {
        this.TieringDetail = TieringDetail;
    }

    /**
     * Get File system auto scale-out policy. 
     * @return AutoScaleUpRule File system auto scale-out policy.
     */
    public AutoScaleUpRule getAutoScaleUpRule() {
        return this.AutoScaleUpRule;
    }

    /**
     * Set File system auto scale-out policy.
     * @param AutoScaleUpRule File system auto scale-out policy.
     */
    public void setAutoScaleUpRule(AutoScaleUpRule AutoScaleUpRule) {
        this.AutoScaleUpRule = AutoScaleUpRule;
    }

    /**
     * Get File System Version 
     * @return Version File System Version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set File System Version
     * @param Version File System Version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Additional performance info.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExstraPerformanceInfo Additional performance info.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExstraPerformanceInfo [] getExstraPerformanceInfo() {
        return this.ExstraPerformanceInfo;
    }

    /**
     * Set Additional performance info.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExstraPerformanceInfo Additional performance info.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExstraPerformanceInfo(ExstraPerformanceInfo [] ExstraPerformanceInfo) {
        this.ExstraPerformanceInfo = ExstraPerformanceInfo;
    }

    /**
     * Get basic: standard version metadata type.
enhanced: additional metadata type. 
     * @return MetaType basic: standard version metadata type.
enhanced: additional metadata type.
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set basic: standard version metadata type.
enhanced: additional metadata type.
     * @param MetaType basic: standard version metadata type.
enhanced: additional metadata type.
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    public FileSystemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileSystemInfo(FileSystemInfo source) {
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.CreationToken != null) {
            this.CreationToken = new String(source.CreationToken);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.LifeCycleState != null) {
            this.LifeCycleState = new String(source.LifeCycleState);
        }
        if (source.SizeByte != null) {
            this.SizeByte = new Long(source.SizeByte);
        }
        if (source.SizeLimit != null) {
            this.SizeLimit = new Long(source.SizeLimit);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.StorageResourcePkg != null) {
            this.StorageResourcePkg = new String(source.StorageResourcePkg);
        }
        if (source.BandwidthResourcePkg != null) {
            this.BandwidthResourcePkg = new String(source.BandwidthResourcePkg);
        }
        if (source.PGroup != null) {
            this.PGroup = new PGroup(source.PGroup);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.Encrypted != null) {
            this.Encrypted = new Boolean(source.Encrypted);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BandwidthLimit != null) {
            this.BandwidthLimit = new Float(source.BandwidthLimit);
        }
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.SnapStatus != null) {
            this.SnapStatus = new String(source.SnapStatus);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.TieringState != null) {
            this.TieringState = new String(source.TieringState);
        }
        if (source.TieringDetail != null) {
            this.TieringDetail = new TieringDetailInfo(source.TieringDetail);
        }
        if (source.AutoScaleUpRule != null) {
            this.AutoScaleUpRule = new AutoScaleUpRule(source.AutoScaleUpRule);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ExstraPerformanceInfo != null) {
            this.ExstraPerformanceInfo = new ExstraPerformanceInfo[source.ExstraPerformanceInfo.length];
            for (int i = 0; i < source.ExstraPerformanceInfo.length; i++) {
                this.ExstraPerformanceInfo[i] = new ExstraPerformanceInfo(source.ExstraPerformanceInfo[i]);
            }
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "CreationToken", this.CreationToken);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "LifeCycleState", this.LifeCycleState);
        this.setParamSimple(map, prefix + "SizeByte", this.SizeByte);
        this.setParamSimple(map, prefix + "SizeLimit", this.SizeLimit);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StorageResourcePkg", this.StorageResourcePkg);
        this.setParamSimple(map, prefix + "BandwidthResourcePkg", this.BandwidthResourcePkg);
        this.setParamObj(map, prefix + "PGroup.", this.PGroup);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BandwidthLimit", this.BandwidthLimit);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "SnapStatus", this.SnapStatus);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TieringState", this.TieringState);
        this.setParamObj(map, prefix + "TieringDetail.", this.TieringDetail);
        this.setParamObj(map, prefix + "AutoScaleUpRule.", this.AutoScaleUpRule);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "ExstraPerformanceInfo.", this.ExstraPerformanceInfo);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);

    }
}

