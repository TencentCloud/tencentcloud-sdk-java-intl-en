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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConfigRequest extends AbstractModel {

    /**
    * collection configuration name
-Names do not contain special characters
- Name can be up to 255 characters, exceeding which will be truncated
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Log topic ID to which the collection configuration belongs, i.e., topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Log collection path, which contains the file name. Multiple paths are supported and should be separated by English commas. It is required for file collection.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * The collected log type, default is minimalist_log. Supports the following types:- json_log: JSON File Log (For more information, see [Using JSON pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17419?from_cn_redirect=1));- delimiter_log: Delimiter - File Logs (For more information, see [Using delimiter pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17420?from_cn_redirect=1));- minimalist_log: Single-line Full-text File Log (For more information, see [Using single-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17421?from_cn_redirect=1));- fullregex_log: Single line full regular expression - File log (For more information, see [Using single-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52365?from_cn_redirect=1));- multiline_log: Multiline Full-text File Log (For more information, see [Using multi-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17422?from_cn_redirect=1));- multiline_fullregex_log: Multi-line complete regular expression - File Logs (For more information, see [Using multi-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52366?from_cn_redirect=1));- user_define_log: Combined parsing (Suitable for logs with multiple nested formats, see [Using combined parsing pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/61310?from_cn_redirect=1));- service_syslog: syslog collection (For more information, see [Collect Syslog](https://intl.cloud.tencent.com/document/product/614/81454?from_cn_redirect=1));- windows_event_log: Windows event log (see [Collecting Windows Event Logs](https://intl.cloud.tencent.com/document/product/614/96678?from_cn_redirect=1)).
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
    * Custom collection rules, serialized JSON string. Required when LogType is user_define_log.
    */
    @SerializedName("UserDefineRule")
    @Expose
    private String UserDefineRule;

    /**
    * Advanced collection configuration. A JSON string, Key/Value definition as follows:- ClsAgentFileTimeout (timeout property), value range: an integer greater than or equal to 0, where 0 means no timeout.- ClsAgentMaxDepth (maximum directory depth), value range: an integer greater than or equal to 0.- `ClsAgentParseFailMerge` (Merge Parsing Failure Log), value range: true or false
Sample:`{\"ClsAgentFileTimeout\":0,\"ClsAgentMaxDepth\":10,\"ClsAgentParseFailMerge\":true}`

Default placeholder value in console: `{\"ClsAgentDefault\":0}`
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private String AdvancedConfig;

    /**
    * Log input type (<span style="color:red; font-weight:bold">Note: Required for Windows scenario and only supports file and windows_event type</span>)
-file type collection
-windows event collection
-syslog: System log collection
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
     * Get collection configuration name
-Names do not contain special characters
- Name can be up to 255 characters, exceeding which will be truncated 
     * @return Name collection configuration name
-Names do not contain special characters
- Name can be up to 255 characters, exceeding which will be truncated
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set collection configuration name
-Names do not contain special characters
- Name can be up to 255 characters, exceeding which will be truncated
     * @param Name collection configuration name
-Names do not contain special characters
- Name can be up to 255 characters, exceeding which will be truncated
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Log topic ID to which the collection configuration belongs, i.e., topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). 
     * @return Output Log topic ID to which the collection configuration belongs, i.e., topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Log topic ID to which the collection configuration belongs, i.e., topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     * @param Output Log topic ID to which the collection configuration belongs, i.e., topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get Log collection path, which contains the file name. Multiple paths are supported and should be separated by English commas. It is required for file collection. 
     * @return Path Log collection path, which contains the file name. Multiple paths are supported and should be separated by English commas. It is required for file collection.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Log collection path, which contains the file name. Multiple paths are supported and should be separated by English commas. It is required for file collection.
     * @param Path Log collection path, which contains the file name. Multiple paths are supported and should be separated by English commas. It is required for file collection.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get The collected log type, default is minimalist_log. Supports the following types:- json_log: JSON File Log (For more information, see [Using JSON pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17419?from_cn_redirect=1));- delimiter_log: Delimiter - File Logs (For more information, see [Using delimiter pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17420?from_cn_redirect=1));- minimalist_log: Single-line Full-text File Log (For more information, see [Using single-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17421?from_cn_redirect=1));- fullregex_log: Single line full regular expression - File log (For more information, see [Using single-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52365?from_cn_redirect=1));- multiline_log: Multiline Full-text File Log (For more information, see [Using multi-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17422?from_cn_redirect=1));- multiline_fullregex_log: Multi-line complete regular expression - File Logs (For more information, see [Using multi-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52366?from_cn_redirect=1));- user_define_log: Combined parsing (Suitable for logs with multiple nested formats, see [Using combined parsing pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/61310?from_cn_redirect=1));- service_syslog: syslog collection (For more information, see [Collect Syslog](https://intl.cloud.tencent.com/document/product/614/81454?from_cn_redirect=1));- windows_event_log: Windows event log (see [Collecting Windows Event Logs](https://intl.cloud.tencent.com/document/product/614/96678?from_cn_redirect=1)). 
     * @return LogType The collected log type, default is minimalist_log. Supports the following types:- json_log: JSON File Log (For more information, see [Using JSON pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17419?from_cn_redirect=1));- delimiter_log: Delimiter - File Logs (For more information, see [Using delimiter pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17420?from_cn_redirect=1));- minimalist_log: Single-line Full-text File Log (For more information, see [Using single-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17421?from_cn_redirect=1));- fullregex_log: Single line full regular expression - File log (For more information, see [Using single-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52365?from_cn_redirect=1));- multiline_log: Multiline Full-text File Log (For more information, see [Using multi-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17422?from_cn_redirect=1));- multiline_fullregex_log: Multi-line complete regular expression - File Logs (For more information, see [Using multi-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52366?from_cn_redirect=1));- user_define_log: Combined parsing (Suitable for logs with multiple nested formats, see [Using combined parsing pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/61310?from_cn_redirect=1));- service_syslog: syslog collection (For more information, see [Collect Syslog](https://intl.cloud.tencent.com/document/product/614/81454?from_cn_redirect=1));- windows_event_log: Windows event log (see [Collecting Windows Event Logs](https://intl.cloud.tencent.com/document/product/614/96678?from_cn_redirect=1)).
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set The collected log type, default is minimalist_log. Supports the following types:- json_log: JSON File Log (For more information, see [Using JSON pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17419?from_cn_redirect=1));- delimiter_log: Delimiter - File Logs (For more information, see [Using delimiter pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17420?from_cn_redirect=1));- minimalist_log: Single-line Full-text File Log (For more information, see [Using single-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17421?from_cn_redirect=1));- fullregex_log: Single line full regular expression - File log (For more information, see [Using single-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52365?from_cn_redirect=1));- multiline_log: Multiline Full-text File Log (For more information, see [Using multi-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17422?from_cn_redirect=1));- multiline_fullregex_log: Multi-line complete regular expression - File Logs (For more information, see [Using multi-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52366?from_cn_redirect=1));- user_define_log: Combined parsing (Suitable for logs with multiple nested formats, see [Using combined parsing pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/61310?from_cn_redirect=1));- service_syslog: syslog collection (For more information, see [Collect Syslog](https://intl.cloud.tencent.com/document/product/614/81454?from_cn_redirect=1));- windows_event_log: Windows event log (see [Collecting Windows Event Logs](https://intl.cloud.tencent.com/document/product/614/96678?from_cn_redirect=1)).
     * @param LogType The collected log type, default is minimalist_log. Supports the following types:- json_log: JSON File Log (For more information, see [Using JSON pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17419?from_cn_redirect=1));- delimiter_log: Delimiter - File Logs (For more information, see [Using delimiter pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17420?from_cn_redirect=1));- minimalist_log: Single-line Full-text File Log (For more information, see [Using single-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17421?from_cn_redirect=1));- fullregex_log: Single line full regular expression - File log (For more information, see [Using single-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52365?from_cn_redirect=1));- multiline_log: Multiline Full-text File Log (For more information, see [Using multi-line full-text pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/17422?from_cn_redirect=1));- multiline_fullregex_log: Multi-line complete regular expression - File Logs (For more information, see [Using multi-line - complete regular expression pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/52366?from_cn_redirect=1));- user_define_log: Combined parsing (Suitable for logs with multiple nested formats, see [Using combined parsing pattern to collect logs](https://intl.cloud.tencent.com/document/product/614/61310?from_cn_redirect=1));- service_syslog: syslog collection (For more information, see [Collect Syslog](https://intl.cloud.tencent.com/document/product/614/81454?from_cn_redirect=1));- windows_event_log: Windows event log (see [Collecting Windows Event Logs](https://intl.cloud.tencent.com/document/product/614/96678?from_cn_redirect=1)).
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
     * Get Custom collection rules, serialized JSON string. Required when LogType is user_define_log. 
     * @return UserDefineRule Custom collection rules, serialized JSON string. Required when LogType is user_define_log.
     */
    public String getUserDefineRule() {
        return this.UserDefineRule;
    }

    /**
     * Set Custom collection rules, serialized JSON string. Required when LogType is user_define_log.
     * @param UserDefineRule Custom collection rules, serialized JSON string. Required when LogType is user_define_log.
     */
    public void setUserDefineRule(String UserDefineRule) {
        this.UserDefineRule = UserDefineRule;
    }

    /**
     * Get Advanced collection configuration. A JSON string, Key/Value definition as follows:- ClsAgentFileTimeout (timeout property), value range: an integer greater than or equal to 0, where 0 means no timeout.- ClsAgentMaxDepth (maximum directory depth), value range: an integer greater than or equal to 0.- `ClsAgentParseFailMerge` (Merge Parsing Failure Log), value range: true or false
Sample:`{\"ClsAgentFileTimeout\":0,\"ClsAgentMaxDepth\":10,\"ClsAgentParseFailMerge\":true}`

Default placeholder value in console: `{\"ClsAgentDefault\":0}` 
     * @return AdvancedConfig Advanced collection configuration. A JSON string, Key/Value definition as follows:- ClsAgentFileTimeout (timeout property), value range: an integer greater than or equal to 0, where 0 means no timeout.- ClsAgentMaxDepth (maximum directory depth), value range: an integer greater than or equal to 0.- `ClsAgentParseFailMerge` (Merge Parsing Failure Log), value range: true or false
Sample:`{\"ClsAgentFileTimeout\":0,\"ClsAgentMaxDepth\":10,\"ClsAgentParseFailMerge\":true}`

Default placeholder value in console: `{\"ClsAgentDefault\":0}`
     */
    public String getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set Advanced collection configuration. A JSON string, Key/Value definition as follows:- ClsAgentFileTimeout (timeout property), value range: an integer greater than or equal to 0, where 0 means no timeout.- ClsAgentMaxDepth (maximum directory depth), value range: an integer greater than or equal to 0.- `ClsAgentParseFailMerge` (Merge Parsing Failure Log), value range: true or false
Sample:`{\"ClsAgentFileTimeout\":0,\"ClsAgentMaxDepth\":10,\"ClsAgentParseFailMerge\":true}`

Default placeholder value in console: `{\"ClsAgentDefault\":0}`
     * @param AdvancedConfig Advanced collection configuration. A JSON string, Key/Value definition as follows:- ClsAgentFileTimeout (timeout property), value range: an integer greater than or equal to 0, where 0 means no timeout.- ClsAgentMaxDepth (maximum directory depth), value range: an integer greater than or equal to 0.- `ClsAgentParseFailMerge` (Merge Parsing Failure Log), value range: true or false
Sample:`{\"ClsAgentFileTimeout\":0,\"ClsAgentMaxDepth\":10,\"ClsAgentParseFailMerge\":true}`

Default placeholder value in console: `{\"ClsAgentDefault\":0}`
     */
    public void setAdvancedConfig(String AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    /**
     * Get Log input type (<span style="color:red; font-weight:bold">Note: Required for Windows scenario and only supports file and windows_event type</span>)
-file type collection
-windows event collection
-syslog: System log collection 
     * @return InputType Log input type (<span style="color:red; font-weight:bold">Note: Required for Windows scenario and only supports file and windows_event type</span>)
-file type collection
-windows event collection
-syslog: System log collection
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set Log input type (<span style="color:red; font-weight:bold">Note: Required for Windows scenario and only supports file and windows_event type</span>)
-file type collection
-windows event collection
-syslog: System log collection
     * @param InputType Log input type (<span style="color:red; font-weight:bold">Note: Required for Windows scenario and only supports file and windows_event type</span>)
-file type collection
-windows event collection
-syslog: System log collection
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    public CreateConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConfigRequest(CreateConfigRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
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
        if (source.UserDefineRule != null) {
            this.UserDefineRule = new String(source.UserDefineRule);
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new String(source.AdvancedConfig);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);
        this.setParamArrayObj(map, prefix + "ExcludePaths.", this.ExcludePaths);
        this.setParamSimple(map, prefix + "UserDefineRule", this.UserDefineRule);
        this.setParamSimple(map, prefix + "AdvancedConfig", this.AdvancedConfig);
        this.setParamSimple(map, prefix + "InputType", this.InputType);

    }
}

