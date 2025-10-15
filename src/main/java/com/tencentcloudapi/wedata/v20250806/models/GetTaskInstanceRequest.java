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

public class GetTaskInstanceRequest extends AbstractModel {

    /**
    * Project id.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Instance unique id, can be obtained through ListInstances.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Project id. 
     * @return ProjectId Project id.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project id.
     * @param ProjectId Project id.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Instance unique id, can be obtained through ListInstances. 
     * @return InstanceKey Instance unique id, can be obtained through ListInstances.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Instance unique id, can be obtained through ListInstances.
     * @param InstanceKey Instance unique id, can be obtained through ListInstances.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8. 
     * @return TimeZone **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
     * @param TimeZone **Time zone** timeZone, specifies the time zone of the passed in time string. default UTC+8.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public GetTaskInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTaskInstanceRequest(GetTaskInstanceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

