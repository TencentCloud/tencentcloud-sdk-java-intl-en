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

public class MPSAiMediaTask extends AbstractModel {

    /**
    * Template ID of the MPS intelligent task
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * MPS intelligent task output file collection
    */
    @SerializedName("OutputFile")
    @Expose
    private MPSOutputFileInfo [] OutputFile;

    /**
    * Result returned by the MPS intelligent task. This field corresponds to the Output result in the MPS task return, returned in JSON format.
The output result structures of different MPS tasks are different. For the specific return content, see the MPS task output struct.
[Intelligent Classification Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskClassificationOutput)
[Intelligent Cover Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskCoverOutput)
[Intelligent Tag Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskTagOutput)
[Intelligent frame tagging classification result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskFrameTagOutput)
[Intelligent Highlight Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHighlightOutput)
[Video Splitting Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskSegmentOutput)
[Intelligent opening and ending content result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHeadTailOutput)
[Intelligent Summary Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskDescriptionOutput)
[Intelligent Landscape-to-Portrait Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHorizontalToVerticalOutput)
[Intelligent dubbing result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskDubbingOutput)
[Intelligent video understanding result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskVideoComprehensionOutput)
[Full speech recognition result of smart subtitling](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskAsrFullTextResultOutput)
[Intelligent caption translation result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskTransTextResultOutput)
[Translation result of pure subtitle file in smart subtitling](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#PureSubtitleTransResultOutput)
[Smart subtitle text extraction subtitle result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskTextResultOutput)


    */
    @SerializedName("OutputText")
    @Expose
    private String OutputText;

    /**
     * Get Template ID of the MPS intelligent task 
     * @return Definition Template ID of the MPS intelligent task
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Template ID of the MPS intelligent task
     * @param Definition Template ID of the MPS intelligent task
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get MPS intelligent task output file collection 
     * @return OutputFile MPS intelligent task output file collection
     */
    public MPSOutputFileInfo [] getOutputFile() {
        return this.OutputFile;
    }

    /**
     * Set MPS intelligent task output file collection
     * @param OutputFile MPS intelligent task output file collection
     */
    public void setOutputFile(MPSOutputFileInfo [] OutputFile) {
        this.OutputFile = OutputFile;
    }

    /**
     * Get Result returned by the MPS intelligent task. This field corresponds to the Output result in the MPS task return, returned in JSON format.
The output result structures of different MPS tasks are different. For the specific return content, see the MPS task output struct.
[Intelligent Classification Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskClassificationOutput)
[Intelligent Cover Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskCoverOutput)
[Intelligent Tag Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskTagOutput)
[Intelligent frame tagging classification result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskFrameTagOutput)
[Intelligent Highlight Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHighlightOutput)
[Video Splitting Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskSegmentOutput)
[Intelligent opening and ending content result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHeadTailOutput)
[Intelligent Summary Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskDescriptionOutput)
[Intelligent Landscape-to-Portrait Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHorizontalToVerticalOutput)
[Intelligent dubbing result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskDubbingOutput)
[Intelligent video understanding result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskVideoComprehensionOutput)
[Full speech recognition result of smart subtitling](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskAsrFullTextResultOutput)
[Intelligent caption translation result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskTransTextResultOutput)
[Translation result of pure subtitle file in smart subtitling](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#PureSubtitleTransResultOutput)
[Smart subtitle text extraction subtitle result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskTextResultOutput)

 
     * @return OutputText Result returned by the MPS intelligent task. This field corresponds to the Output result in the MPS task return, returned in JSON format.
The output result structures of different MPS tasks are different. For the specific return content, see the MPS task output struct.
[Intelligent Classification Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskClassificationOutput)
[Intelligent Cover Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskCoverOutput)
[Intelligent Tag Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskTagOutput)
[Intelligent frame tagging classification result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskFrameTagOutput)
[Intelligent Highlight Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHighlightOutput)
[Video Splitting Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskSegmentOutput)
[Intelligent opening and ending content result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHeadTailOutput)
[Intelligent Summary Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskDescriptionOutput)
[Intelligent Landscape-to-Portrait Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHorizontalToVerticalOutput)
[Intelligent dubbing result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskDubbingOutput)
[Intelligent video understanding result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskVideoComprehensionOutput)
[Full speech recognition result of smart subtitling](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskAsrFullTextResultOutput)
[Intelligent caption translation result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskTransTextResultOutput)
[Translation result of pure subtitle file in smart subtitling](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#PureSubtitleTransResultOutput)
[Smart subtitle text extraction subtitle result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskTextResultOutput)


     */
    public String getOutputText() {
        return this.OutputText;
    }

