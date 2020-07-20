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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskCoverOutput extends AbstractModel{

    /**
    * List of intelligently generated covers.
    */
    @SerializedName("CoverSet")
    @Expose
    private MediaAiAnalysisCoverItem [] CoverSet;

    /**
    * Storage location of intelligently generated cover.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get List of intelligently generated covers. 
     * @return CoverSet List of intelligently generated covers.
     */
    public MediaAiAnalysisCoverItem [] getCoverSet() {
        return this.CoverSet;
    }

    /**
     * Set List of intelligently generated covers.
     * @param CoverSet List of intelligently generated covers.
     */
    public void setCoverSet(MediaAiAnalysisCoverItem [] CoverSet) {
        this.CoverSet = CoverSet;
    }

    /**
     * Get Storage location of intelligently generated cover. 
     * @return OutputStorage Storage location of intelligently generated cover.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Storage location of intelligently generated cover.
     * @param OutputStorage Storage location of intelligently generated cover.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CoverSet.", this.CoverSet);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

