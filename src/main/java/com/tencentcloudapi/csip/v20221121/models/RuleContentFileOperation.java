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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleContentFileOperation extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Process")
    @Expose
    private RuleContentProcessInfo Process;

    /**
    * 
    */
    @SerializedName("ParentProcess")
    @Expose
    private RuleContentProcessInfo ParentProcess;

    /**
    * 
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 
    */
    @SerializedName("FileActions")
    @Expose
    private String [] FileActions;

    /**
     * Get  
     * @return Process 
     */
    public RuleContentProcessInfo getProcess() {
        return this.Process;
    }

    /**
     * Set 
     * @param Process 
     */
    public void setProcess(RuleContentProcessInfo Process) {
        this.Process = Process;
    }

    /**
     * Get  
     * @return ParentProcess 
     */
    public RuleContentProcessInfo getParentProcess() {
        return this.ParentProcess;
    }

    /**
     * Set 
     * @param ParentProcess 
     */
    public void setParentProcess(RuleContentProcessInfo ParentProcess) {
        this.ParentProcess = ParentProcess;
    }

    /**
     * Get  
     * @return FilePath 
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 
     * @param FilePath 
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get  
     * @return FileActions 
     */
    public String [] getFileActions() {
        return this.FileActions;
    }

    /**
     * Set 
     * @param FileActions 
     */
    public void setFileActions(String [] FileActions) {
        this.FileActions = FileActions;
    }

    public RuleContentFileOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleContentFileOperation(RuleContentFileOperation source) {
        if (source.Process != null) {
            this.Process = new RuleContentProcessInfo(source.Process);
        }
        if (source.ParentProcess != null) {
            this.ParentProcess = new RuleContentProcessInfo(source.ParentProcess);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileActions != null) {
            this.FileActions = new String[source.FileActions.length];
            for (int i = 0; i < source.FileActions.length; i++) {
                this.FileActions[i] = new String(source.FileActions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Process.", this.Process);
        this.setParamObj(map, prefix + "ParentProcess.", this.ParentProcess);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamArraySimple(map, prefix + "FileActions.", this.FileActions);

    }
}

