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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNotifySettingRequest extends AbstractModel {

    /**
    * <p>Notification module</p><p>Enumeration values:</p><ul><li>AkSk: Cloud API Risk Governance</li><li>Alert: Alert Center</li><li>Agent: Client</li></ul>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>Notification setting mode</p><p>Enumeration values:</p><ul><li>0: Standard mode</li><li>1: Advanced mode</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * <p>Notification status</p><p>Enumeration values:</p><ul><li>0: Notifications off</li><li>1: Notifications on</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Notification start time</p><p>Parameter format: hh:mm:ss</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>Notification end time</p><p>Parameter format: hh:mm:ss</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Notification option</p><p>Enumeration values:</p><ul><li>CRITICAL: Alarm level: critical</li><li>HIGH: Alarm level: high risk</li><li>MEDIUM: Alarm level: medium risk</li><li>LOW: Alarm level: low risk</li><li>INFO: Alarm level: reminder</li><li>AGENT_UNINSTALL: Client uninstallation</li><li>AGENT_OFFLINE: Client offline</li></ul>
    */
    @SerializedName("Option")
    @Expose
    private String [] Option;

    /**
     * Get <p>Notification module</p><p>Enumeration values:</p><ul><li>AkSk: Cloud API Risk Governance</li><li>Alert: Alert Center</li><li>Agent: Client</li></ul> 
     * @return Module <p>Notification module</p><p>Enumeration values:</p><ul><li>AkSk: Cloud API Risk Governance</li><li>Alert: Alert Center</li><li>Agent: Client</li></ul>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>Notification module</p><p>Enumeration values:</p><ul><li>AkSk: Cloud API Risk Governance</li><li>Alert: Alert Center</li><li>Agent: Client</li></ul>
     * @param Module <p>Notification module</p><p>Enumeration values:</p><ul><li>AkSk: Cloud API Risk Governance</li><li>Alert: Alert Center</li><li>Agent: Client</li></ul>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>Notification setting mode</p><p>Enumeration values:</p><ul><li>0: Standard mode</li><li>1: Advanced mode</li></ul> 
     * @return Mode <p>Notification setting mode</p><p>Enumeration values:</p><ul><li>0: Standard mode</li><li>1: Advanced mode</li></ul>
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Notification setting mode</p><p>Enumeration values:</p><ul><li>0: Standard mode</li><li>1: Advanced mode</li></ul>
     * @param Mode <p>Notification setting mode</p><p>Enumeration values:</p><ul><li>0: Standard mode</li><li>1: Advanced mode</li></ul>
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>Notification status</p><p>Enumeration values:</p><ul><li>0: Notifications off</li><li>1: Notifications on</li></ul> 
     * @return Status <p>Notification status</p><p>Enumeration values:</p><ul><li>0: Notifications off</li><li>1: Notifications on</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Notification status</p><p>Enumeration values:</p><ul><li>0: Notifications off</li><li>1: Notifications on</li></ul>
     * @param Status <p>Notification status</p><p>Enumeration values:</p><ul><li>0: Notifications off</li><li>1: Notifications on</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Notification start time</p><p>Parameter format: hh:mm:ss</p> 
     * @return BeginTime <p>Notification start time</p><p>Parameter format: hh:mm:ss</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>Notification start time</p><p>Parameter format: hh:mm:ss</p>
     * @param BeginTime <p>Notification start time</p><p>Parameter format: hh:mm:ss</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>Notification end time</p><p>Parameter format: hh:mm:ss</p> 
     * @return EndTime <p>Notification end time</p><p>Parameter format: hh:mm:ss</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Notification end time</p><p>Parameter format: hh:mm:ss</p>
     * @param EndTime <p>Notification end time</p><p>Parameter format: hh:mm:ss</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Notification option</p><p>Enumeration values:</p><ul><li>CRITICAL: Alarm level: critical</li><li>HIGH: Alarm level: high risk</li><li>MEDIUM: Alarm level: medium risk</li><li>LOW: Alarm level: low risk</li><li>INFO: Alarm level: reminder</li><li>AGENT_UNINSTALL: Client uninstallation</li><li>AGENT_OFFLINE: Client offline</li></ul> 
     * @return Option <p>Notification option</p><p>Enumeration values:</p><ul><li>CRITICAL: Alarm level: critical</li><li>HIGH: Alarm level: high risk</li><li>MEDIUM: Alarm level: medium risk</li><li>LOW: Alarm level: low risk</li><li>INFO: Alarm level: reminder</li><li>AGENT_UNINSTALL: Client uninstallation</li><li>AGENT_OFFLINE: Client offline</li></ul>
     */
    public String [] getOption() {
        return this.Option;
    }

    /**
     * Set <p>Notification option</p><p>Enumeration values:</p><ul><li>CRITICAL: Alarm level: critical</li><li>HIGH: Alarm level: high risk</li><li>MEDIUM: Alarm level: medium risk</li><li>LOW: Alarm level: low risk</li><li>INFO: Alarm level: reminder</li><li>AGENT_UNINSTALL: Client uninstallation</li><li>AGENT_OFFLINE: Client offline</li></ul>
     * @param Option <p>Notification option</p><p>Enumeration values:</p><ul><li>CRITICAL: Alarm level: critical</li><li>HIGH: Alarm level: high risk</li><li>MEDIUM: Alarm level: medium risk</li><li>LOW: Alarm level: low risk</li><li>INFO: Alarm level: reminder</li><li>AGENT_UNINSTALL: Client uninstallation</li><li>AGENT_OFFLINE: Client offline</li></ul>
     */
    public void setOption(String [] Option) {
        this.Option = Option;
    }

    public ModifyNotifySettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNotifySettingRequest(ModifyNotifySettingRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Option != null) {
            this.Option = new String[source.Option.length];
            for (int i = 0; i < source.Option.length; i++) {
                this.Option[i] = new String(source.Option[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Option.", this.Option);

    }
}

