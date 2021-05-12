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

public class EditMediaFileInfo extends AbstractModel{

    /**
    * Video ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Start time offset of video clipping in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of video clipping in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get Video ID. 
     * @return FileId Video ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Video ID.
     * @param FileId Video ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Start time offset of video clipping in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StartTimeOffset Start time offset of video clipping in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of video clipping in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StartTimeOffset Start time offset of video clipping in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of video clipping in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EndTimeOffset End time offset of video clipping in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of video clipping in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EndTimeOffset End time offset of video clipping in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public EditMediaFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaFileInfo(EditMediaFileInfo source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

