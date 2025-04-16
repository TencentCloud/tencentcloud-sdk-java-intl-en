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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTaskInstanceRequest extends AbstractModel {

    /**
    * **Project ID**.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Unique identifier of an instance.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
     * Get **Project ID**. 
     * @return ProjectId **Project ID**.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set **Project ID**.
     * @param ProjectId **Project ID**.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Unique identifier of an instance. 
     * @return InstanceKey Unique identifier of an instance.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Unique identifier of an instance.
     * @param InstanceKey Unique identifier of an instance.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get Time zone.
Time zone. specifies the time zone. the default value is UTC+8. 
     * @return ScheduleTimeZone Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
     * @param ScheduleTimeZone Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
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
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);

    }
}

