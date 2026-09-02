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

public class ModifyAgentRunModeRequest extends AbstractModel {

    /**
    * <p>Group account member id.</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Custom mode configuration</p>
    */
    @SerializedName("CustomPolicy")
    @Expose
    private CustomAgentRunModePolicy CustomPolicy;

    /**
    * <p>List of quuids in high protection mode</p>
    */
    @SerializedName("AdvanceModeQuuids")
    @Expose
    private String [] AdvanceModeQuuids;

    /**
    * <p>Custom mode quuid list</p>
    */
    @SerializedName("CustomModeQuuids")
    @Expose
    private String [] CustomModeQuuids;

    /**
    * <p>Log enhancement switch. 0: off, 1: on</p>
    */
    @SerializedName("EnhanceLogMode")
    @Expose
    private Long EnhanceLogMode;

    /**
    * <p>Malicious file scan automatic poc mode switch. 0: off, 1: on</p>
    */
    @SerializedName("MalwarePocMode")
    @Expose
    private Long MalwarePocMode;

    /**
    * <p>Whether the quintuple reports the source port. 0: not reported; 1: reported</p>
    */
    @SerializedName("ReportSourcePort")
    @Expose
    private Long ReportSourcePort;

    /**
    * <p>Log gathering settings, collect TCP source port tcp_src_port, TCP ingress log tcp_ingress, HTTP egress connection log http_egress, HTTP ingress connection log http_ingress, and application access log app_access</p>
    */
    @SerializedName("LogCollectSettings")
    @Expose
    private String [] LogCollectSettings;

    /**
     * Get <p>Group account member id.</p> 
     * @return MemberId <p>Group account member id.</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id.</p>
     * @param MemberId <p>Group account member id.</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Custom mode configuration</p> 
     * @return CustomPolicy <p>Custom mode configuration</p>
     */
    public CustomAgentRunModePolicy getCustomPolicy() {
        return this.CustomPolicy;
    }

    /**
     * Set <p>Custom mode configuration</p>
     * @param CustomPolicy <p>Custom mode configuration</p>
     */
    public void setCustomPolicy(CustomAgentRunModePolicy CustomPolicy) {
        this.CustomPolicy = CustomPolicy;
    }

    /**
     * Get <p>List of quuids in high protection mode</p> 
     * @return AdvanceModeQuuids <p>List of quuids in high protection mode</p>
     */
    public String [] getAdvanceModeQuuids() {
        return this.AdvanceModeQuuids;
    }

    /**
     * Set <p>List of quuids in high protection mode</p>
     * @param AdvanceModeQuuids <p>List of quuids in high protection mode</p>
     */
    public void setAdvanceModeQuuids(String [] AdvanceModeQuuids) {
        this.AdvanceModeQuuids = AdvanceModeQuuids;
    }

    /**
     * Get <p>Custom mode quuid list</p> 
     * @return CustomModeQuuids <p>Custom mode quuid list</p>
     */
    public String [] getCustomModeQuuids() {
        return this.CustomModeQuuids;
    }

    /**
     * Set <p>Custom mode quuid list</p>
     * @param CustomModeQuuids <p>Custom mode quuid list</p>
     */
    public void setCustomModeQuuids(String [] CustomModeQuuids) {
        this.CustomModeQuuids = CustomModeQuuids;
    }

    /**
     * Get <p>Log enhancement switch. 0: off, 1: on</p> 
     * @return EnhanceLogMode <p>Log enhancement switch. 0: off, 1: on</p>
     */
    public Long getEnhanceLogMode() {
        return this.EnhanceLogMode;
    }

    /**
     * Set <p>Log enhancement switch. 0: off, 1: on</p>
     * @param EnhanceLogMode <p>Log enhancement switch. 0: off, 1: on</p>
     */
    public void setEnhanceLogMode(Long EnhanceLogMode) {
        this.EnhanceLogMode = EnhanceLogMode;
    }

    /**
     * Get <p>Malicious file scan automatic poc mode switch. 0: off, 1: on</p> 
     * @return MalwarePocMode <p>Malicious file scan automatic poc mode switch. 0: off, 1: on</p>
     */
    public Long getMalwarePocMode() {
        return this.MalwarePocMode;
    }

