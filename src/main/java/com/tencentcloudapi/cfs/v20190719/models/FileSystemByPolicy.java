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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileSystemByPolicy extends AbstractModel {

    /**
    * File system name
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
    * File system size
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * Storage class
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Total snapshot size
    */
    @SerializedName("TotalSnapshotSize")
    @Expose
    private Long TotalSnapshotSize;

    /**
    * File system creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Region ID of the file system
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
     * Get File system name 
     * @return CreationToken File system name
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set File system name
     * @param CreationToken File system name
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
     * Get File system size 
     * @return SizeByte File system size
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set File system size
     * @param SizeByte File system size
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get Storage class 
     * @return StorageType Storage class
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage class
     * @param StorageType Storage class
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Total snapshot size 
     * @return TotalSnapshotSize Total snapshot size
     */
    public Long getTotalSnapshotSize() {
        return this.TotalSnapshotSize;
    }

    /**
     * Set Total snapshot size
     * @param TotalSnapshotSize Total snapshot size
     */
    public void setTotalSnapshotSize(Long TotalSnapshotSize) {
        this.TotalSnapshotSize = TotalSnapshotSize;
    }

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
     * Get Region ID of the file system 
     * @return ZoneId Region ID of the file system
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Region ID of the file system
     * @param ZoneId Region ID of the file system
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    public FileSystemByPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileSystemByPolicy(FileSystemByPolicy source) {
        if (source.CreationToken != null) {
            this.CreationToken = new String(source.CreationToken);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.SizeByte != null) {
            this.SizeByte = new Long(source.SizeByte);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.TotalSnapshotSize != null) {
            this.TotalSnapshotSize = new Long(source.TotalSnapshotSize);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationToken", this.CreationToken);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "SizeByte", this.SizeByte);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "TotalSnapshotSize", this.TotalSnapshotSize);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

