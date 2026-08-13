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

public class AudioTrackChannelInfo extends AbstractModel {

    /**
    * Whether audio mixing is enabled. Value range:
0: Disable audio mixing
1: Enable audio mixing
Default value: 0
    */
    @SerializedName("ChannelsRemix")
    @Expose
    private Long ChannelsRemix;

    /**
    * Merge audio track input type, available values:
track: Indicates usage of the audio track id.
track_channel: Indicates usage of audio track id and sound channel id.
Default: track.
Note: If the original video is multichannel, recommend using track_channel.
    */
    @SerializedName("SelectType")
    @Expose
    private String SelectType;

    /**
    * Audio track info
    */
    @SerializedName("InputTrackInfo")
    @Expose
    private TrackInfo [] InputTrackInfo;

    /**
     * Get Whether audio mixing is enabled. Value range:
0: Disable audio mixing
1: Enable audio mixing
Default value: 0 
     * @return ChannelsRemix Whether audio mixing is enabled. Value range:
0: Disable audio mixing
1: Enable audio mixing
Default value: 0
     */
    public Long getChannelsRemix() {
        return this.ChannelsRemix;
    }

    /**
     * Set Whether audio mixing is enabled. Value range:
0: Disable audio mixing
1: Enable audio mixing
Default value: 0
     * @param ChannelsRemix Whether audio mixing is enabled. Value range:
0: Disable audio mixing
1: Enable audio mixing
Default value: 0
     */
    public void setChannelsRemix(Long ChannelsRemix) {
        this.ChannelsRemix = ChannelsRemix;
    }

    /**
     * Get Merge audio track input type, available values:
track: Indicates usage of the audio track id.
track_channel: Indicates usage of audio track id and sound channel id.
Default: track.
Note: If the original video is multichannel, recommend using track_channel. 
     * @return SelectType Merge audio track input type, available values:
track: Indicates usage of the audio track id.
track_channel: Indicates usage of audio track id and sound channel id.
Default: track.
Note: If the original video is multichannel, recommend using track_channel.
     */
    public String getSelectType() {
        return this.SelectType;
    }

    /**
     * Set Merge audio track input type, available values:
track: Indicates usage of the audio track id.
track_channel: Indicates usage of audio track id and sound channel id.
Default: track.
Note: If the original video is multichannel, recommend using track_channel.
     * @param SelectType Merge audio track input type, available values:
track: Indicates usage of the audio track id.
track_channel: Indicates usage of audio track id and sound channel id.
Default: track.
Note: If the original video is multichannel, recommend using track_channel.
     */
    public void setSelectType(String SelectType) {
        this.SelectType = SelectType;
    }

    /**
     * Get Audio track info 
     * @return InputTrackInfo Audio track info
     */
    public TrackInfo [] getInputTrackInfo() {
        return this.InputTrackInfo;
    }

    /**
     * Set Audio track info
     * @param InputTrackInfo Audio track info
     */
    public void setInputTrackInfo(TrackInfo [] InputTrackInfo) {
        this.InputTrackInfo = InputTrackInfo;
    }

    public AudioTrackChannelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTrackChannelInfo(AudioTrackChannelInfo source) {
        if (source.ChannelsRemix != null) {
            this.ChannelsRemix = new Long(source.ChannelsRemix);
        }
        if (source.SelectType != null) {
            this.SelectType = new String(source.SelectType);
        }
        if (source.InputTrackInfo != null) {
            this.InputTrackInfo = new TrackInfo[source.InputTrackInfo.length];
            for (int i = 0; i < source.InputTrackInfo.length; i++) {
                this.InputTrackInfo[i] = new TrackInfo(source.InputTrackInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelsRemix", this.ChannelsRemix);
        this.setParamSimple(map, prefix + "SelectType", this.SelectType);
        this.setParamArrayObj(map, prefix + "InputTrackInfo.", this.InputTrackInfo);

    }
}

