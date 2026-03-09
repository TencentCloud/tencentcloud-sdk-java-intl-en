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
    * <p>Command ID.</p>.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * <P>Command name.</p>.
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

    /**
    * <P>Command description.</p>.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>The Base64-encoded command content.</p>.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Command type. value is one of SHELL, POWERSHELL, BAT.</p>.
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * <P>Command execution path.</p>.
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * <p>Command timeout time.</p><p>unit: seconds.</p><p>when specifying the OutputCOSBucketUrl parameter, the timeout period includes the time taken to upload command output to COS.</p>.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Command creation time. the format is YYYY-MM-DDThh:MM:ssZ.</p>.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>Command last update time. format: YYYY-MM-DDThh:MM:ssZ.</p>.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <P>Whether to enable the custom parameter feature.</p>.
    */
    @SerializedName("EnableParameter")
    @Expose
    private Boolean EnableParameter;

    /**
    * <P>Default value of custom parameter.</p>.
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * <P>Default value of custom parameters.</p>.
    */
    @SerializedName("DefaultParameterConfs")
    @Expose
    private DefaultParameterConf [] DefaultParameterConfs;

    /**
    * <P>Command association scenarios</p>.
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
    * <P>Structured description of the command. public commands have values, and user commands are empty strings.</p>.
    */
    @SerializedName("FormattedDescription")
    @Expose
    private String FormattedDescription;

    /**
    * <p>Command creator.</p><p>enumeration value:</p><ul><li>TAT: public command</li><li>USER: personal creation command</li></ul>.
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * <P>Tag list associated with the command.</p>.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <P>Username to run command on the instance.</p>.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <P>The cos bucket address for log upload.</p>.
    */
    @SerializedName("OutputCOSBucketUrl")
    @Expose
    private String OutputCOSBucketUrl;

    /**
    * <P>Directory of logs in the cos bucket.</p>.
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

    /**
     * Get <p>Command ID.</p>. 
     * @return CommandId <p>Command ID.</p>.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set <p>Command ID.</p>.
     * @param CommandId <p>Command ID.</p>.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get <P>Command name.</p>. 
     * @return CommandName <P>Command name.</p>.
     */
    public String getCommandName() {
        return this.CommandName;
    }

    /**
     * Set <P>Command name.</p>.
     * @param CommandName <P>Command name.</p>.
     */
    public void setCommandName(String CommandName) {
        this.CommandName = CommandName;
    }

    /**
     * Get <P>Command description.</p>. 
     * @return Description <P>Command description.</p>.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <P>Command description.</p>.
     * @param Description <P>Command description.</p>.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>The Base64-encoded command content.</p>. 
     * @return Content <p>The Base64-encoded command content.</p>.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>The Base64-encoded command content.</p>.
     * @param Content <p>The Base64-encoded command content.</p>.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Command type. value is one of SHELL, POWERSHELL, BAT.</p>. 
     * @return CommandType <p>Command type. value is one of SHELL, POWERSHELL, BAT.</p>.
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set <p>Command type. value is one of SHELL, POWERSHELL, BAT.</p>.
     * @param CommandType <p>Command type. value is one of SHELL, POWERSHELL, BAT.</p>.
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get <P>Command execution path.</p>. 
     * @return WorkingDirectory <P>Command execution path.</p>.
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set <P>Command execution path.</p>.
     * @param WorkingDirectory <P>Command execution path.</p>.
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get <p>Command timeout time.</p><p>unit: seconds.</p><p>when specifying the OutputCOSBucketUrl parameter, the timeout period includes the time taken to upload command output to COS.</p>. 
     * @return Timeout <p>Command timeout time.</p><p>unit: seconds.</p><p>when specifying the OutputCOSBucketUrl parameter, the timeout period includes the time taken to upload command output to COS.</p>.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Command timeout time.</p><p>unit: seconds.</p><p>when specifying the OutputCOSBucketUrl parameter, the timeout period includes the time taken to upload command output to COS.</p>.
     * @param Timeout <p>Command timeout time.</p><p>unit: seconds.</p><p>when specifying the OutputCOSBucketUrl parameter, the timeout period includes the time taken to upload command output to COS.</p>.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Command creation time. the format is YYYY-MM-DDThh:MM:ssZ.</p>. 
     * @return CreatedTime <p>Command creation time. the format is YYYY-MM-DDThh:MM:ssZ.</p>.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>Command creation time. the format is YYYY-MM-DDThh:MM:ssZ.</p>.
     * @param CreatedTime <p>Command creation time. the format is YYYY-MM-DDThh:MM:ssZ.</p>.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>Command last update time. format: YYYY-MM-DDThh:MM:ssZ.</p>. 
     * @return UpdatedTime <p>Command last update time. format: YYYY-MM-DDThh:MM:ssZ.</p>.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>Command last update time. format: YYYY-MM-DDThh:MM:ssZ.</p>.
     * @param UpdatedTime <p>Command last update time. format: YYYY-MM-DDThh:MM:ssZ.</p>.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <P>Whether to enable the custom parameter feature.</p>. 
     * @return EnableParameter <P>Whether to enable the custom parameter feature.</p>.
     */
    public Boolean getEnableParameter() {
        return this.EnableParameter;
    }

    /**
     * Set <P>Whether to enable the custom parameter feature.</p>.
     * @param EnableParameter <P>Whether to enable the custom parameter feature.</p>.
     */
    public void setEnableParameter(Boolean EnableParameter) {
        this.EnableParameter = EnableParameter;
    }

    /**
     * Get <P>Default value of custom parameter.</p>. 
     * @return DefaultParameters <P>Default value of custom parameter.</p>.
     */
    public String getDefaultParameters() {
        return this.DefaultParameters;
    }

    /**
     * Set <P>Default value of custom parameter.</p>.
     * @param DefaultParameters <P>Default value of custom parameter.</p>.
     */
    public void setDefaultParameters(String DefaultParameters) {
        this.DefaultParameters = DefaultParameters;
    }

    /**
     * Get <P>Default value of custom parameters.</p>. 
     * @return DefaultParameterConfs <P>Default value of custom parameters.</p>.
     */
    public DefaultParameterConf [] getDefaultParameterConfs() {
        return this.DefaultParameterConfs;
    }

    /**
     * Set <P>Default value of custom parameters.</p>.
     * @param DefaultParameterConfs <P>Default value of custom parameters.</p>.
     */
    public void setDefaultParameterConfs(DefaultParameterConf [] DefaultParameterConfs) {
        this.DefaultParameterConfs = DefaultParameterConfs;
    }

    /**
     * Get <P>Command association scenarios</p>. 
     * @return Scenes <P>Command association scenarios</p>.
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set <P>Command association scenarios</p>.
     * @param Scenes <P>Command association scenarios</p>.
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    /**
     * Get <P>Structured description of the command. public commands have values, and user commands are empty strings.</p>. 
     * @return FormattedDescription <P>Structured description of the command. public commands have values, and user commands are empty strings.</p>.
     */
    public String getFormattedDescription() {
        return this.FormattedDescription;
    }

    /**
     * Set <P>Structured description of the command. public commands have values, and user commands are empty strings.</p>.
     * @param FormattedDescription <P>Structured description of the command. public commands have values, and user commands are empty strings.</p>.
     */
    public void setFormattedDescription(String FormattedDescription) {
        this.FormattedDescription = FormattedDescription;
    }

    /**
     * Get <p>Command creator.</p><p>enumeration value:</p><ul><li>TAT: public command</li><li>USER: personal creation command</li></ul>. 
     * @return CreatedBy <p>Command creator.</p><p>enumeration value:</p><ul><li>TAT: public command</li><li>USER: personal creation command</li></ul>.
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set <p>Command creator.</p><p>enumeration value:</p><ul><li>TAT: public command</li><li>USER: personal creation command</li></ul>.
     * @param CreatedBy <p>Command creator.</p><p>enumeration value:</p><ul><li>TAT: public command</li><li>USER: personal creation command</li></ul>.
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get <P>Tag list associated with the command.</p>. 
     * @return Tags <P>Tag list associated with the command.</p>.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <P>Tag list associated with the command.</p>.
     * @param Tags <P>Tag list associated with the command.</p>.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <P>Username to run command on the instance.</p>. 
     * @return Username <P>Username to run command on the instance.</p>.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <P>Username to run command on the instance.</p>.
     * @param Username <P>Username to run command on the instance.</p>.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <P>The cos bucket address for log upload.</p>. 
     * @return OutputCOSBucketUrl <P>The cos bucket address for log upload.</p>.
     */
    public String getOutputCOSBucketUrl() {
        return this.OutputCOSBucketUrl;
    }

    /**
     * Set <P>The cos bucket address for log upload.</p>.
     * @param OutputCOSBucketUrl <P>The cos bucket address for log upload.</p>.
     */
    public void setOutputCOSBucketUrl(String OutputCOSBucketUrl) {
        this.OutputCOSBucketUrl = OutputCOSBucketUrl;
    }

    /**
     * Get <P>Directory of logs in the cos bucket.</p>. 
     * @return OutputCOSKeyPrefix <P>Directory of logs in the cos bucket.</p>.
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set <P>Directory of logs in the cos bucket.</p>.
     * @param OutputCOSKeyPrefix <P>Directory of logs in the cos bucket.</p>.
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
        if (source.DefaultParameterConfs != null) {
            this.DefaultParameterConfs = new DefaultParameterConf[source.DefaultParameterConfs.length];
            for (int i = 0; i < source.DefaultParameterConfs.length; i++) {
                this.DefaultParameterConfs[i] = new DefaultParameterConf(source.DefaultParameterConfs[i]);
            }
        }
        if (source.Scenes != null) {
            this.Scenes = new String[source.Scenes.length];
            for (int i = 0; i < source.Scenes.length; i++) {
                this.Scenes[i] = new String(source.Scenes[i]);
            }
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
        this.setParamArrayObj(map, prefix + "DefaultParameterConfs.", this.DefaultParameterConfs);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);
        this.setParamSimple(map, prefix + "FormattedDescription", this.FormattedDescription);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

