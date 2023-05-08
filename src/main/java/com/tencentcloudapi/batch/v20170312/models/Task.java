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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel{

    /**
    * Application information
    */
    @SerializedName("Application")
    @Expose
    private Application Application;

    /**
    * Task name, which should be unique within a job
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Number of running task instances
    */
    @SerializedName("TaskInstanceNum")
    @Expose
    private Long TaskInstanceNum;

    /**
    * Compute environment information. One (and only one) parameter must be specified for ComputeEnv and EnvId.
    */
    @SerializedName("ComputeEnv")
    @Expose
    private AnonymousComputeEnv ComputeEnv;

    /**
    * Compute environment ID. One (and only one) parameter must be specified for ComputeEnv and EnvId.
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Redirection information
    */
    @SerializedName("RedirectInfo")
    @Expose
    private RedirectInfo RedirectInfo;

    /**
    * Local redirection information
    */
    @SerializedName("RedirectLocalInfo")
    @Expose
    private RedirectLocalInfo RedirectLocalInfo;

    /**
    * Input mapping
    */
    @SerializedName("InputMappings")
    @Expose
    private InputMapping [] InputMappings;

    /**
    * Output mapping
    */
    @SerializedName("OutputMappings")
    @Expose
    private OutputMapping [] OutputMappings;

    /**
    * Output mapping configuration
    */
    @SerializedName("OutputMappingConfigs")
    @Expose
    private OutputMappingConfig [] OutputMappingConfigs;

    /**
    * Custom environment variable
    */
    @SerializedName("EnvVars")
    @Expose
    private EnvVar [] EnvVars;

    /**
    * Authorization information
    */
    @SerializedName("Authentications")
    @Expose
    private Authentication [] Authentications;

    /**
    * The processing method after the TaskInstance fails; Value range: `TERMINATE` (default), `INTERRUPT`, `FAST_INTERRUPT`.
    */
    @SerializedName("FailedAction")
    @Expose
    private String FailedAction;

    /**
    * The maximum number of retries after the task fails. Range: 0 - 5. Default value: 0
    */
    @SerializedName("MaxRetryCount")
    @Expose
    private Long MaxRetryCount;

    /**
    * Timeout period of the task in seconds. Defaults value: 86400
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * The maximum number of concurrent tasks. Range: 0 - 200000. There is no limit by default.
    */
    @SerializedName("MaxConcurrentNum")
    @Expose
    private Long MaxConcurrentNum;

    /**
    * Restarts the compute node after the task is completed. This is suitable for specifying the compute environment for task execution.
    */
    @SerializedName("RestartComputeNode")
    @Expose
    private Boolean RestartComputeNode;

    /**
    * Maximum number of retry attempts after failing to create computing resources such as the CVM in the task launch process. Default: `0`; Maximum: `100`.
    */
    @SerializedName("ResourceMaxRetryCount")
    @Expose
    private Long ResourceMaxRetryCount;

    /**
     * Get Application information 
     * @return Application Application information
     */
    public Application getApplication() {
        return this.Application;
    }

    /**
     * Set Application information
     * @param Application Application information
     */
    public void setApplication(Application Application) {
        this.Application = Application;
    }

    /**
     * Get Task name, which should be unique within a job 
     * @return TaskName Task name, which should be unique within a job
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name, which should be unique within a job
     * @param TaskName Task name, which should be unique within a job
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Number of running task instances 
     * @return TaskInstanceNum Number of running task instances
     */
    public Long getTaskInstanceNum() {
        return this.TaskInstanceNum;
    }

    /**
     * Set Number of running task instances
     * @param TaskInstanceNum Number of running task instances
     */
    public void setTaskInstanceNum(Long TaskInstanceNum) {
        this.TaskInstanceNum = TaskInstanceNum;
    }

    /**
     * Get Compute environment information. One (and only one) parameter must be specified for ComputeEnv and EnvId. 
     * @return ComputeEnv Compute environment information. One (and only one) parameter must be specified for ComputeEnv and EnvId.
     */
    public AnonymousComputeEnv getComputeEnv() {
        return this.ComputeEnv;
    }

    /**
     * Set Compute environment information. One (and only one) parameter must be specified for ComputeEnv and EnvId.
     * @param ComputeEnv Compute environment information. One (and only one) parameter must be specified for ComputeEnv and EnvId.
     */
    public void setComputeEnv(AnonymousComputeEnv ComputeEnv) {
        this.ComputeEnv = ComputeEnv;
    }

    /**
     * Get Compute environment ID. One (and only one) parameter must be specified for ComputeEnv and EnvId. 
     * @return EnvId Compute environment ID. One (and only one) parameter must be specified for ComputeEnv and EnvId.
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Compute environment ID. One (and only one) parameter must be specified for ComputeEnv and EnvId.
     * @param EnvId Compute environment ID. One (and only one) parameter must be specified for ComputeEnv and EnvId.
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Redirection information 
     * @return RedirectInfo Redirection information
     */
    public RedirectInfo getRedirectInfo() {
        return this.RedirectInfo;
    }

    /**
     * Set Redirection information
     * @param RedirectInfo Redirection information
     */
    public void setRedirectInfo(RedirectInfo RedirectInfo) {
        this.RedirectInfo = RedirectInfo;
    }

    /**
     * Get Local redirection information 
     * @return RedirectLocalInfo Local redirection information
     */
    public RedirectLocalInfo getRedirectLocalInfo() {
        return this.RedirectLocalInfo;
    }

    /**
     * Set Local redirection information
     * @param RedirectLocalInfo Local redirection information
     */
    public void setRedirectLocalInfo(RedirectLocalInfo RedirectLocalInfo) {
        this.RedirectLocalInfo = RedirectLocalInfo;
    }

    /**
     * Get Input mapping 
     * @return InputMappings Input mapping
     */
    public InputMapping [] getInputMappings() {
        return this.InputMappings;
    }

    /**
     * Set Input mapping
     * @param InputMappings Input mapping
     */
    public void setInputMappings(InputMapping [] InputMappings) {
        this.InputMappings = InputMappings;
    }

    /**
     * Get Output mapping 
     * @return OutputMappings Output mapping
     */
    public OutputMapping [] getOutputMappings() {
        return this.OutputMappings;
    }

    /**
     * Set Output mapping
     * @param OutputMappings Output mapping
     */
    public void setOutputMappings(OutputMapping [] OutputMappings) {
        this.OutputMappings = OutputMappings;
    }

    /**
     * Get Output mapping configuration 
     * @return OutputMappingConfigs Output mapping configuration
     */
    public OutputMappingConfig [] getOutputMappingConfigs() {
        return this.OutputMappingConfigs;
    }

    /**
     * Set Output mapping configuration
     * @param OutputMappingConfigs Output mapping configuration
     */
    public void setOutputMappingConfigs(OutputMappingConfig [] OutputMappingConfigs) {
        this.OutputMappingConfigs = OutputMappingConfigs;
    }

    /**
     * Get Custom environment variable 
     * @return EnvVars Custom environment variable
     */
    public EnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set Custom environment variable
     * @param EnvVars Custom environment variable
     */
    public void setEnvVars(EnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get Authorization information 
     * @return Authentications Authorization information
     */
    public Authentication [] getAuthentications() {
        return this.Authentications;
    }

    /**
     * Set Authorization information
     * @param Authentications Authorization information
     */
    public void setAuthentications(Authentication [] Authentications) {
        this.Authentications = Authentications;
    }

    /**
     * Get The processing method after the TaskInstance fails; Value range: `TERMINATE` (default), `INTERRUPT`, `FAST_INTERRUPT`. 
     * @return FailedAction The processing method after the TaskInstance fails; Value range: `TERMINATE` (default), `INTERRUPT`, `FAST_INTERRUPT`.
     */
    public String getFailedAction() {
        return this.FailedAction;
    }

    /**
     * Set The processing method after the TaskInstance fails; Value range: `TERMINATE` (default), `INTERRUPT`, `FAST_INTERRUPT`.
     * @param FailedAction The processing method after the TaskInstance fails; Value range: `TERMINATE` (default), `INTERRUPT`, `FAST_INTERRUPT`.
     */
    public void setFailedAction(String FailedAction) {
        this.FailedAction = FailedAction;
    }

    /**
     * Get The maximum number of retries after the task fails. Range: 0 - 5. Default value: 0 
     * @return MaxRetryCount The maximum number of retries after the task fails. Range: 0 - 5. Default value: 0
     */
    public Long getMaxRetryCount() {
        return this.MaxRetryCount;
    }

    /**
     * Set The maximum number of retries after the task fails. Range: 0 - 5. Default value: 0
     * @param MaxRetryCount The maximum number of retries after the task fails. Range: 0 - 5. Default value: 0
     */
    public void setMaxRetryCount(Long MaxRetryCount) {
        this.MaxRetryCount = MaxRetryCount;
    }

    /**
     * Get Timeout period of the task in seconds. Defaults value: 86400 
     * @return Timeout Timeout period of the task in seconds. Defaults value: 86400
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout period of the task in seconds. Defaults value: 86400
     * @param Timeout Timeout period of the task in seconds. Defaults value: 86400
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get The maximum number of concurrent tasks. Range: 0 - 200000. There is no limit by default. 
     * @return MaxConcurrentNum The maximum number of concurrent tasks. Range: 0 - 200000. There is no limit by default.
     */
    public Long getMaxConcurrentNum() {
        return this.MaxConcurrentNum;
    }

    /**
     * Set The maximum number of concurrent tasks. Range: 0 - 200000. There is no limit by default.
     * @param MaxConcurrentNum The maximum number of concurrent tasks. Range: 0 - 200000. There is no limit by default.
     */
    public void setMaxConcurrentNum(Long MaxConcurrentNum) {
        this.MaxConcurrentNum = MaxConcurrentNum;
    }

    /**
     * Get Restarts the compute node after the task is completed. This is suitable for specifying the compute environment for task execution. 
     * @return RestartComputeNode Restarts the compute node after the task is completed. This is suitable for specifying the compute environment for task execution.
     */
    public Boolean getRestartComputeNode() {
        return this.RestartComputeNode;
    }

    /**
     * Set Restarts the compute node after the task is completed. This is suitable for specifying the compute environment for task execution.
     * @param RestartComputeNode Restarts the compute node after the task is completed. This is suitable for specifying the compute environment for task execution.
     */
    public void setRestartComputeNode(Boolean RestartComputeNode) {
        this.RestartComputeNode = RestartComputeNode;
    }

    /**
     * Get Maximum number of retry attempts after failing to create computing resources such as the CVM in the task launch process. Default: `0`; Maximum: `100`. 
     * @return ResourceMaxRetryCount Maximum number of retry attempts after failing to create computing resources such as the CVM in the task launch process. Default: `0`; Maximum: `100`.
     */
    public Long getResourceMaxRetryCount() {
        return this.ResourceMaxRetryCount;
    }

    /**
     * Set Maximum number of retry attempts after failing to create computing resources such as the CVM in the task launch process. Default: `0`; Maximum: `100`.
     * @param ResourceMaxRetryCount Maximum number of retry attempts after failing to create computing resources such as the CVM in the task launch process. Default: `0`; Maximum: `100`.
     */
    public void setResourceMaxRetryCount(Long ResourceMaxRetryCount) {
        this.ResourceMaxRetryCount = ResourceMaxRetryCount;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.Application != null) {
            this.Application = new Application(source.Application);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskInstanceNum != null) {
            this.TaskInstanceNum = new Long(source.TaskInstanceNum);
        }
        if (source.ComputeEnv != null) {
            this.ComputeEnv = new AnonymousComputeEnv(source.ComputeEnv);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.RedirectInfo != null) {
            this.RedirectInfo = new RedirectInfo(source.RedirectInfo);
        }
        if (source.RedirectLocalInfo != null) {
            this.RedirectLocalInfo = new RedirectLocalInfo(source.RedirectLocalInfo);
        }
        if (source.InputMappings != null) {
            this.InputMappings = new InputMapping[source.InputMappings.length];
            for (int i = 0; i < source.InputMappings.length; i++) {
                this.InputMappings[i] = new InputMapping(source.InputMappings[i]);
            }
        }
        if (source.OutputMappings != null) {
            this.OutputMappings = new OutputMapping[source.OutputMappings.length];
            for (int i = 0; i < source.OutputMappings.length; i++) {
                this.OutputMappings[i] = new OutputMapping(source.OutputMappings[i]);
            }
        }
        if (source.OutputMappingConfigs != null) {
            this.OutputMappingConfigs = new OutputMappingConfig[source.OutputMappingConfigs.length];
            for (int i = 0; i < source.OutputMappingConfigs.length; i++) {
                this.OutputMappingConfigs[i] = new OutputMappingConfig(source.OutputMappingConfigs[i]);
            }
        }
        if (source.EnvVars != null) {
            this.EnvVars = new EnvVar[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new EnvVar(source.EnvVars[i]);
            }
        }
        if (source.Authentications != null) {
            this.Authentications = new Authentication[source.Authentications.length];
            for (int i = 0; i < source.Authentications.length; i++) {
                this.Authentications[i] = new Authentication(source.Authentications[i]);
            }
        }
        if (source.FailedAction != null) {
            this.FailedAction = new String(source.FailedAction);
        }
        if (source.MaxRetryCount != null) {
            this.MaxRetryCount = new Long(source.MaxRetryCount);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.MaxConcurrentNum != null) {
            this.MaxConcurrentNum = new Long(source.MaxConcurrentNum);
        }
        if (source.RestartComputeNode != null) {
            this.RestartComputeNode = new Boolean(source.RestartComputeNode);
        }
        if (source.ResourceMaxRetryCount != null) {
            this.ResourceMaxRetryCount = new Long(source.ResourceMaxRetryCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Application.", this.Application);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskInstanceNum", this.TaskInstanceNum);
        this.setParamObj(map, prefix + "ComputeEnv.", this.ComputeEnv);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamObj(map, prefix + "RedirectInfo.", this.RedirectInfo);
        this.setParamObj(map, prefix + "RedirectLocalInfo.", this.RedirectLocalInfo);
        this.setParamArrayObj(map, prefix + "InputMappings.", this.InputMappings);
        this.setParamArrayObj(map, prefix + "OutputMappings.", this.OutputMappings);
        this.setParamArrayObj(map, prefix + "OutputMappingConfigs.", this.OutputMappingConfigs);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamArrayObj(map, prefix + "Authentications.", this.Authentications);
        this.setParamSimple(map, prefix + "FailedAction", this.FailedAction);
        this.setParamSimple(map, prefix + "MaxRetryCount", this.MaxRetryCount);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "MaxConcurrentNum", this.MaxConcurrentNum);
        this.setParamSimple(map, prefix + "RestartComputeNode", this.RestartComputeNode);
        this.setParamSimple(map, prefix + "ResourceMaxRetryCount", this.ResourceMaxRetryCount);

    }
}

