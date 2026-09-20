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

public class RoundPlayListItemInfo extends AbstractModel {

    /**
    * Media file identifier.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Played audio and video type. Available values:
<li>Transcode: transcoding output. There will be multiple templates for transcoding output, and the Definition field must be specified.</li>
<li>Original: original audio/video.</li>
The format of Type must be HLS format.
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * Program ID assigned by the system.
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * Specify the transcoding template for playback. This parameter is required when AudioVideoType is Transcode.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
     * Get Media file identifier. 
     * @return FileId Media file identifier.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file identifier.
     * @param FileId Media file identifier.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Played audio and video type. Available values:
<li>Transcode: transcoding output. There will be multiple templates for transcoding output, and the Definition field must be specified.</li>
<li>Original: original audio/video.</li>
The format of Type must be HLS format. 
     * @return AudioVideoType Played audio and video type. Available values:
<li>Transcode: transcoding output. There will be multiple templates for transcoding output, and the Definition field must be specified.</li>
<li>Original: original audio/video.</li>
The format of Type must be HLS format.
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set Played audio and video type. Available values:
<li>Transcode: transcoding output. There will be multiple templates for transcoding output, and the Definition field must be specified.</li>
<li>Original: original audio/video.</li>
The format of Type must be HLS format.
     * @param AudioVideoType Played audio and video type. Available values:
<li>Transcode: transcoding output. There will be multiple templates for transcoding output, and the Definition field must be specified.</li>
<li>Original: original audio/video.</li>
The format of Type must be HLS format.
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get Program ID assigned by the system. 
     * @return ItemId Program ID assigned by the system.
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set Program ID assigned by the system.
     * @param ItemId Program ID assigned by the system.
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Specify the transcoding template for playback. This parameter is required when AudioVideoType is Transcode. 
     * @return Definition Specify the transcoding template for playback. This parameter is required when AudioVideoType is Transcode.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Specify the transcoding template for playback. This parameter is required when AudioVideoType is Transcode.
     * @param Definition Specify the transcoding template for playback. This parameter is required when AudioVideoType is Transcode.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    public RoundPlayListItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoundPlayListItemInfo(RoundPlayListItemInfo source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.AudioVideoType != null) {
            this.AudioVideoType = new String(source.AudioVideoType);
        }
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "AudioVideoType", this.AudioVideoType);
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}

