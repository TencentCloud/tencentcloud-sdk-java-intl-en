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
    * Prepaid storage pack bound to a file system (not supported currently)
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
     * Get Prepaid storage pack bound to a file system (not supported currently) 
     * @return StorageResourcePkg Prepaid storage pack bound to a file system (not supported currently)
     */
    public String getStorageResourcePkg() {
        return this.StorageResourcePkg;
    }

    /**
     * Set Prepaid storage pack bound to a file system (not supported currently)
     * @param StorageResourcePkg Prepaid storage pack bound to a file system (not supported currently)
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

    }
}

