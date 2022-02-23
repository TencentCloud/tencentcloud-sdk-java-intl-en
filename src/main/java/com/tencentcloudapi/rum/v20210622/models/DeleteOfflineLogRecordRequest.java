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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOfflineLogRecordRequest extends AbstractModel{

    /**
    * Unique project key for reporting
    */
    @SerializedName("ProjectKey")
    @Expose
    private String ProjectKey;

    /**
    * Offline log file ID
    */
    @SerializedName("FileID")
    @Expose
    private String FileID;

    /**
     * Get Unique project key for reporting 
     * @return ProjectKey Unique project key for reporting
     */
    public String getProjectKey() {
        return this.ProjectKey;
    }

    /**
     * Set Unique project key for reporting
     * @param ProjectKey Unique project key for reporting
     */
    public void setProjectKey(String ProjectKey) {
        this.ProjectKey = ProjectKey;
    }

    /**
     * Get Offline log file ID 
     * @return FileID Offline log file ID
     */
    public String getFileID() {
        return this.FileID;
    }

    /**
     * Set Offline log file ID
     * @param FileID Offline log file ID
     */
    public void setFileID(String FileID) {
        this.FileID = FileID;
    }

    public DeleteOfflineLogRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOfflineLogRecordRequest(DeleteOfflineLogRecordRequest source) {
        if (source.ProjectKey != null) {
            this.ProjectKey = new String(source.ProjectKey);
        }
        if (source.FileID != null) {
            this.FileID = new String(source.FileID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectKey", this.ProjectKey);
        this.setParamSimple(map, prefix + "FileID", this.FileID);

    }
}

