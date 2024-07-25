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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunMetadata extends AbstractModel {

    /**
    * Run type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RunType")
    @Expose
    private String RunType;

    /**
    * Run ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * Parent layer ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * Job ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Job name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CallName")
    @Expose
    private String CallName;

    /**
    * Scatter index
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScatterIndex")
    @Expose
    private String ScatterIndex;

    /**
    * Input
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * Output
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Submission time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
    * End time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Command Line
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Runtime
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * Preprocessing
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Preprocess")
    @Expose
    private Boolean Preprocess;

    /**
    * Post-processing
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PostProcess")
    @Expose
    private Boolean PostProcess;

    /**
    * Cache hit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CallCached")
    @Expose
    private Boolean CallCached;

    /**
    * Standard output
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Stdout")
    @Expose
    private String Stdout;

    /**
    * Error output
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Stderr")
    @Expose
    private String Stderr;

    /**
    * Other information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Meta")
    @Expose
    private String Meta;

    /**
     * Get Run type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RunType Run type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRunType() {
        return this.RunType;
    }

    /**
     * Set Run type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RunType Run type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRunType(String RunType) {
        this.RunType = RunType;
    }

    /**
     * Get Run ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RunId Run ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * Set Run ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RunId Run ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
    }

    /**
     * Get Parent layer ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParentId Parent layer ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set Parent layer ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParentId Parent layer ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get Job ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobId Job ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobId Job ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Job name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CallName Job name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCallName() {
        return this.CallName;
    }

    /**
     * Set Job name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CallName Job name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCallName(String CallName) {
        this.CallName = CallName;
    }

    /**
     * Get Scatter index
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScatterIndex Scatter index
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScatterIndex() {
        return this.ScatterIndex;
    }

    /**
     * Set Scatter index
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScatterIndex Scatter index
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScatterIndex(String ScatterIndex) {
        this.ScatterIndex = ScatterIndex;
    }

    /**
     * Get Input
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Input Input
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set Input
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Input Input
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get Output
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output Output
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Output
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output Output
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get Status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorMessage Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorMessage Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Submission time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubmitTime Submission time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set Submission time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubmitTime Submission time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubmitTime(String SubmitTime) {
        this.SubmitTime = SubmitTime;
    }

    /**
     * Get End time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Command Line
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Command Command Line
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Command Line
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Command Command Line
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Runtime
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Runtime Runtime
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Runtime
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Runtime Runtime
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get Preprocessing
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Preprocess Preprocessing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getPreprocess() {
        return this.Preprocess;
    }

    /**
     * Set Preprocessing
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Preprocess Preprocessing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPreprocess(Boolean Preprocess) {
        this.Preprocess = Preprocess;
    }

    /**
     * Get Post-processing
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PostProcess Post-processing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getPostProcess() {
        return this.PostProcess;
    }

    /**
     * Set Post-processing
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PostProcess Post-processing
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPostProcess(Boolean PostProcess) {
        this.PostProcess = PostProcess;
    }

    /**
     * Get Cache hit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CallCached Cache hit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCallCached() {
        return this.CallCached;
    }

    /**
     * Set Cache hit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CallCached Cache hit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCallCached(Boolean CallCached) {
        this.CallCached = CallCached;
    }

    /**
     * Get Standard output
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Stdout Standard output
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStdout() {
        return this.Stdout;
    }

    /**
     * Set Standard output
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Stdout Standard output
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStdout(String Stdout) {
        this.Stdout = Stdout;
    }

    /**
     * Get Error output
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Stderr Error output
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStderr() {
        return this.Stderr;
    }

    /**
     * Set Error output
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Stderr Error output
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStderr(String Stderr) {
        this.Stderr = Stderr;
    }

    /**
     * Get Other information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Meta Other information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMeta() {
        return this.Meta;
    }

    /**
     * Set Other information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Meta Other information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMeta(String Meta) {
        this.Meta = Meta;
    }

    public RunMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunMetadata(RunMetadata source) {
        if (source.RunType != null) {
            this.RunType = new String(source.RunType);
        }
        if (source.RunId != null) {
            this.RunId = new String(source.RunId);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CallName != null) {
            this.CallName = new String(source.CallName);
        }
        if (source.ScatterIndex != null) {
            this.ScatterIndex = new String(source.ScatterIndex);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new String(source.SubmitTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.Preprocess != null) {
            this.Preprocess = new Boolean(source.Preprocess);
        }
        if (source.PostProcess != null) {
            this.PostProcess = new Boolean(source.PostProcess);
        }
        if (source.CallCached != null) {
            this.CallCached = new Boolean(source.CallCached);
        }
        if (source.Stdout != null) {
            this.Stdout = new String(source.Stdout);
        }
        if (source.Stderr != null) {
            this.Stderr = new String(source.Stderr);
        }
        if (source.Meta != null) {
            this.Meta = new String(source.Meta);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "RunId", this.RunId);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CallName", this.CallName);
        this.setParamSimple(map, prefix + "ScatterIndex", this.ScatterIndex);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "Preprocess", this.Preprocess);
        this.setParamSimple(map, prefix + "PostProcess", this.PostProcess);
        this.setParamSimple(map, prefix + "CallCached", this.CallCached);
        this.setParamSimple(map, prefix + "Stdout", this.Stdout);
        this.setParamSimple(map, prefix + "Stderr", this.Stderr);
        this.setParamSimple(map, prefix + "Meta", this.Meta);

    }
}

