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

public class TrackInfo extends AbstractModel {

    /**
    * Audio track and number of sound channels. Description:
When SelectType is track, this value is an integer, for example: 1.
When SelectType is track_channel, this value is of decimal type, for example: 1.0;
Default value: 1.0.
Note: The integer part represents the audio track serial number, and the decimal part represents the sound channel. The audio track serial number is the stream index of the audio track, supporting input of 0 and positive integers. The decimal part supports up to 2 decimal places and is only allowed from 0 to 63. However, if the Codec is aac, eac3, or ac3, the decimal part only supports 0 to 15. For example, for an audio track with stream index 1, 1.0 represents the first sound channel of this audio track, and 1.1 represents the second sound channel of this audio track.
    */
    @SerializedName("TrackNum")
    @Expose
    private String TrackNum;

    /**
    * Sound channel volume, description:
When AudioChannel is set to 1, the array length is 1, for example: [6].
When AudioChannel is set to 2, the array length is 2, for example: [0,6];
When the value of AudioChannel is 6, the length of this array is greater than 2 and less than 16, for example: [-60,0,0,6].
The value array ranges from -60 to 6. Among them, -60 means mute, 0 means keep the original volume, and 6 means double the original volume. The default value is -60.
Note: Supports 3 decimal places.

    */
    @SerializedName("ChannelVolume")
    @Expose
    private Float [] ChannelVolume;

    /**
     * Get Audio track and number of sound channels. Description:
When SelectType is track, this value is an integer, for example: 1.
When SelectType is track_channel, this value is of decimal type, for example: 1.0;
Default value: 1.0.
Note: The integer part represents the audio track serial number, and the decimal part represents the sound channel. The audio track serial number is the stream index of the audio track, supporting input of 0 and positive integers. The decimal part supports up to 2 decimal places and is only allowed from 0 to 63. However, if the Codec is aac, eac3, or ac3, the decimal part only supports 0 to 15. For example, for an audio track with stream index 1, 1.0 represents the first sound channel of this audio track, and 1.1 represents the second sound channel of this audio track. 
     * @return TrackNum Audio track and number of sound channels. Description:
When SelectType is track, this value is an integer, for example: 1.
When SelectType is track_channel, this value is of decimal type, for example: 1.0;
Default value: 1.0.
Note: The integer part represents the audio track serial number, and the decimal part represents the sound channel. The audio track serial number is the stream index of the audio track, supporting input of 0 and positive integers. The decimal part supports up to 2 decimal places and is only allowed from 0 to 63. However, if the Codec is aac, eac3, or ac3, the decimal part only supports 0 to 15. For example, for an audio track with stream index 1, 1.0 represents the first sound channel of this audio track, and 1.1 represents the second sound channel of this audio track.
     */
    public String getTrackNum() {
        return this.TrackNum;
    }

    /**
     * Set Audio track and number of sound channels. Description:
When SelectType is track, this value is an integer, for example: 1.
When SelectType is track_channel, this value is of decimal type, for example: 1.0;
Default value: 1.0.
Note: The integer part represents the audio track serial number, and the decimal part represents the sound channel. The audio track serial number is the stream index of the audio track, supporting input of 0 and positive integers. The decimal part supports up to 2 decimal places and is only allowed from 0 to 63. However, if the Codec is aac, eac3, or ac3, the decimal part only supports 0 to 15. For example, for an audio track with stream index 1, 1.0 represents the first sound channel of this audio track, and 1.1 represents the second sound channel of this audio track.
     * @param TrackNum Audio track and number of sound channels. Description:
When SelectType is track, this value is an integer, for example: 1.
When SelectType is track_channel, this value is of decimal type, for example: 1.0;
Default value: 1.0.
Note: The integer part represents the audio track serial number, and the decimal part represents the sound channel. The audio track serial number is the stream index of the audio track, supporting input of 0 and positive integers. The decimal part supports up to 2 decimal places and is only allowed from 0 to 63. However, if the Codec is aac, eac3, or ac3, the decimal part only supports 0 to 15. For example, for an audio track with stream index 1, 1.0 represents the first sound channel of this audio track, and 1.1 represents the second sound channel of this audio track.
     */
    public void setTrackNum(String TrackNum) {
        this.TrackNum = TrackNum;
    }

    /**
     * Get Sound channel volume, description:
When AudioChannel is set to 1, the array length is 1, for example: [6].
When AudioChannel is set to 2, the array length is 2, for example: [0,6];
When the value of AudioChannel is 6, the length of this array is greater than 2 and less than 16, for example: [-60,0,0,6].
The value array ranges from -60 to 6. Among them, -60 means mute, 0 means keep the original volume, and 6 means double the original volume. The default value is -60.
Note: Supports 3 decimal places.
 
     * @return ChannelVolume Sound channel volume, description:
When AudioChannel is set to 1, the array length is 1, for example: [6].
When AudioChannel is set to 2, the array length is 2, for example: [0,6];
When the value of AudioChannel is 6, the length of this array is greater than 2 and less than 16, for example: [-60,0,0,6].
The value array ranges from -60 to 6. Among them, -60 means mute, 0 means keep the original volume, and 6 means double the original volume. The default value is -60.
Note: Supports 3 decimal places.

     */
    public Float [] getChannelVolume() {
        return this.ChannelVolume;
    }

    /**
     * Set Sound channel volume, description:
When AudioChannel is set to 1, the array length is 1, for example: [6].
When AudioChannel is set to 2, the array length is 2, for example: [0,6];
When the value of AudioChannel is 6, the length of this array is greater than 2 and less than 16, for example: [-60,0,0,6].
The value array ranges from -60 to 6. Among them, -60 means mute, 0 means keep the original volume, and 6 means double the original volume. The default value is -60.
Note: Supports 3 decimal places.

     * @param ChannelVolume Sound channel volume, description:
When AudioChannel is set to 1, the array length is 1, for example: [6].
When AudioChannel is set to 2, the array length is 2, for example: [0,6];
When the value of AudioChannel is 6, the length of this array is greater than 2 and less than 16, for example: [-60,0,0,6].
The value array ranges from -60 to 6. Among them, -60 means mute, 0 means keep the original volume, and 6 means double the original volume. The default value is -60.
Note: Supports 3 decimal places.

     */
    public void setChannelVolume(Float [] ChannelVolume) {
        this.ChannelVolume = ChannelVolume;
    }

    public TrackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrackInfo(TrackInfo source) {
        if (source.TrackNum != null) {
            this.TrackNum = new String(source.TrackNum);
        }
        if (source.ChannelVolume != null) {
            this.ChannelVolume = new Float[source.ChannelVolume.length];
            for (int i = 0; i < source.ChannelVolume.length; i++) {
                this.ChannelVolume[i] = new Float(source.ChannelVolume[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrackNum", this.TrackNum);
        this.setParamArraySimple(map, prefix + "ChannelVolume.", this.ChannelVolume);

    }
}

