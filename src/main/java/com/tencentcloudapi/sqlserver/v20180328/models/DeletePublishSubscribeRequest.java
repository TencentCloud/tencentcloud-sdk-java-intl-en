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

public class DeletePublishSubscribeRequest extends AbstractModel {

    /**
    * Publish/subscribe ID, which can be obtained through the DescribePublishSubscribe API.
    */
    @SerializedName("PublishSubscribeId")
    @Expose
    private Long PublishSubscribeId;

    /**
    * Publish/subscribe relationship collection of the database to be deleted.
    */
    @SerializedName("DatabaseTupleSet")
    @Expose
    private DatabaseTuple [] DatabaseTupleSet;

    /**
     * Get Publish/subscribe ID, which can be obtained through the DescribePublishSubscribe API. 
     * @return PublishSubscribeId Publish/subscribe ID, which can be obtained through the DescribePublishSubscribe API.
     */
    public Long getPublishSubscribeId() {
        return this.PublishSubscribeId;
    }

    /**
     * Set Publish/subscribe ID, which can be obtained through the DescribePublishSubscribe API.
     * @param PublishSubscribeId Publish/subscribe ID, which can be obtained through the DescribePublishSubscribe API.
     */
    public void setPublishSubscribeId(Long PublishSubscribeId) {
        this.PublishSubscribeId = PublishSubscribeId;
    }

    /**
     * Get Publish/subscribe relationship collection of the database to be deleted. 
     * @return DatabaseTupleSet Publish/subscribe relationship collection of the database to be deleted.
     */
    public DatabaseTuple [] getDatabaseTupleSet() {
        return this.DatabaseTupleSet;
    }

    /**
     * Set Publish/subscribe relationship collection of the database to be deleted.
     * @param DatabaseTupleSet Publish/subscribe relationship collection of the database to be deleted.
     */
    public void setDatabaseTupleSet(DatabaseTuple [] DatabaseTupleSet) {
        this.DatabaseTupleSet = DatabaseTupleSet;
    }

    public DeletePublishSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePublishSubscribeRequest(DeletePublishSubscribeRequest source) {
        if (source.PublishSubscribeId != null) {
            this.PublishSubscribeId = new Long(source.PublishSubscribeId);
        }
        if (source.DatabaseTupleSet != null) {
            this.DatabaseTupleSet = new DatabaseTuple[source.DatabaseTupleSet.length];
            for (int i = 0; i < source.DatabaseTupleSet.length; i++) {
                this.DatabaseTupleSet[i] = new DatabaseTuple(source.DatabaseTupleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishSubscribeId", this.PublishSubscribeId);
        this.setParamArrayObj(map, prefix + "DatabaseTupleSet.", this.DatabaseTupleSet);

    }
}

