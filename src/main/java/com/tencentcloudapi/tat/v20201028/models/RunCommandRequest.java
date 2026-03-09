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

public class RunCommandRequest extends AbstractModel {

    /**
    * Base64-encoded command. The maximum length is 64 KB.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Instance ID list for the command to be executed, with a cap of 200.

Instance ID can be obtained through the query instance interface of corresponding cloud services. currently supported instance types:.
- CVM
- Lighthouse
-TAT register instance.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Command name. The name can be up to 60 bytes, and contain [a-z], [A-Z], [0-9] and [_-.].
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

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
    * Whether to save the command. value range:.
<li>true: save</li>.
<li>false: not saved.</li>.
The default value is false.
    */
    @SerializedName("SaveCommand")
    @Expose
    private Boolean SaveCommand;

    /**
    * Whether to enable the custom parameter feature.
Once created, this value does not offer modification.
Valid values:.
<li>true: enable</li>.
<li>false: disabled.</li>.
The default value is false.
    */
    @SerializedName("EnableParameter")
    @Expose
    private Boolean EnableParameter;

    /**
    * Enable the custom parameter feature. default value of the custom parameter. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
If Parameters is not provided, the default value here will be used to replace.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * Custom parameter array. if Parameters is not provided, the default value here will be used to replace. up to 20 custom Parameters are allowed.
If Parameters is not provided, the default value here will be used to replace.
This parameter can be set only when the EnableParameter of the command is true.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
    */
    @SerializedName("DefaultParameterConfs")
    @Expose
    private DefaultParameterConf [] DefaultParameterConfs;

    /**
    * Custom parameter of Command. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true.
If the parameter value is not provided, DefaultParameters or DefaultParameterConfs will be used.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * The tags of the command. It is available when `SaveCommand` is `True`. A maximum of 10 tags are allowed.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The username used to execute the command on the CVM or Lighthouse instance.
The principle of least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. By default, the user `root` is used to execute commands on Linux and the user `System` is used on Windows.
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
3. ".." can not be used as the folder name. It cannot start with a slash (/), and cannot contain consecutive slashes.
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

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
     * Get Instance ID list for the command to be executed, with a cap of 200.

Instance ID can be obtained through the query instance interface of corresponding cloud services. currently supported instance types:.
- CVM
- Lighthouse
-TAT register instance. 
     * @return InstanceIds Instance ID list for the command to be executed, with a cap of 200.

Instance ID can be obtained through the query instance interface of corresponding cloud services. currently supported instance types:.
- CVM
- Lighthouse
-TAT register instance.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list for the command to be executed, with a cap of 200.

Instance ID can be obtained through the query instance interface of corresponding cloud services. currently supported instance types:.
- CVM
- Lighthouse
-TAT register instance.
     * @param InstanceIds Instance ID list for the command to be executed, with a cap of 200.

Instance ID can be obtained through the query instance interface of corresponding cloud services. currently supported instance types:.
- CVM
- Lighthouse
-TAT register instance.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

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
     * Get Whether to save the command. value range:.
<li>true: save</li>.
<li>false: not saved.</li>.
The default value is false. 
     * @return SaveCommand Whether to save the command. value range:.
<li>true: save</li>.
<li>false: not saved.</li>.
The default value is false.
     */
    public Boolean getSaveCommand() {
        return this.SaveCommand;
    }

    /**
     * Set Whether to save the command. value range:.
<li>true: save</li>.
<li>false: not saved.</li>.
The default value is false.
     * @param SaveCommand Whether to save the command. value range:.
<li>true: save</li>.
<li>false: not saved.</li>.
The default value is false.
     */
    public void setSaveCommand(Boolean SaveCommand) {
        this.SaveCommand = SaveCommand;
    }

    /**
     * Get Whether to enable the custom parameter feature.
Once created, this value does not offer modification.
Valid values:.
<li>true: enable</li>.
<li>false: disabled.</li>.
The default value is false. 
     * @return EnableParameter Whether to enable the custom parameter feature.
Once created, this value does not offer modification.
Valid values:.
<li>true: enable</li>.
<li>false: disabled.</li>.
The default value is false.
     */
    public Boolean getEnableParameter() {
        return this.EnableParameter;
    }

    /**
     * Set Whether to enable the custom parameter feature.
Once created, this value does not offer modification.
Valid values:.
<li>true: enable</li>.
<li>false: disabled.</li>.
The default value is false.
     * @param EnableParameter Whether to enable the custom parameter feature.
Once created, this value does not offer modification.
Valid values:.
<li>true: enable</li>.
<li>false: disabled.</li>.
The default value is false.
     */
    public void setEnableParameter(Boolean EnableParameter) {
        this.EnableParameter = EnableParameter;
    }

    /**
     * Get Enable the custom parameter feature. default value of the custom parameter. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
If Parameters is not provided, the default value here will be used to replace.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_]. 
     * @return DefaultParameters Enable the custom parameter feature. default value of the custom parameter. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
If Parameters is not provided, the default value here will be used to replace.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
     */
    public String getDefaultParameters() {
        return this.DefaultParameters;
    }

