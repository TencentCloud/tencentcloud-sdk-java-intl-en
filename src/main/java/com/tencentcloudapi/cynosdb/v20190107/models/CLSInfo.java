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
    * Log topic operation: optional create, reuse.
create: create a new log topic using TopicName.
reuse: use an existing log topic by specifying TopicId.
Combining the use of an existing log topic and creating a new log set is not allowed.
    */
    @SerializedName("TopicOperation")
    @Expose
    private String TopicOperation;

    /**
    * Log set operation: optional create, reuse.
create: create a new log set using GroupName.
reuse: use an existing log set by specifying GroupId.
Combining the use of an existing log topic and creating a new log set is not allowed.
    */
    @SerializedName("GroupOperation")
    @Expose
    private String GroupOperation;

    /**
    * Log Delivery Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * log topic id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * log topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * log set id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * log set name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get Log topic operation: optional create, reuse.
create: create a new log topic using TopicName.
reuse: use an existing log topic by specifying TopicId.
Combining the use of an existing log topic and creating a new log set is not allowed. 
     * @return TopicOperation Log topic operation: optional create, reuse.
create: create a new log topic using TopicName.
reuse: use an existing log topic by specifying TopicId.
Combining the use of an existing log topic and creating a new log set is not allowed.
     */
    public String getTopicOperation() {
        return this.TopicOperation;
    }

    /**
     * Set Log topic operation: optional create, reuse.
create: create a new log topic using TopicName.
reuse: use an existing log topic by specifying TopicId.
Combining the use of an existing log topic and creating a new log set is not allowed.
     * @param TopicOperation Log topic operation: optional create, reuse.
create: create a new log topic using TopicName.
reuse: use an existing log topic by specifying TopicId.
Combining the use of an existing log topic and creating a new log set is not allowed.
     */
    public void setTopicOperation(String TopicOperation) {
        this.TopicOperation = TopicOperation;
    }

    /**
     * Get Log set operation: optional create, reuse.
create: create a new log set using GroupName.
reuse: use an existing log set by specifying GroupId.
Combining the use of an existing log topic and creating a new log set is not allowed. 
     * @return GroupOperation Log set operation: optional create, reuse.
create: create a new log set using GroupName.
reuse: use an existing log set by specifying GroupId.
Combining the use of an existing log topic and creating a new log set is not allowed.
     */
    public String getGroupOperation() {
        return this.GroupOperation;
    }

    /**
     * Set Log set operation: optional create, reuse.
create: create a new log set using GroupName.
reuse: use an existing log set by specifying GroupId.
Combining the use of an existing log topic and creating a new log set is not allowed.
     * @param GroupOperation Log set operation: optional create, reuse.
create: create a new log set using GroupName.
reuse: use an existing log set by specifying GroupId.
Combining the use of an existing log topic and creating a new log set is not allowed.
     */
    public void setGroupOperation(String GroupOperation) {
        this.GroupOperation = GroupOperation;
    }

    /**
     * Get Log Delivery Region 
     * @return Region Log Delivery Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Log Delivery Region
     * @param Region Log Delivery Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get log topic id 
     * @return TopicId log topic id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set log topic id
     * @param TopicId log topic id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get log topic name 
     * @return TopicName log topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set log topic name
     * @param TopicName log topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get log set id 
     * @return GroupId log set id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set log set id
     * @param GroupId log set id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get log set name 
     * @return GroupName log set name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set log set name
     * @param GroupName log set name
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

