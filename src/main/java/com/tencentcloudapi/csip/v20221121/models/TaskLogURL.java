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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskLogURL extends AbstractModel {

    /**
    * Temp download URL for the report
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * Task report ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * Task report name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskLogName")
    @Expose
    private String TaskLogName;

    /**
    * APP ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * Get Temp download URL for the report
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return URL Temp download URL for the report
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set Temp download URL for the report
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param URL Temp download URL for the report
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get Task report ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return LogId Task report ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set Task report ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param LogId Task report ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get Task report name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return TaskLogName Task report name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getTaskLogName() {
        return this.TaskLogName;
    }

    /**
     * Set Task report name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param TaskLogName Task report name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTaskLogName(String TaskLogName) {
        this.TaskLogName = TaskLogName;
    }

    /**
     * Get APP ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AppId APP ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set APP ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AppId APP ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    public TaskLogURL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskLogURL(TaskLogURL source) {
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.TaskLogName != null) {
            this.TaskLogName = new String(source.TaskLogName);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "TaskLogName", this.TaskLogName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

