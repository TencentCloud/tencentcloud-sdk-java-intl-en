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

public class ReplayInstanceAuditLogRequest extends AbstractModel {

    /**
    * Source cluster id.
    */
    @SerializedName("SourceClusterId")
    @Expose
    private String SourceClusterId;

    /**
    * Source instance id.
    */
    @SerializedName("SourceInstanceId")
    @Expose
    private String SourceInstanceId;

    /**
    * Target cluster id.
Specifies the target cluster must be a cluster cloned from the original cluster within three days.
    */
    @SerializedName("TargetClusterId")
    @Expose
    private String TargetClusterId;

    /**
    * Target instance id.
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * Username. host must be % username.
    */
    @SerializedName("TargetUserName")
    @Expose
    private String TargetUserName;

    /**
    * Password.
    */
    @SerializedName("TargetPassword")
    @Expose
    private String TargetPassword;

    /**
    * Start time. time format: yyyy-DD-mm hh:mm:ss.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Specifies the end time in the time format yyyy-DD-mm hh:mm:ss.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Source cluster id. 
     * @return SourceClusterId Source cluster id.
     */
    public String getSourceClusterId() {
        return this.SourceClusterId;
    }

    /**
     * Set Source cluster id.
     * @param SourceClusterId Source cluster id.
     */
    public void setSourceClusterId(String SourceClusterId) {
        this.SourceClusterId = SourceClusterId;
    }

    /**
     * Get Source instance id. 
     * @return SourceInstanceId Source instance id.
     */
    public String getSourceInstanceId() {
        return this.SourceInstanceId;
    }

    /**
     * Set Source instance id.
     * @param SourceInstanceId Source instance id.
     */
    public void setSourceInstanceId(String SourceInstanceId) {
        this.SourceInstanceId = SourceInstanceId;
    }

    /**
     * Get Target cluster id.
Specifies the target cluster must be a cluster cloned from the original cluster within three days. 
     * @return TargetClusterId Target cluster id.
Specifies the target cluster must be a cluster cloned from the original cluster within three days.
     */
    public String getTargetClusterId() {
        return this.TargetClusterId;
    }

    /**
     * Set Target cluster id.
Specifies the target cluster must be a cluster cloned from the original cluster within three days.
     * @param TargetClusterId Target cluster id.
Specifies the target cluster must be a cluster cloned from the original cluster within three days.
     */
    public void setTargetClusterId(String TargetClusterId) {
        this.TargetClusterId = TargetClusterId;
    }

    /**
     * Get Target instance id. 
     * @return TargetInstanceId Target instance id.
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set Target instance id.
     * @param TargetInstanceId Target instance id.
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get Username. host must be % username. 
     * @return TargetUserName Username. host must be % username.
     */
    public String getTargetUserName() {
        return this.TargetUserName;
    }

    /**
     * Set Username. host must be % username.
     * @param TargetUserName Username. host must be % username.
     */
    public void setTargetUserName(String TargetUserName) {
        this.TargetUserName = TargetUserName;
    }

    /**
     * Get Password. 
     * @return TargetPassword Password.
     */
    public String getTargetPassword() {
        return this.TargetPassword;
    }

    /**
     * Set Password.
     * @param TargetPassword Password.
     */
    public void setTargetPassword(String TargetPassword) {
        this.TargetPassword = TargetPassword;
    }

    /**
     * Get Start time. time format: yyyy-DD-mm hh:mm:ss. 
     * @return StartTime Start time. time format: yyyy-DD-mm hh:mm:ss.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. time format: yyyy-DD-mm hh:mm:ss.
     * @param StartTime Start time. time format: yyyy-DD-mm hh:mm:ss.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Specifies the end time in the time format yyyy-DD-mm hh:mm:ss. 
     * @return EndTime Specifies the end time in the time format yyyy-DD-mm hh:mm:ss.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Specifies the end time in the time format yyyy-DD-mm hh:mm:ss.
     * @param EndTime Specifies the end time in the time format yyyy-DD-mm hh:mm:ss.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ReplayInstanceAuditLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplayInstanceAuditLogRequest(ReplayInstanceAuditLogRequest source) {
        if (source.SourceClusterId != null) {
            this.SourceClusterId = new String(source.SourceClusterId);
        }
        if (source.SourceInstanceId != null) {
            this.SourceInstanceId = new String(source.SourceInstanceId);
        }
        if (source.TargetClusterId != null) {
            this.TargetClusterId = new String(source.TargetClusterId);
        }
        if (source.TargetInstanceId != null) {
            this.TargetInstanceId = new String(source.TargetInstanceId);
        }
        if (source.TargetUserName != null) {
            this.TargetUserName = new String(source.TargetUserName);
        }
        if (source.TargetPassword != null) {
            this.TargetPassword = new String(source.TargetPassword);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceClusterId", this.SourceClusterId);
        this.setParamSimple(map, prefix + "SourceInstanceId", this.SourceInstanceId);
        this.setParamSimple(map, prefix + "TargetClusterId", this.TargetClusterId);
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);
        this.setParamSimple(map, prefix + "TargetUserName", this.TargetUserName);
        this.setParamSimple(map, prefix + "TargetPassword", this.TargetPassword);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

