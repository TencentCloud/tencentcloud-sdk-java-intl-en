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

public class AiAnalysisTaskHighlightOutput extends AbstractModel{

    /**
    * A list of the highlight segments generated.
    */
    @SerializedName("HighlightSet")
    @Expose
    private MediaAiAnalysisHighlightItem [] HighlightSet;

    /**
    * The storage location of the highlight segments.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get A list of the highlight segments generated. 
     * @return HighlightSet A list of the highlight segments generated.
     */
    public MediaAiAnalysisHighlightItem [] getHighlightSet() {
        return this.HighlightSet;
    }

    /**
     * Set A list of the highlight segments generated.
     * @param HighlightSet A list of the highlight segments generated.
     */
    public void setHighlightSet(MediaAiAnalysisHighlightItem [] HighlightSet) {
        this.HighlightSet = HighlightSet;
    }

    /**
     * Get The storage location of the highlight segments.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OutputStorage The storage location of the highlight segments.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set The storage location of the highlight segments.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OutputStorage The storage location of the highlight segments.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public AiAnalysisTaskHighlightOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskHighlightOutput(AiAnalysisTaskHighlightOutput source) {
        if (source.HighlightSet != null) {
            this.HighlightSet = new MediaAiAnalysisHighlightItem[source.HighlightSet.length];
            for (int i = 0; i < source.HighlightSet.length; i++) {
                this.HighlightSet[i] = new MediaAiAnalysisHighlightItem(source.HighlightSet[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HighlightSet.", this.HighlightSet);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

