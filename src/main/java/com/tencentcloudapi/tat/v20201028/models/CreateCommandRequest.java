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

public class CreateCommandRequest extends AbstractModel {

    /**
    * Command name. The name can be up to 60 bytes, and contain [a-z], [A-Z], [0-9] and [_-.].
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

    /**
    * Base64-encoded command. The maximum length is 64 KB.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Command description. The maximum length is 120 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Command type. currently supports SHELL, POWERSHELL, BAT. default: SHELL.
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * Command execution path. The default value is /root for `SHELL` commands and C:\Program Files\qcloud\tat_agent\workdir for `POWERSHELL` commands.
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * Command timeout period. Default value: 60 seconds. Value range: [1, 86400].
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Whether to enable the custom parameter feature.
This cannot be modified once created.
Default value: `false`.
    */
    @SerializedName("EnableParameter")
    @Expose
    private Boolean EnableParameter;

    /**
    * Enable the custom parameter feature. default value of the custom parameter. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
If no parameter value is provided when invoking the command, the default value here will be used to replace it.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
Allow settings only when the EnableParameter parameter is true.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * Custom parameter array.
If no parameter value is provided when invoking the command, the default value here will be used to replace it.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
Allow settings only when the EnableParameter parameter is true.
Custom parameters can be up to 20.
    */
    @SerializedName("DefaultParameterConfs")
    @Expose
    private DefaultParameterConf [] DefaultParameterConfs;

    /**
    * Tags bound to the command. At most 10 tags are allowed.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The username used to execute the command on the CVM or Lighthouse instance.
The principle of least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. By default, the root user is used to execute commands on Linux and the System user is used on Windows.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * The COS bucket URL for uploading logs. The URL must start with `https`, such as `https://BucketName-123454321.cos.ap-beijing.myqcloud.com`.
    */
    @SerializedName("OutputCOSBucketUrl")
    @Expose
    private String OutputCOSBucketUrl;

    /**
    * The COS bucket directory where the logs are saved. Check below for the rules of the directory name. 
1. It must be a combination of number, letters, and visible characters. Up to 60 characters are allowed.
2. Use a slash (/) to create a subdirectory.
3. Consecutive dots (.) and slashes (/) are not allowed. It can not start with a slash (/). 
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

    /**
     * Get Command name. The name can be up to 60 bytes, and contain [a-z], [A-Z], [0-9] and [_-.]. 
     * @return CommandName Command name. The name can be up to 60 bytes, and contain [a-z], [A-Z], [0-9] and [_-.].
     */
    public String getCommandName() {
        return this.CommandName;
    }

    /**
     * Set Command name. The name can be up to 60 bytes, and contain [a-z], [A-Z], [0-9] and [_-.].
     * @param CommandName Command name. The name can be up to 60 bytes, and contain [a-z], [A-Z], [0-9] and [_-.].
     */
    public void setCommandName(String CommandName) {
        this.CommandName = CommandName;
    }

    /**
     * Get Base64-encoded command. The maximum length is 64 KB. 
     * @return Content Base64-encoded command. The maximum length is 64 KB.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Base64-encoded command. The maximum length is 64 KB.
     * @param Content Base64-encoded command. The maximum length is 64 KB.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Command description. The maximum length is 120 characters. 
     * @return Description Command description. The maximum length is 120 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Command description. The maximum length is 120 characters.
     * @param Description Command description. The maximum length is 120 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Command type. currently supports SHELL, POWERSHELL, BAT. default: SHELL. 
     * @return CommandType Command type. currently supports SHELL, POWERSHELL, BAT. default: SHELL.
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set Command type. currently supports SHELL, POWERSHELL, BAT. default: SHELL.
     * @param CommandType Command type. currently supports SHELL, POWERSHELL, BAT. default: SHELL.
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get Command execution path. The default value is /root for `SHELL` commands and C:\Program Files\qcloud\tat_agent\workdir for `POWERSHELL` commands. 
     * @return WorkingDirectory Command execution path. The default value is /root for `SHELL` commands and C:\Program Files\qcloud\tat_agent\workdir for `POWERSHELL` commands.
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set Command execution path. The default value is /root for `SHELL` commands and C:\Program Files\qcloud\tat_agent\workdir for `POWERSHELL` commands.
     * @param WorkingDirectory Command execution path. The default value is /root for `SHELL` commands and C:\Program Files\qcloud\tat_agent\workdir for `POWERSHELL` commands.
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get Command timeout period. Default value: 60 seconds. Value range: [1, 86400]. 
     * @return Timeout Command timeout period. Default value: 60 seconds. Value range: [1, 86400].
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Command timeout period. Default value: 60 seconds. Value range: [1, 86400].
     * @param Timeout Command timeout period. Default value: 60 seconds. Value range: [1, 86400].
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Whether to enable the custom parameter feature.
This cannot be modified once created.
Default value: `false`. 
     * @return EnableParameter Whether to enable the custom parameter feature.
This cannot be modified once created.
Default value: `false`.
     */
    public Boolean getEnableParameter() {
        return this.EnableParameter;
    }

    /**
     * Set Whether to enable the custom parameter feature.
This cannot be modified once created.
Default value: `false`.
     * @param EnableParameter Whether to enable the custom parameter feature.
This cannot be modified once created.
Default value: `false`.
     */
    public void setEnableParameter(Boolean EnableParameter) {
        this.EnableParameter = EnableParameter;
    }

    /**
     * Get Enable the custom parameter feature. default value of the custom parameter. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
If no parameter value is provided when invoking the command, the default value here will be used to replace it.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
Allow settings only when the EnableParameter parameter is true.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_]. 
     * @return DefaultParameters Enable the custom parameter feature. default value of the custom parameter. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
If no parameter value is provided when invoking the command, the default value here will be used to replace it.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
Allow settings only when the EnableParameter parameter is true.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
     */
    public String getDefaultParameters() {
        return this.DefaultParameters;
    }

