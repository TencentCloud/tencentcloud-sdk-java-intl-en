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

public class ModifyCommandRequest extends AbstractModel {

    /**
    * <p>Command ID. call the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands</a> api to query command details.</p>.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * <p>Command name. name only supports chinese, english, digits, underscore, separator "-", and decimal point. the maximum length cannot exceed 60 bytes.</p>.
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

    /**
    * <P>Command description. no more than 120 characters.</p>.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>The Base64-encoded command content, length cannot exceed 64KB.</p>.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Command type. currently supports SHELL, POWERSHELL, BAT.</p>.
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
    * <p>Command timeout time.</p><p>value range: [1, 86400].</p><p>unit: seconds.</p><p>default value: 60.</p><p>when specifying the OutputCOSBucketUrl parameter, the timeout period includes the time taken to upload command output to COS.</p>.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>The default value of custom parameters when the custom parameter feature is enabled. the field type is a json-encoded string, for example: {"varA": "222"}.<br>parameters must not be specified simultaneously for <code>DefaultParameters</code> and <code>DefaultParameterConfs</code>.<br>a comprehensive modification is applied, meaning all new default values must be provided when modifying.<br>this parameter can be modified only when EnableParameter of the command is true. obtain the EnableParameter settings of the command through the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands (query command details)</a> api.<br>the key is the custom parameter name, and the value is the default value of this parameter. both key and value are string-type.<br>there is an upper limit of 20 custom parameters.<br>custom parameter names must meet the following requirements: the upper limit of character quantity is 64, and the optional range is [a-zA-Z0-9-_].</p>.
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * <p>Custom parameter array. if no parameter value is provided when invoking the command, the default value here will be used to replace it.<br>parameters do not support specifying both <code>DefaultParameters</code> and <code>DefaultParameterConfs</code>.<br>this parameter can be modified only when EnableParameter of the command is true. obtain the EnableParameter settings through the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands (query command details)</a> api.<br>up to 20 custom parameters are allowed.</p>.
    */
    @SerializedName("DefaultParameterConfs")
    @Expose
    private DefaultParameterConf [] DefaultParameterConfs;

    /**
    * <p>The username to run commands in a CVM or Lighthouse instance.<br>using minimum permission to execute commands is the best practice for permission management. we recommend running cloud assistant commands as a regular user identity.</p>.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>Specifies the cos bucket address for the uploaded log, which must start with https, such as https://BucketName-123454321.cos.ap-beijing.myqcloud.com.</p>.
    */
    @SerializedName("OutputCOSBucketUrl")
    @Expose
    private String OutputCOSBucketUrl;

    /**
    * <P>Specify the directory for logs in the cos bucket. the directory naming has the following rules:</p><ol><li>use a combination of numbers, chinese and english, and visible characters, with a maximum length of 60.</li><li>use / to split the path and quickly create subdirectories.</li><li>consecutive / are not allowed; cannot start with /; cannot use .. as the folder name.</li></ol>.
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

    /**
     * Get <p>Command ID. call the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands</a> api to query command details.</p>. 
     * @return CommandId <p>Command ID. call the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands</a> api to query command details.</p>.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set <p>Command ID. call the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands</a> api to query command details.</p>.
     * @param CommandId <p>Command ID. call the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands</a> api to query command details.</p>.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get <p>Command name. name only supports chinese, english, digits, underscore, separator "-", and decimal point. the maximum length cannot exceed 60 bytes.</p>. 
     * @return CommandName <p>Command name. name only supports chinese, english, digits, underscore, separator "-", and decimal point. the maximum length cannot exceed 60 bytes.</p>.
     */
    public String getCommandName() {
        return this.CommandName;
    }

    /**
     * Set <p>Command name. name only supports chinese, english, digits, underscore, separator "-", and decimal point. the maximum length cannot exceed 60 bytes.</p>.
     * @param CommandName <p>Command name. name only supports chinese, english, digits, underscore, separator "-", and decimal point. the maximum length cannot exceed 60 bytes.</p>.
     */
    public void setCommandName(String CommandName) {
        this.CommandName = CommandName;
    }

