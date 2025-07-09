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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileDeleteTask extends AbstractModel {

    /**
    * List of IDs of deleted files.
    */
    @SerializedName("FileIdSet")
    @Expose
    private String [] FileIdSet;

    /**
    * The information of the files deleted.
    */
    @SerializedName("FileDeleteResultInfo")
    @Expose
    private FileDeleteResultItem [] FileDeleteResultInfo;

    /**
     * Get List of IDs of deleted files. 
     * @return FileIdSet List of IDs of deleted files.
     */
    public String [] getFileIdSet() {
        return this.FileIdSet;
    }

    /**
     * Set List of IDs of deleted files.
     * @param FileIdSet List of IDs of deleted files.
     */
    public void setFileIdSet(String [] FileIdSet) {
        this.FileIdSet = FileIdSet;
    }

    /**
     * Get The information of the files deleted. 
     * @return FileDeleteResultInfo The information of the files deleted.
     */
    public FileDeleteResultItem [] getFileDeleteResultInfo() {
        return this.FileDeleteResultInfo;
    }

    /**
     * Set The information of the files deleted.
     * @param FileDeleteResultInfo The information of the files deleted.
     */
    public void setFileDeleteResultInfo(FileDeleteResultItem [] FileDeleteResultInfo) {
        this.FileDeleteResultInfo = FileDeleteResultInfo;
    }

    public FileDeleteTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileDeleteTask(FileDeleteTask source) {
        if (source.FileIdSet != null) {
            this.FileIdSet = new String[source.FileIdSet.length];
            for (int i = 0; i < source.FileIdSet.length; i++) {
                this.FileIdSet[i] = new String(source.FileIdSet[i]);
            }
        }
        if (source.FileDeleteResultInfo != null) {
            this.FileDeleteResultInfo = new FileDeleteResultItem[source.FileDeleteResultInfo.length];
            for (int i = 0; i < source.FileDeleteResultInfo.length; i++) {
                this.FileDeleteResultInfo[i] = new FileDeleteResultItem(source.FileDeleteResultInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIdSet.", this.FileIdSet);
        this.setParamArrayObj(map, prefix + "FileDeleteResultInfo.", this.FileDeleteResultInfo);

    }
}

