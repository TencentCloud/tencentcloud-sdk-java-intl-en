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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Command extends AbstractModel {

    /**
    * Command ID.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * Command name.
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

    /**
    * Command description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Base64-encoded command.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Command type.
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * Command execution path.
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * Command timeout period.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Command creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Command update time.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * Whether to enable the custom parameter feature.
    */
    @SerializedName("EnableParameter")
    @Expose
    private Boolean EnableParameter;

    /**
    * Default custom parameter value.
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * Formatted description of the command. This parameter is an empty string for user commands and contains values for public commands.
    */
    @SerializedName("FormattedDescription")
    @Expose
    private String FormattedDescription;

    /**
    * Command creator. `TAT` indicates a public command and `USER` indicates a personal command.
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * The list of tags bound to the command.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The user who executes the command on the instance.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * The COS bucket URL for uploading logs.
    */
    @SerializedName("OutputCOSBucketUrl")
    @Expose
    private String OutputCOSBucketUrl;

    /**
    * The COS bucket directory where the logs are saved.
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

    /**
     * Get Command ID. 
     * @return CommandId Command ID.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set Command ID.
     * @param CommandId Command ID.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get Command name. 
     * @return CommandName Command name.
     */
    public String getCommandName() {
        return this.CommandName;
    }

    /**
     * Set Command name.
     * @param CommandName Command name.
     */
    public void setCommandName(String CommandName) {
        this.CommandName = CommandName;
    }

    /**
     * Get Command description. 
     * @return Description Command description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Command description.
     * @param Description Command description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Base64-encoded command. 
     * @return Content Base64-encoded command.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Base64-encoded command.
     * @param Content Base64-encoded command.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Command type. 
     * @return CommandType Command type.
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set Command type.
     * @param CommandType Command type.
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get Command execution path. 
     * @return WorkingDirectory Command execution path.
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set Command execution path.
     * @param WorkingDirectory Command execution path.
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get Command timeout period. 
     * @return Timeout Command timeout period.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Command timeout period.
     * @param Timeout Command timeout period.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Command creation time. 
     * @return CreatedTime Command creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Command creation time.
     * @param CreatedTime Command creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Command update time. 
     * @return UpdatedTime Command update time.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Command update time.
     * @param UpdatedTime Command update time.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get Whether to enable the custom parameter feature. 
     * @return EnableParameter Whether to enable the custom parameter feature.
     */
    public Boolean getEnableParameter() {
        return this.EnableParameter;
    }

    /**
     * Set Whether to enable the custom parameter feature.
     * @param EnableParameter Whether to enable the custom parameter feature.
     */
    public void setEnableParameter(Boolean EnableParameter) {
        this.EnableParameter = EnableParameter;
    }

    /**
     * Get Default custom parameter value. 
     * @return DefaultParameters Default custom parameter value.
     */
    public String getDefaultParameters() {
        return this.DefaultParameters;
    }

    /**
     * Set Default custom parameter value.
     * @param DefaultParameters Default custom parameter value.
     */
    public void setDefaultParameters(String DefaultParameters) {
        this.DefaultParameters = DefaultParameters;
    }

    /**
     * Get Formatted description of the command. This parameter is an empty string for user commands and contains values for public commands. 
     * @return FormattedDescription Formatted description of the command. This parameter is an empty string for user commands and contains values for public commands.
     */
    public String getFormattedDescription() {
        return this.FormattedDescription;
    }

    /**
     * Set Formatted description of the command. This parameter is an empty string for user commands and contains values for public commands.
     * @param FormattedDescription Formatted description of the command. This parameter is an empty string for user commands and contains values for public commands.
     */
    public void setFormattedDescription(String FormattedDescription) {
        this.FormattedDescription = FormattedDescription;
    }

    /**
     * Get Command creator. `TAT` indicates a public command and `USER` indicates a personal command. 
     * @return CreatedBy Command creator. `TAT` indicates a public command and `USER` indicates a personal command.
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set Command creator. `TAT` indicates a public command and `USER` indicates a personal command.
     * @param CreatedBy Command creator. `TAT` indicates a public command and `USER` indicates a personal command.
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get The list of tags bound to the command. 
     * @return Tags The list of tags bound to the command.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set The list of tags bound to the command.
     * @param Tags The list of tags bound to the command.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The user who executes the command on the instance. 
     * @return Username The user who executes the command on the instance.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set The user who executes the command on the instance.
     * @param Username The user who executes the command on the instance.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get The COS bucket URL for uploading logs. 
     * @return OutputCOSBucketUrl The COS bucket URL for uploading logs.
     */
    public String getOutputCOSBucketUrl() {
        return this.OutputCOSBucketUrl;
    }

    /**
     * Set The COS bucket URL for uploading logs.
     * @param OutputCOSBucketUrl The COS bucket URL for uploading logs.
     */
    public void setOutputCOSBucketUrl(String OutputCOSBucketUrl) {
        this.OutputCOSBucketUrl = OutputCOSBucketUrl;
    }

    /**
     * Get The COS bucket directory where the logs are saved. 
     * @return OutputCOSKeyPrefix The COS bucket directory where the logs are saved.
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set The COS bucket directory where the logs are saved.
     * @param OutputCOSKeyPrefix The COS bucket directory where the logs are saved.
     */
    public void setOutputCOSKeyPrefix(String OutputCOSKeyPrefix) {
        this.OutputCOSKeyPrefix = OutputCOSKeyPrefix;
    }

    public Command() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Command(Command source) {
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.CommandName != null) {
            this.CommandName = new String(source.CommandName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.CommandType != null) {
            this.CommandType = new String(source.CommandType);
        }
        if (source.WorkingDirectory != null) {
            this.WorkingDirectory = new String(source.WorkingDirectory);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.EnableParameter != null) {
            this.EnableParameter = new Boolean(source.EnableParameter);
        }
        if (source.DefaultParameters != null) {
            this.DefaultParameters = new String(source.DefaultParameters);
        }
        if (source.FormattedDescription != null) {
            this.FormattedDescription = new String(source.FormattedDescription);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.OutputCOSBucketUrl != null) {
            this.OutputCOSBucketUrl = new String(source.OutputCOSBucketUrl);
        }
        if (source.OutputCOSKeyPrefix != null) {
            this.OutputCOSKeyPrefix = new String(source.OutputCOSKeyPrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "CommandName", this.CommandName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "EnableParameter", this.EnableParameter);
        this.setParamSimple(map, prefix + "DefaultParameters", this.DefaultParameters);
        this.setParamSimple(map, prefix + "FormattedDescription", this.FormattedDescription);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

