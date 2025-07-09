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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalProcessEventTendencyInfo extends AbstractModel {

    /**
    * Date
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Number of pending proxy events
    */
    @SerializedName("ProxyToolEventCount")
    @Expose
    private Long ProxyToolEventCount;

    /**
    * Number of pending lateral movement events
    */
    @SerializedName("TransferControlEventCount")
    @Expose
    private Long TransferControlEventCount;

    /**
    * Number of pending malicious command events
    */
    @SerializedName("AttackCmdEventCount")
    @Expose
    private Long AttackCmdEventCount;

    /**
    * Number of pending reverse shell events
    */
    @SerializedName("ReverseShellEventCount")
    @Expose
    private Long ReverseShellEventCount;

    /**
    * Number of pending fileless execution events
    */
    @SerializedName("FilelessEventCount")
    @Expose
    private Long FilelessEventCount;

    /**
    * Number of pending high-risk command events
    */
    @SerializedName("RiskCmdEventCount")
    @Expose
    private Long RiskCmdEventCount;

    /**
    * Number of pending events of unusual startups found in the child process of the sensitive service
    */
    @SerializedName("AbnormalChildProcessEventCount")
    @Expose
    private Long AbnormalChildProcessEventCount;

    /**
    * Number of pending custom rule events
    */
    @SerializedName("UserDefinedRuleEventCount")
    @Expose
    private Long UserDefinedRuleEventCount;

    /**
     * Get Date 
     * @return Date Date
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date
     * @param Date Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Number of pending proxy events 
     * @return ProxyToolEventCount Number of pending proxy events
     */
    public Long getProxyToolEventCount() {
        return this.ProxyToolEventCount;
    }

    /**
     * Set Number of pending proxy events
     * @param ProxyToolEventCount Number of pending proxy events
     */
    public void setProxyToolEventCount(Long ProxyToolEventCount) {
        this.ProxyToolEventCount = ProxyToolEventCount;
    }

    /**
     * Get Number of pending lateral movement events 
     * @return TransferControlEventCount Number of pending lateral movement events
     */
    public Long getTransferControlEventCount() {
        return this.TransferControlEventCount;
    }

    /**
     * Set Number of pending lateral movement events
     * @param TransferControlEventCount Number of pending lateral movement events
     */
    public void setTransferControlEventCount(Long TransferControlEventCount) {
        this.TransferControlEventCount = TransferControlEventCount;
    }

    /**
     * Get Number of pending malicious command events 
     * @return AttackCmdEventCount Number of pending malicious command events
     */
    public Long getAttackCmdEventCount() {
        return this.AttackCmdEventCount;
    }

    /**
     * Set Number of pending malicious command events
     * @param AttackCmdEventCount Number of pending malicious command events
     */
    public void setAttackCmdEventCount(Long AttackCmdEventCount) {
        this.AttackCmdEventCount = AttackCmdEventCount;
    }

    /**
     * Get Number of pending reverse shell events 
     * @return ReverseShellEventCount Number of pending reverse shell events
     */
    public Long getReverseShellEventCount() {
        return this.ReverseShellEventCount;
    }

    /**
     * Set Number of pending reverse shell events
     * @param ReverseShellEventCount Number of pending reverse shell events
     */
    public void setReverseShellEventCount(Long ReverseShellEventCount) {
        this.ReverseShellEventCount = ReverseShellEventCount;
    }

    /**
     * Get Number of pending fileless execution events 
     * @return FilelessEventCount Number of pending fileless execution events
     */
    public Long getFilelessEventCount() {
        return this.FilelessEventCount;
    }

    /**
     * Set Number of pending fileless execution events
     * @param FilelessEventCount Number of pending fileless execution events
     */
    public void setFilelessEventCount(Long FilelessEventCount) {
        this.FilelessEventCount = FilelessEventCount;
    }

    /**
     * Get Number of pending high-risk command events 
     * @return RiskCmdEventCount Number of pending high-risk command events
     */
    public Long getRiskCmdEventCount() {
        return this.RiskCmdEventCount;
    }

    /**
     * Set Number of pending high-risk command events
     * @param RiskCmdEventCount Number of pending high-risk command events
     */
    public void setRiskCmdEventCount(Long RiskCmdEventCount) {
        this.RiskCmdEventCount = RiskCmdEventCount;
    }

    /**
     * Get Number of pending events of unusual startups found in the child process of the sensitive service 
     * @return AbnormalChildProcessEventCount Number of pending events of unusual startups found in the child process of the sensitive service
     */
    public Long getAbnormalChildProcessEventCount() {
        return this.AbnormalChildProcessEventCount;
    }

    /**
     * Set Number of pending events of unusual startups found in the child process of the sensitive service
     * @param AbnormalChildProcessEventCount Number of pending events of unusual startups found in the child process of the sensitive service
     */
    public void setAbnormalChildProcessEventCount(Long AbnormalChildProcessEventCount) {
        this.AbnormalChildProcessEventCount = AbnormalChildProcessEventCount;
    }

    /**
     * Get Number of pending custom rule events 
     * @return UserDefinedRuleEventCount Number of pending custom rule events
     */
    public Long getUserDefinedRuleEventCount() {
        return this.UserDefinedRuleEventCount;
    }

    /**
     * Set Number of pending custom rule events
     * @param UserDefinedRuleEventCount Number of pending custom rule events
     */
    public void setUserDefinedRuleEventCount(Long UserDefinedRuleEventCount) {
        this.UserDefinedRuleEventCount = UserDefinedRuleEventCount;
    }

    public AbnormalProcessEventTendencyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalProcessEventTendencyInfo(AbnormalProcessEventTendencyInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.ProxyToolEventCount != null) {
            this.ProxyToolEventCount = new Long(source.ProxyToolEventCount);
        }
        if (source.TransferControlEventCount != null) {
            this.TransferControlEventCount = new Long(source.TransferControlEventCount);
        }
        if (source.AttackCmdEventCount != null) {
            this.AttackCmdEventCount = new Long(source.AttackCmdEventCount);
        }
        if (source.ReverseShellEventCount != null) {
            this.ReverseShellEventCount = new Long(source.ReverseShellEventCount);
        }
        if (source.FilelessEventCount != null) {
            this.FilelessEventCount = new Long(source.FilelessEventCount);
        }
        if (source.RiskCmdEventCount != null) {
            this.RiskCmdEventCount = new Long(source.RiskCmdEventCount);
        }
        if (source.AbnormalChildProcessEventCount != null) {
            this.AbnormalChildProcessEventCount = new Long(source.AbnormalChildProcessEventCount);
        }
        if (source.UserDefinedRuleEventCount != null) {
            this.UserDefinedRuleEventCount = new Long(source.UserDefinedRuleEventCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "ProxyToolEventCount", this.ProxyToolEventCount);
        this.setParamSimple(map, prefix + "TransferControlEventCount", this.TransferControlEventCount);
        this.setParamSimple(map, prefix + "AttackCmdEventCount", this.AttackCmdEventCount);
        this.setParamSimple(map, prefix + "ReverseShellEventCount", this.ReverseShellEventCount);
        this.setParamSimple(map, prefix + "FilelessEventCount", this.FilelessEventCount);
        this.setParamSimple(map, prefix + "RiskCmdEventCount", this.RiskCmdEventCount);
        this.setParamSimple(map, prefix + "AbnormalChildProcessEventCount", this.AbnormalChildProcessEventCount);
        this.setParamSimple(map, prefix + "UserDefinedRuleEventCount", this.UserDefinedRuleEventCount);

    }
}

