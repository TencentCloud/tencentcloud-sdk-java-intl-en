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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInstanceLog extends AbstractModel {

    /**
    * Task instance
    */
    @SerializedName("TaskInstanceIndex")
    @Expose
    private Long TaskInstanceIndex;

    /**
    * Standard output log (Base64-encoded, up to 2048 bytes after decompression)
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StdoutLog")
    @Expose
    private String StdoutLog;

    /**
    * Standard error log (Base64-encoded, up to 2048 bytes after decompression)
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StderrLog")
    @Expose
    private String StderrLog;

    /**
    * Standard output redirection path
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StdoutRedirectPath")
    @Expose
    private String StdoutRedirectPath;

    /**
    * Standard error redirection path
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StderrRedirectPath")
    @Expose
    private String StderrRedirectPath;

    /**
    * Standard output redirection file name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StdoutRedirectFileName")
    @Expose
    private String StdoutRedirectFileName;

    /**
    * Standard error redirection file name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StderrRedirectFileName")
    @Expose
    private String StderrRedirectFileName;

    /**
     * Get Task instance 
     * @return TaskInstanceIndex Task instance
     */
    public Long getTaskInstanceIndex() {
        return this.TaskInstanceIndex;
    }

    /**
     * Set Task instance
     * @param TaskInstanceIndex Task instance
     */
    public void setTaskInstanceIndex(Long TaskInstanceIndex) {
        this.TaskInstanceIndex = TaskInstanceIndex;
    }

    /**
     * Get Standard output log (Base64-encoded, up to 2048 bytes after decompression)
Note: This field may return `null`, indicating that no valid value was found. 
     * @return StdoutLog Standard output log (Base64-encoded, up to 2048 bytes after decompression)
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getStdoutLog() {
        return this.StdoutLog;
    }

    /**
     * Set Standard output log (Base64-encoded, up to 2048 bytes after decompression)
Note: This field may return `null`, indicating that no valid value was found.
     * @param StdoutLog Standard output log (Base64-encoded, up to 2048 bytes after decompression)
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStdoutLog(String StdoutLog) {
        this.StdoutLog = StdoutLog;
    }

    /**
     * Get Standard error log (Base64-encoded, up to 2048 bytes after decompression)
Note: This field may return `null`, indicating that no valid value was found. 
     * @return StderrLog Standard error log (Base64-encoded, up to 2048 bytes after decompression)
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getStderrLog() {
        return this.StderrLog;
    }

    /**
     * Set Standard error log (Base64-encoded, up to 2048 bytes after decompression)
Note: This field may return `null`, indicating that no valid value was found.
     * @param StderrLog Standard error log (Base64-encoded, up to 2048 bytes after decompression)
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStderrLog(String StderrLog) {
        this.StderrLog = StderrLog;
    }

    /**
     * Get Standard output redirection path
Note: This field may return `null`, indicating that no valid value was found. 
     * @return StdoutRedirectPath Standard output redirection path
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getStdoutRedirectPath() {
        return this.StdoutRedirectPath;
    }

    /**
     * Set Standard output redirection path
Note: This field may return `null`, indicating that no valid value was found.
     * @param StdoutRedirectPath Standard output redirection path
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStdoutRedirectPath(String StdoutRedirectPath) {
        this.StdoutRedirectPath = StdoutRedirectPath;
    }

    /**
     * Get Standard error redirection path
Note: This field may return `null`, indicating that no valid value was found. 
     * @return StderrRedirectPath Standard error redirection path
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getStderrRedirectPath() {
        return this.StderrRedirectPath;
    }

    /**
     * Set Standard error redirection path
Note: This field may return `null`, indicating that no valid value was found.
     * @param StderrRedirectPath Standard error redirection path
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStderrRedirectPath(String StderrRedirectPath) {
        this.StderrRedirectPath = StderrRedirectPath;
    }

    /**
     * Get Standard output redirection file name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return StdoutRedirectFileName Standard output redirection file name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getStdoutRedirectFileName() {
        return this.StdoutRedirectFileName;
    }

    /**
     * Set Standard output redirection file name
Note: This field may return `null`, indicating that no valid value was found.
     * @param StdoutRedirectFileName Standard output redirection file name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStdoutRedirectFileName(String StdoutRedirectFileName) {
        this.StdoutRedirectFileName = StdoutRedirectFileName;
    }

    /**
     * Get Standard error redirection file name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return StderrRedirectFileName Standard error redirection file name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getStderrRedirectFileName() {
        return this.StderrRedirectFileName;
    }

    /**
     * Set Standard error redirection file name
Note: This field may return `null`, indicating that no valid value was found.
     * @param StderrRedirectFileName Standard error redirection file name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStderrRedirectFileName(String StderrRedirectFileName) {
        this.StderrRedirectFileName = StderrRedirectFileName;
    }

    public TaskInstanceLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInstanceLog(TaskInstanceLog source) {
        if (source.TaskInstanceIndex != null) {
            this.TaskInstanceIndex = new Long(source.TaskInstanceIndex);
        }
        if (source.StdoutLog != null) {
            this.StdoutLog = new String(source.StdoutLog);
        }
        if (source.StderrLog != null) {
            this.StderrLog = new String(source.StderrLog);
        }
        if (source.StdoutRedirectPath != null) {
            this.StdoutRedirectPath = new String(source.StdoutRedirectPath);
        }
        if (source.StderrRedirectPath != null) {
            this.StderrRedirectPath = new String(source.StderrRedirectPath);
        }
        if (source.StdoutRedirectFileName != null) {
            this.StdoutRedirectFileName = new String(source.StdoutRedirectFileName);
        }
        if (source.StderrRedirectFileName != null) {
            this.StderrRedirectFileName = new String(source.StderrRedirectFileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskInstanceIndex", this.TaskInstanceIndex);
        this.setParamSimple(map, prefix + "StdoutLog", this.StdoutLog);
        this.setParamSimple(map, prefix + "StderrLog", this.StderrLog);
        this.setParamSimple(map, prefix + "StdoutRedirectPath", this.StdoutRedirectPath);
        this.setParamSimple(map, prefix + "StderrRedirectPath", this.StderrRedirectPath);
        this.setParamSimple(map, prefix + "StdoutRedirectFileName", this.StdoutRedirectFileName);
        this.setParamSimple(map, prefix + "StderrRedirectFileName", this.StderrRedirectFileName);

    }
}

