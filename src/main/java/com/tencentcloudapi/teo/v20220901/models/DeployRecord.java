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
    * Detailed information of the released version.
    */
    @SerializedName("ConfigGroupVersionInfos")
    @Expose
    private ConfigGroupVersionInfo [] ConfigGroupVersionInfos;

    /**
    * Release time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
    * Publishing status. Valid values:
<li> deploying: Releasing;</li>
<li>failure: release failure;</li>
<li>success: Published successfully.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Publish result information.
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
     * Get Detailed information of the released version. 
     * @return ConfigGroupVersionInfos Detailed information of the released version.
     */
    public ConfigGroupVersionInfo [] getConfigGroupVersionInfos() {
        return this.ConfigGroupVersionInfos;
    }

    /**
     * Set Detailed information of the released version.
     * @param ConfigGroupVersionInfos Detailed information of the released version.
     */
    public void setConfigGroupVersionInfos(ConfigGroupVersionInfo [] ConfigGroupVersionInfos) {
        this.ConfigGroupVersionInfos = ConfigGroupVersionInfos;
    }

    /**
     * Get Release time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard. 
     * @return DeployTime Release time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set Release time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     * @param DeployTime Release time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Get Publishing status. Valid values:
<li> deploying: Releasing;</li>
<li>failure: release failure;</li>
<li>success: Published successfully.</li> 
     * @return Status Publishing status. Valid values:
<li> deploying: Releasing;</li>
<li>failure: release failure;</li>
<li>success: Published successfully.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Publishing status. Valid values:
<li> deploying: Releasing;</li>
<li>failure: release failure;</li>
<li>success: Published successfully.</li>
     * @param Status Publishing status. Valid values:
<li> deploying: Releasing;</li>
<li>failure: release failure;</li>
<li>success: Published successfully.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Publish result information. 
     * @return Message Publish result information.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Publish result information.
     * @param Message Publish result information.
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

