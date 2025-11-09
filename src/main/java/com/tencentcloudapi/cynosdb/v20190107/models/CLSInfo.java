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
    * 
    */
    @SerializedName("TopicOperation")
    @Expose
    private String TopicOperation;

    /**
    * 
    */
    @SerializedName("GroupOperation")
    @Expose
    private String GroupOperation;

    /**
    * 
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get  
     * @return TopicOperation 
     */
    public String getTopicOperation() {
        return this.TopicOperation;
    }

    /**
     * Set 
     * @param TopicOperation 
     */
    public void setTopicOperation(String TopicOperation) {
        this.TopicOperation = TopicOperation;
    }

    /**
     * Get  
     * @return GroupOperation 
     */
    public String getGroupOperation() {
        return this.GroupOperation;
    }

    /**
     * Set 
     * @param GroupOperation 
     */
    public void setGroupOperation(String GroupOperation) {
        this.GroupOperation = GroupOperation;
    }

    /**
     * Get  
     * @return Region 
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 
     * @param Region 
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get  
     * @return TopicId 
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 
     * @param TopicId 
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get  
     * @return TopicName 
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 
     * @param TopicName 
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get  
     * @return GroupId 
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 
     * @param GroupId 
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get  
     * @return GroupName 
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 
     * @param GroupName 
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

