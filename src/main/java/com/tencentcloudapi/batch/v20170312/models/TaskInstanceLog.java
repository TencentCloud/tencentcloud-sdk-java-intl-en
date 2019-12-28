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

public class TaskInstanceLog extends AbstractModel{

    /**
    * Task instance
    */
    @SerializedName("TaskInstanceIndex")
    @Expose
    private Long TaskInstanceIndex;

    /**
    * Standard output log (Base64-encoded)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StdoutLog")
    @Expose
    private String StdoutLog;

    /**
    * Standard error log (Base64-encoded)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StderrLog")
    @Expose
    private String StderrLog;

    /**
    * Standard output redirection path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StdoutRedirectPath")
    @Expose
    private String StdoutRedirectPath;

    /**
    * Standard error redirection path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StderrRedirectPath")
    @Expose
    private String StderrRedirectPath;

    /**
    * Standard output redirection file name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StdoutRedirectFileName")
    @Expose
    private String StdoutRedirectFileName;

    /**
    * Standard error redirection file name
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Standard output log (Base64-encoded)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StdoutLog Standard output log (Base64-encoded)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStdoutLog() {
        return this.StdoutLog;
    }

    /**
     * Set Standard output log (Base64-encoded)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StdoutLog Standard output log (Base64-encoded)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStdoutLog(String StdoutLog) {
        this.StdoutLog = StdoutLog;
    }

    /**
     * Get Standard error log (Base64-encoded)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StderrLog Standard error log (Base64-encoded)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStderrLog() {
        return this.StderrLog;
    }

    /**
     * Set Standard error log (Base64-encoded)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StderrLog Standard error log (Base64-encoded)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStderrLog(String StderrLog) {
        this.StderrLog = StderrLog;
    }

    /**
     * Get Standard output redirection path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StdoutRedirectPath Standard output redirection path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStdoutRedirectPath() {
        return this.StdoutRedirectPath;
    }

    /**
     * Set Standard output redirection path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StdoutRedirectPath Standard output redirection path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStdoutRedirectPath(String StdoutRedirectPath) {
        this.StdoutRedirectPath = StdoutRedirectPath;
    }

    /**
     * Get Standard error redirection path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StderrRedirectPath Standard error redirection path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStderrRedirectPath() {
        return this.StderrRedirectPath;
    }

    /**
     * Set Standard error redirection path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StderrRedirectPath Standard error redirection path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStderrRedirectPath(String StderrRedirectPath) {
        this.StderrRedirectPath = StderrRedirectPath;
    }

    /**
     * Get Standard output redirection file name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StdoutRedirectFileName Standard output redirection file name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStdoutRedirectFileName() {
        return this.StdoutRedirectFileName;
    }

    /**
     * Set Standard output redirection file name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StdoutRedirectFileName Standard output redirection file name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStdoutRedirectFileName(String StdoutRedirectFileName) {
        this.StdoutRedirectFileName = StdoutRedirectFileName;
    }

    /**
     * Get Standard error redirection file name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StderrRedirectFileName Standard error redirection file name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStderrRedirectFileName() {
        return this.StderrRedirectFileName;
    }

    /**
     * Set Standard error redirection file name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StderrRedirectFileName Standard error redirection file name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStderrRedirectFileName(String StderrRedirectFileName) {
        this.StderrRedirectFileName = StderrRedirectFileName;
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

