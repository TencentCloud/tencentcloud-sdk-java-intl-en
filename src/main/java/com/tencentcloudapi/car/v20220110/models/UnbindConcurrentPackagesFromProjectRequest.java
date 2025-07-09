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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindConcurrentPackagesFromProjectRequest extends AbstractModel {

    /**
    * Concurrency pack ID list.
    */
    @SerializedName("ConcurrentIds")
    @Expose
    private String [] ConcurrentIds;

    /**
    * Cloud application project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get Concurrency pack ID list. 
     * @return ConcurrentIds Concurrency pack ID list.
     */
    public String [] getConcurrentIds() {
        return this.ConcurrentIds;
    }

    /**
     * Set Concurrency pack ID list.
     * @param ConcurrentIds Concurrency pack ID list.
     */
    public void setConcurrentIds(String [] ConcurrentIds) {
        this.ConcurrentIds = ConcurrentIds;
    }

    /**
     * Get Cloud application project ID. 
     * @return ProjectId Cloud application project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Cloud application project ID.
     * @param ProjectId Cloud application project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public UnbindConcurrentPackagesFromProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindConcurrentPackagesFromProjectRequest(UnbindConcurrentPackagesFromProjectRequest source) {
        if (source.ConcurrentIds != null) {
            this.ConcurrentIds = new String[source.ConcurrentIds.length];
            for (int i = 0; i < source.ConcurrentIds.length; i++) {
                this.ConcurrentIds[i] = new String(source.ConcurrentIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ConcurrentIds.", this.ConcurrentIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

