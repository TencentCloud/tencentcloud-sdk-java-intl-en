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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountDataDisk extends AbstractModel {

    /**
    * Mounting point. A valid path (for Linux) for a drive (for Windows, such as "H:\\")
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * File system type. Linux: `EXT3` (default) and `EXT4`. Windows: `NTFS`
    */
    @SerializedName("FileSystemType")
    @Expose
    private String FileSystemType;

    /**
     * Get Mounting point. A valid path (for Linux) for a drive (for Windows, such as "H:\\") 
     * @return LocalPath Mounting point. A valid path (for Linux) for a drive (for Windows, such as "H:\\")
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set Mounting point. A valid path (for Linux) for a drive (for Windows, such as "H:\\")
     * @param LocalPath Mounting point. A valid path (for Linux) for a drive (for Windows, such as "H:\\")
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get File system type. Linux: `EXT3` (default) and `EXT4`. Windows: `NTFS` 
     * @return FileSystemType File system type. Linux: `EXT3` (default) and `EXT4`. Windows: `NTFS`
     */
    public String getFileSystemType() {
        return this.FileSystemType;
    }

    /**
     * Set File system type. Linux: `EXT3` (default) and `EXT4`. Windows: `NTFS`
     * @param FileSystemType File system type. Linux: `EXT3` (default) and `EXT4`. Windows: `NTFS`
     */
    public void setFileSystemType(String FileSystemType) {
        this.FileSystemType = FileSystemType;
    }

    public MountDataDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountDataDisk(MountDataDisk source) {
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.FileSystemType != null) {
            this.FileSystemType = new String(source.FileSystemType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "FileSystemType", this.FileSystemType);

    }
}

