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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountDataDisk extends AbstractModel{

    /**
    * Mounting point. For Linux, this parameter should be a valid path. For Windows, this parameter should be a system disk letter such as "H:\\"
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * File system type. For Linux, "EXT3" and "EXT4" are supported and the default value is "EXT3". For Windows, only "NTFS" is supported
    */
    @SerializedName("FileSystemType")
    @Expose
    private String FileSystemType;

    /**
     * Get Mounting point. For Linux, this parameter should be a valid path. For Windows, this parameter should be a system disk letter such as "H:\\" 
     * @return LocalPath Mounting point. For Linux, this parameter should be a valid path. For Windows, this parameter should be a system disk letter such as "H:\\"
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set Mounting point. For Linux, this parameter should be a valid path. For Windows, this parameter should be a system disk letter such as "H:\\"
     * @param LocalPath Mounting point. For Linux, this parameter should be a valid path. For Windows, this parameter should be a system disk letter such as "H:\\"
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get File system type. For Linux, "EXT3" and "EXT4" are supported and the default value is "EXT3". For Windows, only "NTFS" is supported 
     * @return FileSystemType File system type. For Linux, "EXT3" and "EXT4" are supported and the default value is "EXT3". For Windows, only "NTFS" is supported
     */
    public String getFileSystemType() {
        return this.FileSystemType;
    }

    /**
     * Set File system type. For Linux, "EXT3" and "EXT4" are supported and the default value is "EXT3". For Windows, only "NTFS" is supported
     * @param FileSystemType File system type. For Linux, "EXT3" and "EXT4" are supported and the default value is "EXT3". For Windows, only "NTFS" is supported
     */
    public void setFileSystemType(String FileSystemType) {
        this.FileSystemType = FileSystemType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "FileSystemType", this.FileSystemType);

    }
}

