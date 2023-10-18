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

public class LogConfig extends AbstractModel {

    /**
    * Name.
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
    * Logset ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log topic ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log withdrawal mode. Values: `minimalist_log` (full text in a single line); `multiline_log` (full text in multiple lines); `fullregex_log` (regex in a single line); `multiline_fullregex_log` (regex in multiple lines), `json_log` (JSON); 
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * First line regex. It’s valid when `LogType` is `multiline_log` or `multiline_fullregex_log`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("BeginningRegex")
    @Expose
    private String BeginningRegex;

    /**
    * Directory of files to collect. It’s valid when `InputType` is `container_file`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
    * Name pattern of files to collect. It’s valid when `InputType` is `container_file`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FilePattern")
    @Expose
    private String FilePattern;

    /**
    * Creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * Update time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyDate")
    @Expose
    private String ModifyDate;

    /**
    * Application ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Export rules
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ExtractRule")
    @Expose
    private LogConfigExtractRule ExtractRule;

    /**
     * Get Name. 
     * @return Name Name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name.
     * @param Name Name.
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
     * Get Logset ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LogsetId Logset ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LogsetId Logset ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Log topic ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TopicId Log topic ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TopicId Log topic ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Log withdrawal mode. Values: `minimalist_log` (full text in a single line); `multiline_log` (full text in multiple lines); `fullregex_log` (regex in a single line); `multiline_fullregex_log` (regex in multiple lines), `json_log` (JSON);  
     * @return LogType Log withdrawal mode. Values: `minimalist_log` (full text in a single line); `multiline_log` (full text in multiple lines); `fullregex_log` (regex in a single line); `multiline_fullregex_log` (regex in multiple lines), `json_log` (JSON); 
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log withdrawal mode. Values: `minimalist_log` (full text in a single line); `multiline_log` (full text in multiple lines); `fullregex_log` (regex in a single line); `multiline_fullregex_log` (regex in multiple lines), `json_log` (JSON); 
     * @param LogType Log withdrawal mode. Values: `minimalist_log` (full text in a single line); `multiline_log` (full text in multiple lines); `fullregex_log` (regex in a single line); `multiline_fullregex_log` (regex in multiple lines), `json_log` (JSON); 
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get First line regex. It’s valid when `LogType` is `multiline_log` or `multiline_fullregex_log`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return BeginningRegex First line regex. It’s valid when `LogType` is `multiline_log` or `multiline_fullregex_log`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getBeginningRegex() {
        return this.BeginningRegex;
    }

    /**
     * Set First line regex. It’s valid when `LogType` is `multiline_log` or `multiline_fullregex_log`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param BeginningRegex First line regex. It’s valid when `LogType` is `multiline_log` or `multiline_fullregex_log`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setBeginningRegex(String BeginningRegex) {
        this.BeginningRegex = BeginningRegex;
    }

    /**
     * Get Directory of files to collect. It’s valid when `InputType` is `container_file`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LogPath Directory of files to collect. It’s valid when `InputType` is `container_file`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLogPath() {
        return this.LogPath;
    }

    /**
     * Set Directory of files to collect. It’s valid when `InputType` is `container_file`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LogPath Directory of files to collect. It’s valid when `InputType` is `container_file`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    /**
     * Get Name pattern of files to collect. It’s valid when `InputType` is `container_file`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return FilePattern Name pattern of files to collect. It’s valid when `InputType` is `container_file`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getFilePattern() {
        return this.FilePattern;
    }

    /**
     * Set Name pattern of files to collect. It’s valid when `InputType` is `container_file`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param FilePattern Name pattern of files to collect. It’s valid when `InputType` is `container_file`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFilePattern(String FilePattern) {
        this.FilePattern = FilePattern;
    }

    /**
     * Get Creation time.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateDate Creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set Creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CreateDate Creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get Update time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ModifyDate Update time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getModifyDate() {
        return this.ModifyDate;
    }

    /**
     * Set Update time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ModifyDate Update time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    /**
     * Get Application ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplicationId Application ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ApplicationId Application ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ApplicationName Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Export rules
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ExtractRule Export rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public LogConfigExtractRule getExtractRule() {
        return this.ExtractRule;
    }

    /**
     * Set Export rules
Note: This field may return `null`, indicating that no valid value was found.
     * @param ExtractRule Export rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setExtractRule(LogConfigExtractRule ExtractRule) {
        this.ExtractRule = ExtractRule;
    }

    public LogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogConfig(LogConfig source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
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
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.ModifyDate != null) {
            this.ModifyDate = new String(source.ModifyDate);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ExtractRule != null) {
            this.ExtractRule = new LogConfigExtractRule(source.ExtractRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "BeginningRegex", this.BeginningRegex);
        this.setParamSimple(map, prefix + "LogPath", this.LogPath);
        this.setParamSimple(map, prefix + "FilePattern", this.FilePattern);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "ModifyDate", this.ModifyDate);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);

    }
}

