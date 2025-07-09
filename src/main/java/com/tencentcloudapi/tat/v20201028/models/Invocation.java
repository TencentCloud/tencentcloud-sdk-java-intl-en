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

public class Invocation extends AbstractModel {

    /**
    * Execution activity ID.
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * Command ID.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * Execution task status. Valid values:
<li> PENDING: Pending 
<li> RUNNING: Running
<li> SUCCESS: Success
<li> FAILED: Failed
<li> TIMEOUT: Command timed out
<li> PARTIAL_FAILED: Partial failure
    */
    @SerializedName("InvocationStatus")
    @Expose
    private String InvocationStatus;

    /**
    * Execution task information list.
    */
    @SerializedName("InvocationTaskBasicInfoSet")
    @Expose
    private InvocationTaskBasicInfo [] InvocationTaskBasicInfoSet;

    /**
    * Execution activity description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Start time of the execution activity.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the execution activity.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Time when the execution activity is created.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Time when the execution activity is updated.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * Values of custom parameters.
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * Default custom parameter value.
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * Type of the instance executing the command. Valid values: `CVM`, `LIGHTHOUSE`.
    */
    @SerializedName("InstanceKind")
    @Expose
    private String InstanceKind;

    /**
    * The user who executes the command on the instance.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Invocation source.
    */
    @SerializedName("InvocationSource")
    @Expose
    private String InvocationSource;

    /**
    * Base64-encoded command
    */
    @SerializedName("CommandContent")
    @Expose
    private String CommandContent;

    /**
    * Command type
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * Command timeout period, in seconds.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Working directory for executing the command.
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

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
     * Get Execution activity ID. 
     * @return InvocationId Execution activity ID.
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set Execution activity ID.
     * @param InvocationId Execution activity ID.
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

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
     * Get Execution task status. Valid values:
<li> PENDING: Pending 
<li> RUNNING: Running
<li> SUCCESS: Success
<li> FAILED: Failed
<li> TIMEOUT: Command timed out
<li> PARTIAL_FAILED: Partial failure 
     * @return InvocationStatus Execution task status. Valid values:
<li> PENDING: Pending 
<li> RUNNING: Running
<li> SUCCESS: Success
<li> FAILED: Failed
<li> TIMEOUT: Command timed out
<li> PARTIAL_FAILED: Partial failure
     */
    public String getInvocationStatus() {
        return this.InvocationStatus;
    }

    /**
     * Set Execution task status. Valid values:
<li> PENDING: Pending 
<li> RUNNING: Running
<li> SUCCESS: Success
<li> FAILED: Failed
<li> TIMEOUT: Command timed out
<li> PARTIAL_FAILED: Partial failure
     * @param InvocationStatus Execution task status. Valid values:
<li> PENDING: Pending 
<li> RUNNING: Running
<li> SUCCESS: Success
<li> FAILED: Failed
<li> TIMEOUT: Command timed out
<li> PARTIAL_FAILED: Partial failure
     */
    public void setInvocationStatus(String InvocationStatus) {
        this.InvocationStatus = InvocationStatus;
    }

    /**
     * Get Execution task information list. 
     * @return InvocationTaskBasicInfoSet Execution task information list.
     */
    public InvocationTaskBasicInfo [] getInvocationTaskBasicInfoSet() {
        return this.InvocationTaskBasicInfoSet;
    }

    /**
     * Set Execution task information list.
     * @param InvocationTaskBasicInfoSet Execution task information list.
     */
    public void setInvocationTaskBasicInfoSet(InvocationTaskBasicInfo [] InvocationTaskBasicInfoSet) {
        this.InvocationTaskBasicInfoSet = InvocationTaskBasicInfoSet;
    }

