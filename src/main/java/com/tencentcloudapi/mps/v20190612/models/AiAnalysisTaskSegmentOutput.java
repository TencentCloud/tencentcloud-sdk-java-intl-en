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

public class AiAnalysisTaskSegmentOutput extends AbstractModel {

    /**
    * Intelligent splitting sub-segment list.
    */
    @SerializedName("SegmentSet")
    @Expose
    private SegmentRecognitionItem [] SegmentSet;

    /**
    * Video abstract, used for offline scenarios.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Abstract")
    @Expose
    private String Abstract;

    /**
     * Get Intelligent splitting sub-segment list. 
     * @return SegmentSet Intelligent splitting sub-segment list.
     */
    public SegmentRecognitionItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set Intelligent splitting sub-segment list.
     * @param SegmentSet Intelligent splitting sub-segment list.
     */
    public void setSegmentSet(SegmentRecognitionItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get Video abstract, used for offline scenarios.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Abstract Video abstract, used for offline scenarios.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAbstract() {
        return this.Abstract;
    }

    /**
     * Set Video abstract, used for offline scenarios.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Abstract Video abstract, used for offline scenarios.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    public AiAnalysisTaskSegmentOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskSegmentOutput(AiAnalysisTaskSegmentOutput source) {
        if (source.SegmentSet != null) {
            this.SegmentSet = new SegmentRecognitionItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new SegmentRecognitionItem(source.SegmentSet[i]);
            }
        }
        if (source.Abstract != null) {
            this.Abstract = new String(source.Abstract);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "Abstract", this.Abstract);

    }
}

