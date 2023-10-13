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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeAudioItem extends AbstractModel{

    /**
    * The media information of the element.
    */
    @SerializedName("SourceMedia")
    @Expose
    private ComposeSourceMedia SourceMedia;

    /**
    * The time of the element in the timeline. If this is not specified, the element will follow the previous element.
    */
    @SerializedName("TrackTime")
    @Expose
    private ComposeTrackTime TrackTime;

    /**
    * The operations performed, such as muting.
    */
    @SerializedName("AudioOperations")
    @Expose
    private ComposeAudioOperation [] AudioOperations;

    /**
     * Get The media information of the element. 
     * @return SourceMedia The media information of the element.
     */
    public ComposeSourceMedia getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set The media information of the element.
     * @param SourceMedia The media information of the element.
     */
    public void setSourceMedia(ComposeSourceMedia SourceMedia) {
        this.SourceMedia = SourceMedia;
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

    /**
     * Get The operations performed, such as muting. 
     * @return AudioOperations The operations performed, such as muting.
     */
    public ComposeAudioOperation [] getAudioOperations() {
        return this.AudioOperations;
    }

    /**
     * Set The operations performed, such as muting.
     * @param AudioOperations The operations performed, such as muting.
     */
    public void setAudioOperations(ComposeAudioOperation [] AudioOperations) {
        this.AudioOperations = AudioOperations;
    }

    public ComposeAudioItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeAudioItem(ComposeAudioItem source) {
        if (source.SourceMedia != null) {
            this.SourceMedia = new ComposeSourceMedia(source.SourceMedia);
        }
        if (source.TrackTime != null) {
            this.TrackTime = new ComposeTrackTime(source.TrackTime);
        }
        if (source.AudioOperations != null) {
            this.AudioOperations = new ComposeAudioOperation[source.AudioOperations.length];
            for (int i = 0; i < source.AudioOperations.length; i++) {
                this.AudioOperations[i] = new ComposeAudioOperation(source.AudioOperations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SourceMedia.", this.SourceMedia);
        this.setParamObj(map, prefix + "TrackTime.", this.TrackTime);
        this.setParamArrayObj(map, prefix + "AudioOperations.", this.AudioOperations);

    }
}

