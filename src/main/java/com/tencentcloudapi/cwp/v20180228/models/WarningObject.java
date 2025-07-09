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

public class WarningObject extends AbstractModel {

    /**
    * Event Alarm Type. 1: Offline; 2: Trojan; 3: Exceptional login; 4: Brute force; 5: Vulnerability (split into four types ranging from 9 to 12); 6: High-risk command; 7: Reverse sell; 8: Local privilege escalation;, 9: System component vulnerabilities; 10: Web application vulnerabilities; 11: Emergency vulnerabilities; 12: Security baseline; 14: Malicious request; 15: Network attack; 16: Windows system vulnerabilities; 17: Linux software vulnerabilities
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 1: disable alarm; 0: enable alarm.
    */
    @SerializedName("DisablePhoneWarning")
    @Expose
    private Long DisablePhoneWarning;

    /**
    * Start time. Format: HH:mm.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time. Format: HH:mm.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 1. Vulnerability level control bits in binary. Each bit corresponds to the vulnerability level enabling status on the corresponding page. Level: low, medium, high (0: disabled; 1: enabled). Example: 101, indicating both the low and high levels are enabled. 2. Brute force cracking control bits in binary. 01: notify upon successful brute force cracking; 10: notify upon brute force cracking failure.
    */
    @SerializedName("ControlBits")
    @Expose
    private String ControlBits;

    /**
    * Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
    */
    @SerializedName("HostRange")
    @Expose
    private Long HostRange;

    /**
     * Get Event Alarm Type. 1: Offline; 2: Trojan; 3: Exceptional login; 4: Brute force; 5: Vulnerability (split into four types ranging from 9 to 12); 6: High-risk command; 7: Reverse sell; 8: Local privilege escalation;, 9: System component vulnerabilities; 10: Web application vulnerabilities; 11: Emergency vulnerabilities; 12: Security baseline; 14: Malicious request; 15: Network attack; 16: Windows system vulnerabilities; 17: Linux software vulnerabilities 
     * @return Type Event Alarm Type. 1: Offline; 2: Trojan; 3: Exceptional login; 4: Brute force; 5: Vulnerability (split into four types ranging from 9 to 12); 6: High-risk command; 7: Reverse sell; 8: Local privilege escalation;, 9: System component vulnerabilities; 10: Web application vulnerabilities; 11: Emergency vulnerabilities; 12: Security baseline; 14: Malicious request; 15: Network attack; 16: Windows system vulnerabilities; 17: Linux software vulnerabilities
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Event Alarm Type. 1: Offline; 2: Trojan; 3: Exceptional login; 4: Brute force; 5: Vulnerability (split into four types ranging from 9 to 12); 6: High-risk command; 7: Reverse sell; 8: Local privilege escalation;, 9: System component vulnerabilities; 10: Web application vulnerabilities; 11: Emergency vulnerabilities; 12: Security baseline; 14: Malicious request; 15: Network attack; 16: Windows system vulnerabilities; 17: Linux software vulnerabilities
     * @param Type Event Alarm Type. 1: Offline; 2: Trojan; 3: Exceptional login; 4: Brute force; 5: Vulnerability (split into four types ranging from 9 to 12); 6: High-risk command; 7: Reverse sell; 8: Local privilege escalation;, 9: System component vulnerabilities; 10: Web application vulnerabilities; 11: Emergency vulnerabilities; 12: Security baseline; 14: Malicious request; 15: Network attack; 16: Windows system vulnerabilities; 17: Linux software vulnerabilities
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 1: disable alarm; 0: enable alarm. 
     * @return DisablePhoneWarning 1: disable alarm; 0: enable alarm.
     */
    public Long getDisablePhoneWarning() {
        return this.DisablePhoneWarning;
    }

    /**
     * Set 1: disable alarm; 0: enable alarm.
     * @param DisablePhoneWarning 1: disable alarm; 0: enable alarm.
     */
    public void setDisablePhoneWarning(Long DisablePhoneWarning) {
        this.DisablePhoneWarning = DisablePhoneWarning;
    }

    /**
     * Get Start time. Format: HH:mm. 
     * @return BeginTime Start time. Format: HH:mm.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time. Format: HH:mm.
     * @param BeginTime Start time. Format: HH:mm.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time. Format: HH:mm. 
     * @return EndTime End time. Format: HH:mm.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. Format: HH:mm.
     * @param EndTime End time. Format: HH:mm.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 1. Vulnerability level control bits in binary. Each bit corresponds to the vulnerability level enabling status on the corresponding page. Level: low, medium, high (0: disabled; 1: enabled). Example: 101, indicating both the low and high levels are enabled. 2. Brute force cracking control bits in binary. 01: notify upon successful brute force cracking; 10: notify upon brute force cracking failure. 
     * @return ControlBits 1. Vulnerability level control bits in binary. Each bit corresponds to the vulnerability level enabling status on the corresponding page. Level: low, medium, high (0: disabled; 1: enabled). Example: 101, indicating both the low and high levels are enabled. 2. Brute force cracking control bits in binary. 01: notify upon successful brute force cracking; 10: notify upon brute force cracking failure.
     */
    public String getControlBits() {
        return this.ControlBits;
    }

    /**
     * Set 1. Vulnerability level control bits in binary. Each bit corresponds to the vulnerability level enabling status on the corresponding page. Level: low, medium, high (0: disabled; 1: enabled). Example: 101, indicating both the low and high levels are enabled. 2. Brute force cracking control bits in binary. 01: notify upon successful brute force cracking; 10: notify upon brute force cracking failure.
     * @param ControlBits 1. Vulnerability level control bits in binary. Each bit corresponds to the vulnerability level enabling status on the corresponding page. Level: low, medium, high (0: disabled; 1: enabled). Example: 101, indicating both the low and high levels are enabled. 2. Brute force cracking control bits in binary. 01: notify upon successful brute force cracking; 10: notify upon brute force cracking failure.
     */
    public void setControlBits(String ControlBits) {
        this.ControlBits = ControlBits;
    }

    /**
     * Get Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts 
     * @return HostRange Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
     */
    public Long getHostRange() {
        return this.HostRange;
    }

    /**
     * Set Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
     * @param HostRange Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
     */
    public void setHostRange(Long HostRange) {
        this.HostRange = HostRange;
    }

    public WarningObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WarningObject(WarningObject source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DisablePhoneWarning != null) {
            this.DisablePhoneWarning = new Long(source.DisablePhoneWarning);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ControlBits != null) {
            this.ControlBits = new String(source.ControlBits);
        }
        if (source.HostRange != null) {
            this.HostRange = new Long(source.HostRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DisablePhoneWarning", this.DisablePhoneWarning);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ControlBits", this.ControlBits);
        this.setParamSimple(map, prefix + "HostRange", this.HostRange);

    }
}