    /**
     * Set Enable the custom parameter feature. default value of the custom parameter. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
If no parameter value is provided when invoking the command, the default value here will be used to replace it.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
Allow settings only when the EnableParameter parameter is true.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
     * @param DefaultParameters Enable the custom parameter feature. default value of the custom parameter. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
If no parameter value is provided when invoking the command, the default value here will be used to replace it.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
Allow settings only when the EnableParameter parameter is true.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
     */
    public void setDefaultParameters(String DefaultParameters) {
        this.DefaultParameters = DefaultParameters;
    }

    /**
     * Get Custom parameter array.
If no parameter value is provided when invoking the command, the default value here will be used to replace it.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
Allow settings only when the EnableParameter parameter is true.
Custom parameters can be up to 20. 
     * @return DefaultParameterConfs Custom parameter array.
If no parameter value is provided when invoking the command, the default value here will be used to replace it.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
Allow settings only when the EnableParameter parameter is true.
Custom parameters can be up to 20.
     */
    public DefaultParameterConf [] getDefaultParameterConfs() {
        return this.DefaultParameterConfs;
    }

    /**
     * Set Custom parameter array.
If no parameter value is provided when invoking the command, the default value here will be used to replace it.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
Allow settings only when the EnableParameter parameter is true.
Custom parameters can be up to 20.
     * @param DefaultParameterConfs Custom parameter array.
If no parameter value is provided when invoking the command, the default value here will be used to replace it.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
Allow settings only when the EnableParameter parameter is true.
Custom parameters can be up to 20.
     */
    public void setDefaultParameterConfs(DefaultParameterConf [] DefaultParameterConfs) {
        this.DefaultParameterConfs = DefaultParameterConfs;
    }

    /**
     * Get Tags bound to the command. At most 10 tags are allowed. 
     * @return Tags Tags bound to the command. At most 10 tags are allowed.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags bound to the command. At most 10 tags are allowed.
     * @param Tags Tags bound to the command. At most 10 tags are allowed.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The username used to execute the command on the CVM or Lighthouse instance.
The principle of least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. By default, the root user is used to execute commands on Linux and the System user is used on Windows. 
     * @return Username The username used to execute the command on the CVM or Lighthouse instance.
The principle of least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. By default, the root user is used to execute commands on Linux and the System user is used on Windows.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set The username used to execute the command on the CVM or Lighthouse instance.
The principle of least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. By default, the root user is used to execute commands on Linux and the System user is used on Windows.
     * @param Username The username used to execute the command on the CVM or Lighthouse instance.
The principle of least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. By default, the root user is used to execute commands on Linux and the System user is used on Windows.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get The COS bucket URL for uploading logs. The URL must start with `https`, such as `https://BucketName-123454321.cos.ap-beijing.myqcloud.com`. 
     * @return OutputCOSBucketUrl The COS bucket URL for uploading logs. The URL must start with `https`, such as `https://BucketName-123454321.cos.ap-beijing.myqcloud.com`.
     */
    public String getOutputCOSBucketUrl() {
        return this.OutputCOSBucketUrl;
    }

    /**
     * Set The COS bucket URL for uploading logs. The URL must start with `https`, such as `https://BucketName-123454321.cos.ap-beijing.myqcloud.com`.
     * @param OutputCOSBucketUrl The COS bucket URL for uploading logs. The URL must start with `https`, such as `https://BucketName-123454321.cos.ap-beijing.myqcloud.com`.
     */
    public void setOutputCOSBucketUrl(String OutputCOSBucketUrl) {
        this.OutputCOSBucketUrl = OutputCOSBucketUrl;
    }

    /**
     * Get The COS bucket directory where the logs are saved. Check below for the rules of the directory name. 
1. It must be a combination of number, letters, and visible characters. Up to 60 characters are allowed.
2. Use a slash (/) to create a subdirectory.
3. Consecutive dots (.) and slashes (/) are not allowed. It can not start with a slash (/).  
     * @return OutputCOSKeyPrefix The COS bucket directory where the logs are saved. Check below for the rules of the directory name. 
1. It must be a combination of number, letters, and visible characters. Up to 60 characters are allowed.
2. Use a slash (/) to create a subdirectory.
3. Consecutive dots (.) and slashes (/) are not allowed. It can not start with a slash (/). 
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set The COS bucket directory where the logs are saved. Check below for the rules of the directory name. 
1. It must be a combination of number, letters, and visible characters. Up to 60 characters are allowed.
2. Use a slash (/) to create a subdirectory.
3. Consecutive dots (.) and slashes (/) are not allowed. It can not start with a slash (/). 
     * @param OutputCOSKeyPrefix The COS bucket directory where the logs are saved. Check below for the rules of the directory name. 
1. It must be a combination of number, letters, and visible characters. Up to 60 characters are allowed.
2. Use a slash (/) to create a subdirectory.
3. Consecutive dots (.) and slashes (/) are not allowed. It can not start with a slash (/). 
     */
    public void setOutputCOSKeyPrefix(String OutputCOSKeyPrefix) {
        this.OutputCOSKeyPrefix = OutputCOSKeyPrefix;
    }

    public CreateCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCommandRequest(CreateCommandRequest source) {
        if (source.CommandName != null) {
            this.CommandName = new String(source.CommandName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "CommandName", this.CommandName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "EnableParameter", this.EnableParameter);
        this.setParamSimple(map, prefix + "DefaultParameters", this.DefaultParameters);
        this.setParamArrayObj(map, prefix + "DefaultParameterConfs.", this.DefaultParameterConfs);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

