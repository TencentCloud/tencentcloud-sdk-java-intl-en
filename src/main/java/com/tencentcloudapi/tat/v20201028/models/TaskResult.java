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

public class TaskResult extends AbstractModel {

    /**
    * ExitCode of the execution.
    */
    @SerializedName("ExitCode")
    @Expose
    private Long ExitCode;

    /**
    * Base64-encoded command output. The maximum length is 24 KB.
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Time when the execution is started.
    */
    @SerializedName("ExecStartTime")
    @Expose
    private String ExecStartTime;

    /**
    * Time when the execution is ended.
    */
    @SerializedName("ExecEndTime")
    @Expose
    private String ExecEndTime;

    /**
    * Dropped bytes of the command output.
    */
    @SerializedName("Dropped")
    @Expose
    private Long Dropped;

    /**
    * COS URL of the logs.
    */
    @SerializedName("OutputUrl")
    @Expose
    private String OutputUrl;

    /**
    * Error message for uploading logs to COS.
    */
    @SerializedName("OutputUploadCOSErrorInfo")
    @Expose
    private String OutputUploadCOSErrorInfo;

    /**
     * Get ExitCode of the execution. 
     * @return ExitCode ExitCode of the execution.
     */
    public Long getExitCode() {
        return this.ExitCode;
    }

    /**
     * Set ExitCode of the execution.
     * @param ExitCode ExitCode of the execution.
     */
    public void setExitCode(Long ExitCode) {
        this.ExitCode = ExitCode;
    }

    /**
     * Get Base64-encoded command output. The maximum length is 24 KB. 
     * @return Output Base64-encoded command output. The maximum length is 24 KB.
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Base64-encoded command output. The maximum length is 24 KB.
     * @param Output Base64-encoded command output. The maximum length is 24 KB.
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get Time when the execution is started. 
     * @return ExecStartTime Time when the execution is started.
     */
    public String getExecStartTime() {
        return this.ExecStartTime;
    }

    /**
     * Set Time when the execution is started.
     * @param ExecStartTime Time when the execution is started.
     */
    public void setExecStartTime(String ExecStartTime) {
        this.ExecStartTime = ExecStartTime;
    }

    /**
     * Get Time when the execution is ended. 
     * @return ExecEndTime Time when the execution is ended.
     */
    public String getExecEndTime() {
        return this.ExecEndTime;
    }

    /**
     * Set Time when the execution is ended.
     * @param ExecEndTime Time when the execution is ended.
     */
    public void setExecEndTime(String ExecEndTime) {
        this.ExecEndTime = ExecEndTime;
    }

    /**
     * Get Dropped bytes of the command output. 
     * @return Dropped Dropped bytes of the command output.
     */
    public Long getDropped() {
        return this.Dropped;
    }

    /**
     * Set Dropped bytes of the command output.
     * @param Dropped Dropped bytes of the command output.
     */
    public void setDropped(Long Dropped) {
        this.Dropped = Dropped;
    }

    /**
     * Get COS URL of the logs. 
     * @return OutputUrl COS URL of the logs.
     */
    public String getOutputUrl() {
        return this.OutputUrl;
    }

    /**
     * Set COS URL of the logs.
     * @param OutputUrl COS URL of the logs.
     */
    public void setOutputUrl(String OutputUrl) {
        this.OutputUrl = OutputUrl;
    }

    /**
     * Get Error message for uploading logs to COS. 
     * @return OutputUploadCOSErrorInfo Error message for uploading logs to COS.
     */
    public String getOutputUploadCOSErrorInfo() {
        return this.OutputUploadCOSErrorInfo;
    }

    /**
     * Set Error message for uploading logs to COS.
     * @param OutputUploadCOSErrorInfo Error message for uploading logs to COS.
     */
    public void setOutputUploadCOSErrorInfo(String OutputUploadCOSErrorInfo) {
        this.OutputUploadCOSErrorInfo = OutputUploadCOSErrorInfo;
    }

    public TaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskResult(TaskResult source) {
        if (source.ExitCode != null) {
            this.ExitCode = new Long(source.ExitCode);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.ExecStartTime != null) {
            this.ExecStartTime = new String(source.ExecStartTime);
        }
        if (source.ExecEndTime != null) {
            this.ExecEndTime = new String(source.ExecEndTime);
        }
        if (source.Dropped != null) {
            this.Dropped = new Long(source.Dropped);
        }
        if (source.OutputUrl != null) {
            this.OutputUrl = new String(source.OutputUrl);
        }
        if (source.OutputUploadCOSErrorInfo != null) {
            this.OutputUploadCOSErrorInfo = new String(source.OutputUploadCOSErrorInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExitCode", this.ExitCode);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "ExecStartTime", this.ExecStartTime);
        this.setParamSimple(map, prefix + "ExecEndTime", this.ExecEndTime);
        this.setParamSimple(map, prefix + "Dropped", this.Dropped);
        this.setParamSimple(map, prefix + "OutputUrl", this.OutputUrl);
        this.setParamSimple(map, prefix + "OutputUploadCOSErrorInfo", this.OutputUploadCOSErrorInfo);

    }
}

