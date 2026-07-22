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

public class AigcVideoTaskOutput extends AbstractModel {

    /**
    * <p>Output file info of the AIGC video task.</p>
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcVideoTaskOutputFileInfo [] FileInfos;

    /**
    * <p>The task ID of the task type Procedure. If a task flow template (Procedure) is specified when initiating <a href="https://www.tencentcloud.com/document/product/266/126239?from_cn_redirect=1">AIGC video task creation</a>, the task is initiated when the task flow template specifies one or more of MediaProcessTask, AiAnalysisTask, or AiRecognitionTask.</p>
    */
    @SerializedName("ProcedureTaskIds")
    @Expose
    private String [] ProcedureTaskIds;

    /**
    * <p>Usage information for AIGC video tasks.</p>
    */
    @SerializedName("Usage")
    @Expose
    private AigcVideoTaskUsage Usage;

    /**
     * Get <p>Output file info of the AIGC video task.</p> 
     * @return FileInfos <p>Output file info of the AIGC video task.</p>
     */
    public AigcVideoTaskOutputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>Output file info of the AIGC video task.</p>
     * @param FileInfos <p>Output file info of the AIGC video task.</p>
     */
    public void setFileInfos(AigcVideoTaskOutputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get <p>The task ID of the task type Procedure. If a task flow template (Procedure) is specified when initiating <a href="https://www.tencentcloud.com/document/product/266/126239?from_cn_redirect=1">AIGC video task creation</a>, the task is initiated when the task flow template specifies one or more of MediaProcessTask, AiAnalysisTask, or AiRecognitionTask.</p> 
     * @return ProcedureTaskIds <p>The task ID of the task type Procedure. If a task flow template (Procedure) is specified when initiating <a href="https://www.tencentcloud.com/document/product/266/126239?from_cn_redirect=1">AIGC video task creation</a>, the task is initiated when the task flow template specifies one or more of MediaProcessTask, AiAnalysisTask, or AiRecognitionTask.</p>
     */
    public String [] getProcedureTaskIds() {
        return this.ProcedureTaskIds;
    }

    /**
     * Set <p>The task ID of the task type Procedure. If a task flow template (Procedure) is specified when initiating <a href="https://www.tencentcloud.com/document/product/266/126239?from_cn_redirect=1">AIGC video task creation</a>, the task is initiated when the task flow template specifies one or more of MediaProcessTask, AiAnalysisTask, or AiRecognitionTask.</p>
     * @param ProcedureTaskIds <p>The task ID of the task type Procedure. If a task flow template (Procedure) is specified when initiating <a href="https://www.tencentcloud.com/document/product/266/126239?from_cn_redirect=1">AIGC video task creation</a>, the task is initiated when the task flow template specifies one or more of MediaProcessTask, AiAnalysisTask, or AiRecognitionTask.</p>
     */
    public void setProcedureTaskIds(String [] ProcedureTaskIds) {
        this.ProcedureTaskIds = ProcedureTaskIds;
    }

    /**
     * Get <p>Usage information for AIGC video tasks.</p> 
     * @return Usage <p>Usage information for AIGC video tasks.</p>
     */
    public AigcVideoTaskUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>Usage information for AIGC video tasks.</p>
     * @param Usage <p>Usage information for AIGC video tasks.</p>
     */
    public void setUsage(AigcVideoTaskUsage Usage) {
        this.Usage = Usage;
    }

    public AigcVideoTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskOutput(AigcVideoTaskOutput source) {
        if (source.FileInfos != null) {
            this.FileInfos = new AigcVideoTaskOutputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcVideoTaskOutputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.ProcedureTaskIds != null) {
            this.ProcedureTaskIds = new String[source.ProcedureTaskIds.length];
            for (int i = 0; i < source.ProcedureTaskIds.length; i++) {
                this.ProcedureTaskIds[i] = new String(source.ProcedureTaskIds[i]);
            }
        }
        if (source.Usage != null) {
            this.Usage = new AigcVideoTaskUsage(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArraySimple(map, prefix + "ProcedureTaskIds.", this.ProcedureTaskIds);
        this.setParamObj(map, prefix + "Usage.", this.Usage);

    }
}

