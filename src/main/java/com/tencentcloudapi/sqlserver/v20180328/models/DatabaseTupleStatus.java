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
    * 
    */
    @SerializedName("PublishDatabase")
    @Expose
    private String PublishDatabase;

    /**
    * 
    */
    @SerializedName("SubscribeDatabase")
    @Expose
    private String SubscribeDatabase;

    /**
    * 
    */
    @SerializedName("LastSyncTime")
    @Expose
    private String LastSyncTime;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get  
     * @return PublishDatabase 
     */
    public String getPublishDatabase() {
        return this.PublishDatabase;
    }

    /**
     * Set 
     * @param PublishDatabase 
     */
    public void setPublishDatabase(String PublishDatabase) {
        this.PublishDatabase = PublishDatabase;
    }

    /**
     * Get  
     * @return SubscribeDatabase 
     */
    public String getSubscribeDatabase() {
        return this.SubscribeDatabase;
    }

    /**
     * Set 
     * @param SubscribeDatabase 
     */
    public void setSubscribeDatabase(String SubscribeDatabase) {
        this.SubscribeDatabase = SubscribeDatabase;
    }

    /**
     * Get  
     * @return LastSyncTime 
     */
    public String getLastSyncTime() {
        return this.LastSyncTime;
    }

    /**
     * Set 
     * @param LastSyncTime 
     */
    public void setLastSyncTime(String LastSyncTime) {
        this.LastSyncTime = LastSyncTime;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
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

