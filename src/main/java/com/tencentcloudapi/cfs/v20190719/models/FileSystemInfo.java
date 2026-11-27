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
    * <p>Creation time.</p>
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * <p>User-defined name.</p>
    */
    @SerializedName("CreationToken")
    @Expose
    private String CreationToken;

    /**
    * <p>File system ID.</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>File system status. Valid values:</p><ul><li>creating: Creating</li><li>mounting: Mounting</li><li>create_failed: Failed to create</li><li>available: Available</li><li>unserviced: Service suspended</li><li>upgrading: Upgrading</li></ul>
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * <p>Used capacity of the file system. Unit: Byte.</p>
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * <p>File system space limit. Unit: GiB.</p>
    */
    @SerializedName("SizeLimit")
    @Expose
    private Long SizeLimit;

    /**
    * <p>Region ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>Region name.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>File system protocol type. Valid values: NFS, CIFS, and TURBO.</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Storage type. Valid values: HP: General performance; SD: General standard; TP: turbo performance; TB: turbo standard; THP: Throughput.</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>Prepaid storage pack bound to the file system.</p>
    */
    @SerializedName("StorageResourcePkg")
    @Expose
    private String StorageResourcePkg;

    /**
    * <p>Prepaid bandwidth pack bound to the file system (not supported yet).</p>
    */
    @SerializedName("BandwidthResourcePkg")
    @Expose
    private String BandwidthResourcePkg;

    /**
    * <p>Information of the permission group bound to the file system.</p>
    */
    @SerializedName("PGroup")
    @Expose
    private PGroup PGroup;

    /**
    * <p>User-defined name.</p>
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * <p>Whether the file system is encrypted. true: encrypted; false: not encrypted.</p>
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
    * <p>Key used for encryption, which can be the key ID or ARN.</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Maximum file system throughput, which is determined by the current used storage capacity of the file system, the bound storage pack, and the throughput pack. Unit: MiB/s.</p>
    */
    @SerializedName("BandwidthLimit")
    @Expose
    private Float BandwidthLimit;

    /**
    * <p>Snapshot policy associated with the file system.</p>
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * <p>Snapshot processing status of the file system. snapping: snapshot in progress; normal: normal status.</p>
    */
    @SerializedName("SnapStatus")
    @Expose
    private String SnapStatus;

    /**
    * <p>Maximum capacity specification of the file system.<br>Unit: GiB.</p>
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * <p>List of file system tags.</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>Lifecycle management status of the file system.<br>NotAvailable: Unavailable.<br>Available: Available.</p>
    */
    @SerializedName("TieringState")
    @Expose
    private String TieringState;

    /**
    * <p>Tiered storage details.</p>
    */
    @SerializedName("TieringDetail")
    @Expose
    private TieringDetailInfo TieringDetail;

    /**
    * <p>Automatic scaling policy of the file system.</p>
    */
    @SerializedName("AutoScaleUpRule")
    @Expose
    private AutoScaleUpRule AutoScaleUpRule;

    /**
    * <p>File system version.</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>Additional performance information.</p>
    */
    @SerializedName("ExstraPerformanceInfo")
    @Expose
    private ExstraPerformanceInfo [] ExstraPerformanceInfo;

    /**
    * <p>basic: standard metadata type.<br>enhanced: enhanced metadata type.</p>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * <p>Business scenario.</p><p>Valid values:</p><ul><li>AgentSandbox: Create AgentCFS.</li></ul>
    */
    @SerializedName("Scenario")
    @Expose
    private String Scenario;

    /**
    * <p>Overfull deletion capacity ratio. 0.0 indicates disabled.</p><p>Value range: [0.0, 1.0].</p>
    */
    @SerializedName("FullDeleteCapacityUsage")
    @Expose
    private Float FullDeleteCapacityUsage;

    /**
    * <p>Minimum survival time before overfull deletion, in seconds.</p><p>Unit: seconds.</p>
    */
    @SerializedName("FullDeleteMinTtl")
    @Expose
    private Long FullDeleteMinTtl;

    /**
    * <p>Expiration deletion TTL, in seconds. 0 indicates disabled.</p><p>Unit: seconds.</p>
    */
    @SerializedName("ExpireDeleteTtl")
    @Expose
    private Long ExpireDeleteTtl;

    /**
     * Get <p>Creation time.</p> 
     * @return CreationTime <p>Creation time.</p>
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreationTime <p>Creation time.</p>
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get <p>User-defined name.</p> 
     * @return CreationToken <p>User-defined name.</p>
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set <p>User-defined name.</p>
     * @param CreationToken <p>User-defined name.</p>
     */
    public void setCreationToken(String CreationToken) {
        this.CreationToken = CreationToken;
    }

    /**
     * Get <p>File system ID.</p> 
     * @return FileSystemId <p>File system ID.</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>File system ID.</p>
     * @param FileSystemId <p>File system ID.</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>File system status. Valid values:</p><ul><li>creating: Creating</li><li>mounting: Mounting</li><li>create_failed: Failed to create</li><li>available: Available</li><li>unserviced: Service suspended</li><li>upgrading: Upgrading</li></ul> 
     * @return LifeCycleState <p>File system status. Valid values:</p><ul><li>creating: Creating</li><li>mounting: Mounting</li><li>create_failed: Failed to create</li><li>available: Available</li><li>unserviced: Service suspended</li><li>upgrading: Upgrading</li></ul>
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set <p>File system status. Valid values:</p><ul><li>creating: Creating</li><li>mounting: Mounting</li><li>create_failed: Failed to create</li><li>available: Available</li><li>unserviced: Service suspended</li><li>upgrading: Upgrading</li></ul>
     * @param LifeCycleState <p>File system status. Valid values:</p><ul><li>creating: Creating</li><li>mounting: Mounting</li><li>create_failed: Failed to create</li><li>available: Available</li><li>unserviced: Service suspended</li><li>upgrading: Upgrading</li></ul>
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get <p>Used capacity of the file system. Unit: Byte.</p> 
     * @return SizeByte <p>Used capacity of the file system. Unit: Byte.</p>
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set <p>Used capacity of the file system. Unit: Byte.</p>
     * @param SizeByte <p>Used capacity of the file system. Unit: Byte.</p>
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get <p>File system space limit. Unit: GiB.</p> 
     * @return SizeLimit <p>File system space limit. Unit: GiB.</p>
     */
    public Long getSizeLimit() {
        return this.SizeLimit;
    }

    /**
     * Set <p>File system space limit. Unit: GiB.</p>
     * @param SizeLimit <p>File system space limit. Unit: GiB.</p>
     */
    public void setSizeLimit(Long SizeLimit) {
        this.SizeLimit = SizeLimit;
    }

    /**
     * Get <p>Region ID.</p> 
     * @return ZoneId <p>Region ID.</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Region ID.</p>
     * @param ZoneId <p>Region ID.</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Region name.</p> 
     * @return Zone <p>Region name.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Region name.</p>
     * @param Zone <p>Region name.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>File system protocol type. Valid values: NFS, CIFS, and TURBO.</p> 
     * @return Protocol <p>File system protocol type. Valid values: NFS, CIFS, and TURBO.</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>File system protocol type. Valid values: NFS, CIFS, and TURBO.</p>
     * @param Protocol <p>File system protocol type. Valid values: NFS, CIFS, and TURBO.</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Storage type. Valid values: HP: General performance; SD: General standard; TP: turbo performance; TB: turbo standard; THP: Throughput.</p> 
     * @return StorageType <p>Storage type. Valid values: HP: General performance; SD: General standard; TP: turbo performance; TB: turbo standard; THP: Throughput.</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Storage type. Valid values: HP: General performance; SD: General standard; TP: turbo performance; TB: turbo standard; THP: Throughput.</p>
     * @param StorageType <p>Storage type. Valid values: HP: General performance; SD: General standard; TP: turbo performance; TB: turbo standard; THP: Throughput.</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>Prepaid storage pack bound to the file system.</p> 
     * @return StorageResourcePkg <p>Prepaid storage pack bound to the file system.</p>
     */
    public String getStorageResourcePkg() {
        return this.StorageResourcePkg;
    }

    /**
     * Set <p>Prepaid storage pack bound to the file system.</p>
     * @param StorageResourcePkg <p>Prepaid storage pack bound to the file system.</p>
     */
    public void setStorageResourcePkg(String StorageResourcePkg) {
        this.StorageResourcePkg = StorageResourcePkg;
    }

    /**
     * Get <p>Prepaid bandwidth pack bound to the file system (not supported yet).</p> 
     * @return BandwidthResourcePkg <p>Prepaid bandwidth pack bound to the file system (not supported yet).</p>
     */
    public String getBandwidthResourcePkg() {
        return this.BandwidthResourcePkg;
    }

    /**
     * Set <p>Prepaid bandwidth pack bound to the file system (not supported yet).</p>
     * @param BandwidthResourcePkg <p>Prepaid bandwidth pack bound to the file system (not supported yet).</p>
     */
    public void setBandwidthResourcePkg(String BandwidthResourcePkg) {
        this.BandwidthResourcePkg = BandwidthResourcePkg;
    }

    /**
     * Get <p>Information of the permission group bound to the file system.</p> 
     * @return PGroup <p>Information of the permission group bound to the file system.</p>
     */
    public PGroup getPGroup() {
        return this.PGroup;
    }

    /**
     * Set <p>Information of the permission group bound to the file system.</p>
     * @param PGroup <p>Information of the permission group bound to the file system.</p>
     */
    public void setPGroup(PGroup PGroup) {
        this.PGroup = PGroup;
    }

    /**
     * Get <p>User-defined name.</p> 
     * @return FsName <p>User-defined name.</p>
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set <p>User-defined name.</p>
     * @param FsName <p>User-defined name.</p>
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get <p>Whether the file system is encrypted. true: encrypted; false: not encrypted.</p> 
     * @return Encrypted <p>Whether the file system is encrypted. true: encrypted; false: not encrypted.</p>
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set <p>Whether the file system is encrypted. true: encrypted; false: not encrypted.</p>
     * @param Encrypted <p>Whether the file system is encrypted. true: encrypted; false: not encrypted.</p>
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    /**
     * Get <p>Key used for encryption, which can be the key ID or ARN.</p> 
     * @return KmsKeyId <p>Key used for encryption, which can be the key ID or ARN.</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>Key used for encryption, which can be the key ID or ARN.</p>
     * @param KmsKeyId <p>Key used for encryption, which can be the key ID or ARN.</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>Application ID.</p> 
     * @return AppId <p>Application ID.</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID.</p>
     * @param AppId <p>Application ID.</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Maximum file system throughput, which is determined by the current used storage capacity of the file system, the bound storage pack, and the throughput pack. Unit: MiB/s.</p> 
     * @return BandwidthLimit <p>Maximum file system throughput, which is determined by the current used storage capacity of the file system, the bound storage pack, and the throughput pack. Unit: MiB/s.</p>
     */
    public Float getBandwidthLimit() {
        return this.BandwidthLimit;
    }

    /**
     * Set <p>Maximum file system throughput, which is determined by the current used storage capacity of the file system, the bound storage pack, and the throughput pack. Unit: MiB/s.</p>
     * @param BandwidthLimit <p>Maximum file system throughput, which is determined by the current used storage capacity of the file system, the bound storage pack, and the throughput pack. Unit: MiB/s.</p>
     */
    public void setBandwidthLimit(Float BandwidthLimit) {
        this.BandwidthLimit = BandwidthLimit;
    }

    /**
     * Get <p>Snapshot policy associated with the file system.</p> 
     * @return AutoSnapshotPolicyId <p>Snapshot policy associated with the file system.</p>
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set <p>Snapshot policy associated with the file system.</p>
     * @param AutoSnapshotPolicyId <p>Snapshot policy associated with the file system.</p>
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get <p>Snapshot processing status of the file system. snapping: snapshot in progress; normal: normal status.</p> 
     * @return SnapStatus <p>Snapshot processing status of the file system. snapping: snapshot in progress; normal: normal status.</p>
     */
    public String getSnapStatus() {
        return this.SnapStatus;
    }

    /**
     * Set <p>Snapshot processing status of the file system. snapping: snapshot in progress; normal: normal status.</p>
     * @param SnapStatus <p>Snapshot processing status of the file system. snapping: snapshot in progress; normal: normal status.</p>
     */
    public void setSnapStatus(String SnapStatus) {
        this.SnapStatus = SnapStatus;
    }

    /**
     * Get <p>Maximum capacity specification of the file system.<br>Unit: GiB.</p> 
     * @return Capacity <p>Maximum capacity specification of the file system.<br>Unit: GiB.</p>
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set <p>Maximum capacity specification of the file system.<br>Unit: GiB.</p>
     * @param Capacity <p>Maximum capacity specification of the file system.<br>Unit: GiB.</p>
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get <p>List of file system tags.</p> 
     * @return Tags <p>List of file system tags.</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>List of file system tags.</p>
     * @param Tags <p>List of file system tags.</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Lifecycle management status of the file system.<br>NotAvailable: Unavailable.<br>Available: Available.</p> 
     * @return TieringState <p>Lifecycle management status of the file system.<br>NotAvailable: Unavailable.<br>Available: Available.</p>
     */
    public String getTieringState() {
        return this.TieringState;
    }

    /**
     * Set <p>Lifecycle management status of the file system.<br>NotAvailable: Unavailable.<br>Available: Available.</p>
     * @param TieringState <p>Lifecycle management status of the file system.<br>NotAvailable: Unavailable.<br>Available: Available.</p>
     */
    public void setTieringState(String TieringState) {
        this.TieringState = TieringState;
    }

    /**
     * Get <p>Tiered storage details.</p> 
     * @return TieringDetail <p>Tiered storage details.</p>
     */
    public TieringDetailInfo getTieringDetail() {
        return this.TieringDetail;
    }

    /**
     * Set <p>Tiered storage details.</p>
     * @param TieringDetail <p>Tiered storage details.</p>
     */
    public void setTieringDetail(TieringDetailInfo TieringDetail) {
        this.TieringDetail = TieringDetail;
    }

    /**
     * Get <p>Automatic scaling policy of the file system.</p> 
     * @return AutoScaleUpRule <p>Automatic scaling policy of the file system.</p>
     */
    public AutoScaleUpRule getAutoScaleUpRule() {
        return this.AutoScaleUpRule;
    }

    /**
     * Set <p>Automatic scaling policy of the file system.</p>
     * @param AutoScaleUpRule <p>Automatic scaling policy of the file system.</p>
     */
    public void setAutoScaleUpRule(AutoScaleUpRule AutoScaleUpRule) {
        this.AutoScaleUpRule = AutoScaleUpRule;
    }

    /**
     * Get <p>File system version.</p> 
     * @return Version <p>File system version.</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>File system version.</p>
     * @param Version <p>File system version.</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Additional performance information.</p> 
     * @return ExstraPerformanceInfo <p>Additional performance information.</p>
     */
    public ExstraPerformanceInfo [] getExstraPerformanceInfo() {
        return this.ExstraPerformanceInfo;
    }

    /**
     * Set <p>Additional performance information.</p>
     * @param ExstraPerformanceInfo <p>Additional performance information.</p>
     */
    public void setExstraPerformanceInfo(ExstraPerformanceInfo [] ExstraPerformanceInfo) {
        this.ExstraPerformanceInfo = ExstraPerformanceInfo;
    }

    /**
     * Get <p>basic: standard metadata type.<br>enhanced: enhanced metadata type.</p> 
     * @return MetaType <p>basic: standard metadata type.<br>enhanced: enhanced metadata type.</p>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>basic: standard metadata type.<br>enhanced: enhanced metadata type.</p>
     * @param MetaType <p>basic: standard metadata type.<br>enhanced: enhanced metadata type.</p>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get <p>Business scenario.</p><p>Valid values:</p><ul><li>AgentSandbox: Create AgentCFS.</li></ul> 
     * @return Scenario <p>Business scenario.</p><p>Valid values:</p><ul><li>AgentSandbox: Create AgentCFS.</li></ul>
     */
    public String getScenario() {
        return this.Scenario;
    }

    /**
     * Set <p>Business scenario.</p><p>Valid values:</p><ul><li>AgentSandbox: Create AgentCFS.</li></ul>
     * @param Scenario <p>Business scenario.</p><p>Valid values:</p><ul><li>AgentSandbox: Create AgentCFS.</li></ul>
     */
    public void setScenario(String Scenario) {
        this.Scenario = Scenario;
    }

    /**
     * Get <p>Overfull deletion capacity ratio. 0.0 indicates disabled.</p><p>Value range: [0.0, 1.0].</p> 
     * @return FullDeleteCapacityUsage <p>Overfull deletion capacity ratio. 0.0 indicates disabled.</p><p>Value range: [0.0, 1.0].</p>
     */
    public Float getFullDeleteCapacityUsage() {
        return this.FullDeleteCapacityUsage;
    }

    /**
     * Set <p>Overfull deletion capacity ratio. 0.0 indicates disabled.</p><p>Value range: [0.0, 1.0].</p>
     * @param FullDeleteCapacityUsage <p>Overfull deletion capacity ratio. 0.0 indicates disabled.</p><p>Value range: [0.0, 1.0].</p>
     */
    public void setFullDeleteCapacityUsage(Float FullDeleteCapacityUsage) {
        this.FullDeleteCapacityUsage = FullDeleteCapacityUsage;
    }

    /**
     * Get <p>Minimum survival time before overfull deletion, in seconds.</p><p>Unit: seconds.</p> 
     * @return FullDeleteMinTtl <p>Minimum survival time before overfull deletion, in seconds.</p><p>Unit: seconds.</p>
     */
    public Long getFullDeleteMinTtl() {
        return this.FullDeleteMinTtl;
    }

    /**
     * Set <p>Minimum survival time before overfull deletion, in seconds.</p><p>Unit: seconds.</p>
     * @param FullDeleteMinTtl <p>Minimum survival time before overfull deletion, in seconds.</p><p>Unit: seconds.</p>
     */
    public void setFullDeleteMinTtl(Long FullDeleteMinTtl) {
        this.FullDeleteMinTtl = FullDeleteMinTtl;
    }

    /**
     * Get <p>Expiration deletion TTL, in seconds. 0 indicates disabled.</p><p>Unit: seconds.</p> 
     * @return ExpireDeleteTtl <p>Expiration deletion TTL, in seconds. 0 indicates disabled.</p><p>Unit: seconds.</p>
     */
    public Long getExpireDeleteTtl() {
        return this.ExpireDeleteTtl;
    }

    /**
     * Set <p>Expiration deletion TTL, in seconds. 0 indicates disabled.</p><p>Unit: seconds.</p>
     * @param ExpireDeleteTtl <p>Expiration deletion TTL, in seconds. 0 indicates disabled.</p><p>Unit: seconds.</p>
     */
    public void setExpireDeleteTtl(Long ExpireDeleteTtl) {
        this.ExpireDeleteTtl = ExpireDeleteTtl;
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
        if (source.Scenario != null) {
            this.Scenario = new String(source.Scenario);
        }
        if (source.FullDeleteCapacityUsage != null) {
            this.FullDeleteCapacityUsage = new Float(source.FullDeleteCapacityUsage);
        }
        if (source.FullDeleteMinTtl != null) {
            this.FullDeleteMinTtl = new Long(source.FullDeleteMinTtl);
        }
        if (source.ExpireDeleteTtl != null) {
            this.ExpireDeleteTtl = new Long(source.ExpireDeleteTtl);
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
        this.setParamSimple(map, prefix + "Scenario", this.Scenario);
        this.setParamSimple(map, prefix + "FullDeleteCapacityUsage", this.FullDeleteCapacityUsage);
        this.setParamSimple(map, prefix + "FullDeleteMinTtl", this.FullDeleteMinTtl);
        this.setParamSimple(map, prefix + "ExpireDeleteTtl", this.ExpireDeleteTtl);

    }
}

