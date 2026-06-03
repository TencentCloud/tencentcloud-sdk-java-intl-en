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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceLogToCLSRequest extends AbstractModel {

    /**
    * <p>Instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Log type. Error: error log, slowlog: slow log.</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Delivery status. ON: enabled, OFF: disabled.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Whether required to create logset. Default to false.</p>
    */
    @SerializedName("CreateLogset")
    @Expose
    private Boolean CreateLogset;

    /**
    * <p>Logset name when creating a logset; logset ID when selecting an existing logset. Empty by default.<br>Description: When the Status parameter is ON, either the Logset or LogTopic parameter must be filled.</p>
    */
    @SerializedName("Logset")
    @Expose
    private String Logset;

    /**
    * <p>Whether required to create log topic. Default to false.</p>
    */
    @SerializedName("CreateLogTopic")
    @Expose
    private Boolean CreateLogTopic;

    /**
    * <p>Enter a log topic name when creating a log topic, or enter a log topic ID when selecting an existing log topic. Empty by default.<br>Description: When the Status parameter is set to ON, either the Logset or LogTopic parameter must be specified.</p>
    */
    @SerializedName("LogTopic")
    @Expose
    private String LogTopic;

    /**
    * <p>Valid period of the log topic. Default value: 30 days if left empty. Maximum value: 3600 days.</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Whether to create an index when creating a log topic. Defaults to false.</p>
    */
    @SerializedName("CreateIndex")
    @Expose
    private Boolean CreateIndex;

    /**
    * <p>CLS region. If left empty, it defaults to the Region parameter value.</p>
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

    /**
    * <p>Selectable when creating a log topic. Cannot exceed 10 tags</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfoItem [] ResourceTags;

    /**
     * Get <p>Instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p> 
     * @return InstanceId <p>Instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     * @param InstanceId <p>Instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Log type. Error: error log, slowlog: slow log.</p> 
     * @return LogType <p>Log type. Error: error log, slowlog: slow log.</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type. Error: error log, slowlog: slow log.</p>
     * @param LogType <p>Log type. Error: error log, slowlog: slow log.</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Delivery status. ON: enabled, OFF: disabled.</p> 
     * @return Status <p>Delivery status. ON: enabled, OFF: disabled.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Delivery status. ON: enabled, OFF: disabled.</p>
     * @param Status <p>Delivery status. ON: enabled, OFF: disabled.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Whether required to create logset. Default to false.</p> 
     * @return CreateLogset <p>Whether required to create logset. Default to false.</p>
     */
    public Boolean getCreateLogset() {
        return this.CreateLogset;
    }

    /**
     * Set <p>Whether required to create logset. Default to false.</p>
     * @param CreateLogset <p>Whether required to create logset. Default to false.</p>
     */
    public void setCreateLogset(Boolean CreateLogset) {
        this.CreateLogset = CreateLogset;
    }

    /**
     * Get <p>Logset name when creating a logset; logset ID when selecting an existing logset. Empty by default.<br>Description: When the Status parameter is ON, either the Logset or LogTopic parameter must be filled.</p> 
     * @return Logset <p>Logset name when creating a logset; logset ID when selecting an existing logset. Empty by default.<br>Description: When the Status parameter is ON, either the Logset or LogTopic parameter must be filled.</p>
     */
    public String getLogset() {
        return this.Logset;
    }

    /**
     * Set <p>Logset name when creating a logset; logset ID when selecting an existing logset. Empty by default.<br>Description: When the Status parameter is ON, either the Logset or LogTopic parameter must be filled.</p>
     * @param Logset <p>Logset name when creating a logset; logset ID when selecting an existing logset. Empty by default.<br>Description: When the Status parameter is ON, either the Logset or LogTopic parameter must be filled.</p>
     */
    public void setLogset(String Logset) {
        this.Logset = Logset;
    }

    /**
     * Get <p>Whether required to create log topic. Default to false.</p> 
     * @return CreateLogTopic <p>Whether required to create log topic. Default to false.</p>
     */
    public Boolean getCreateLogTopic() {
        return this.CreateLogTopic;
    }

    /**
     * Set <p>Whether required to create log topic. Default to false.</p>
     * @param CreateLogTopic <p>Whether required to create log topic. Default to false.</p>
     */
    public void setCreateLogTopic(Boolean CreateLogTopic) {
        this.CreateLogTopic = CreateLogTopic;
    }

    /**
     * Get <p>Enter a log topic name when creating a log topic, or enter a log topic ID when selecting an existing log topic. Empty by default.<br>Description: When the Status parameter is set to ON, either the Logset or LogTopic parameter must be specified.</p> 
     * @return LogTopic <p>Enter a log topic name when creating a log topic, or enter a log topic ID when selecting an existing log topic. Empty by default.<br>Description: When the Status parameter is set to ON, either the Logset or LogTopic parameter must be specified.</p>
     */
    public String getLogTopic() {
        return this.LogTopic;
    }

    /**
     * Set <p>Enter a log topic name when creating a log topic, or enter a log topic ID when selecting an existing log topic. Empty by default.<br>Description: When the Status parameter is set to ON, either the Logset or LogTopic parameter must be specified.</p>
     * @param LogTopic <p>Enter a log topic name when creating a log topic, or enter a log topic ID when selecting an existing log topic. Empty by default.<br>Description: When the Status parameter is set to ON, either the Logset or LogTopic parameter must be specified.</p>
     */
    public void setLogTopic(String LogTopic) {
        this.LogTopic = LogTopic;
    }

    /**
     * Get <p>Valid period of the log topic. Default value: 30 days if left empty. Maximum value: 3600 days.</p> 
     * @return Period <p>Valid period of the log topic. Default value: 30 days if left empty. Maximum value: 3600 days.</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Valid period of the log topic. Default value: 30 days if left empty. Maximum value: 3600 days.</p>
     * @param Period <p>Valid period of the log topic. Default value: 30 days if left empty. Maximum value: 3600 days.</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Whether to create an index when creating a log topic. Defaults to false.</p> 
     * @return CreateIndex <p>Whether to create an index when creating a log topic. Defaults to false.</p>
     */
    public Boolean getCreateIndex() {
        return this.CreateIndex;
    }

    /**
     * Set <p>Whether to create an index when creating a log topic. Defaults to false.</p>
     * @param CreateIndex <p>Whether to create an index when creating a log topic. Defaults to false.</p>
     */
    public void setCreateIndex(Boolean CreateIndex) {
        this.CreateIndex = CreateIndex;
    }

    /**
     * Get <p>CLS region. If left empty, it defaults to the Region parameter value.</p> 
     * @return ClsRegion <p>CLS region. If left empty, it defaults to the Region parameter value.</p>
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set <p>CLS region. If left empty, it defaults to the Region parameter value.</p>
     * @param ClsRegion <p>CLS region. If left empty, it defaults to the Region parameter value.</p>
     */
    public void setClsRegion(String ClsRegion) {
        this.ClsRegion = ClsRegion;
    }

    /**
     * Get <p>Selectable when creating a log topic. Cannot exceed 10 tags</p> 
     * @return ResourceTags <p>Selectable when creating a log topic. Cannot exceed 10 tags</p>
     */
    public TagInfoItem [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>Selectable when creating a log topic. Cannot exceed 10 tags</p>
     * @param ResourceTags <p>Selectable when creating a log topic. Cannot exceed 10 tags</p>
     */
    public void setResourceTags(TagInfoItem [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    public ModifyDBInstanceLogToCLSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceLogToCLSRequest(ModifyDBInstanceLogToCLSRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateLogset != null) {
            this.CreateLogset = new Boolean(source.CreateLogset);
        }
        if (source.Logset != null) {
            this.Logset = new String(source.Logset);
        }
        if (source.CreateLogTopic != null) {
            this.CreateLogTopic = new Boolean(source.CreateLogTopic);
        }
        if (source.LogTopic != null) {
            this.LogTopic = new String(source.LogTopic);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.CreateIndex != null) {
            this.CreateIndex = new Boolean(source.CreateIndex);
        }
        if (source.ClsRegion != null) {
            this.ClsRegion = new String(source.ClsRegion);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfoItem[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfoItem(source.ResourceTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateLogset", this.CreateLogset);
        this.setParamSimple(map, prefix + "Logset", this.Logset);
        this.setParamSimple(map, prefix + "CreateLogTopic", this.CreateLogTopic);
        this.setParamSimple(map, prefix + "LogTopic", this.LogTopic);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "CreateIndex", this.CreateIndex);
        this.setParamSimple(map, prefix + "ClsRegion", this.ClsRegion);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

