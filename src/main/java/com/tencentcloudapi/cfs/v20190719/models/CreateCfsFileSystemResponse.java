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

public class CreateCfsFileSystemResponse extends AbstractModel{

    /**
    * File system creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Custom file system name
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
    * AZ ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Custom file system name
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
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get File system creation time 
     * @return CreationTime File system creation time
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set File system creation time
     * @param CreationTime File system creation time
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Custom file system name 
     * @return CreationToken Custom file system name
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set Custom file system name
     * @param CreationToken Custom file system name
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
     * Get AZ ID 
     * @return ZoneId AZ ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID
     * @param ZoneId AZ ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Custom file system name 
     * @return FsName Custom file system name
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set Custom file system name
     * @param FsName Custom file system name
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
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

