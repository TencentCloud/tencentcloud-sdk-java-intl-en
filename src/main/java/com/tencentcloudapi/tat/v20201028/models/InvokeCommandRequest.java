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

public class InvokeCommandRequest extends AbstractModel {

    /**
    * Pending trigger command ID. call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

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
    * Custom parameter of Command. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true. you can obtain the EnableParameter settings through the [DescribeCommands (detailed command information)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api.
If the parameter value is not provided, the DefaultParameters or DefaultParameterConfs of Command will be used to replace it.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
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
     * Get Pending trigger command ID. call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details. 
     * @return CommandId Pending trigger command ID. call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set Pending trigger command ID. call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     * @param CommandId Pending trigger command ID. call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
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
     * Get Custom parameter of Command. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true. you can obtain the EnableParameter settings through the [DescribeCommands (detailed command information)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api.
If the parameter value is not provided, the DefaultParameters or DefaultParameterConfs of Command will be used to replace it.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_]. 
     * @return Parameters Custom parameter of Command. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true. you can obtain the EnableParameter settings through the [DescribeCommands (detailed command information)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api.
If the parameter value is not provided, the DefaultParameters or DefaultParameterConfs of Command will be used to replace it.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Custom parameter of Command. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true. you can obtain the EnableParameter settings through the [DescribeCommands (detailed command information)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api.
If the parameter value is not provided, the DefaultParameters or DefaultParameterConfs of Command will be used to replace it.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
     * @param Parameters Custom parameter of Command. field type is json encoded string. for example: {"varA": "222"}.
The key is the custom parameter name, and the value is the default. both kv are string-type.
This parameter can be set only when the EnableParameter of the command is true. you can obtain the EnableParameter settings through the [DescribeCommands (detailed command information)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api.
If the parameter value is not provided, the DefaultParameters or DefaultParameterConfs of Command will be used to replace it.
Custom parameters can be up to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
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

