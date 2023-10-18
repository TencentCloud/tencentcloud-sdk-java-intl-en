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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurgeTask extends AbstractModel {

    /**
    * Purge task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Purged URL.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Purge task status. fail: failed, done: succeeded, process: purging.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Purge type. url: URL purge; path: directory purge.
    */
    @SerializedName("PurgeType")
    @Expose
    private String PurgeType;

    /**
    * Resource purge method. flush: purges updated resources, delete: purges all resources.
    */
    @SerializedName("FlushType")
    @Expose
    private String FlushType;

    /**
    * Purge task submission time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Purge task ID. 
     * @return TaskId Purge task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Purge task ID.
     * @param TaskId Purge task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Purged URL. 
     * @return Url Purged URL.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Purged URL.
     * @param Url Purged URL.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Purge task status. fail: failed, done: succeeded, process: purging. 
     * @return Status Purge task status. fail: failed, done: succeeded, process: purging.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Purge task status. fail: failed, done: succeeded, process: purging.
     * @param Status Purge task status. fail: failed, done: succeeded, process: purging.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Purge type. url: URL purge; path: directory purge. 
     * @return PurgeType Purge type. url: URL purge; path: directory purge.
     */
    public String getPurgeType() {
        return this.PurgeType;
    }

    /**
     * Set Purge type. url: URL purge; path: directory purge.
     * @param PurgeType Purge type. url: URL purge; path: directory purge.
     */
    public void setPurgeType(String PurgeType) {
        this.PurgeType = PurgeType;
    }

    /**
     * Get Resource purge method. flush: purges updated resources, delete: purges all resources. 
     * @return FlushType Resource purge method. flush: purges updated resources, delete: purges all resources.
     */
    public String getFlushType() {
        return this.FlushType;
    }

    /**
     * Set Resource purge method. flush: purges updated resources, delete: purges all resources.
     * @param FlushType Resource purge method. flush: purges updated resources, delete: purges all resources.
     */
    public void setFlushType(String FlushType) {
        this.FlushType = FlushType;
    }

    /**
     * Get Purge task submission time 
     * @return CreateTime Purge task submission time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Purge task submission time
     * @param CreateTime Purge task submission time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public PurgeTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PurgeTask(PurgeTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PurgeType != null) {
            this.PurgeType = new String(source.PurgeType);
        }
        if (source.FlushType != null) {
            this.FlushType = new String(source.FlushType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PurgeType", this.PurgeType);
        this.setParamSimple(map, prefix + "FlushType", this.FlushType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

