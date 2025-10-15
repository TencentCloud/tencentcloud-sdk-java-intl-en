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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitTaskResult extends AbstractModel {

    /**
    * Generated task version ID.

    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * Submission status.
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get Generated task version ID.
 
     * @return VersionId Generated task version ID.

     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set Generated task version ID.

     * @param VersionId Generated task version ID.

     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Submission status. 
     * @return Status Submission status.
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Submission status.
     * @param Status Submission status.
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public SubmitTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTaskResult(SubmitTaskResult source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

