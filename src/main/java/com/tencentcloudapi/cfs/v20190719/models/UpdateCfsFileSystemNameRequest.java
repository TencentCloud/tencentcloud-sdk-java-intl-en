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

public class UpdateCfsFileSystemNameRequest extends AbstractModel {

    /**
    * File system ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Custom file system name
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

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

    public UpdateCfsFileSystemNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCfsFileSystemNameRequest(UpdateCfsFileSystemNameRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "FsName", this.FsName);

    }
}

