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

public class ComposeSubtitleItem extends AbstractModel {

    /**
    * The subtitle style ID, which corresponds to the `Id` field of `ComposeStyles`.
    */
    @SerializedName("StyleId")
    @Expose
    private String StyleId;

    /**
    * Subtitle text. note: long text may exceed the frame. recommend using \n for line breaks.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * The time of the element in the timeline. If this is not specified, the element will follow the previous element.	
    */
    @SerializedName("TrackTime")
    @Expose
    private ComposeTrackTime TrackTime;

    /**
     * Get The subtitle style ID, which corresponds to the `Id` field of `ComposeStyles`. 
     * @return StyleId The subtitle style ID, which corresponds to the `Id` field of `ComposeStyles`.
     */
    public String getStyleId() {
        return this.StyleId;
    }

    /**
     * Set The subtitle style ID, which corresponds to the `Id` field of `ComposeStyles`.
     * @param StyleId The subtitle style ID, which corresponds to the `Id` field of `ComposeStyles`.
     */
    public void setStyleId(String StyleId) {
        this.StyleId = StyleId;
    }

    /**
     * Get Subtitle text. note: long text may exceed the frame. recommend using \n for line breaks. 
     * @return Text Subtitle text. note: long text may exceed the frame. recommend using \n for line breaks.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Subtitle text. note: long text may exceed the frame. recommend using \n for line breaks.
     * @param Text Subtitle text. note: long text may exceed the frame. recommend using \n for line breaks.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get The time of the element in the timeline. If this is not specified, the element will follow the previous element.	 
     * @return TrackTime The time of the element in the timeline. If this is not specified, the element will follow the previous element.	
     */
    public ComposeTrackTime getTrackTime() {
        return this.TrackTime;
    }

    /**
     * Set The time of the element in the timeline. If this is not specified, the element will follow the previous element.	
     * @param TrackTime The time of the element in the timeline. If this is not specified, the element will follow the previous element.	
     */
    public void setTrackTime(ComposeTrackTime TrackTime) {
        this.TrackTime = TrackTime;
    }

    public ComposeSubtitleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeSubtitleItem(ComposeSubtitleItem source) {
        if (source.StyleId != null) {
            this.StyleId = new String(source.StyleId);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TrackTime != null) {
            this.TrackTime = new ComposeTrackTime(source.TrackTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StyleId", this.StyleId);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "TrackTime.", this.TrackTime);

    }
}