    /**
     * Get <P>Command description. no more than 120 characters.</p>. 
     * @return Description <P>Command description. no more than 120 characters.</p>.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <P>Command description. no more than 120 characters.</p>.
     * @param Description <P>Command description. no more than 120 characters.</p>.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>The Base64-encoded command content, length cannot exceed 64KB.</p>. 
     * @return Content <p>The Base64-encoded command content, length cannot exceed 64KB.</p>.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>The Base64-encoded command content, length cannot exceed 64KB.</p>.
     * @param Content <p>The Base64-encoded command content, length cannot exceed 64KB.</p>.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Command type. currently supports SHELL, POWERSHELL, BAT.</p>. 
     * @return CommandType <p>Command type. currently supports SHELL, POWERSHELL, BAT.</p>.
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set <p>Command type. currently supports SHELL, POWERSHELL, BAT.</p>.
     * @param CommandType <p>Command type. currently supports SHELL, POWERSHELL, BAT.</p>.
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
     * Get <p>Command timeout time.</p><p>value range: [1, 86400].</p><p>unit: seconds.</p><p>default value: 60.</p><p>when specifying the OutputCOSBucketUrl parameter, the timeout period includes the time taken to upload command output to COS.</p>. 
     * @return Timeout <p>Command timeout time.</p><p>value range: [1, 86400].</p><p>unit: seconds.</p><p>default value: 60.</p><p>when specifying the OutputCOSBucketUrl parameter, the timeout period includes the time taken to upload command output to COS.</p>.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Command timeout time.</p><p>value range: [1, 86400].</p><p>unit: seconds.</p><p>default value: 60.</p><p>when specifying the OutputCOSBucketUrl parameter, the timeout period includes the time taken to upload command output to COS.</p>.
     * @param Timeout <p>Command timeout time.</p><p>value range: [1, 86400].</p><p>unit: seconds.</p><p>default value: 60.</p><p>when specifying the OutputCOSBucketUrl parameter, the timeout period includes the time taken to upload command output to COS.</p>.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>The default value of custom parameters when the custom parameter feature is enabled. the field type is a json-encoded string, for example: {"varA": "222"}.<br>parameters must not be specified simultaneously for <code>DefaultParameters</code> and <code>DefaultParameterConfs</code>.<br>a comprehensive modification is applied, meaning all new default values must be provided when modifying.<br>this parameter can be modified only when EnableParameter of the command is true. obtain the EnableParameter settings of the command through the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands (query command details)</a> api.<br>the key is the custom parameter name, and the value is the default value of this parameter. both key and value are string-type.<br>there is an upper limit of 20 custom parameters.<br>custom parameter names must meet the following requirements: the upper limit of character quantity is 64, and the optional range is [a-zA-Z0-9-_].</p>. 
     * @return DefaultParameters <p>The default value of custom parameters when the custom parameter feature is enabled. the field type is a json-encoded string, for example: {"varA": "222"}.<br>parameters must not be specified simultaneously for <code>DefaultParameters</code> and <code>DefaultParameterConfs</code>.<br>a comprehensive modification is applied, meaning all new default values must be provided when modifying.<br>this parameter can be modified only when EnableParameter of the command is true. obtain the EnableParameter settings of the command through the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands (query command details)</a> api.<br>the key is the custom parameter name, and the value is the default value of this parameter. both key and value are string-type.<br>there is an upper limit of 20 custom parameters.<br>custom parameter names must meet the following requirements: the upper limit of character quantity is 64, and the optional range is [a-zA-Z0-9-_].</p>.
     */
    public String getDefaultParameters() {
        return this.DefaultParameters;
    }

