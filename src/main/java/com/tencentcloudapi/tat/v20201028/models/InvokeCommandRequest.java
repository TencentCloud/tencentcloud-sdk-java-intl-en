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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeCommandRequest extends AbstractModel {

    /**
    * ID of the command to be triggered.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * IDs of instances about to execute commands. At most 100 IDs are allowed.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Custom parameters of the command. The field type is JSON encoded string. For example, {\"varA\": \"222\"}.
`key` is the name of the custom parameter and `value` is the default value. Both `key` and `value` are strings.
If no parameter value is provided, the DefaultParameters of the command is used.
Up to 20 custom parameters are supported.
The name of the custom parameter cannot exceed 64 characters and can contain [a-z], [A-Z], [0-9] and [-_].
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * The username used to execute the command on the CVM or Lighthouse instance.
The principle of the least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. If this is not specified, the Username of the command is used by default.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Execution path of the command. The WorkingDirectory of the command is used by default.
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * Command timeout period. Value range: [1, 86400]. The Timeout of the command is used by default.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

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
     * Get ID of the command to be triggered. 
     * @return CommandId ID of the command to be triggered.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set ID of the command to be triggered.
     * @param CommandId ID of the command to be triggered.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get IDs of instances about to execute commands. At most 100 IDs are allowed. 
     * @return InstanceIds IDs of instances about to execute commands. At most 100 IDs are allowed.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set IDs of instances about to execute commands. At most 100 IDs are allowed.
     * @param InstanceIds IDs of instances about to execute commands. At most 100 IDs are allowed.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Custom parameters of the command. The field type is JSON encoded string. For example, {\"varA\": \"222\"}.
`key` is the name of the custom parameter and `value` is the default value. Both `key` and `value` are strings.
If no parameter value is provided, the DefaultParameters of the command is used.
Up to 20 custom parameters are supported.
The name of the custom parameter cannot exceed 64 characters and can contain [a-z], [A-Z], [0-9] and [-_]. 
     * @return Parameters Custom parameters of the command. The field type is JSON encoded string. For example, {\"varA\": \"222\"}.
`key` is the name of the custom parameter and `value` is the default value. Both `key` and `value` are strings.
If no parameter value is provided, the DefaultParameters of the command is used.
Up to 20 custom parameters are supported.
The name of the custom parameter cannot exceed 64 characters and can contain [a-z], [A-Z], [0-9] and [-_].
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Custom parameters of the command. The field type is JSON encoded string. For example, {\"varA\": \"222\"}.
`key` is the name of the custom parameter and `value` is the default value. Both `key` and `value` are strings.
If no parameter value is provided, the DefaultParameters of the command is used.
Up to 20 custom parameters are supported.
The name of the custom parameter cannot exceed 64 characters and can contain [a-z], [A-Z], [0-9] and [-_].
     * @param Parameters Custom parameters of the command. The field type is JSON encoded string. For example, {\"varA\": \"222\"}.
`key` is the name of the custom parameter and `value` is the default value. Both `key` and `value` are strings.
If no parameter value is provided, the DefaultParameters of the command is used.
Up to 20 custom parameters are supported.
The name of the custom parameter cannot exceed 64 characters and can contain [a-z], [A-Z], [0-9] and [-_].
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get The username used to execute the command on the CVM or Lighthouse instance.
The principle of the least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. If this is not specified, the Username of the command is used by default. 
     * @return Username The username used to execute the command on the CVM or Lighthouse instance.
The principle of the least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. If this is not specified, the Username of the command is used by default.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set The username used to execute the command on the CVM or Lighthouse instance.
The principle of the least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. If this is not specified, the Username of the command is used by default.
     * @param Username The username used to execute the command on the CVM or Lighthouse instance.
The principle of the least privilege is the best practice for permission management. We recommend you execute TAT commands as a general user. If this is not specified, the Username of the command is used by default.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Execution path of the command. The WorkingDirectory of the command is used by default. 
     * @return WorkingDirectory Execution path of the command. The WorkingDirectory of the command is used by default.
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set Execution path of the command. The WorkingDirectory of the command is used by default.
     * @param WorkingDirectory Execution path of the command. The WorkingDirectory of the command is used by default.
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get Command timeout period. Value range: [1, 86400]. The Timeout of the command is used by default. 
     * @return Timeout Command timeout period. Value range: [1, 86400]. The Timeout of the command is used by default.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Command timeout period. Value range: [1, 86400]. The Timeout of the command is used by default.
     * @param Timeout Command timeout period. Value range: [1, 86400]. The Timeout of the command is used by default.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
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

    public InvokeCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeCommandRequest(InvokeCommandRequest source) {
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.WorkingDirectory != null) {
            this.WorkingDirectory = new String(source.WorkingDirectory);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
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
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

