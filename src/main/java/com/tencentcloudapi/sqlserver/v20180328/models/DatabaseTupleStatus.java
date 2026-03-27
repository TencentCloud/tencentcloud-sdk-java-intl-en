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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabaseTupleStatus extends AbstractModel {

    /**
    * Publish Database Name
    */
    @SerializedName("PublishDatabase")
    @Expose
    private String PublishDatabase;

    /**
    * Subscription Database Name
    */
    @SerializedName("SubscribeDatabase")
    @Expose
    private String SubscribeDatabase;

    /**
    * Latest Synchronization Time
    */
    @SerializedName("LastSyncTime")
    @Expose
    private String LastSyncTime;

    /**
    * Publish/Subscribe Status Between Databases: running, success, fail, unknow
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Publish Database Name 
     * @return PublishDatabase Publish Database Name
     */
    public String getPublishDatabase() {
        return this.PublishDatabase;
    }

    /**
     * Set Publish Database Name
     * @param PublishDatabase Publish Database Name
     */
    public void setPublishDatabase(String PublishDatabase) {
        this.PublishDatabase = PublishDatabase;
    }

    /**
     * Get Subscription Database Name 
     * @return SubscribeDatabase Subscription Database Name
     */
    public String getSubscribeDatabase() {
        return this.SubscribeDatabase;
    }

    /**
     * Set Subscription Database Name
     * @param SubscribeDatabase Subscription Database Name
     */
    public void setSubscribeDatabase(String SubscribeDatabase) {
        this.SubscribeDatabase = SubscribeDatabase;
    }

    /**
     * Get Latest Synchronization Time 
     * @return LastSyncTime Latest Synchronization Time
     */
    public String getLastSyncTime() {
        return this.LastSyncTime;
    }

    /**
     * Set Latest Synchronization Time
     * @param LastSyncTime Latest Synchronization Time
     */
    public void setLastSyncTime(String LastSyncTime) {
        this.LastSyncTime = LastSyncTime;
    }

    /**
     * Get Publish/Subscribe Status Between Databases: running, success, fail, unknow 
     * @return Status Publish/Subscribe Status Between Databases: running, success, fail, unknow
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Publish/Subscribe Status Between Databases: running, success, fail, unknow
     * @param Status Publish/Subscribe Status Between Databases: running, success, fail, unknow
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DatabaseTupleStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseTupleStatus(DatabaseTupleStatus source) {
        if (source.PublishDatabase != null) {
            this.PublishDatabase = new String(source.PublishDatabase);
        }
        if (source.SubscribeDatabase != null) {
            this.SubscribeDatabase = new String(source.SubscribeDatabase);
        }
        if (source.LastSyncTime != null) {
            this.LastSyncTime = new String(source.LastSyncTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishDatabase", this.PublishDatabase);
        this.setParamSimple(map, prefix + "SubscribeDatabase", this.SubscribeDatabase);
        this.setParamSimple(map, prefix + "LastSyncTime", this.LastSyncTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

