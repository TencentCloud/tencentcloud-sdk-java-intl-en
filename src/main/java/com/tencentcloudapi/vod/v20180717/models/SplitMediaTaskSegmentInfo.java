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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SplitMediaTaskSegmentInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Input")
    @Expose
    private SplitMediaTaskInput Input;

    /**
    * 
    */
    @SerializedName("Output")
    @Expose
    private TaskOutputMediaInfo Output;

    /**
    * 
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
    * 
    */
    @SerializedName("ReviewAudioVideoTaskId")
    @Expose
    private String ReviewAudioVideoTaskId;

    /**
     * Get  
     * @return Input 
     */
    public SplitMediaTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set 
     * @param Input 
     */
    public void setInput(SplitMediaTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get  
     * @return Output 
     */
    public TaskOutputMediaInfo getOutput() {
        return this.Output;
    }

    /**
     * Set 
     * @param Output 
     */
    public void setOutput(TaskOutputMediaInfo Output) {
        this.Output = Output;
    }

    /**
     * Get  
     * @return ProcedureTaskId 
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set 
     * @param ProcedureTaskId 
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * Get  
     * @return ReviewAudioVideoTaskId 
     */
    public String getReviewAudioVideoTaskId() {
        return this.ReviewAudioVideoTaskId;
    }

    /**
     * Set 
     * @param ReviewAudioVideoTaskId 
     */
    public void setReviewAudioVideoTaskId(String ReviewAudioVideoTaskId) {
        this.ReviewAudioVideoTaskId = ReviewAudioVideoTaskId;
    }

    public SplitMediaTaskSegmentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SplitMediaTaskSegmentInfo(SplitMediaTaskSegmentInfo source) {
        if (source.Input != null) {
            this.Input = new SplitMediaTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new TaskOutputMediaInfo(source.Output);
        }
        if (source.ProcedureTaskId != null) {
            this.ProcedureTaskId = new String(source.ProcedureTaskId);
        }
        if (source.ReviewAudioVideoTaskId != null) {
            this.ReviewAudioVideoTaskId = new String(source.ReviewAudioVideoTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);
        this.setParamSimple(map, prefix + "ReviewAudioVideoTaskId", this.ReviewAudioVideoTaskId);

    }
}