    /**
     * Get Execution activity description. 
     * @return Description Execution activity description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Execution activity description.
     * @param Description Execution activity description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Start time of the execution activity. 
     * @return StartTime Start time of the execution activity.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the execution activity.
     * @param StartTime Start time of the execution activity.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the execution activity. 
     * @return EndTime End time of the execution activity.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the execution activity.
     * @param EndTime End time of the execution activity.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Time when the execution activity is created. 
     * @return CreatedTime Time when the execution activity is created.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Time when the execution activity is created.
     * @param CreatedTime Time when the execution activity is created.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Time when the execution activity is updated. 
     * @return UpdatedTime Time when the execution activity is updated.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Time when the execution activity is updated.
     * @param UpdatedTime Time when the execution activity is updated.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get Values of custom parameters. 
     * @return Parameters Values of custom parameters.
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Values of custom parameters.
     * @param Parameters Values of custom parameters.
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
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
     * Get Type of the instance executing the command. Valid values: `CVM`, `LIGHTHOUSE`. 
     * @return InstanceKind Type of the instance executing the command. Valid values: `CVM`, `LIGHTHOUSE`.
     */
    public String getInstanceKind() {
        return this.InstanceKind;
    }

    /**
     * Set Type of the instance executing the command. Valid values: `CVM`, `LIGHTHOUSE`.
     * @param InstanceKind Type of the instance executing the command. Valid values: `CVM`, `LIGHTHOUSE`.
     */
    public void setInstanceKind(String InstanceKind) {
        this.InstanceKind = InstanceKind;
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
     * Get Invocation source. 
     * @return InvocationSource Invocation source.
     */
    public String getInvocationSource() {
        return this.InvocationSource;
    }

    /**
     * Set Invocation source.
     * @param InvocationSource Invocation source.
     */
    public void setInvocationSource(String InvocationSource) {
        this.InvocationSource = InvocationSource;
    }

    /**
     * Get Base64-encoded command 
     * @return CommandContent Base64-encoded command
     */
    public String getCommandContent() {
        return this.CommandContent;
    }

    /**
     * Set Base64-encoded command
     * @param CommandContent Base64-encoded command
     */
    public void setCommandContent(String CommandContent) {
        this.CommandContent = CommandContent;
    }

    /**
     * Get Command type 
     * @return CommandType Command type
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set Command type
     * @param CommandType Command type
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get Command timeout period, in seconds. 
     * @return Timeout Command timeout period, in seconds.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Command timeout period, in seconds.
     * @param Timeout Command timeout period, in seconds.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Working directory for executing the command. 
     * @return WorkingDirectory Working directory for executing the command.
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set Working directory for executing the command.
     * @param WorkingDirectory Working directory for executing the command.
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
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

    public Invocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Invocation(Invocation source) {
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.InvocationStatus != null) {
            this.InvocationStatus = new String(source.InvocationStatus);
        }
        if (source.InvocationTaskBasicInfoSet != null) {
            this.InvocationTaskBasicInfoSet = new InvocationTaskBasicInfo[source.InvocationTaskBasicInfoSet.length];
            for (int i = 0; i < source.InvocationTaskBasicInfoSet.length; i++) {
                this.InvocationTaskBasicInfoSet[i] = new InvocationTaskBasicInfo(source.InvocationTaskBasicInfoSet[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.DefaultParameters != null) {
            this.DefaultParameters = new String(source.DefaultParameters);
        }
        if (source.InstanceKind != null) {
            this.InstanceKind = new String(source.InstanceKind);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.InvocationSource != null) {
            this.InvocationSource = new String(source.InvocationSource);
        }
        if (source.CommandContent != null) {
            this.CommandContent = new String(source.CommandContent);
        }
        if (source.CommandType != null) {
            this.CommandType = new String(source.CommandType);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.WorkingDirectory != null) {
            this.WorkingDirectory = new String(source.WorkingDirectory);
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
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "InvocationStatus", this.InvocationStatus);
        this.setParamArrayObj(map, prefix + "InvocationTaskBasicInfoSet.", this.InvocationTaskBasicInfoSet);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "DefaultParameters", this.DefaultParameters);
        this.setParamSimple(map, prefix + "InstanceKind", this.InstanceKind);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "InvocationSource", this.InvocationSource);
        this.setParamSimple(map, prefix + "CommandContent", this.CommandContent);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