    /**
     * Set <p>The default value of custom parameters when the custom parameter feature is enabled. the field type is a json-encoded string, for example: {"varA": "222"}.<br>parameters must not be specified simultaneously for <code>DefaultParameters</code> and <code>DefaultParameterConfs</code>.<br>a comprehensive modification is applied, meaning all new default values must be provided when modifying.<br>this parameter can be modified only when EnableParameter of the command is true. obtain the EnableParameter settings of the command through the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands (query command details)</a> api.<br>the key is the custom parameter name, and the value is the default value of this parameter. both key and value are string-type.<br>there is an upper limit of 20 custom parameters.<br>custom parameter names must meet the following requirements: the upper limit of character quantity is 64, and the optional range is [a-zA-Z0-9-_].</p>.
     * @param DefaultParameters <p>The default value of custom parameters when the custom parameter feature is enabled. the field type is a json-encoded string, for example: {"varA": "222"}.<br>parameters must not be specified simultaneously for <code>DefaultParameters</code> and <code>DefaultParameterConfs</code>.<br>a comprehensive modification is applied, meaning all new default values must be provided when modifying.<br>this parameter can be modified only when EnableParameter of the command is true. obtain the EnableParameter settings of the command through the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands (query command details)</a> api.<br>the key is the custom parameter name, and the value is the default value of this parameter. both key and value are string-type.<br>there is an upper limit of 20 custom parameters.<br>custom parameter names must meet the following requirements: the upper limit of character quantity is 64, and the optional range is [a-zA-Z0-9-_].</p>.
     */
    public void setDefaultParameters(String DefaultParameters) {
        this.DefaultParameters = DefaultParameters;
    }

    /**
     * Get <p>Custom parameter array. if no parameter value is provided when invoking the command, the default value here will be used to replace it.<br>parameters do not support specifying both <code>DefaultParameters</code> and <code>DefaultParameterConfs</code>.<br>this parameter can be modified only when EnableParameter of the command is true. obtain the EnableParameter settings through the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands (query command details)</a> api.<br>up to 20 custom parameters are allowed.</p>. 
     * @return DefaultParameterConfs <p>Custom parameter array. if no parameter value is provided when invoking the command, the default value here will be used to replace it.<br>parameters do not support specifying both <code>DefaultParameters</code> and <code>DefaultParameterConfs</code>.<br>this parameter can be modified only when EnableParameter of the command is true. obtain the EnableParameter settings through the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands (query command details)</a> api.<br>up to 20 custom parameters are allowed.</p>.
     */
    public DefaultParameterConf [] getDefaultParameterConfs() {
        return this.DefaultParameterConfs;
    }

    /**
     * Set <p>Custom parameter array. if no parameter value is provided when invoking the command, the default value here will be used to replace it.<br>parameters do not support specifying both <code>DefaultParameters</code> and <code>DefaultParameterConfs</code>.<br>this parameter can be modified only when EnableParameter of the command is true. obtain the EnableParameter settings through the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands (query command details)</a> api.<br>up to 20 custom parameters are allowed.</p>.
     * @param DefaultParameterConfs <p>Custom parameter array. if no parameter value is provided when invoking the command, the default value here will be used to replace it.<br>parameters do not support specifying both <code>DefaultParameters</code> and <code>DefaultParameterConfs</code>.<br>this parameter can be modified only when EnableParameter of the command is true. obtain the EnableParameter settings through the <a href="https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1">DescribeCommands (query command details)</a> api.<br>up to 20 custom parameters are allowed.</p>.
     */
    public void setDefaultParameterConfs(DefaultParameterConf [] DefaultParameterConfs) {
        this.DefaultParameterConfs = DefaultParameterConfs;
    }

