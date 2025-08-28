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

public class CreatePublishSubscribeRequest extends AbstractModel {

    /**
    * Publishing instance ID. For example, mssql-j8kv137v.
    */
    @SerializedName("PublishInstanceId")
    @Expose
    private String PublishInstanceId;

    /**
    * Subscription instance ID. For example, mssql-j8kv137v.
    */
    @SerializedName("SubscribeInstanceId")
    @Expose
    private String SubscribeInstanceId;

    /**
    * Publish/subscribe relationship collection of the database.
    */
    @SerializedName("DatabaseTupleSet")
    @Expose
    private DatabaseTuple [] DatabaseTupleSet;

    /**
    * Publish/subscribe name. The default value is default_name.
    */
    @SerializedName("PublishSubscribeName")
    @Expose
    private String PublishSubscribeName;

    /**
     * Get Publishing instance ID. For example, mssql-j8kv137v. 
     * @return PublishInstanceId Publishing instance ID. For example, mssql-j8kv137v.
     */
    public String getPublishInstanceId() {
        return this.PublishInstanceId;
    }

    /**
     * Set Publishing instance ID. For example, mssql-j8kv137v.
     * @param PublishInstanceId Publishing instance ID. For example, mssql-j8kv137v.
     */
    public void setPublishInstanceId(String PublishInstanceId) {
        this.PublishInstanceId = PublishInstanceId;
    }

    /**
     * Get Subscription instance ID. For example, mssql-j8kv137v. 
     * @return SubscribeInstanceId Subscription instance ID. For example, mssql-j8kv137v.
     */
    public String getSubscribeInstanceId() {
        return this.SubscribeInstanceId;
    }

    /**
     * Set Subscription instance ID. For example, mssql-j8kv137v.
     * @param SubscribeInstanceId Subscription instance ID. For example, mssql-j8kv137v.
     */
    public void setSubscribeInstanceId(String SubscribeInstanceId) {
        this.SubscribeInstanceId = SubscribeInstanceId;
    }

    /**
     * Get Publish/subscribe relationship collection of the database. 
     * @return DatabaseTupleSet Publish/subscribe relationship collection of the database.
     */
    public DatabaseTuple [] getDatabaseTupleSet() {
        return this.DatabaseTupleSet;
    }

    /**
     * Set Publish/subscribe relationship collection of the database.
     * @param DatabaseTupleSet Publish/subscribe relationship collection of the database.
     */
    public void setDatabaseTupleSet(DatabaseTuple [] DatabaseTupleSet) {
        this.DatabaseTupleSet = DatabaseTupleSet;
    }

    /**
     * Get Publish/subscribe name. The default value is default_name. 
     * @return PublishSubscribeName Publish/subscribe name. The default value is default_name.
     */
    public String getPublishSubscribeName() {
        return this.PublishSubscribeName;
    }

    /**
     * Set Publish/subscribe name. The default value is default_name.
     * @param PublishSubscribeName Publish/subscribe name. The default value is default_name.
     */
    public void setPublishSubscribeName(String PublishSubscribeName) {
        this.PublishSubscribeName = PublishSubscribeName;
    }

    public CreatePublishSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePublishSubscribeRequest(CreatePublishSubscribeRequest source) {
        if (source.PublishInstanceId != null) {
            this.PublishInstanceId = new String(source.PublishInstanceId);
        }
        if (source.SubscribeInstanceId != null) {
            this.SubscribeInstanceId = new String(source.SubscribeInstanceId);
        }
        if (source.DatabaseTupleSet != null) {
            this.DatabaseTupleSet = new DatabaseTuple[source.DatabaseTupleSet.length];
            for (int i = 0; i < source.DatabaseTupleSet.length; i++) {
                this.DatabaseTupleSet[i] = new DatabaseTuple(source.DatabaseTupleSet[i]);
            }
        }
        if (source.PublishSubscribeName != null) {
            this.PublishSubscribeName = new String(source.PublishSubscribeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishInstanceId", this.PublishInstanceId);
        this.setParamSimple(map, prefix + "SubscribeInstanceId", this.SubscribeInstanceId);
        this.setParamArrayObj(map, prefix + "DatabaseTupleSet.", this.DatabaseTupleSet);
        this.setParamSimple(map, prefix + "PublishSubscribeName", this.PublishSubscribeName);

    }
}

