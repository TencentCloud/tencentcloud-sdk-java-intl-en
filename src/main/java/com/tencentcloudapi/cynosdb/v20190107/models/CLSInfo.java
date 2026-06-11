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
    * Log topic operation: Options are create, reuse. 
create: Create a new log topic, using TopicName to create the log topic.
reuse: Use an existing log topic, using TopicId to specify the log topic.
The combination of using an existing log topic while creating a new logset is not allowed.
    */
    @SerializedName("TopicOperation")
    @Expose
    private String TopicOperation;

    /**
    * Logset operation: Options are create, reuse.
create: Create a new logset, using GroupName to create the logset.
reuse: Use an existing logset, using GroupId to specify the logset.
The combination of using an existing log topic while creating a new logset is not allowed.
    */
    @SerializedName("GroupOperation")
    @Expose
    private String GroupOperation;

    /**
    * Log delivery region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Log topic ID.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Logset ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Logset name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get Log topic operation: Options are create, reuse. 
create: Create a new log topic, using TopicName to create the log topic.
reuse: Use an existing log topic, using TopicId to specify the log topic.
The combination of using an existing log topic while creating a new logset is not allowed. 
     * @return TopicOperation Log topic operation: Options are create, reuse. 
create: Create a new log topic, using TopicName to create the log topic.
reuse: Use an existing log topic, using TopicId to specify the log topic.
The combination of using an existing log topic while creating a new logset is not allowed.
     */
    public String getTopicOperation() {
        return this.TopicOperation;
    }

    /**
     * Set Log topic operation: Options are create, reuse. 
create: Create a new log topic, using TopicName to create the log topic.
reuse: Use an existing log topic, using TopicId to specify the log topic.
The combination of using an existing log topic while creating a new logset is not allowed.
     * @param TopicOperation Log topic operation: Options are create, reuse. 
create: Create a new log topic, using TopicName to create the log topic.
reuse: Use an existing log topic, using TopicId to specify the log topic.
The combination of using an existing log topic while creating a new logset is not allowed.
     */
    public void setTopicOperation(String TopicOperation) {
        this.TopicOperation = TopicOperation;
    }

    /**
     * Get Logset operation: Options are create, reuse.
create: Create a new logset, using GroupName to create the logset.
reuse: Use an existing logset, using GroupId to specify the logset.
The combination of using an existing log topic while creating a new logset is not allowed. 
     * @return GroupOperation Logset operation: Options are create, reuse.
create: Create a new logset, using GroupName to create the logset.
reuse: Use an existing logset, using GroupId to specify the logset.
The combination of using an existing log topic while creating a new logset is not allowed.
     */
    public String getGroupOperation() {
        return this.GroupOperation;
    }

    /**
     * Set Logset operation: Options are create, reuse.
create: Create a new logset, using GroupName to create the logset.
reuse: Use an existing logset, using GroupId to specify the logset.
The combination of using an existing log topic while creating a new logset is not allowed.
     * @param GroupOperation Logset operation: Options are create, reuse.
create: Create a new logset, using GroupName to create the logset.
reuse: Use an existing logset, using GroupId to specify the logset.
The combination of using an existing log topic while creating a new logset is not allowed.
     */
    public void setGroupOperation(String GroupOperation) {
        this.GroupOperation = GroupOperation;
    }

    /**
     * Get Log delivery region. 
     * @return Region Log delivery region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Log delivery region.
     * @param Region Log delivery region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Log topic ID. 
     * @return TopicId Log topic ID.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID.
     * @param TopicId Log topic ID.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Log topic name. 
     * @return TopicName Log topic name.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Log topic name.
     * @param TopicName Log topic name.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Logset ID. 
     * @return GroupId Logset ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Logset ID.
     * @param GroupId Logset ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Logset name. 
     * @return GroupName Logset name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Logset name.
     * @param GroupName Logset name.
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