    /**
     * Set Result returned by the MPS intelligent task. This field corresponds to the Output result in the MPS task return, returned in JSON format.
The output result structures of different MPS tasks are different. For the specific return content, see the MPS task output struct.
[Intelligent Classification Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskClassificationOutput)
[Intelligent Cover Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskCoverOutput)
[Intelligent Tag Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskTagOutput)
[Intelligent frame tagging classification result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskFrameTagOutput)
[Intelligent Highlight Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHighlightOutput)
[Video Splitting Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskSegmentOutput)
[Intelligent opening and ending content result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHeadTailOutput)
[Intelligent Summary Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskDescriptionOutput)
[Intelligent Landscape-to-Portrait Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHorizontalToVerticalOutput)
[Intelligent dubbing result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskDubbingOutput)
[Intelligent video understanding result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskVideoComprehensionOutput)
[Full speech recognition result of smart subtitling](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskAsrFullTextResultOutput)
[Intelligent caption translation result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskTransTextResultOutput)
[Translation result of pure subtitle file in smart subtitling](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#PureSubtitleTransResultOutput)
[Smart subtitle text extraction subtitle result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskTextResultOutput)


     * @param OutputText Result returned by the MPS intelligent task. This field corresponds to the Output result in the MPS task return, returned in JSON format.
The output result structures of different MPS tasks are different. For the specific return content, see the MPS task output struct.
[Intelligent Classification Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskClassificationOutput)
[Intelligent Cover Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskCoverOutput)
[Intelligent Tag Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskTagOutput)
[Intelligent frame tagging classification result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskFrameTagOutput)
[Intelligent Highlight Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHighlightOutput)
[Video Splitting Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskSegmentOutput)
[Intelligent opening and ending content result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHeadTailOutput)
[Intelligent Summary Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskDescriptionOutput)
[Intelligent Landscape-to-Portrait Result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskHorizontalToVerticalOutput)
[Intelligent dubbing result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskDubbingOutput)
[Intelligent video understanding result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#AiAnalysisTaskVideoComprehensionOutput)
[Full speech recognition result of smart subtitling](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskAsrFullTextResultOutput)
[Intelligent caption translation result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskTransTextResultOutput)
[Translation result of pure subtitle file in smart subtitling](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#PureSubtitleTransResultOutput)
[Smart subtitle text extraction subtitle result](https://www.tencentcloud.com/document/product/862/37615?from_cn_redirect=1#SmartSubtitleTaskTextResultOutput)


     */
    public void setOutputText(String OutputText) {
        this.OutputText = OutputText;
    }

    public MPSAiMediaTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAiMediaTask(MPSAiMediaTask source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.OutputFile != null) {
            this.OutputFile = new MPSOutputFileInfo[source.OutputFile.length];
            for (int i = 0; i < source.OutputFile.length; i++) {
                this.OutputFile[i] = new MPSOutputFileInfo(source.OutputFile[i]);
            }
        }
        if (source.OutputText != null) {
            this.OutputText = new String(source.OutputText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "OutputFile.", this.OutputFile);
        this.setParamSimple(map, prefix + "OutputText", this.OutputText);

    }
}

