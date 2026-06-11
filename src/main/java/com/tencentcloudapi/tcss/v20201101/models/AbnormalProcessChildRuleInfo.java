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

public class AbnormalProcessChildRuleInfo extends AbstractModel {

    /**
    * <p>Process path.</p>
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * <p>Policy mode: RULE_MODE_RELEASE: allow<br>   RULE_MODE_ALERT: alarm<br>   RULE_MODE_HOLDUP: block</p>
    */
    @SerializedName("RuleMode")
    @Expose
    private String RuleMode;

    /**
    * <p>Command line parameters.</p>
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * <p>Sub-policy ID.</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>Threat level: HIGH, MIDDLE, and LOW.</p>
    */
    @SerializedName("RuleLevel")
    @Expose
    private String RuleLevel;

    /**
     * Get <p>Process path.</p> 
     * @return ProcessPath <p>Process path.</p>
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set <p>Process path.</p>
     * @param ProcessPath <p>Process path.</p>
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get <p>Policy mode: RULE_MODE_RELEASE: allow<br>   RULE_MODE_ALERT: alarm<br>   RULE_MODE_HOLDUP: block</p> 
     * @return RuleMode <p>Policy mode: RULE_MODE_RELEASE: allow<br>   RULE_MODE_ALERT: alarm<br>   RULE_MODE_HOLDUP: block</p>
     */
    public String getRuleMode() {
        return this.RuleMode;
    }

    /**
     * Set <p>Policy mode: RULE_MODE_RELEASE: allow<br>   RULE_MODE_ALERT: alarm<br>   RULE_MODE_HOLDUP: block</p>
     * @param RuleMode <p>Policy mode: RULE_MODE_RELEASE: allow<br>   RULE_MODE_ALERT: alarm<br>   RULE_MODE_HOLDUP: block</p>
     */
    public void setRuleMode(String RuleMode) {
        this.RuleMode = RuleMode;
    }

    /**
     * Get <p>Command line parameters.</p> 
     * @return CmdLine <p>Command line parameters.</p>
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set <p>Command line parameters.</p>
     * @param CmdLine <p>Command line parameters.</p>
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get <p>Sub-policy ID.</p> 
     * @return RuleId <p>Sub-policy ID.</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Sub-policy ID.</p>
     * @param RuleId <p>Sub-policy ID.</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Threat level: HIGH, MIDDLE, and LOW.</p> 
     * @return RuleLevel <p>Threat level: HIGH, MIDDLE, and LOW.</p>
     */
    public String getRuleLevel() {
        return this.RuleLevel;
    }

    /**
     * Set <p>Threat level: HIGH, MIDDLE, and LOW.</p>
     * @param RuleLevel <p>Threat level: HIGH, MIDDLE, and LOW.</p>
     */
    public void setRuleLevel(String RuleLevel) {
        this.RuleLevel = RuleLevel;
    }

    public AbnormalProcessChildRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalProcessChildRuleInfo(AbnormalProcessChildRuleInfo source) {
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.RuleMode != null) {
            this.RuleMode = new String(source.RuleMode);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleLevel != null) {
            this.RuleLevel = new String(source.RuleLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "RuleMode", this.RuleMode);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleLevel", this.RuleLevel);

    }
}

