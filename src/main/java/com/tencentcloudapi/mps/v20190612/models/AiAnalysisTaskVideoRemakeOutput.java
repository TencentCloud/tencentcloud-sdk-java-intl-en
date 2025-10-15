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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskVideoRemakeOutput extends AbstractModel {

    /**
    * Specifies the file path for intelligent video deduplication.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Specifies the storage location for intelligent video deduplication.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get Specifies the file path for intelligent video deduplication. 
     * @return Path Specifies the file path for intelligent video deduplication.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Specifies the file path for intelligent video deduplication.
     * @param Path Specifies the file path for intelligent video deduplication.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Specifies the storage location for intelligent video deduplication. 
     * @return OutputStorage Specifies the storage location for intelligent video deduplication.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Specifies the storage location for intelligent video deduplication.
     * @param OutputStorage Specifies the storage location for intelligent video deduplication.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public AiAnalysisTaskVideoRemakeOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskVideoRemakeOutput(AiAnalysisTaskVideoRemakeOutput source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

