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

public class RedirectLocalInfo extends AbstractModel{

    /**
    * Standard output redirection local path
    */
    @SerializedName("StdoutLocalPath")
    @Expose
    private String StdoutLocalPath;

    /**
    * Standard error redirection local path
    */
    @SerializedName("StderrLocalPath")
    @Expose
    private String StderrLocalPath;

    /**
    * Standard output redirection local file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
    */
    @SerializedName("StdoutLocalFileName")
    @Expose
    private String StdoutLocalFileName;

    /**
    * Standard error redirection local file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
    */
    @SerializedName("StderrLocalFileName")
    @Expose
    private String StderrLocalFileName;

    /**
     * Get Standard output redirection local path 
     * @return StdoutLocalPath Standard output redirection local path
     */
    public String getStdoutLocalPath() {
        return this.StdoutLocalPath;
    }

    /**
     * Set Standard output redirection local path
     * @param StdoutLocalPath Standard output redirection local path
     */
    public void setStdoutLocalPath(String StdoutLocalPath) {
        this.StdoutLocalPath = StdoutLocalPath;
    }

    /**
     * Get Standard error redirection local path 
     * @return StderrLocalPath Standard error redirection local path
     */
    public String getStderrLocalPath() {
        return this.StderrLocalPath;
    }

    /**
     * Set Standard error redirection local path
     * @param StderrLocalPath Standard error redirection local path
     */
    public void setStderrLocalPath(String StderrLocalPath) {
        this.StderrLocalPath = StderrLocalPath;
    }

    /**
     * Get Standard output redirection local file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}` 
     * @return StdoutLocalFileName Standard output redirection local file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     */
    public String getStdoutLocalFileName() {
        return this.StdoutLocalFileName;
    }

    /**
     * Set Standard output redirection local file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     * @param StdoutLocalFileName Standard output redirection local file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     */
    public void setStdoutLocalFileName(String StdoutLocalFileName) {
        this.StdoutLocalFileName = StdoutLocalFileName;
    }

    /**
     * Get Standard error redirection local file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}` 
     * @return StderrLocalFileName Standard error redirection local file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     */
    public String getStderrLocalFileName() {
        return this.StderrLocalFileName;
    }

    /**
     * Set Standard error redirection local file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     * @param StderrLocalFileName Standard error redirection local file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     */
    public void setStderrLocalFileName(String StderrLocalFileName) {
        this.StderrLocalFileName = StderrLocalFileName;
    }

    public RedirectLocalInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedirectLocalInfo(RedirectLocalInfo source) {
        if (source.StdoutLocalPath != null) {
            this.StdoutLocalPath = new String(source.StdoutLocalPath);
        }
        if (source.StderrLocalPath != null) {
            this.StderrLocalPath = new String(source.StderrLocalPath);
        }
        if (source.StdoutLocalFileName != null) {
            this.StdoutLocalFileName = new String(source.StdoutLocalFileName);
        }
        if (source.StderrLocalFileName != null) {
            this.StderrLocalFileName = new String(source.StderrLocalFileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StdoutLocalPath", this.StdoutLocalPath);
        this.setParamSimple(map, prefix + "StderrLocalPath", this.StderrLocalPath);
        this.setParamSimple(map, prefix + "StdoutLocalFileName", this.StdoutLocalFileName);
        this.setParamSimple(map, prefix + "StderrLocalFileName", this.StderrLocalFileName);

    }
}

