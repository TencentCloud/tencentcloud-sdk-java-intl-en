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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployRecord extends AbstractModel {

    /**
    * Details about the released version.
    */
    @SerializedName("ConfigGroupVersionInfos")
    @Expose
    private ConfigGroupVersionInfo [] ConfigGroupVersionInfos;

    /**
    * Release time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
    * Release status. Valid values: 
<li>deploying: Being released.</li>
<li>failure: Release failed.</li>
<li>success: Released successfully. </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Release result information.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Release record ID.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Change description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Details about the released version. 
     * @return ConfigGroupVersionInfos Details about the released version.
     */
    public ConfigGroupVersionInfo [] getConfigGroupVersionInfos() {
        return this.ConfigGroupVersionInfos;
    }

    /**
     * Set Details about the released version.
     * @param ConfigGroupVersionInfos Details about the released version.
     */
    public void setConfigGroupVersionInfos(ConfigGroupVersionInfo [] ConfigGroupVersionInfos) {
        this.ConfigGroupVersionInfos = ConfigGroupVersionInfos;
    }

    /**
     * Get Release time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC). 
     * @return DeployTime Release time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set Release time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
     * @param DeployTime Release time. The time format follows the ISO 8601 standard and is represented in Coordinated Universal Time (UTC).
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Get Release status. Valid values: 
<li>deploying: Being released.</li>
<li>failure: Release failed.</li>
<li>success: Released successfully. </li> 
     * @return Status Release status. Valid values: 
<li>deploying: Being released.</li>
<li>failure: Release failed.</li>
<li>success: Released successfully. </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Release status. Valid values: 
<li>deploying: Being released.</li>
<li>failure: Release failed.</li>
<li>success: Released successfully. </li>
     * @param Status Release status. Valid values: 
<li>deploying: Being released.</li>
<li>failure: Release failed.</li>
<li>success: Released successfully. </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Release result information. 
     * @return Message Release result information.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Release result information.
     * @param Message Release result information.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Release record ID. 
     * @return RecordId Release record ID.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Release record ID.
     * @param RecordId Release record ID.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Change description. 
     * @return Description Change description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Change description.
     * @param Description Change description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public DeployRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployRecord(DeployRecord source) {
        if (source.ConfigGroupVersionInfos != null) {
            this.ConfigGroupVersionInfos = new ConfigGroupVersionInfo[source.ConfigGroupVersionInfos.length];
            for (int i = 0; i < source.ConfigGroupVersionInfos.length; i++) {
                this.ConfigGroupVersionInfos[i] = new ConfigGroupVersionInfo(source.ConfigGroupVersionInfos[i]);
            }
        }
        if (source.DeployTime != null) {
            this.DeployTime = new String(source.DeployTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ConfigGroupVersionInfos.", this.ConfigGroupVersionInfos);
        this.setParamSimple(map, prefix + "DeployTime", this.DeployTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

