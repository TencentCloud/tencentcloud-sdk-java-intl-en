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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskTypeNotebookExt extends AbstractModel {

    /**
    * <p>SCRIPT SOURCE. Value: SCRIPT_SOURCE_LOCAL (LOCAL) / SCRIPT_SOURCE_GIT (GIT repository) /<br>SCRIPT_SOURCE_CFS (CFS file system) / SCRIPT_SOURCE_COS (cloud object storage) /<br>SCRIPT_SOURCE_WORKSPACE (WORKSPACE)</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>For frontend display usage, meaningless to the execution platform</p>
    */
    @SerializedName("DisplayPath")
    @Expose
    private String DisplayPath;

    /**
    * <p>Notebook relative path</p>
    */
    @SerializedName("NotebookPath")
    @Expose
    private String NotebookPath;

    /**
    * <p>Notebook absolute path</p>
    */
    @SerializedName("NotebookAbsolutePath")
    @Expose
    private String NotebookAbsolutePath;

    /**
     * Get <p>SCRIPT SOURCE. Value: SCRIPT_SOURCE_LOCAL (LOCAL) / SCRIPT_SOURCE_GIT (GIT repository) /<br>SCRIPT_SOURCE_CFS (CFS file system) / SCRIPT_SOURCE_COS (cloud object storage) /<br>SCRIPT_SOURCE_WORKSPACE (WORKSPACE)</p> 
     * @return Source <p>SCRIPT SOURCE. Value: SCRIPT_SOURCE_LOCAL (LOCAL) / SCRIPT_SOURCE_GIT (GIT repository) /<br>SCRIPT_SOURCE_CFS (CFS file system) / SCRIPT_SOURCE_COS (cloud object storage) /<br>SCRIPT_SOURCE_WORKSPACE (WORKSPACE)</p>
     * @deprecated
     */
    @Deprecated
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>SCRIPT SOURCE. Value: SCRIPT_SOURCE_LOCAL (LOCAL) / SCRIPT_SOURCE_GIT (GIT repository) /<br>SCRIPT_SOURCE_CFS (CFS file system) / SCRIPT_SOURCE_COS (cloud object storage) /<br>SCRIPT_SOURCE_WORKSPACE (WORKSPACE)</p>
     * @param Source <p>SCRIPT SOURCE. Value: SCRIPT_SOURCE_LOCAL (LOCAL) / SCRIPT_SOURCE_GIT (GIT repository) /<br>SCRIPT_SOURCE_CFS (CFS file system) / SCRIPT_SOURCE_COS (cloud object storage) /<br>SCRIPT_SOURCE_WORKSPACE (WORKSPACE)</p>
     * @deprecated
     */
    @Deprecated
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>For frontend display usage, meaningless to the execution platform</p> 
     * @return DisplayPath <p>For frontend display usage, meaningless to the execution platform</p>
     * @deprecated
     */
    @Deprecated
    public String getDisplayPath() {
        return this.DisplayPath;
    }

    /**
     * Set <p>For frontend display usage, meaningless to the execution platform</p>
     * @param DisplayPath <p>For frontend display usage, meaningless to the execution platform</p>
     * @deprecated
     */
    @Deprecated
    public void setDisplayPath(String DisplayPath) {
        this.DisplayPath = DisplayPath;
    }

    /**
     * Get <p>Notebook relative path</p> 
     * @return NotebookPath <p>Notebook relative path</p>
     * @deprecated
     */
    @Deprecated
    public String getNotebookPath() {
        return this.NotebookPath;
    }

    /**
     * Set <p>Notebook relative path</p>
     * @param NotebookPath <p>Notebook relative path</p>
     * @deprecated
     */
    @Deprecated
    public void setNotebookPath(String NotebookPath) {
        this.NotebookPath = NotebookPath;
    }

    /**
     * Get <p>Notebook absolute path</p> 
     * @return NotebookAbsolutePath <p>Notebook absolute path</p>
     * @deprecated
     */
    @Deprecated
    public String getNotebookAbsolutePath() {
        return this.NotebookAbsolutePath;
    }

    /**
     * Set <p>Notebook absolute path</p>
     * @param NotebookAbsolutePath <p>Notebook absolute path</p>
     * @deprecated
     */
    @Deprecated
    public void setNotebookAbsolutePath(String NotebookAbsolutePath) {
        this.NotebookAbsolutePath = NotebookAbsolutePath;
    }

    public TaskTypeNotebookExt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTypeNotebookExt(TaskTypeNotebookExt source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.DisplayPath != null) {
            this.DisplayPath = new String(source.DisplayPath);
        }
        if (source.NotebookPath != null) {
            this.NotebookPath = new String(source.NotebookPath);
        }
        if (source.NotebookAbsolutePath != null) {
            this.NotebookAbsolutePath = new String(source.NotebookAbsolutePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "DisplayPath", this.DisplayPath);
        this.setParamSimple(map, prefix + "NotebookPath", this.NotebookPath);
        this.setParamSimple(map, prefix + "NotebookAbsolutePath", this.NotebookAbsolutePath);

    }
}

