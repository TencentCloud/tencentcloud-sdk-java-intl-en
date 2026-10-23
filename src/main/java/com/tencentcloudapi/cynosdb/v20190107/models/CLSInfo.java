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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLSInfo extends AbstractModel {

    /**
    * Log topic operation. Options: create, reuse.
Create: Add a log topic. Use TopicName to create a log topic.
reuse: Use an existing log topic and specify it by TopicId.
It is not allowed to use a combination of an existing log topic and a new log set.
    */
    @SerializedName("TopicOperation")
    @Expose
    private String TopicOperation;

    /**
    * Logset operation. Options: create, reuse.
create: add a new log set using GroupName.
reuse: utilize an existing logset and specify the logset by GroupId.
It is not allowed to use a combination of an existing log topic and a new log set.
    */
    @SerializedName("GroupOperation")
    @Expose
    private String GroupOperation;

    /**
    * Log delivery region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Log topic id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Logset id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Log set name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get Log topic operation. Options: create, reuse.
Create: Add a log topic. Use TopicName to create a log topic.
reuse: Use an existing log topic and specify it by TopicId.
It is not allowed to use a combination of an existing log topic and a new log set. 
     * @return TopicOperation Log topic operation. Options: create, reuse.
Create: Add a log topic. Use TopicName to create a log topic.
reuse: Use an existing log topic and specify it by TopicId.
It is not allowed to use a combination of an existing log topic and a new log set.
     */
    public String getTopicOperation() {
        return this.TopicOperation;
    }

    /**
     * Set Log topic operation. Options: create, reuse.
Create: Add a log topic. Use TopicName to create a log topic.
reuse: Use an existing log topic and specify it by TopicId.
It is not allowed to use a combination of an existing log topic and a new log set.
     * @param TopicOperation Log topic operation. Options: create, reuse.
Create: Add a log topic. Use TopicName to create a log topic.
reuse: Use an existing log topic and specify it by TopicId.
It is not allowed to use a combination of an existing log topic and a new log set.
     */
    public void setTopicOperation(String TopicOperation) {
        this.TopicOperation = TopicOperation;
    }

    /**
     * Get Logset operation. Options: create, reuse.
create: add a new log set using GroupName.
reuse: utilize an existing logset and specify the logset by GroupId.
It is not allowed to use a combination of an existing log topic and a new log set. 
     * @return GroupOperation Logset operation. Options: create, reuse.
create: add a new log set using GroupName.
reuse: utilize an existing logset and specify the logset by GroupId.
It is not allowed to use a combination of an existing log topic and a new log set.
     */
    public String getGroupOperation() {
        return this.GroupOperation;
    }

    /**
     * Set Logset operation. Options: create, reuse.
create: add a new log set using GroupName.
reuse: utilize an existing logset and specify the logset by GroupId.
It is not allowed to use a combination of an existing log topic and a new log set.
     * @param GroupOperation Logset operation. Options: create, reuse.
create: add a new log set using GroupName.
reuse: utilize an existing logset and specify the logset by GroupId.
It is not allowed to use a combination of an existing log topic and a new log set.
     */
    public void setGroupOperation(String GroupOperation) {
        this.GroupOperation = GroupOperation;
    }

    /**
     * Get Log delivery region 
     * @return Region Log delivery region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Log delivery region
     * @param Region Log delivery region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Log topic id 
     * @return TopicId Log topic id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic id
     * @param TopicId Log topic id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Log topic name 
     * @return TopicName Log topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Log topic name
     * @param TopicName Log topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Logset id 
     * @return GroupId Logset id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Logset id
     * @param GroupId Logset id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Log set name. 
     * @return GroupName Log set name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Log set name.
     * @param GroupName Log set name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public CLSInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLSInfo(CLSInfo source) {
        if (source.TopicOperation != null) {
            this.TopicOperation = new String(source.TopicOperation);
        }
        if (source.GroupOperation != null) {
            this.GroupOperation = new String(source.GroupOperation);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicOperation", this.TopicOperation);
        this.setParamSimple(map, prefix + "GroupOperation", this.GroupOperation);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

