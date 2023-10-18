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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseFile extends AbstractModel {

    /**
    * File version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Unique file key
    */
    @SerializedName("FileKey")
    @Expose
    private String FileKey;

    /**
    * Filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File hash
    */
    @SerializedName("FileHash")
    @Expose
    private String FileHash;

    /**
    * File ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get File version 
     * @return Version File version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set File version
     * @param Version File version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Unique file key 
     * @return FileKey Unique file key
     */
    public String getFileKey() {
        return this.FileKey;
    }

    /**
     * Set Unique file key
     * @param FileKey Unique file key
     */
    public void setFileKey(String FileKey) {
        this.FileKey = FileKey;
    }

    /**
     * Get Filename 
     * @return FileName Filename
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename
     * @param FileName Filename
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File hash 
     * @return FileHash File hash
     */
    public String getFileHash() {
        return this.FileHash;
    }

    /**
     * Set File hash
     * @param FileHash File hash
     */
    public void setFileHash(String FileHash) {
        this.FileHash = FileHash;
    }

    /**
     * Get File ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ID File ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set File ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ID File ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public ReleaseFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseFile(ReleaseFile source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.FileKey != null) {
            this.FileKey = new String(source.FileKey);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileHash != null) {
            this.FileHash = new String(source.FileHash);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "FileKey", this.FileKey);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileHash", this.FileHash);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

