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

public class UpdateCfsFileSystemSizeLimitRequest extends AbstractModel {

    /**
    * File system capacity limit in GB. Value range: 0-1,073,741,824. If 0 is entered, no limit will be imposed on the file system capacity.
    */
    @SerializedName("FsLimit")
    @Expose
    private Long FsLimit;

    /**
    * File system ID. Currently, only Standard file systems are supported.
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
     * Get File system capacity limit in GB. Value range: 0-1,073,741,824. If 0 is entered, no limit will be imposed on the file system capacity. 
     * @return FsLimit File system capacity limit in GB. Value range: 0-1,073,741,824. If 0 is entered, no limit will be imposed on the file system capacity.
     */
    public Long getFsLimit() {
        return this.FsLimit;
    }

    /**
     * Set File system capacity limit in GB. Value range: 0-1,073,741,824. If 0 is entered, no limit will be imposed on the file system capacity.
     * @param FsLimit File system capacity limit in GB. Value range: 0-1,073,741,824. If 0 is entered, no limit will be imposed on the file system capacity.
     */
    public void setFsLimit(Long FsLimit) {
        this.FsLimit = FsLimit;
    }

    /**
     * Get File system ID. Currently, only Standard file systems are supported. 
     * @return FileSystemId File system ID. Currently, only Standard file systems are supported.
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID. Currently, only Standard file systems are supported.
     * @param FileSystemId File system ID. Currently, only Standard file systems are supported.
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    public UpdateCfsFileSystemSizeLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCfsFileSystemSizeLimitRequest(UpdateCfsFileSystemSizeLimitRequest source) {
        if (source.FsLimit != null) {
            this.FsLimit = new Long(source.FsLimit);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FsLimit", this.FsLimit);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);

    }
}

