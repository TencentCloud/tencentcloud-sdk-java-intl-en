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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Switch extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Details of the audit switch
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Audit")
    @Expose
    private SwitchInfo Audit;

    /**
    * Details of the event switch
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Event")
    @Expose
    private SwitchInfo Event;

    /**
    * Details of common logs
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Log")
    @Expose
    private SwitchInfo Log;

    /**
    * Details of master log
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("MasterLog")
    @Expose
    private SwitchInfo MasterLog;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Details of the audit switch
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Audit Details of the audit switch
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public SwitchInfo getAudit() {
        return this.Audit;
    }

    /**
     * Set Details of the audit switch
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Audit Details of the audit switch
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setAudit(SwitchInfo Audit) {
        this.Audit = Audit;
    }

    /**
     * Get Details of the event switch
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Event Details of the event switch
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public SwitchInfo getEvent() {
        return this.Event;
    }

    /**
     * Set Details of the event switch
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Event Details of the event switch
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setEvent(SwitchInfo Event) {
        this.Event = Event;
    }

    /**
     * Get Details of common logs
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Log Details of common logs
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public SwitchInfo getLog() {
        return this.Log;
    }

    /**
     * Set Details of common logs
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Log Details of common logs
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setLog(SwitchInfo Log) {
        this.Log = Log;
    }

    /**
     * Get Details of master log
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return MasterLog Details of master log
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public SwitchInfo getMasterLog() {
        return this.MasterLog;
    }

    /**
     * Set Details of master log
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param MasterLog Details of master log
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMasterLog(SwitchInfo MasterLog) {
        this.MasterLog = MasterLog;
    }

    public Switch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Switch(Switch source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Audit != null) {
            this.Audit = new SwitchInfo(source.Audit);
        }
        if (source.Event != null) {
            this.Event = new SwitchInfo(source.Event);
        }
        if (source.Log != null) {
            this.Log = new SwitchInfo(source.Log);
        }
        if (source.MasterLog != null) {
            this.MasterLog = new SwitchInfo(source.MasterLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "Audit.", this.Audit);
        this.setParamObj(map, prefix + "Event.", this.Event);
        this.setParamObj(map, prefix + "Log.", this.Log);
        this.setParamObj(map, prefix + "MasterLog.", this.MasterLog);

    }
}

