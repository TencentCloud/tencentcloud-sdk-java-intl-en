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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioTrackChannelInfo extends AbstractModel {

    /**
    * Whether to enable the feature of multi-audio track mixing. valid values:
0: indicates not enabling multi-audio track mix.
1: Indicates enabling multi-audio track mixing.
Default value: 0

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ChannelsRemix")
    @Expose
    private Long ChannelsRemix;

    /**
    * Set the selector type for the input audio track. valid values:
Track: indicates the usage of audio track id;.
Track_channel: indicates the usage of the audio track id and sound channel id.
Default: track.
If the original video has multiple channels, it is recommended to use track_channel.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SelectType")
    @Expose
    private String SelectType;

    /**
    * Audio track information.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InputTrackInfo")
    @Expose
    private TrackInfo [] InputTrackInfo;

    /**
     * Get Whether to enable the feature of multi-audio track mixing. valid values:
0: indicates not enabling multi-audio track mix.
1: Indicates enabling multi-audio track mixing.
Default value: 0

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ChannelsRemix Whether to enable the feature of multi-audio track mixing. valid values:
0: indicates not enabling multi-audio track mix.
1: Indicates enabling multi-audio track mixing.
Default value: 0

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getChannelsRemix() {
        return this.ChannelsRemix;
    }

    /**
     * Set Whether to enable the feature of multi-audio track mixing. valid values:
0: indicates not enabling multi-audio track mix.
1: Indicates enabling multi-audio track mixing.
Default value: 0

Note: This field may return null, indicating that no valid value can be obtained.
     * @param ChannelsRemix Whether to enable the feature of multi-audio track mixing. valid values:
0: indicates not enabling multi-audio track mix.
1: Indicates enabling multi-audio track mixing.
Default value: 0

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setChannelsRemix(Long ChannelsRemix) {
        this.ChannelsRemix = ChannelsRemix;
    }

    /**
     * Get Set the selector type for the input audio track. valid values:
Track: indicates the usage of audio track id;.
Track_channel: indicates the usage of the audio track id and sound channel id.
Default: track.
If the original video has multiple channels, it is recommended to use track_channel.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SelectType Set the selector type for the input audio track. valid values:
Track: indicates the usage of audio track id;.
Track_channel: indicates the usage of the audio track id and sound channel id.
Default: track.
If the original video has multiple channels, it is recommended to use track_channel.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSelectType() {
        return this.SelectType;
    }

    /**
     * Set Set the selector type for the input audio track. valid values:
Track: indicates the usage of audio track id;.
Track_channel: indicates the usage of the audio track id and sound channel id.
Default: track.
If the original video has multiple channels, it is recommended to use track_channel.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SelectType Set the selector type for the input audio track. valid values:
Track: indicates the usage of audio track id;.
Track_channel: indicates the usage of the audio track id and sound channel id.
Default: track.
If the original video has multiple channels, it is recommended to use track_channel.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSelectType(String SelectType) {
        this.SelectType = SelectType;
    }

    /**
     * Get Audio track information.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InputTrackInfo Audio track information.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TrackInfo [] getInputTrackInfo() {
        return this.InputTrackInfo;
    }

    /**
     * Set Audio track information.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InputTrackInfo Audio track information.
Note: This field may return null, indicating that no valid value can be obtained.
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

