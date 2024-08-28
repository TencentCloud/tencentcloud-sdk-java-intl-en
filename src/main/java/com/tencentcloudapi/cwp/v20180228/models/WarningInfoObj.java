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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WarningInfoObj extends AbstractModel {

    /**
    * Event alarm type. 1: offline; 2: Trojan; 3: abnormal log-in; 4: brute force cracking; 5: vulnerability (including types of values 9, 10, 11, and 12); 6: high-risk command; 7: reverse shell; 8: local privilege escalation; 9: application vulnerability; 10: web CMS vulnerability; 11: emergency vulnerability; 12: security baseline; 13: tampering prevention; 14: malicious request; 15: network attack; 16: Windows system vulnerability; 17: Linux software vulnerability; 18: core file monitoring; 19: client uninstallation; 20: client offline.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 1: disable alarm; 0: enable alarm
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
    * Time zone information
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * Vulnerability level control bit (corresponding to the decimal storage in the database)
    */
    @SerializedName("ControlBit")
    @Expose
    private Long ControlBit;

    /**
    * Vulnerability level control bits in binary. Each bit indicates the enabling status of the corresponding vulnerability level on the page: low, medium, and high (0: disabled; 1: enabled). For example, 101 indicates that both low and high levels are enabled.
    */
    @SerializedName("ControlBits")
    @Expose
    private String ControlBits;

    /**
    * Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostRange")
    @Expose
    private Long HostRange;

    /**
    * Configured Number of Hosts in the Range of Alarm, used by the frontend to decide when to display prompt information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Event alarm type. 1: offline; 2: Trojan; 3: abnormal log-in; 4: brute force cracking; 5: vulnerability (including types of values 9, 10, 11, and 12); 6: high-risk command; 7: reverse shell; 8: local privilege escalation; 9: application vulnerability; 10: web CMS vulnerability; 11: emergency vulnerability; 12: security baseline; 13: tampering prevention; 14: malicious request; 15: network attack; 16: Windows system vulnerability; 17: Linux software vulnerability; 18: core file monitoring; 19: client uninstallation; 20: client offline. 
     * @return Type Event alarm type. 1: offline; 2: Trojan; 3: abnormal log-in; 4: brute force cracking; 5: vulnerability (including types of values 9, 10, 11, and 12); 6: high-risk command; 7: reverse shell; 8: local privilege escalation; 9: application vulnerability; 10: web CMS vulnerability; 11: emergency vulnerability; 12: security baseline; 13: tampering prevention; 14: malicious request; 15: network attack; 16: Windows system vulnerability; 17: Linux software vulnerability; 18: core file monitoring; 19: client uninstallation; 20: client offline.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Event alarm type. 1: offline; 2: Trojan; 3: abnormal log-in; 4: brute force cracking; 5: vulnerability (including types of values 9, 10, 11, and 12); 6: high-risk command; 7: reverse shell; 8: local privilege escalation; 9: application vulnerability; 10: web CMS vulnerability; 11: emergency vulnerability; 12: security baseline; 13: tampering prevention; 14: malicious request; 15: network attack; 16: Windows system vulnerability; 17: Linux software vulnerability; 18: core file monitoring; 19: client uninstallation; 20: client offline.
     * @param Type Event alarm type. 1: offline; 2: Trojan; 3: abnormal log-in; 4: brute force cracking; 5: vulnerability (including types of values 9, 10, 11, and 12); 6: high-risk command; 7: reverse shell; 8: local privilege escalation; 9: application vulnerability; 10: web CMS vulnerability; 11: emergency vulnerability; 12: security baseline; 13: tampering prevention; 14: malicious request; 15: network attack; 16: Windows system vulnerability; 17: Linux software vulnerability; 18: core file monitoring; 19: client uninstallation; 20: client offline.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 1: disable alarm; 0: enable alarm 
     * @return DisablePhoneWarning 1: disable alarm; 0: enable alarm
     */
    public Long getDisablePhoneWarning() {
        return this.DisablePhoneWarning;
    }

    /**
     * Set 1: disable alarm; 0: enable alarm
     * @param DisablePhoneWarning 1: disable alarm; 0: enable alarm
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
     * Get Time zone information 
     * @return TimeZone Time zone information
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Time zone information
     * @param TimeZone Time zone information
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get Vulnerability level control bit (corresponding to the decimal storage in the database) 
     * @return ControlBit Vulnerability level control bit (corresponding to the decimal storage in the database)
     */
    public Long getControlBit() {
        return this.ControlBit;
    }

    /**
     * Set Vulnerability level control bit (corresponding to the decimal storage in the database)
     * @param ControlBit Vulnerability level control bit (corresponding to the decimal storage in the database)
     */
    public void setControlBit(Long ControlBit) {
        this.ControlBit = ControlBit;
    }

    /**
     * Get Vulnerability level control bits in binary. Each bit indicates the enabling status of the corresponding vulnerability level on the page: low, medium, and high (0: disabled; 1: enabled). For example, 101 indicates that both low and high levels are enabled. 
     * @return ControlBits Vulnerability level control bits in binary. Each bit indicates the enabling status of the corresponding vulnerability level on the page: low, medium, and high (0: disabled; 1: enabled). For example, 101 indicates that both low and high levels are enabled.
     */
    public String getControlBits() {
        return this.ControlBits;
    }

    /**
     * Set Vulnerability level control bits in binary. Each bit indicates the enabling status of the corresponding vulnerability level on the page: low, medium, and high (0: disabled; 1: enabled). For example, 101 indicates that both low and high levels are enabled.
     * @param ControlBits Vulnerability level control bits in binary. Each bit indicates the enabling status of the corresponding vulnerability level on the page: low, medium, and high (0: disabled; 1: enabled). For example, 101 indicates that both low and high levels are enabled.
     */
    public void setControlBits(String ControlBits) {
        this.ControlBits = ControlBits;
    }

    /**
     * Get Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostRange Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostRange() {
        return this.HostRange;
    }

    /**
     * Set Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostRange Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostRange(Long HostRange) {
        this.HostRange = HostRange;
    }

    /**
     * Get Configured Number of Hosts in the Range of Alarm, used by the frontend to decide when to display prompt information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Count Configured Number of Hosts in the Range of Alarm, used by the frontend to decide when to display prompt information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Configured Number of Hosts in the Range of Alarm, used by the frontend to decide when to display prompt information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Count Configured Number of Hosts in the Range of Alarm, used by the frontend to decide when to display prompt information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public WarningInfoObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WarningInfoObj(WarningInfoObj source) {
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
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.ControlBit != null) {
            this.ControlBit = new Long(source.ControlBit);
        }
        if (source.ControlBits != null) {
            this.ControlBits = new String(source.ControlBits);
        }
        if (source.HostRange != null) {
            this.HostRange = new Long(source.HostRange);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
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
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "ControlBit", this.ControlBit);
        this.setParamSimple(map, prefix + "ControlBits", this.ControlBits);
        this.setParamSimple(map, prefix + "HostRange", this.HostRange);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

