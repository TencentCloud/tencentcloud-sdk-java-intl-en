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

public class EditMediaFileInfo extends AbstractModel {

    /**
    * Video input information.
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * The start offset (seconds) for video clipping. This parameter is valid for video clipping tasks.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * The end offset (seconds) for video clipping. This parameter is valid for video clipping tasks.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * The ID of the material associated with an element. This parameter is required for video compositing tasks.

Note: The ID can be up to 32 characters long and can contain letters, digits, and special characters -_
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Video input information. 
     * @return InputInfo Video input information.
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set Video input information.
     * @param InputInfo Video input information.
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get The start offset (seconds) for video clipping. This parameter is valid for video clipping tasks. 
     * @return StartTimeOffset The start offset (seconds) for video clipping. This parameter is valid for video clipping tasks.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set The start offset (seconds) for video clipping. This parameter is valid for video clipping tasks.
     * @param StartTimeOffset The start offset (seconds) for video clipping. This parameter is valid for video clipping tasks.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get The end offset (seconds) for video clipping. This parameter is valid for video clipping tasks. 
     * @return EndTimeOffset The end offset (seconds) for video clipping. This parameter is valid for video clipping tasks.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set The end offset (seconds) for video clipping. This parameter is valid for video clipping tasks.
     * @param EndTimeOffset The end offset (seconds) for video clipping. This parameter is valid for video clipping tasks.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get The ID of the material associated with an element. This parameter is required for video compositing tasks.

Note: The ID can be up to 32 characters long and can contain letters, digits, and special characters -_
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id The ID of the material associated with an element. This parameter is required for video compositing tasks.

Note: The ID can be up to 32 characters long and can contain letters, digits, and special characters -_
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The ID of the material associated with an element. This parameter is required for video compositing tasks.

Note: The ID can be up to 32 characters long and can contain letters, digits, and special characters -_
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id The ID of the material associated with an element. This parameter is required for video compositing tasks.

Note: The ID can be up to 32 characters long and can contain letters, digits, and special characters -_
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public EditMediaFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaFileInfo(EditMediaFileInfo source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

