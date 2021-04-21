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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachMediaSubtitlesRequest extends AbstractModel{

    /**
    * Unique ID of the media file
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Operation. Valid values:
<li>`Attach`: associates subtitles.</li>
<li>`Detach`: disassociates subtitles.</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * [Adaptive bitrate streaming template ID](https://intl.cloud.tencent.com/document/product/266/34071?from_cn_redirect=1#zsy)
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * Unique IDs of the subtitles
    */
    @SerializedName("SubtitleIds")
    @Expose
    private String [] SubtitleIds;

    /**
     * Get Unique ID of the media file 
     * @return FileId Unique ID of the media file
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Unique ID of the media file
     * @param FileId Unique ID of the media file
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Operation. Valid values:
<li>`Attach`: associates subtitles.</li>
<li>`Detach`: disassociates subtitles.</li> 
     * @return Operation Operation. Valid values:
<li>`Attach`: associates subtitles.</li>
<li>`Detach`: disassociates subtitles.</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation. Valid values:
<li>`Attach`: associates subtitles.</li>
<li>`Detach`: disassociates subtitles.</li>
     * @param Operation Operation. Valid values:
<li>`Attach`: associates subtitles.</li>
<li>`Detach`: disassociates subtitles.</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get [Adaptive bitrate streaming template ID](https://intl.cloud.tencent.com/document/product/266/34071?from_cn_redirect=1#zsy) 
     * @return AdaptiveDynamicStreamingDefinition [Adaptive bitrate streaming template ID](https://intl.cloud.tencent.com/document/product/266/34071?from_cn_redirect=1#zsy)
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set [Adaptive bitrate streaming template ID](https://intl.cloud.tencent.com/document/product/266/34071?from_cn_redirect=1#zsy)
     * @param AdaptiveDynamicStreamingDefinition [Adaptive bitrate streaming template ID](https://intl.cloud.tencent.com/document/product/266/34071?from_cn_redirect=1#zsy)
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get Unique IDs of the subtitles 
     * @return SubtitleIds Unique IDs of the subtitles
     */
    public String [] getSubtitleIds() {
        return this.SubtitleIds;
    }

    /**
     * Set Unique IDs of the subtitles
     * @param SubtitleIds Unique IDs of the subtitles
     */
    public void setSubtitleIds(String [] SubtitleIds) {
        this.SubtitleIds = SubtitleIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "AdaptiveDynamicStreamingDefinition", this.AdaptiveDynamicStreamingDefinition);
        this.setParamArraySimple(map, prefix + "SubtitleIds.", this.SubtitleIds);

    }
}

