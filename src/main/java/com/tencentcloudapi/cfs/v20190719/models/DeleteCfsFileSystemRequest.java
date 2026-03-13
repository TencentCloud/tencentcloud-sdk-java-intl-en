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

public class DeleteCfsFileSystemRequest extends AbstractModel {

    /**
    * File system ID, which can be obtained by [querying the file system interface](https://www.tencentcloud.com/document/api/582/38170?from_cn_redirect=1). note: the DeleteMountTarget api must be called to remove the mount point of this file system before file system deletion, otherwise deletion will fail.
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
     * Get File system ID, which can be obtained by [querying the file system interface](https://www.tencentcloud.com/document/api/582/38170?from_cn_redirect=1). note: the DeleteMountTarget api must be called to remove the mount point of this file system before file system deletion, otherwise deletion will fail. 
     * @return FileSystemId File system ID, which can be obtained by [querying the file system interface](https://www.tencentcloud.com/document/api/582/38170?from_cn_redirect=1). note: the DeleteMountTarget api must be called to remove the mount point of this file system before file system deletion, otherwise deletion will fail.
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID, which can be obtained by [querying the file system interface](https://www.tencentcloud.com/document/api/582/38170?from_cn_redirect=1). note: the DeleteMountTarget api must be called to remove the mount point of this file system before file system deletion, otherwise deletion will fail.
     * @param FileSystemId File system ID, which can be obtained by [querying the file system interface](https://www.tencentcloud.com/document/api/582/38170?from_cn_redirect=1). note: the DeleteMountTarget api must be called to remove the mount point of this file system before file system deletion, otherwise deletion will fail.
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    public DeleteCfsFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCfsFileSystemRequest(DeleteCfsFileSystemRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);

    }
}