    /**
     * Set Enable the custom parameter feature. default value of the custom parameter. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
If Parameters is not provided, the default value here will be used to replace.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
     * @param DefaultParameters Enable the custom parameter feature. default value of the custom parameter. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
If Parameters is not provided, the default value here will be used to replace.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
     */
    public void setDefaultParameters(String DefaultParameters) {
        this.DefaultParameters = DefaultParameters;
    }

    /**
     * Get Custom parameter array. if Parameters is not provided, the default value here will be used to replace. up to 20 custom Parameters are allowed.
If Parameters is not provided, the default value here will be used to replace.
This parameter can be set only when the EnableParameter of the command is true.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`. 
     * @return DefaultParameterConfs Custom parameter array. if Parameters is not provided, the default value here will be used to replace. up to 20 custom Parameters are allowed.
If Parameters is not provided, the default value here will be used to replace.
This parameter can be set only when the EnableParameter of the command is true.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
     */
    public DefaultParameterConf [] getDefaultParameterConfs() {
        return this.DefaultParameterConfs;
    }

    /**
     * Set Custom parameter array. if Parameters is not provided, the default value here will be used to replace. up to 20 custom Parameters are allowed.
If Parameters is not provided, the default value here will be used to replace.
This parameter can be set only when the EnableParameter of the command is true.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
     * @param DefaultParameterConfs Custom parameter array. if Parameters is not provided, the default value here will be used to replace. up to 20 custom Parameters are allowed.
If Parameters is not provided, the default value here will be used to replace.
This parameter can be set only when the EnableParameter of the command is true.
Parameters must not be specified simultaneously `DefaultParameters` and `DefaultParameterConfs`.
     */
    public void setDefaultParameterConfs(DefaultParameterConf [] DefaultParameterConfs) {
        this.DefaultParameterConfs = DefaultParameterConfs;
    }

    /**
     * Get Custom parameter of Command. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true.
If the parameter value is not provided, DefaultParameters or DefaultParameterConfs will be used.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_]. 
     * @return Parameters Custom parameter of Command. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true.
If the parameter value is not provided, DefaultParameters or DefaultParameterConfs will be used.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Custom parameter of Command. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true.
If the parameter value is not provided, DefaultParameters or DefaultParameterConfs will be used.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
     * @param Parameters Custom parameter of Command. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true.
If the parameter value is not provided, DefaultParameters or DefaultParameterConfs will be used.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get The tags of the command. It is available when `SaveCommand` is `True`. A maximum of 10 tags are allowed. 
     * @return Tags The tags of the command. It is available when `SaveCommand` is `True`. A maximum of 10 tags are allowed.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set The tags of the command. It is available when `SaveCommand` is `True`. A maximum of 10 tags are allowed.
     * @param Tags The tags of the command. It is available when `SaveCommand` is `True`. A maximum of 10 tags are allowed.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The username used to execute the command on the CVM or Lighthouse instance.
The principle of least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. By default, the user `root` is used to execute commands on Linux and the user `System` is used on Windows. 
     * @return Username The username used to execute the command on the CVM or Lighthouse instance.
The principle of least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. By default, the user `root` is used to execute commands on Linux and the user `System` is used on Windows.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set The username used to execute the command on the CVM or Lighthouse instance.
The principle of least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. By default, the user `root` is used to execute commands on Linux and the user `System` is used on Windows.
     * @param Username The username used to execute the command on the CVM or Lighthouse instance.
The principle of least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. By default, the user `root` is used to execute commands on Linux and the user `System` is used on Windows.
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
3. ".." can not be used as the folder name. It cannot start with a slash (/), and cannot contain consecutive slashes. 
     * @return OutputCOSKeyPrefix The COS bucket directory where the logs are saved. Check below for the rules of the directory name. 
1. It must be a combination of number, letters, and visible characters. Up to 60 characters are allowed.
2. Use a slash (/) to create a subdirectory.
3. ".." can not be used as the folder name. It cannot start with a slash (/), and cannot contain consecutive slashes.
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set The COS bucket directory where the logs are saved. Check below for the rules of the directory name. 
1. It must be a combination of number, letters, and visible characters. Up to 60 characters are allowed.
2. Use a slash (/) to create a subdirectory.
3. ".." can not be used as the folder name. It cannot start with a slash (/), and cannot contain consecutive slashes.
     * @param OutputCOSKeyPrefix The COS bucket directory where the logs are saved. Check below for the rules of the directory name. 
1. It must be a combination of number, letters, and visible characters. Up to 60 characters are allowed.
2. Use a slash (/) to create a subdirectory.
3. ".." can not be used as the folder name. It cannot start with a slash (/), and cannot contain consecutive slashes.
     */
    public void setOutputCOSKeyPrefix(String OutputCOSKeyPrefix) {
        this.OutputCOSKeyPrefix = OutputCOSKeyPrefix;
    }

    public RunCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunCommandRequest(RunCommandRequest source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.CommandName != null) {
            this.CommandName = new String(source.CommandName);
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
        if (source.SaveCommand != null) {
            this.SaveCommand = new Boolean(source.SaveCommand);
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
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
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
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "CommandName", this.CommandName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "SaveCommand", this.SaveCommand);
        this.setParamSimple(map, prefix + "EnableParameter", this.EnableParameter);
        this.setParamSimple(map, prefix + "DefaultParameters", this.DefaultParameters);
        this.setParamArrayObj(map, prefix + "DefaultParameterConfs.", this.DefaultParameterConfs);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

