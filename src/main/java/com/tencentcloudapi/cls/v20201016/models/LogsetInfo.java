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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogsetInfo extends AbstractModel{

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Logset name
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Tag bound to logset
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Number of log topics in logset
    */
    @SerializedName("TopicCount")
    @Expose
    private Long TopicCount;

    /**
    * If `AssumerUin` is not empty, it indicates the service provider who creates the logset
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get Logset ID 
     * @return LogsetId Logset ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID
     * @param LogsetId Logset ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Logset name 
     * @return LogsetName Logset name
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set Logset name
     * @param LogsetName Logset name
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Tag bound to logset
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Tags Tag bound to logset
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag bound to logset
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Tags Tag bound to logset
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Number of log topics in logset 
     * @return TopicCount Number of log topics in logset
     */
    public Long getTopicCount() {
        return this.TopicCount;
    }

    /**
     * Set Number of log topics in logset
     * @param TopicCount Number of log topics in logset
     */
    public void setTopicCount(Long TopicCount) {
        this.TopicCount = TopicCount;
    }

    /**
     * Get If `AssumerUin` is not empty, it indicates the service provider who creates the logset 
     * @return RoleName If `AssumerUin` is not empty, it indicates the service provider who creates the logset
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set If `AssumerUin` is not empty, it indicates the service provider who creates the logset
     * @param RoleName If `AssumerUin` is not empty, it indicates the service provider who creates the logset
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public LogsetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogsetInfo(LogsetInfo source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.TopicCount != null) {
            this.TopicCount = new Long(source.TopicCount);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TopicCount", this.TopicCount);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

