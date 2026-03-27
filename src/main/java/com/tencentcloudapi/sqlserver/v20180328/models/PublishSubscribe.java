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

public class PublishSubscribe extends AbstractModel {

    /**
    * Pub/Sub ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Pub/Sub Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Published Instance ID
    */
    @SerializedName("PublishInstanceId")
    @Expose
    private String PublishInstanceId;

    /**
    * Published Instance Name
    */
    @SerializedName("PublishInstanceName")
    @Expose
    private String PublishInstanceName;

    /**
    * Published Instance IP
    */
    @SerializedName("PublishInstanceIp")
    @Expose
    private String PublishInstanceIp;

    /**
    * Subscription Instance ID
    */
    @SerializedName("SubscribeInstanceId")
    @Expose
    private String SubscribeInstanceId;

    /**
    * Subscription Instance Name
    */
    @SerializedName("SubscribeInstanceName")
    @Expose
    private String SubscribeInstanceName;

    /**
    * Subscription Instance IP
    */
    @SerializedName("SubscribeInstanceIp")
    @Expose
    private String SubscribeInstanceIp;

    /**
    * Publication-Subscription Relationship Collection of Database
    */
    @SerializedName("DatabaseTupleSet")
    @Expose
    private DatabaseTupleStatus [] DatabaseTupleSet;

    /**
     * Get Pub/Sub ID 
     * @return Id Pub/Sub ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Pub/Sub ID
     * @param Id Pub/Sub ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Pub/Sub Name 
     * @return Name Pub/Sub Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Pub/Sub Name
     * @param Name Pub/Sub Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Published Instance ID 
     * @return PublishInstanceId Published Instance ID
     */
    public String getPublishInstanceId() {
        return this.PublishInstanceId;
    }

    /**
     * Set Published Instance ID
     * @param PublishInstanceId Published Instance ID
     */
    public void setPublishInstanceId(String PublishInstanceId) {
        this.PublishInstanceId = PublishInstanceId;
    }

    /**
     * Get Published Instance Name 
     * @return PublishInstanceName Published Instance Name
     */
    public String getPublishInstanceName() {
        return this.PublishInstanceName;
    }

    /**
     * Set Published Instance Name
     * @param PublishInstanceName Published Instance Name
     */
    public void setPublishInstanceName(String PublishInstanceName) {
        this.PublishInstanceName = PublishInstanceName;
    }

    /**
     * Get Published Instance IP 
     * @return PublishInstanceIp Published Instance IP
     */
    public String getPublishInstanceIp() {
        return this.PublishInstanceIp;
    }

    /**
     * Set Published Instance IP
     * @param PublishInstanceIp Published Instance IP
     */
    public void setPublishInstanceIp(String PublishInstanceIp) {
        this.PublishInstanceIp = PublishInstanceIp;
    }

    /**
     * Get Subscription Instance ID 
     * @return SubscribeInstanceId Subscription Instance ID
     */
    public String getSubscribeInstanceId() {
        return this.SubscribeInstanceId;
    }

    /**
     * Set Subscription Instance ID
     * @param SubscribeInstanceId Subscription Instance ID
     */
    public void setSubscribeInstanceId(String SubscribeInstanceId) {
        this.SubscribeInstanceId = SubscribeInstanceId;
    }

    /**
     * Get Subscription Instance Name 
     * @return SubscribeInstanceName Subscription Instance Name
     */
    public String getSubscribeInstanceName() {
        return this.SubscribeInstanceName;
    }

    /**
     * Set Subscription Instance Name
     * @param SubscribeInstanceName Subscription Instance Name
     */
    public void setSubscribeInstanceName(String SubscribeInstanceName) {
        this.SubscribeInstanceName = SubscribeInstanceName;
    }

    /**
     * Get Subscription Instance IP 
     * @return SubscribeInstanceIp Subscription Instance IP
     */
    public String getSubscribeInstanceIp() {
        return this.SubscribeInstanceIp;
    }

    /**
     * Set Subscription Instance IP
     * @param SubscribeInstanceIp Subscription Instance IP
     */
    public void setSubscribeInstanceIp(String SubscribeInstanceIp) {
        this.SubscribeInstanceIp = SubscribeInstanceIp;
    }

    /**
     * Get Publication-Subscription Relationship Collection of Database 
     * @return DatabaseTupleSet Publication-Subscription Relationship Collection of Database
     */
    public DatabaseTupleStatus [] getDatabaseTupleSet() {
        return this.DatabaseTupleSet;
    }

    /**
     * Set Publication-Subscription Relationship Collection of Database
     * @param DatabaseTupleSet Publication-Subscription Relationship Collection of Database
     */
    public void setDatabaseTupleSet(DatabaseTupleStatus [] DatabaseTupleSet) {
        this.DatabaseTupleSet = DatabaseTupleSet;
    }

    public PublishSubscribe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishSubscribe(PublishSubscribe source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PublishInstanceId != null) {
            this.PublishInstanceId = new String(source.PublishInstanceId);
        }
        if (source.PublishInstanceName != null) {
            this.PublishInstanceName = new String(source.PublishInstanceName);
        }
        if (source.PublishInstanceIp != null) {
            this.PublishInstanceIp = new String(source.PublishInstanceIp);
        }
        if (source.SubscribeInstanceId != null) {
            this.SubscribeInstanceId = new String(source.SubscribeInstanceId);
        }
        if (source.SubscribeInstanceName != null) {
            this.SubscribeInstanceName = new String(source.SubscribeInstanceName);
        }
        if (source.SubscribeInstanceIp != null) {
            this.SubscribeInstanceIp = new String(source.SubscribeInstanceIp);
        }
        if (source.DatabaseTupleSet != null) {
            this.DatabaseTupleSet = new DatabaseTupleStatus[source.DatabaseTupleSet.length];
            for (int i = 0; i < source.DatabaseTupleSet.length; i++) {
                this.DatabaseTupleSet[i] = new DatabaseTupleStatus(source.DatabaseTupleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PublishInstanceId", this.PublishInstanceId);
        this.setParamSimple(map, prefix + "PublishInstanceName", this.PublishInstanceName);
        this.setParamSimple(map, prefix + "PublishInstanceIp", this.PublishInstanceIp);
        this.setParamSimple(map, prefix + "SubscribeInstanceId", this.SubscribeInstanceId);
        this.setParamSimple(map, prefix + "SubscribeInstanceName", this.SubscribeInstanceName);
        this.setParamSimple(map, prefix + "SubscribeInstanceIp", this.SubscribeInstanceIp);
        this.setParamArrayObj(map, prefix + "DatabaseTupleSet.", this.DatabaseTupleSet);

    }
}