    /**
     * Set <p>Malicious file scan automatic poc mode switch. 0: off, 1: on</p>
     * @param MalwarePocMode <p>Malicious file scan automatic poc mode switch. 0: off, 1: on</p>
     */
    public void setMalwarePocMode(Long MalwarePocMode) {
        this.MalwarePocMode = MalwarePocMode;
    }

    /**
     * Get <p>Whether the quintuple reports the source port. 0: not reported; 1: reported</p> 
     * @return ReportSourcePort <p>Whether the quintuple reports the source port. 0: not reported; 1: reported</p>
     */
    public Long getReportSourcePort() {
        return this.ReportSourcePort;
    }

    /**
     * Set <p>Whether the quintuple reports the source port. 0: not reported; 1: reported</p>
     * @param ReportSourcePort <p>Whether the quintuple reports the source port. 0: not reported; 1: reported</p>
     */
    public void setReportSourcePort(Long ReportSourcePort) {
        this.ReportSourcePort = ReportSourcePort;
    }

    /**
     * Get <p>Log gathering settings, collect TCP source port tcp_src_port, TCP ingress log tcp_ingress, HTTP egress connection log http_egress, HTTP ingress connection log http_ingress, and application access log app_access</p> 
     * @return LogCollectSettings <p>Log gathering settings, collect TCP source port tcp_src_port, TCP ingress log tcp_ingress, HTTP egress connection log http_egress, HTTP ingress connection log http_ingress, and application access log app_access</p>
     */
    public String [] getLogCollectSettings() {
        return this.LogCollectSettings;
    }

    /**
     * Set <p>Log gathering settings, collect TCP source port tcp_src_port, TCP ingress log tcp_ingress, HTTP egress connection log http_egress, HTTP ingress connection log http_ingress, and application access log app_access</p>
     * @param LogCollectSettings <p>Log gathering settings, collect TCP source port tcp_src_port, TCP ingress log tcp_ingress, HTTP egress connection log http_egress, HTTP ingress connection log http_ingress, and application access log app_access</p>
     */
    public void setLogCollectSettings(String [] LogCollectSettings) {
        this.LogCollectSettings = LogCollectSettings;
    }

    public ModifyAgentRunModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentRunModeRequest(ModifyAgentRunModeRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.CustomPolicy != null) {
            this.CustomPolicy = new CustomAgentRunModePolicy(source.CustomPolicy);
        }
        if (source.AdvanceModeQuuids != null) {
            this.AdvanceModeQuuids = new String[source.AdvanceModeQuuids.length];
            for (int i = 0; i < source.AdvanceModeQuuids.length; i++) {
                this.AdvanceModeQuuids[i] = new String(source.AdvanceModeQuuids[i]);
            }
        }
        if (source.CustomModeQuuids != null) {
            this.CustomModeQuuids = new String[source.CustomModeQuuids.length];
            for (int i = 0; i < source.CustomModeQuuids.length; i++) {
                this.CustomModeQuuids[i] = new String(source.CustomModeQuuids[i]);
            }
        }
        if (source.EnhanceLogMode != null) {
            this.EnhanceLogMode = new Long(source.EnhanceLogMode);
        }
        if (source.MalwarePocMode != null) {
            this.MalwarePocMode = new Long(source.MalwarePocMode);
        }
        if (source.ReportSourcePort != null) {
            this.ReportSourcePort = new Long(source.ReportSourcePort);
        }
        if (source.LogCollectSettings != null) {
            this.LogCollectSettings = new String[source.LogCollectSettings.length];
            for (int i = 0; i < source.LogCollectSettings.length; i++) {
                this.LogCollectSettings[i] = new String(source.LogCollectSettings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "CustomPolicy.", this.CustomPolicy);
        this.setParamArraySimple(map, prefix + "AdvanceModeQuuids.", this.AdvanceModeQuuids);
        this.setParamArraySimple(map, prefix + "CustomModeQuuids.", this.CustomModeQuuids);
        this.setParamSimple(map, prefix + "EnhanceLogMode", this.EnhanceLogMode);
        this.setParamSimple(map, prefix + "MalwarePocMode", this.MalwarePocMode);
        this.setParamSimple(map, prefix + "ReportSourcePort", this.ReportSourcePort);
        this.setParamArraySimple(map, prefix + "LogCollectSettings.", this.LogCollectSettings);

    }
}