    /**
     * Get <p>The username to run commands in a CVM or Lighthouse instance.<br>using minimum permission to execute commands is the best practice for permission management. we recommend running cloud assistant commands as a regular user identity.</p>. 
     * @return Username <p>The username to run commands in a CVM or Lighthouse instance.<br>using minimum permission to execute commands is the best practice for permission management. we recommend running cloud assistant commands as a regular user identity.</p>.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>The username to run commands in a CVM or Lighthouse instance.<br>using minimum permission to execute commands is the best practice for permission management. we recommend running cloud assistant commands as a regular user identity.</p>.
     * @param Username <p>The username to run commands in a CVM or Lighthouse instance.<br>using minimum permission to execute commands is the best practice for permission management. we recommend running cloud assistant commands as a regular user identity.</p>.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>Specifies the cos bucket address for the uploaded log, which must start with https, such as https://BucketName-123454321.cos.ap-beijing.myqcloud.com.</p>. 
     * @return OutputCOSBucketUrl <p>Specifies the cos bucket address for the uploaded log, which must start with https, such as https://BucketName-123454321.cos.ap-beijing.myqcloud.com.</p>.
     */
    public String getOutputCOSBucketUrl() {
        return this.OutputCOSBucketUrl;
    }

    /**
     * Set <p>Specifies the cos bucket address for the uploaded log, which must start with https, such as https://BucketName-123454321.cos.ap-beijing.myqcloud.com.</p>.
     * @param OutputCOSBucketUrl <p>Specifies the cos bucket address for the uploaded log, which must start with https, such as https://BucketName-123454321.cos.ap-beijing.myqcloud.com.</p>.
     */
    public void setOutputCOSBucketUrl(String OutputCOSBucketUrl) {
        this.OutputCOSBucketUrl = OutputCOSBucketUrl;
    }

    /**
     * Get <P>Specify the directory for logs in the cos bucket. the directory naming has the following rules:</p><ol><li>use a combination of numbers, chinese and english, and visible characters, with a maximum length of 60.</li><li>use / to split the path and quickly create subdirectories.</li><li>consecutive / are not allowed; cannot start with /; cannot use .. as the folder name.</li></ol>. 
     * @return OutputCOSKeyPrefix <P>Specify the directory for logs in the cos bucket. the directory naming has the following rules:</p><ol><li>use a combination of numbers, chinese and english, and visible characters, with a maximum length of 60.</li><li>use / to split the path and quickly create subdirectories.</li><li>consecutive / are not allowed; cannot start with /; cannot use .. as the folder name.</li></ol>.
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set <P>Specify the directory for logs in the cos bucket. the directory naming has the following rules:</p><ol><li>use a combination of numbers, chinese and english, and visible characters, with a maximum length of 60.</li><li>use / to split the path and quickly create subdirectories.</li><li>consecutive / are not allowed; cannot start with /; cannot use .. as the folder name.</li></ol>.
     * @param OutputCOSKeyPrefix <P>Specify the directory for logs in the cos bucket. the directory naming has the following rules:</p><ol><li>use a combination of numbers, chinese and english, and visible characters, with a maximum length of 60.</li><li>use / to split the path and quickly create subdirectories.</li><li>consecutive / are not allowed; cannot start with /; cannot use .. as the folder name.</li></ol>.
     */
    public void setOutputCOSKeyPrefix(String OutputCOSKeyPrefix) {
        this.OutputCOSKeyPrefix = OutputCOSKeyPrefix;
    }

    public ModifyCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCommandRequest(ModifyCommandRequest source) {
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
        if (source.DefaultParameters != null) {
            this.DefaultParameters = new String(source.DefaultParameters);
        }
        if (source.DefaultParameterConfs != null) {
            this.DefaultParameterConfs = new DefaultParameterConf[source.DefaultParameterConfs.length];
            for (int i = 0; i < source.DefaultParameterConfs.length; i++) {
                this.DefaultParameterConfs[i] = new DefaultParameterConf(source.DefaultParameterConfs[i]);
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
        this.setParamSimple(map, prefix + "DefaultParameters", this.DefaultParameters);
        this.setParamArrayObj(map, prefix + "DefaultParameterConfs.", this.DefaultParameterConfs);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

