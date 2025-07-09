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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileTamperRule extends AbstractModel {

    /**
    * Process path
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * Accessed file path
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Recommended action: skip: skip; alarm: alert
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Monitoring behavior
<li>read: read file</li>
<li>write: modify file</li>
<li>read-write: read and modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileAction")
    @Expose
    private String FileAction;

    /**
     * Get Process path 
     * @return ProcessPath Process path
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set Process path
     * @param ProcessPath Process path
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get Accessed file path 
     * @return Target Accessed file path
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Accessed file path
     * @param Target Accessed file path
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Recommended action: skip: skip; alarm: alert 
     * @return Action Recommended action: skip: skip; alarm: alert
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Recommended action: skip: skip; alarm: alert
     * @param Action Recommended action: skip: skip; alarm: alert
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Monitoring behavior
<li>read: read file</li>
<li>write: modify file</li>
<li>read-write: read and modify file</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileAction Monitoring behavior
<li>read: read file</li>
<li>write: modify file</li>
<li>read-write: read and modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileAction() {
        return this.FileAction;
    }

    /**
     * Set Monitoring behavior
<li>read: read file</li>
<li>write: modify file</li>
<li>read-write: read and modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileAction Monitoring behavior
<li>read: read file</li>
<li>write: modify file</li>
<li>read-write: read and modify file</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileAction(String FileAction) {
        this.FileAction = FileAction;
    }

    public FileTamperRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileTamperRule(FileTamperRule source) {
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.FileAction != null) {
            this.FileAction = new String(source.FileAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "FileAction", this.FileAction);

    }
}

