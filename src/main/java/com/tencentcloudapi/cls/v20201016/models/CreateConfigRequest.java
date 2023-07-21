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

public class CreateConfigRequest extends AbstractModel{

    /**
    * Collection configuration name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Log topic ID (TopicId) of collection configuration
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Log collection path containing the filename
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Type of the log to be collected. Valid values: `json_log`: log in JSON format; `delimiter_log`: log in delimited format; `minimalist_log`: minimalist log; `multiline_log`: log in multi-line format; `fullregex_log`: log in full regex format. Default value: `minimalist_log`
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
    * Custom collection rule, which is a serialized JSON string
    */
    @SerializedName("UserDefineRule")
    @Expose
    private String UserDefineRule;

    /**
    * Advanced collection configuration
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private String AdvancedConfig;

    /**
     * Get Collection configuration name 
     * @return Name Collection configuration name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Collection configuration name
     * @param Name Collection configuration name
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Type of the log to be collected. Valid values: `json_log`: log in JSON format; `delimiter_log`: log in delimited format; `minimalist_log`: minimalist log; `multiline_log`: log in multi-line format; `fullregex_log`: log in full regex format. Default value: `minimalist_log` 
     * @return LogType Type of the log to be collected. Valid values: `json_log`: log in JSON format; `delimiter_log`: log in delimited format; `minimalist_log`: minimalist log; `multiline_log`: log in multi-line format; `fullregex_log`: log in full regex format. Default value: `minimalist_log`
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Type of the log to be collected. Valid values: `json_log`: log in JSON format; `delimiter_log`: log in delimited format; `minimalist_log`: minimalist log; `multiline_log`: log in multi-line format; `fullregex_log`: log in full regex format. Default value: `minimalist_log`
     * @param LogType Type of the log to be collected. Valid values: `json_log`: log in JSON format; `delimiter_log`: log in delimited format; `minimalist_log`: minimalist log; `multiline_log`: log in multi-line format; `fullregex_log`: log in full regex format. Default value: `minimalist_log`
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
     * Get Custom collection rule, which is a serialized JSON string 
     * @return UserDefineRule Custom collection rule, which is a serialized JSON string
     */
    public String getUserDefineRule() {
        return this.UserDefineRule;
    }

    /**
     * Set Custom collection rule, which is a serialized JSON string
     * @param UserDefineRule Custom collection rule, which is a serialized JSON string
     */
    public void setUserDefineRule(String UserDefineRule) {
        this.UserDefineRule = UserDefineRule;
    }

    /**
     * Get Advanced collection configuration 
     * @return AdvancedConfig Advanced collection configuration
     */
    public String getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set Advanced collection configuration
     * @param AdvancedConfig Advanced collection configuration
     */
    public void setAdvancedConfig(String AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
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

    }
}

