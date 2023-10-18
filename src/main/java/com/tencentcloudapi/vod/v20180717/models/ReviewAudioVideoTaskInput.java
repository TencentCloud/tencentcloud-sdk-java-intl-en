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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReviewAudioVideoTaskInput extends AbstractModel {

    /**
    * The ID of the media file.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * The moderation template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * The type of moderated content. Valid values:
<li>`Media`: The original audio/video.</li>
<li>`Cover`: Thumbnails.</li>
    */
    @SerializedName("ReviewContents")
    @Expose
    private String [] ReviewContents;

    /**
     * Get The ID of the media file. 
     * @return FileId The ID of the media file.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The ID of the media file.
     * @param FileId The ID of the media file.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get The moderation template ID. 
     * @return Definition The moderation template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set The moderation template ID.
     * @param Definition The moderation template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get The type of moderated content. Valid values:
<li>`Media`: The original audio/video.</li>
<li>`Cover`: Thumbnails.</li> 
     * @return ReviewContents The type of moderated content. Valid values:
<li>`Media`: The original audio/video.</li>
<li>`Cover`: Thumbnails.</li>
     */
    public String [] getReviewContents() {
        return this.ReviewContents;
    }

    /**
     * Set The type of moderated content. Valid values:
<li>`Media`: The original audio/video.</li>
<li>`Cover`: Thumbnails.</li>
     * @param ReviewContents The type of moderated content. Valid values:
<li>`Media`: The original audio/video.</li>
<li>`Cover`: Thumbnails.</li>
     */
    public void setReviewContents(String [] ReviewContents) {
        this.ReviewContents = ReviewContents;
    }

    public ReviewAudioVideoTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewAudioVideoTaskInput(ReviewAudioVideoTaskInput source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ReviewContents != null) {
            this.ReviewContents = new String[source.ReviewContents.length];
            for (int i = 0; i < source.ReviewContents.length; i++) {
                this.ReviewContents[i] = new String(source.ReviewContents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArraySimple(map, prefix + "ReviewContents.", this.ReviewContents);

    }
}

