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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceLogToCLSRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Log type. Valid values: error and slowLog.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Enabling status. Valid values: ON and OFF.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Indicates whether a log set needs to be created.
    */
    @SerializedName("CreateLogset")
    @Expose
    private Boolean CreateLogset;

    /**
    * Log set name if the log set is to be created or ID of the selected existing log set.
    */
    @SerializedName("Logset")
    @Expose
    private String Logset;

    /**
    * Indicates whether a log topic needs to be created.
    */
    @SerializedName("CreateLogTopic")
    @Expose
    private Boolean CreateLogTopic;

    /**
    * Log topic name if the topic is to be created or ID of the selected existing topic.
    */
    @SerializedName("LogTopic")
    @Expose
    private String LogTopic;

    /**
    * Log topic validity period, which is 30 days by default if not specified.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Indicates whether to create an index when creating the log topic.
    */
    @SerializedName("CreateIndex")
    @Expose
    private Boolean CreateIndex;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Log type. Valid values: error and slowLog. 
     * @return LogType Log type. Valid values: error and slowLog.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type. Valid values: error and slowLog.
     * @param LogType Log type. Valid values: error and slowLog.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Enabling status. Valid values: ON and OFF. 
     * @return Status Enabling status. Valid values: ON and OFF.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Enabling status. Valid values: ON and OFF.
     * @param Status Enabling status. Valid values: ON and OFF.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Indicates whether a log set needs to be created. 
     * @return CreateLogset Indicates whether a log set needs to be created.
     */
    public Boolean getCreateLogset() {
        return this.CreateLogset;
    }

    /**
     * Set Indicates whether a log set needs to be created.
     * @param CreateLogset Indicates whether a log set needs to be created.
     */
    public void setCreateLogset(Boolean CreateLogset) {
        this.CreateLogset = CreateLogset;
    }

    /**
     * Get Log set name if the log set is to be created or ID of the selected existing log set. 
     * @return Logset Log set name if the log set is to be created or ID of the selected existing log set.
     */
    public String getLogset() {
        return this.Logset;
    }

    /**
     * Set Log set name if the log set is to be created or ID of the selected existing log set.
     * @param Logset Log set name if the log set is to be created or ID of the selected existing log set.
     */
    public void setLogset(String Logset) {
        this.Logset = Logset;
    }

    /**
     * Get Indicates whether a log topic needs to be created. 
     * @return CreateLogTopic Indicates whether a log topic needs to be created.
     */
    public Boolean getCreateLogTopic() {
        return this.CreateLogTopic;
    }

    /**
     * Set Indicates whether a log topic needs to be created.
     * @param CreateLogTopic Indicates whether a log topic needs to be created.
     */
    public void setCreateLogTopic(Boolean CreateLogTopic) {
        this.CreateLogTopic = CreateLogTopic;
    }

    /**
     * Get Log topic name if the topic is to be created or ID of the selected existing topic. 
     * @return LogTopic Log topic name if the topic is to be created or ID of the selected existing topic.
     */
    public String getLogTopic() {
        return this.LogTopic;
    }

    /**
     * Set Log topic name if the topic is to be created or ID of the selected existing topic.
     * @param LogTopic Log topic name if the topic is to be created or ID of the selected existing topic.
     */
    public void setLogTopic(String LogTopic) {
        this.LogTopic = LogTopic;
    }

    /**
     * Get Log topic validity period, which is 30 days by default if not specified. 
     * @return Period Log topic validity period, which is 30 days by default if not specified.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Log topic validity period, which is 30 days by default if not specified.
     * @param Period Log topic validity period, which is 30 days by default if not specified.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Indicates whether to create an index when creating the log topic. 
     * @return CreateIndex Indicates whether to create an index when creating the log topic.
     */
    public Boolean getCreateIndex() {
        return this.CreateIndex;
    }

    /**
     * Set Indicates whether to create an index when creating the log topic.
     * @param CreateIndex Indicates whether to create an index when creating the log topic.
     */
    public void setCreateIndex(Boolean CreateIndex) {
        this.CreateIndex = CreateIndex;
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

    }
}

