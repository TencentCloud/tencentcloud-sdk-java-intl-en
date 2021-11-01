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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigInfo extends AbstractModel{

    /**
    * Collection rule configuration ID
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Log formatting method
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LogFormat")
    @Expose
    private String LogFormat;

    /**
    * Log collection path
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Type of the log to be collected. Valid values: `json_log`: log in JSON format; `delimiter_log`: log in delimited format; `minimalist_log`: minimalist log; `multiline_log`: log in multi-line format; `fullregex_log`: log in full regex format. Default value: `minimalist_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Extraction rule. If `ExtractRule` is set, `LogType` must be set
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtractRule")
    @Expose
    private ExtractRuleInfo ExtractRule;

    /**
    * Collection path blocklist
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExcludePaths")
    @Expose
    private ExcludePathInfo [] ExcludePaths;

    /**
    * Log topic ID (TopicId) of collection configuration
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Update time
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Custom parsing string
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UserDefineRule")
    @Expose
    private String UserDefineRule;

    /**
     * Get Collection rule configuration ID 
     * @return ConfigId Collection rule configuration ID
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Collection rule configuration ID
     * @param ConfigId Collection rule configuration ID
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Log formatting method
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LogFormat Log formatting method
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set Log formatting method
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LogFormat Log formatting method
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogFormat(String LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get Log collection path
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Path Log collection path
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Log collection path
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Path Log collection path
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Type of the log to be collected. Valid values: `json_log`: log in JSON format; `delimiter_log`: log in delimited format; `minimalist_log`: minimalist log; `multiline_log`: log in multi-line format; `fullregex_log`: log in full regex format. Default value: `minimalist_log`
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LogType Type of the log to be collected. Valid values: `json_log`: log in JSON format; `delimiter_log`: log in delimited format; `minimalist_log`: minimalist log; `multiline_log`: log in multi-line format; `fullregex_log`: log in full regex format. Default value: `minimalist_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Type of the log to be collected. Valid values: `json_log`: log in JSON format; `delimiter_log`: log in delimited format; `minimalist_log`: minimalist log; `multiline_log`: log in multi-line format; `fullregex_log`: log in full regex format. Default value: `minimalist_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LogType Type of the log to be collected. Valid values: `json_log`: log in JSON format; `delimiter_log`: log in delimited format; `minimalist_log`: minimalist log; `multiline_log`: log in multi-line format; `fullregex_log`: log in full regex format. Default value: `minimalist_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Extraction rule. If `ExtractRule` is set, `LogType` must be set
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ExtractRule Extraction rule. If `ExtractRule` is set, `LogType` must be set
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ExtractRuleInfo getExtractRule() {
        return this.ExtractRule;
    }

    /**
     * Set Extraction rule. If `ExtractRule` is set, `LogType` must be set
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ExtractRule Extraction rule. If `ExtractRule` is set, `LogType` must be set
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExtractRule(ExtractRuleInfo ExtractRule) {
        this.ExtractRule = ExtractRule;
    }

    /**
     * Get Collection path blocklist
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ExcludePaths Collection path blocklist
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ExcludePathInfo [] getExcludePaths() {
        return this.ExcludePaths;
    }

    /**
     * Set Collection path blocklist
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ExcludePaths Collection path blocklist
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExcludePaths(ExcludePathInfo [] ExcludePaths) {
        this.ExcludePaths = ExcludePaths;
    }

    /**
     * Get Log topic ID (TopicId) of collection configuration 
     * @return Output Log topic ID (TopicId) of collection configuration
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Log topic ID (TopicId) of collection configuration
     * @param Output Log topic ID (TopicId) of collection configuration
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get Update time
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Custom parsing string
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UserDefineRule Custom parsing string
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUserDefineRule() {
        return this.UserDefineRule;
    }

    /**
     * Set Custom parsing string
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UserDefineRule Custom parsing string
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUserDefineRule(String UserDefineRule) {
        this.UserDefineRule = UserDefineRule;
    }

    public ConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigInfo(ConfigInfo source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.LogFormat != null) {
            this.LogFormat = new String(source.LogFormat);
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
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserDefineRule != null) {
            this.UserDefineRule = new String(source.UserDefineRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "LogFormat", this.LogFormat);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);
        this.setParamArrayObj(map, prefix + "ExcludePaths.", this.ExcludePaths);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserDefineRule", this.UserDefineRule);

    }
}

