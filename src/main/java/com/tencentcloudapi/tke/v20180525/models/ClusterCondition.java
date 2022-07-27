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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterCondition extends AbstractModel{

    /**
    * Process type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Process status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Last time when the status is probed
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LastProbeTime")
    @Expose
    private String LastProbeTime;

    /**
    * Last time when transiting to the process
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LastTransitionTime")
    @Expose
    private String LastTransitionTime;

    /**
    * Reasons for transiting to the process
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * More information on transition
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Process type 
     * @return Type Process type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Process type
     * @param Type Process type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Process status 
     * @return Status Process status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Process status
     * @param Status Process status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Last time when the status is probed
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LastProbeTime Last time when the status is probed
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLastProbeTime() {
        return this.LastProbeTime;
    }

    /**
     * Set Last time when the status is probed
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LastProbeTime Last time when the status is probed
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLastProbeTime(String LastProbeTime) {
        this.LastProbeTime = LastProbeTime;
    }

    /**
     * Get Last time when transiting to the process
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LastTransitionTime Last time when transiting to the process
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLastTransitionTime() {
        return this.LastTransitionTime;
    }

    /**
     * Set Last time when transiting to the process
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LastTransitionTime Last time when transiting to the process
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLastTransitionTime(String LastTransitionTime) {
        this.LastTransitionTime = LastTransitionTime;
    }

    /**
     * Get Reasons for transiting to the process
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Reason Reasons for transiting to the process
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reasons for transiting to the process
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Reason Reasons for transiting to the process
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get More information on transition
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Message More information on transition
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set More information on transition
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Message More information on transition
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ClusterCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterCondition(ClusterCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LastProbeTime != null) {
            this.LastProbeTime = new String(source.LastProbeTime);
        }
        if (source.LastTransitionTime != null) {
            this.LastTransitionTime = new String(source.LastTransitionTime);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastProbeTime", this.LastProbeTime);
        this.setParamSimple(map, prefix + "LastTransitionTime", this.LastTransitionTime);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

