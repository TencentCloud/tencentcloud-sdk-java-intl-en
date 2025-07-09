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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateResultDownloadRequest extends AbstractModel {

    /**
    * The result query task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The result format.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Whether to re-generate a file to download. This parameter applies only when the last task is `timeout` or `error`.
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get The result query task ID. 
     * @return TaskId The result query task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The result query task ID.
     * @param TaskId The result query task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The result format. 
     * @return Format The result format.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set The result format.
     * @param Format The result format.
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Whether to re-generate a file to download. This parameter applies only when the last task is `timeout` or `error`. 
     * @return Force Whether to re-generate a file to download. This parameter applies only when the last task is `timeout` or `error`.
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set Whether to re-generate a file to download. This parameter applies only when the last task is `timeout` or `error`.
     * @param Force Whether to re-generate a file to download. This parameter applies only when the last task is `timeout` or `error`.
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public CreateResultDownloadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResultDownloadRequest(CreateResultDownloadRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

