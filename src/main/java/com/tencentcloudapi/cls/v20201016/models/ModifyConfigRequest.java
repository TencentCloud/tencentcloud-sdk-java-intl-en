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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyConfigRequest extends AbstractModel {

    /**
    * Collection rule configuration ID, accessed through [Access collection rule configuration](https://intl.cloud.tencent.com/document/product/614/58616?from_cn_redirect=1).
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Collection rule configuration name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Log collection path containing the filename
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * The types of logs collected. Supported types are:
- json_log: JSON File Log (For more information, see [Using JSON pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17419?from_cn_redirect=1));- delimiter_log: Delimiter - File Logs (For more information, see [Using delimiter pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17420?from_cn_redirect=1));- minimalist_log: Single-line Full-text File Log (For more information, see [Using single-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17421?from_cn_redirect=1));- fullregex_log: Single line full regular expression - File log (For more information, see [Using single-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52365?from_cn_redirect=1));- multiline_log: Multiline Full-text File Log (For more information, see [Using multi-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17422?from_cn_redirect=1));- multiline_fullregex_log: Multi-line complete regular expression - File Logs (For more information, see [Using multi-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52366?from_cn_redirect=1));- user_define_log: Combined parsing (Suitable for logs with multiple nested formats, see [Using combined parsing pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/61310?from_cn_redirect=1));- service_syslog: syslog collection (For more information, see [Collect Syslog](https://intl.cloud.tencent.com/document/product/614/81454?from_cn_redirect=1));- windows_event_log: Windows event log (For more information, see [Collect Windows Event Log](https://intl.cloud.tencent.com/document/product/614/96678?from_cn_redirect=1)).
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Extraction rule. If `ExtractRule` is set, `LogType` must be set.
    */
    @SerializedName("ExtractRule")
    @Expose
    private ExtractRuleInfo ExtractRule;

    /**
    * Collection path blocklist
    */
    @SerializedName("ExcludePaths")
    @Expose
    private ExcludePathInfo [] ExcludePaths;

    /**
    * Log topic (TopicId) associated with collection configuration
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Custom parsing string, serialized as a JSON string.
    */
    @SerializedName("UserDefineRule")
    @Expose
    private String UserDefineRule;

    /**
    * Advanced collection configuration. A JSON string, Key/Value definition as follows:
- ClsAgentFileTimeout (timeout property), value range: an integer greater than or equal to 0, where 0 means no timeout- ClsAgentMaxDepth (maximum directory depth), value range: an integer greater than or equal to 0
- ClsAgentParseFailMerge (merge logs that failed parsing), value range: true or false
Sample:
`{\"ClsAgentFileTimeout\":0,\"ClsAgentMaxDepth\":10,\"ClsAgentParseFailMerge\":true}`
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private String AdvancedConfig;

    /**
     * Get Collection rule configuration ID, accessed through [Access collection rule configuration](https://intl.cloud.tencent.com/document/product/614/58616?from_cn_redirect=1). 
     * @return ConfigId Collection rule configuration ID, accessed through [Access collection rule configuration](https://intl.cloud.tencent.com/document/product/614/58616?from_cn_redirect=1).
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Collection rule configuration ID, accessed through [Access collection rule configuration](https://intl.cloud.tencent.com/document/product/614/58616?from_cn_redirect=1).
     * @param ConfigId Collection rule configuration ID, accessed through [Access collection rule configuration](https://intl.cloud.tencent.com/document/product/614/58616?from_cn_redirect=1).
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Collection rule configuration name 
     * @return Name Collection rule configuration name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Collection rule configuration name
     * @param Name Collection rule configuration name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Log collection path containing the filename 
     * @return Path Log collection path containing the filename
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Log collection path containing the filename
     * @param Path Log collection path containing the filename
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get The types of logs collected. Supported types are:
- json_log: JSON File Log (For more information, see [Using JSON pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17419?from_cn_redirect=1));- delimiter_log: Delimiter - File Logs (For more information, see [Using delimiter pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17420?from_cn_redirect=1));- minimalist_log: Single-line Full-text File Log (For more information, see [Using single-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17421?from_cn_redirect=1));- fullregex_log: Single line full regular expression - File log (For more information, see [Using single-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52365?from_cn_redirect=1));- multiline_log: Multiline Full-text File Log (For more information, see [Using multi-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17422?from_cn_redirect=1));- multiline_fullregex_log: Multi-line complete regular expression - File Logs (For more information, see [Using multi-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52366?from_cn_redirect=1));- user_define_log: Combined parsing (Suitable for logs with multiple nested formats, see [Using combined parsing pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/61310?from_cn_redirect=1));- service_syslog: syslog collection (For more information, see [Collect Syslog](https://intl.cloud.tencent.com/document/product/614/81454?from_cn_redirect=1));- windows_event_log: Windows event log (For more information, see [Collect Windows Event Log](https://intl.cloud.tencent.com/document/product/614/96678?from_cn_redirect=1)). 
     * @return LogType The types of logs collected. Supported types are:
- json_log: JSON File Log (For more information, see [Using JSON pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17419?from_cn_redirect=1));- delimiter_log: Delimiter - File Logs (For more information, see [Using delimiter pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17420?from_cn_redirect=1));- minimalist_log: Single-line Full-text File Log (For more information, see [Using single-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17421?from_cn_redirect=1));- fullregex_log: Single line full regular expression - File log (For more information, see [Using single-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52365?from_cn_redirect=1));- multiline_log: Multiline Full-text File Log (For more information, see [Using multi-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17422?from_cn_redirect=1));- multiline_fullregex_log: Multi-line complete regular expression - File Logs (For more information, see [Using multi-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52366?from_cn_redirect=1));- user_define_log: Combined parsing (Suitable for logs with multiple nested formats, see [Using combined parsing pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/61310?from_cn_redirect=1));- service_syslog: syslog collection (For more information, see [Collect Syslog](https://intl.cloud.tencent.com/document/product/614/81454?from_cn_redirect=1));- windows_event_log: Windows event log (For more information, see [Collect Windows Event Log](https://intl.cloud.tencent.com/document/product/614/96678?from_cn_redirect=1)).
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set The types of logs collected. Supported types are:
- json_log: JSON File Log (For more information, see [Using JSON pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17419?from_cn_redirect=1));- delimiter_log: Delimiter - File Logs (For more information, see [Using delimiter pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17420?from_cn_redirect=1));- minimalist_log: Single-line Full-text File Log (For more information, see [Using single-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17421?from_cn_redirect=1));- fullregex_log: Single line full regular expression - File log (For more information, see [Using single-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52365?from_cn_redirect=1));- multiline_log: Multiline Full-text File Log (For more information, see [Using multi-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17422?from_cn_redirect=1));- multiline_fullregex_log: Multi-line complete regular expression - File Logs (For more information, see [Using multi-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52366?from_cn_redirect=1));- user_define_log: Combined parsing (Suitable for logs with multiple nested formats, see [Using combined parsing pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/61310?from_cn_redirect=1));- service_syslog: syslog collection (For more information, see [Collect Syslog](https://intl.cloud.tencent.com/document/product/614/81454?from_cn_redirect=1));- windows_event_log: Windows event log (For more information, see [Collect Windows Event Log](https://intl.cloud.tencent.com/document/product/614/96678?from_cn_redirect=1)).
     * @param LogType The types of logs collected. Supported types are:
- json_log: JSON File Log (For more information, see [Using JSON pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17419?from_cn_redirect=1));- delimiter_log: Delimiter - File Logs (For more information, see [Using delimiter pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17420?from_cn_redirect=1));- minimalist_log: Single-line Full-text File Log (For more information, see [Using single-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17421?from_cn_redirect=1));- fullregex_log: Single line full regular expression - File log (For more information, see [Using single-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52365?from_cn_redirect=1));- multiline_log: Multiline Full-text File Log (For more information, see [Using multi-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17422?from_cn_redirect=1));- multiline_fullregex_log: Multi-line complete regular expression - File Logs (For more information, see [Using multi-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52366?from_cn_redirect=1));- user_define_log: Combined parsing (Suitable for logs with multiple nested formats, see [Using combined parsing pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/61310?from_cn_redirect=1));- service_syslog: syslog collection (For more information, see [Collect Syslog](https://intl.cloud.tencent.com/document/product/614/81454?from_cn_redirect=1));- windows_event_log: Windows event log (For more information, see [Collect Windows Event Log](https://intl.cloud.tencent.com/document/product/614/96678?from_cn_redirect=1)).
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Extraction rule. If `ExtractRule` is set, `LogType` must be set. 
     * @return ExtractRule Extraction rule. If `ExtractRule` is set, `LogType` must be set.
     */
    public ExtractRuleInfo getExtractRule() {
        return this.ExtractRule;
    }

    /**
     * Set Extraction rule. If `ExtractRule` is set, `LogType` must be set.
     * @param ExtractRule Extraction rule. If `ExtractRule` is set, `LogType` must be set.
     */
    public void setExtractRule(ExtractRuleInfo ExtractRule) {
        this.ExtractRule = ExtractRule;
    }

    /**
     * Get Collection path blocklist 
     * @return ExcludePaths Collection path blocklist
     */
    public ExcludePathInfo [] getExcludePaths() {
        return this.ExcludePaths;
    }

    /**
     * Set Collection path blocklist
     * @param ExcludePaths Collection path blocklist
     */
    public void setExcludePaths(ExcludePathInfo [] ExcludePaths) {
        this.ExcludePaths = ExcludePaths;
    }

    /**
     * Get Log topic (TopicId) associated with collection configuration 
     * @return Output Log topic (TopicId) associated with collection configuration
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Log topic (TopicId) associated with collection configuration
     * @param Output Log topic (TopicId) associated with collection configuration
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get Custom parsing string, serialized as a JSON string. 
     * @return UserDefineRule Custom parsing string, serialized as a JSON string.
     */
    public String getUserDefineRule() {
        return this.UserDefineRule;
    }

    /**
     * Set Custom parsing string, serialized as a JSON string.
     * @param UserDefineRule Custom parsing string, serialized as a JSON string.
     */
    public void setUserDefineRule(String UserDefineRule) {
        this.UserDefineRule = UserDefineRule;
    }

    /**
     * Get Advanced collection configuration. A JSON string, Key/Value definition as follows:
- ClsAgentFileTimeout (timeout property), value range: an integer greater than or equal to 0, where 0 means no timeout- ClsAgentMaxDepth (maximum directory depth), value range: an integer greater than or equal to 0
- ClsAgentParseFailMerge (merge logs that failed parsing), value range: true or false
Sample:
`{\"ClsAgentFileTimeout\":0,\"ClsAgentMaxDepth\":10,\"ClsAgentParseFailMerge\":true}` 
     * @return AdvancedConfig Advanced collection configuration. A JSON string, Key/Value definition as follows:
- ClsAgentFileTimeout (timeout property), value range: an integer greater than or equal to 0, where 0 means no timeout- ClsAgentMaxDepth (maximum directory depth), value range: an integer greater than or equal to 0
- ClsAgentParseFailMerge (merge logs that failed parsing), value range: true or false
Sample:
`{\"ClsAgentFileTimeout\":0,\"ClsAgentMaxDepth\":10,\"ClsAgentParseFailMerge\":true}`
     */
    public String getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set Advanced collection configuration. A JSON string, Key/Value definition as follows:
- ClsAgentFileTimeout (timeout property), value range: an integer greater than or equal to 0, where 0 means no timeout- ClsAgentMaxDepth (maximum directory depth), value range: an integer greater than or equal to 0
- ClsAgentParseFailMerge (merge logs that failed parsing), value range: true or false
Sample:
`{\"ClsAgentFileTimeout\":0,\"ClsAgentMaxDepth\":10,\"ClsAgentParseFailMerge\":true}`
     * @param AdvancedConfig Advanced collection configuration. A JSON string, Key/Value definition as follows:
- ClsAgentFileTimeout (timeout property), value range: an integer greater than or equal to 0, where 0 means no timeout- ClsAgentMaxDepth (maximum directory depth), value range: an integer greater than or equal to 0
- ClsAgentParseFailMerge (merge logs that failed parsing), value range: true or false
Sample:
`{\"ClsAgentFileTimeout\":0,\"ClsAgentMaxDepth\":10,\"ClsAgentParseFailMerge\":true}`
     */
    public void setAdvancedConfig(String AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    public ModifyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConfigRequest(ModifyConfigRequest source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.ExtractRule != null) {
            this.ExtractRule = new ExtractRuleInfo(source.ExtractRule);
        }
        if (source.ExcludePaths != null) {
            this.ExcludePaths = new ExcludePathInfo[source.ExcludePaths.length];
            for (int i = 0; i < source.ExcludePaths.length; i++) {
                this.ExcludePaths[i] = new ExcludePathInfo(source.ExcludePaths[i]);
            }
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.UserDefineRule != null) {
            this.UserDefineRule = new String(source.UserDefineRule);
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new String(source.AdvancedConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);
        this.setParamArrayObj(map, prefix + "ExcludePaths.", this.ExcludePaths);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "UserDefineRule", this.UserDefineRule);
        this.setParamSimple(map, prefix + "AdvancedConfig", this.AdvancedConfig);

    }
}

