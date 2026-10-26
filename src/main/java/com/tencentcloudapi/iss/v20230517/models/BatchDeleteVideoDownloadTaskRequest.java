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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDeleteVideoDownloadTaskRequest extends AbstractModel {

    /**
    * List of local recording download task IDs
    */
    @SerializedName("DownloadTaskIds")
    @Expose
    private String [] DownloadTaskIds;

    /**
     * Get List of local recording download task IDs 
     * @return DownloadTaskIds List of local recording download task IDs
     */
    public String [] getDownloadTaskIds() {
        return this.DownloadTaskIds;
    }

    /**
     * Set List of local recording download task IDs
     * @param DownloadTaskIds List of local recording download task IDs
     */
    public void setDownloadTaskIds(String [] DownloadTaskIds) {
        this.DownloadTaskIds = DownloadTaskIds;
    }

    public BatchDeleteVideoDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteVideoDownloadTaskRequest(BatchDeleteVideoDownloadTaskRequest source) {
        if (source.DownloadTaskIds != null) {
            this.DownloadTaskIds = new String[source.DownloadTaskIds.length];
            for (int i = 0; i < source.DownloadTaskIds.length; i++) {
                this.DownloadTaskIds[i] = new String(source.DownloadTaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DownloadTaskIds.", this.DownloadTaskIds);

    }
}

