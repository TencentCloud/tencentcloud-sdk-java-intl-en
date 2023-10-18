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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WarningRule extends AbstractModel {

    /**
    * Alert event type:
Image repository security - Trojan: `IMG_REG_VIRUS`.
Image repository security - Vulnerability: `IMG_REG_VUL`.
Image repository security - Sensitive data: `IMG_REG_RISK`.
Image security - Trojan: `IMG_VIRUS`.
Image security - Vulnerability: `IMG_VUL`.
Image security - Sensitive data: `IMG_RISK`.
Image security - Image blocking: `IMG_INTERCEPT`.
Runtime security - Container escape: `RUNTIME_ESCAPE`.
Runtime security - Abnormal process: `RUNTIME_FILE`.
Runtime security - Abnormal file access: `RUNTIME_PROCESS`.
Runtime security - High-risk syscall: `RUNTIME_SYSCALL`.
Runtime security - Reverse shell: `RUNTIME_REVERSE_SHELL`.
Runtime security - Trojan: `RUNTIME_VIRUS`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Switch status:
`ON`: On.
`OFF`: Off.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Alert start time in the format of "HH:mm"
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Alert end time in the format of "HH:mm"
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Alert level policy control. Each binary bit represents a meaning, and the value is passed as a string.
The control switch can be high, medium, or low, corresponding to the third, second, and first binary bit, respectively. Valid values: `0` (off); `1` (on).
For example, if the high and medium levels indicate to enable the alert and the low level indicates to disable it, the binary value is `110`.
If level control does not take effect for the alert type, pass in `1`.
    */
    @SerializedName("ControlBits")
    @Expose
    private String ControlBits;

    /**
     * Get Alert event type:
Image repository security - Trojan: `IMG_REG_VIRUS`.
Image repository security - Vulnerability: `IMG_REG_VUL`.
Image repository security - Sensitive data: `IMG_REG_RISK`.
Image security - Trojan: `IMG_VIRUS`.
Image security - Vulnerability: `IMG_VUL`.
Image security - Sensitive data: `IMG_RISK`.
Image security - Image blocking: `IMG_INTERCEPT`.
Runtime security - Container escape: `RUNTIME_ESCAPE`.
Runtime security - Abnormal process: `RUNTIME_FILE`.
Runtime security - Abnormal file access: `RUNTIME_PROCESS`.
Runtime security - High-risk syscall: `RUNTIME_SYSCALL`.
Runtime security - Reverse shell: `RUNTIME_REVERSE_SHELL`.
Runtime security - Trojan: `RUNTIME_VIRUS`. 
     * @return Type Alert event type:
Image repository security - Trojan: `IMG_REG_VIRUS`.
Image repository security - Vulnerability: `IMG_REG_VUL`.
Image repository security - Sensitive data: `IMG_REG_RISK`.
Image security - Trojan: `IMG_VIRUS`.
Image security - Vulnerability: `IMG_VUL`.
Image security - Sensitive data: `IMG_RISK`.
Image security - Image blocking: `IMG_INTERCEPT`.
Runtime security - Container escape: `RUNTIME_ESCAPE`.
Runtime security - Abnormal process: `RUNTIME_FILE`.
Runtime security - Abnormal file access: `RUNTIME_PROCESS`.
Runtime security - High-risk syscall: `RUNTIME_SYSCALL`.
Runtime security - Reverse shell: `RUNTIME_REVERSE_SHELL`.
Runtime security - Trojan: `RUNTIME_VIRUS`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Alert event type:
Image repository security - Trojan: `IMG_REG_VIRUS`.
Image repository security - Vulnerability: `IMG_REG_VUL`.
Image repository security - Sensitive data: `IMG_REG_RISK`.
Image security - Trojan: `IMG_VIRUS`.
Image security - Vulnerability: `IMG_VUL`.
Image security - Sensitive data: `IMG_RISK`.
Image security - Image blocking: `IMG_INTERCEPT`.
Runtime security - Container escape: `RUNTIME_ESCAPE`.
Runtime security - Abnormal process: `RUNTIME_FILE`.
Runtime security - Abnormal file access: `RUNTIME_PROCESS`.
Runtime security - High-risk syscall: `RUNTIME_SYSCALL`.
Runtime security - Reverse shell: `RUNTIME_REVERSE_SHELL`.
Runtime security - Trojan: `RUNTIME_VIRUS`.
     * @param Type Alert event type:
Image repository security - Trojan: `IMG_REG_VIRUS`.
Image repository security - Vulnerability: `IMG_REG_VUL`.
Image repository security - Sensitive data: `IMG_REG_RISK`.
Image security - Trojan: `IMG_VIRUS`.
Image security - Vulnerability: `IMG_VUL`.
Image security - Sensitive data: `IMG_RISK`.
Image security - Image blocking: `IMG_INTERCEPT`.
Runtime security - Container escape: `RUNTIME_ESCAPE`.
Runtime security - Abnormal process: `RUNTIME_FILE`.
Runtime security - Abnormal file access: `RUNTIME_PROCESS`.
Runtime security - High-risk syscall: `RUNTIME_SYSCALL`.
Runtime security - Reverse shell: `RUNTIME_REVERSE_SHELL`.
Runtime security - Trojan: `RUNTIME_VIRUS`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Switch status:
`ON`: On.
`OFF`: Off. 
     * @return Switch Switch status:
`ON`: On.
`OFF`: Off.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch status:
`ON`: On.
`OFF`: Off.
     * @param Switch Switch status:
`ON`: On.
`OFF`: Off.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Alert start time in the format of "HH:mm" 
     * @return BeginTime Alert start time in the format of "HH:mm"
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Alert start time in the format of "HH:mm"
     * @param BeginTime Alert start time in the format of "HH:mm"
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Alert end time in the format of "HH:mm" 
     * @return EndTime Alert end time in the format of "HH:mm"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Alert end time in the format of "HH:mm"
     * @param EndTime Alert end time in the format of "HH:mm"
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Alert level policy control. Each binary bit represents a meaning, and the value is passed as a string.
The control switch can be high, medium, or low, corresponding to the third, second, and first binary bit, respectively. Valid values: `0` (off); `1` (on).
For example, if the high and medium levels indicate to enable the alert and the low level indicates to disable it, the binary value is `110`.
If level control does not take effect for the alert type, pass in `1`. 
     * @return ControlBits Alert level policy control. Each binary bit represents a meaning, and the value is passed as a string.
The control switch can be high, medium, or low, corresponding to the third, second, and first binary bit, respectively. Valid values: `0` (off); `1` (on).
For example, if the high and medium levels indicate to enable the alert and the low level indicates to disable it, the binary value is `110`.
If level control does not take effect for the alert type, pass in `1`.
     */
    public String getControlBits() {
        return this.ControlBits;
    }

    /**
     * Set Alert level policy control. Each binary bit represents a meaning, and the value is passed as a string.
The control switch can be high, medium, or low, corresponding to the third, second, and first binary bit, respectively. Valid values: `0` (off); `1` (on).
For example, if the high and medium levels indicate to enable the alert and the low level indicates to disable it, the binary value is `110`.
If level control does not take effect for the alert type, pass in `1`.
     * @param ControlBits Alert level policy control. Each binary bit represents a meaning, and the value is passed as a string.
The control switch can be high, medium, or low, corresponding to the third, second, and first binary bit, respectively. Valid values: `0` (off); `1` (on).
For example, if the high and medium levels indicate to enable the alert and the low level indicates to disable it, the binary value is `110`.
If level control does not take effect for the alert type, pass in `1`.
     */
    public void setControlBits(String ControlBits) {
        this.ControlBits = ControlBits;
    }

    public WarningRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WarningRule(WarningRule source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ControlBits", this.ControlBits);

    }
}

