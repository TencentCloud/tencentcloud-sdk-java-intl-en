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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileSystemInfo extends AbstractModel{

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
    * File system status
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * Used file system capacity
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * Maximum storage limit of a file system
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
    * File system protocol type
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * File system storage class
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
    * Whether a file system is encrypted
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
    * The upper limit on the file system’s throughput, which is determined based on its current usage, and bound resource packs for both storage and throughput
    */
    @SerializedName("BandwidthLimit")
    @Expose
    private Float BandwidthLimit;

    /**
    * Total capacity of the file system
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
    * The lifecycle management status of a file system.
    */
    @SerializedName("TieringState")
    @Expose
    private String TieringState;

    /**
    * The details about tiered storage.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TieringDetail")
    @Expose
    private TieringDetailInfo TieringDetail;

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
     * Get File system status 
     * @return LifeCycleState File system status
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set File system status
     * @param LifeCycleState File system status
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get Used file system capacity 
     * @return SizeByte Used file system capacity
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set Used file system capacity
     * @param SizeByte Used file system capacity
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get Maximum storage limit of a file system 
     * @return SizeLimit Maximum storage limit of a file system
     */
    public Long getSizeLimit() {
        return this.SizeLimit;
    }

    /**
     * Set Maximum storage limit of a file system
     * @param SizeLimit Maximum storage limit of a file system
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
     * Get File system protocol type 
     * @return Protocol File system protocol type
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set File system protocol type
     * @param Protocol File system protocol type
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get File system storage class 
     * @return StorageType File system storage class
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set File system storage class
     * @param StorageType File system storage class
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
     * Get Whether a file system is encrypted 
     * @return Encrypted Whether a file system is encrypted
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set Whether a file system is encrypted
     * @param Encrypted Whether a file system is encrypted
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
     * Get The upper limit on the file system’s throughput, which is determined based on its current usage, and bound resource packs for both storage and throughput 
     * @return BandwidthLimit The upper limit on the file system’s throughput, which is determined based on its current usage, and bound resource packs for both storage and throughput
     */
    public Float getBandwidthLimit() {
        return this.BandwidthLimit;
    }

    /**
     * Set The upper limit on the file system’s throughput, which is determined based on its current usage, and bound resource packs for both storage and throughput
     * @param BandwidthLimit The upper limit on the file system’s throughput, which is determined based on its current usage, and bound resource packs for both storage and throughput
     */
    public void setBandwidthLimit(Float BandwidthLimit) {
        this.BandwidthLimit = BandwidthLimit;
    }

    /**
     * Get Total capacity of the file system 
     * @return Capacity Total capacity of the file system
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set Total capacity of the file system
     * @param Capacity Total capacity of the file system
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
     * Get The lifecycle management status of a file system. 
     * @return TieringState The lifecycle management status of a file system.
     */
    public String getTieringState() {
        return this.TieringState;
    }

    /**
     * Set The lifecycle management status of a file system.
     * @param TieringState The lifecycle management status of a file system.
     */
    public void setTieringState(String TieringState) {
        this.TieringState = TieringState;
    }

    /**
     * Get The details about tiered storage.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TieringDetail The details about tiered storage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TieringDetailInfo getTieringDetail() {
        return this.TieringDetail;
    }

    /**
     * Set The details about tiered storage.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TieringDetail The details about tiered storage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTieringDetail(TieringDetailInfo TieringDetail) {
        this.TieringDetail = TieringDetail;
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
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TieringState", this.TieringState);
        this.setParamObj(map, prefix + "TieringDetail.", this.TieringDetail);

    }
}

