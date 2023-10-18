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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogConfigRequest extends AbstractModel {

    /**
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Configuration name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Collection type. Values: `container_stdout` (standard); `container_file` (file)
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log withdrawal mode. Values: `minimalist_log` (full text in a single line); `multiline_log` (full text in multiple lines); `json_log` (JSON); `fullregex_log` (regex in a single line); `multiline_fullregex_log` (regex in multiple lines)
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * The first line regex. It’s valid when `LogType` is `multiline_log`.
    */
    @SerializedName("BeginningRegex")
    @Expose
    private String BeginningRegex;

    /**
    * Directory of files to collect. It’s valid when `InputType` is `container_file`.
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
    * Name pattern of files to collect. It’s valid when `InputType` is `container_file`.
    */
    @SerializedName("FilePattern")
    @Expose
    private String FilePattern;

    /**
    * Export
    */
    @SerializedName("ExtractRule")
    @Expose
    private LogConfigExtractRule ExtractRule;

    /**
     * Get Environment ID 
     * @return EnvironmentId Environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
     * @param EnvironmentId Environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Configuration name 
     * @return Name Configuration name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Configuration name
     * @param Name Configuration name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Collection type. Values: `container_stdout` (standard); `container_file` (file) 
     * @return InputType Collection type. Values: `container_stdout` (standard); `container_file` (file)
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set Collection type. Values: `container_stdout` (standard); `container_file` (file)
     * @param InputType Collection type. Values: `container_stdout` (standard); `container_file` (file)
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Logset ID 
     * @return LogsetId Logset ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID
     * @param LogsetId Logset ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Log withdrawal mode. Values: `minimalist_log` (full text in a single line); `multiline_log` (full text in multiple lines); `json_log` (JSON); `fullregex_log` (regex in a single line); `multiline_fullregex_log` (regex in multiple lines) 
     * @return LogType Log withdrawal mode. Values: `minimalist_log` (full text in a single line); `multiline_log` (full text in multiple lines); `json_log` (JSON); `fullregex_log` (regex in a single line); `multiline_fullregex_log` (regex in multiple lines)
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log withdrawal mode. Values: `minimalist_log` (full text in a single line); `multiline_log` (full text in multiple lines); `json_log` (JSON); `fullregex_log` (regex in a single line); `multiline_fullregex_log` (regex in multiple lines)
     * @param LogType Log withdrawal mode. Values: `minimalist_log` (full text in a single line); `multiline_log` (full text in multiple lines); `json_log` (JSON); `fullregex_log` (regex in a single line); `multiline_fullregex_log` (regex in multiple lines)
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get The first line regex. It’s valid when `LogType` is `multiline_log`. 
     * @return BeginningRegex The first line regex. It’s valid when `LogType` is `multiline_log`.
     */
    public String getBeginningRegex() {
        return this.BeginningRegex;
    }

    /**
     * Set The first line regex. It’s valid when `LogType` is `multiline_log`.
     * @param BeginningRegex The first line regex. It’s valid when `LogType` is `multiline_log`.
     */
    public void setBeginningRegex(String BeginningRegex) {
        this.BeginningRegex = BeginningRegex;
    }

    /**
     * Get Directory of files to collect. It’s valid when `InputType` is `container_file`. 
     * @return LogPath Directory of files to collect. It’s valid when `InputType` is `container_file`.
     */
    public String getLogPath() {
        return this.LogPath;
    }

    /**
     * Set Directory of files to collect. It’s valid when `InputType` is `container_file`.
     * @param LogPath Directory of files to collect. It’s valid when `InputType` is `container_file`.
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    /**
     * Get Name pattern of files to collect. It’s valid when `InputType` is `container_file`. 
     * @return FilePattern Name pattern of files to collect. It’s valid when `InputType` is `container_file`.
     */
    public String getFilePattern() {
        return this.FilePattern;
    }

    /**
     * Set Name pattern of files to collect. It’s valid when `InputType` is `container_file`.
     * @param FilePattern Name pattern of files to collect. It’s valid when `InputType` is `container_file`.
     */
    public void setFilePattern(String FilePattern) {
        this.FilePattern = FilePattern;
    }

    /**
     * Get Export 
     * @return ExtractRule Export
     */
    public LogConfigExtractRule getExtractRule() {
        return this.ExtractRule;
    }

    /**
     * Set Export
     * @param ExtractRule Export
     */
    public void setExtractRule(LogConfigExtractRule ExtractRule) {
        this.ExtractRule = ExtractRule;
    }

    public CreateLogConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogConfigRequest(CreateLogConfigRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.BeginningRegex != null) {
            this.BeginningRegex = new String(source.BeginningRegex);
        }
        if (source.LogPath != null) {
            this.LogPath = new String(source.LogPath);
        }
        if (source.FilePattern != null) {
            this.FilePattern = new String(source.FilePattern);
        }
        if (source.ExtractRule != null) {
            this.ExtractRule = new LogConfigExtractRule(source.ExtractRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "BeginningRegex", this.BeginningRegex);
        this.setParamSimple(map, prefix + "LogPath", this.LogPath);
        this.setParamSimple(map, prefix + "FilePattern", this.FilePattern);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);

    }
}

