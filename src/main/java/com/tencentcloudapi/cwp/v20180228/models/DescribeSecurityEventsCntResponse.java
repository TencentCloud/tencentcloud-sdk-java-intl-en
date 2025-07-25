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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityEventsCntResponse extends AbstractModel {

    /**
    * Trojan file-related risk event
    */
    @SerializedName("Malware")
    @Expose
    private SecurityEventInfo Malware;

    /**
    * Log-in audit-related risk event
    */
    @SerializedName("HostLogin")
    @Expose
    private SecurityEventInfo HostLogin;

    /**
    * Password cracking-related risk event
    */
    @SerializedName("BruteAttack")
    @Expose
    private SecurityEventInfo BruteAttack;

    /**
    * Malicious request-related risk event
    */
    @SerializedName("RiskDns")
    @Expose
    private SecurityEventInfo RiskDns;

    /**
    * High-risk command-related risk event
    */
    @SerializedName("Bash")
    @Expose
    private SecurityEventInfo Bash;

    /**
    * Local privilege escalation-related risk event
    */
    @SerializedName("PrivilegeRules")
    @Expose
    private SecurityEventInfo PrivilegeRules;

    /**
    * Reverse Shell-related risk event
    */
    @SerializedName("ReverseShell")
    @Expose
    private SecurityEventInfo ReverseShell;

    /**
    * Application vulnerability-related risk event
    */
    @SerializedName("SysVul")
    @Expose
    private SecurityEventInfo SysVul;

    /**
    * Web application vulnerability-related risk event
    */
    @SerializedName("WebVul")
    @Expose
    private SecurityEventInfo WebVul;

    /**
    * Emergency vulnerability-related risk event
    */
    @SerializedName("EmergencyVul")
    @Expose
    private SecurityEventInfo EmergencyVul;

    /**
    * Security baseline-related risk event
    */
    @SerializedName("BaseLine")
    @Expose
    private SecurityEventInfo BaseLine;

    /**
    * Attack detection-related risk event
    */
    @SerializedName("AttackLogs")
    @Expose
    private SecurityEventInfo AttackLogs;

    /**
    * Number of affected machines
    */
    @SerializedName("EffectMachineCount")
    @Expose
    private Long EffectMachineCount;

    /**
    * Total of number of events
    */
    @SerializedName("EventsCount")
    @Expose
    private Long EventsCount;

    /**
    * Total of Windows system vulnerability events
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WindowVul")
    @Expose
    private SecurityEventInfo WindowVul;

    /**
    * Total of Linux system vulnerability events
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LinuxVul")
    @Expose
    private SecurityEventInfo LinuxVul;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Trojan file-related risk event 
     * @return Malware Trojan file-related risk event
     */
    public SecurityEventInfo getMalware() {
        return this.Malware;
    }

    /**
     * Set Trojan file-related risk event
     * @param Malware Trojan file-related risk event
     */
    public void setMalware(SecurityEventInfo Malware) {
        this.Malware = Malware;
    }

    /**
     * Get Log-in audit-related risk event 
     * @return HostLogin Log-in audit-related risk event
     */
    public SecurityEventInfo getHostLogin() {
        return this.HostLogin;
    }

    /**
     * Set Log-in audit-related risk event
     * @param HostLogin Log-in audit-related risk event
     */
    public void setHostLogin(SecurityEventInfo HostLogin) {
        this.HostLogin = HostLogin;
    }

    /**
     * Get Password cracking-related risk event 
     * @return BruteAttack Password cracking-related risk event
     */
    public SecurityEventInfo getBruteAttack() {
        return this.BruteAttack;
    }

    /**
     * Set Password cracking-related risk event
     * @param BruteAttack Password cracking-related risk event
     */
    public void setBruteAttack(SecurityEventInfo BruteAttack) {
        this.BruteAttack = BruteAttack;
    }

    /**
     * Get Malicious request-related risk event 
     * @return RiskDns Malicious request-related risk event
     */
    public SecurityEventInfo getRiskDns() {
        return this.RiskDns;
    }

    /**
     * Set Malicious request-related risk event
     * @param RiskDns Malicious request-related risk event
     */
    public void setRiskDns(SecurityEventInfo RiskDns) {
        this.RiskDns = RiskDns;
    }

    /**
     * Get High-risk command-related risk event 
     * @return Bash High-risk command-related risk event
     */
    public SecurityEventInfo getBash() {
        return this.Bash;
    }

    /**
     * Set High-risk command-related risk event
     * @param Bash High-risk command-related risk event
     */
    public void setBash(SecurityEventInfo Bash) {
        this.Bash = Bash;
    }

    /**
     * Get Local privilege escalation-related risk event 
     * @return PrivilegeRules Local privilege escalation-related risk event
     */
    public SecurityEventInfo getPrivilegeRules() {
        return this.PrivilegeRules;
    }

    /**
     * Set Local privilege escalation-related risk event
     * @param PrivilegeRules Local privilege escalation-related risk event
     */
    public void setPrivilegeRules(SecurityEventInfo PrivilegeRules) {
        this.PrivilegeRules = PrivilegeRules;
    }

    /**
     * Get Reverse Shell-related risk event 
     * @return ReverseShell Reverse Shell-related risk event
     */
    public SecurityEventInfo getReverseShell() {
        return this.ReverseShell;
    }

    /**
     * Set Reverse Shell-related risk event
     * @param ReverseShell Reverse Shell-related risk event
     */
    public void setReverseShell(SecurityEventInfo ReverseShell) {
        this.ReverseShell = ReverseShell;
    }

    /**
     * Get Application vulnerability-related risk event 
     * @return SysVul Application vulnerability-related risk event
     */
    public SecurityEventInfo getSysVul() {
        return this.SysVul;
    }

    /**
     * Set Application vulnerability-related risk event
     * @param SysVul Application vulnerability-related risk event
     */
    public void setSysVul(SecurityEventInfo SysVul) {
        this.SysVul = SysVul;
    }

    /**
     * Get Web application vulnerability-related risk event 
     * @return WebVul Web application vulnerability-related risk event
     */
    public SecurityEventInfo getWebVul() {
        return this.WebVul;
    }

    /**
     * Set Web application vulnerability-related risk event
     * @param WebVul Web application vulnerability-related risk event
     */
    public void setWebVul(SecurityEventInfo WebVul) {
        this.WebVul = WebVul;
    }

    /**
     * Get Emergency vulnerability-related risk event 
     * @return EmergencyVul Emergency vulnerability-related risk event
     */
    public SecurityEventInfo getEmergencyVul() {
        return this.EmergencyVul;
    }

    /**
     * Set Emergency vulnerability-related risk event
     * @param EmergencyVul Emergency vulnerability-related risk event
     */
    public void setEmergencyVul(SecurityEventInfo EmergencyVul) {
        this.EmergencyVul = EmergencyVul;
    }

    /**
     * Get Security baseline-related risk event 
     * @return BaseLine Security baseline-related risk event
     */
    public SecurityEventInfo getBaseLine() {
        return this.BaseLine;
    }

    /**
     * Set Security baseline-related risk event
     * @param BaseLine Security baseline-related risk event
     */
    public void setBaseLine(SecurityEventInfo BaseLine) {
        this.BaseLine = BaseLine;
    }

    /**
     * Get Attack detection-related risk event 
     * @return AttackLogs Attack detection-related risk event
     */
    public SecurityEventInfo getAttackLogs() {
        return this.AttackLogs;
    }

    /**
     * Set Attack detection-related risk event
     * @param AttackLogs Attack detection-related risk event
     */
    public void setAttackLogs(SecurityEventInfo AttackLogs) {
        this.AttackLogs = AttackLogs;
    }

    /**
     * Get Number of affected machines 
     * @return EffectMachineCount Number of affected machines
     */
    public Long getEffectMachineCount() {
        return this.EffectMachineCount;
    }

    /**
     * Set Number of affected machines
     * @param EffectMachineCount Number of affected machines
     */
    public void setEffectMachineCount(Long EffectMachineCount) {
        this.EffectMachineCount = EffectMachineCount;
    }

    /**
     * Get Total of number of events 
     * @return EventsCount Total of number of events
     */
    public Long getEventsCount() {
        return this.EventsCount;
    }

    /**
     * Set Total of number of events
     * @param EventsCount Total of number of events
     */
    public void setEventsCount(Long EventsCount) {
        this.EventsCount = EventsCount;
    }

    /**
     * Get Total of Windows system vulnerability events
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WindowVul Total of Windows system vulnerability events
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SecurityEventInfo getWindowVul() {
        return this.WindowVul;
    }

    /**
     * Set Total of Windows system vulnerability events
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WindowVul Total of Windows system vulnerability events
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWindowVul(SecurityEventInfo WindowVul) {
        this.WindowVul = WindowVul;
    }

    /**
     * Get Total of Linux system vulnerability events
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LinuxVul Total of Linux system vulnerability events
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SecurityEventInfo getLinuxVul() {
        return this.LinuxVul;
    }

    /**
     * Set Total of Linux system vulnerability events
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LinuxVul Total of Linux system vulnerability events
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLinuxVul(SecurityEventInfo LinuxVul) {
        this.LinuxVul = LinuxVul;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSecurityEventsCntResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityEventsCntResponse(DescribeSecurityEventsCntResponse source) {
        if (source.Malware != null) {
            this.Malware = new SecurityEventInfo(source.Malware);
        }
        if (source.HostLogin != null) {
            this.HostLogin = new SecurityEventInfo(source.HostLogin);
        }
        if (source.BruteAttack != null) {
            this.BruteAttack = new SecurityEventInfo(source.BruteAttack);
        }
        if (source.RiskDns != null) {
            this.RiskDns = new SecurityEventInfo(source.RiskDns);
        }
        if (source.Bash != null) {
            this.Bash = new SecurityEventInfo(source.Bash);
        }
        if (source.PrivilegeRules != null) {
            this.PrivilegeRules = new SecurityEventInfo(source.PrivilegeRules);
        }
        if (source.ReverseShell != null) {
            this.ReverseShell = new SecurityEventInfo(source.ReverseShell);
        }
        if (source.SysVul != null) {
            this.SysVul = new SecurityEventInfo(source.SysVul);
        }
        if (source.WebVul != null) {
            this.WebVul = new SecurityEventInfo(source.WebVul);
        }
        if (source.EmergencyVul != null) {
            this.EmergencyVul = new SecurityEventInfo(source.EmergencyVul);
        }
        if (source.BaseLine != null) {
            this.BaseLine = new SecurityEventInfo(source.BaseLine);
        }
        if (source.AttackLogs != null) {
            this.AttackLogs = new SecurityEventInfo(source.AttackLogs);
        }
        if (source.EffectMachineCount != null) {
            this.EffectMachineCount = new Long(source.EffectMachineCount);
        }
        if (source.EventsCount != null) {
            this.EventsCount = new Long(source.EventsCount);
        }
        if (source.WindowVul != null) {
            this.WindowVul = new SecurityEventInfo(source.WindowVul);
        }
        if (source.LinuxVul != null) {
            this.LinuxVul = new SecurityEventInfo(source.LinuxVul);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Malware.", this.Malware);
        this.setParamObj(map, prefix + "HostLogin.", this.HostLogin);
        this.setParamObj(map, prefix + "BruteAttack.", this.BruteAttack);
        this.setParamObj(map, prefix + "RiskDns.", this.RiskDns);
        this.setParamObj(map, prefix + "Bash.", this.Bash);
        this.setParamObj(map, prefix + "PrivilegeRules.", this.PrivilegeRules);
        this.setParamObj(map, prefix + "ReverseShell.", this.ReverseShell);
        this.setParamObj(map, prefix + "SysVul.", this.SysVul);
        this.setParamObj(map, prefix + "WebVul.", this.WebVul);
        this.setParamObj(map, prefix + "EmergencyVul.", this.EmergencyVul);
        this.setParamObj(map, prefix + "BaseLine.", this.BaseLine);
        this.setParamObj(map, prefix + "AttackLogs.", this.AttackLogs);
        this.setParamSimple(map, prefix + "EffectMachineCount", this.EffectMachineCount);
        this.setParamSimple(map, prefix + "EventsCount", this.EventsCount);
        this.setParamObj(map, prefix + "WindowVul.", this.WindowVul);
        this.setParamObj(map, prefix + "LinuxVul.", this.LinuxVul);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

