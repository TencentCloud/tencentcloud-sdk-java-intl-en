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

public class TrackInfo extends AbstractModel {

    /**
    * Audio track and sound channel serial number, description:
When the SelectType value is trask, this value is of the integer type, for example: 1.
When the SelectType value is trask_channel, this value is of the decimal type, for example: 1.0.
Default value: `1.0`.
The integer part represents the audio track serial number, and the decimal part represents the sound channel. The audio track serial number is the stream index of the audio track, and input of 0 and positive integers is supported. The decimal part supports up to 2 decimal places, and only 0 - 63 is supported. However, when the Codec is aac/eac3/ac3, only 0 - 15 is supported for the decimal part. For example: for an audio track with a stream index of 1, 1.0 represents the first sound channel of this audio track, and 1.1 represents the second sound channel of this audio track.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TrackNum")
    @Expose
    private String TrackNum;

    /**
    * Sound channel volume. specifies the volume of the sound channel.
When the value of AudioChannel is 1, the value length is 1.
When the value of AudioChannel is 2, the value length is 2.
When the value of AudioChannel is 6, the length of this value is greater than 2.
The array value of this parameter has a valid value range of [-60, 6]. among them, -60 indicates mute, 0 indicates keeping the original volume, and 6 means doubling the original volume. the default value is -60.
Supports 3 decimal places.

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ChannelVolume")
    @Expose
    private Float [] ChannelVolume;

    /**
     * Get Audio track and sound channel serial number, description:
When the SelectType value is trask, this value is of the integer type, for example: 1.
When the SelectType value is trask_channel, this value is of the decimal type, for example: 1.0.
Default value: `1.0`.
The integer part represents the audio track serial number, and the decimal part represents the sound channel. The audio track serial number is the stream index of the audio track, and input of 0 and positive integers is supported. The decimal part supports up to 2 decimal places, and only 0 - 63 is supported. However, when the Codec is aac/eac3/ac3, only 0 - 15 is supported for the decimal part. For example: for an audio track with a stream index of 1, 1.0 represents the first sound channel of this audio track, and 1.1 represents the second sound channel of this audio track.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TrackNum Audio track and sound channel serial number, description:
When the SelectType value is trask, this value is of the integer type, for example: 1.
When the SelectType value is trask_channel, this value is of the decimal type, for example: 1.0.
Default value: `1.0`.
The integer part represents the audio track serial number, and the decimal part represents the sound channel. The audio track serial number is the stream index of the audio track, and input of 0 and positive integers is supported. The decimal part supports up to 2 decimal places, and only 0 - 63 is supported. However, when the Codec is aac/eac3/ac3, only 0 - 15 is supported for the decimal part. For example: for an audio track with a stream index of 1, 1.0 represents the first sound channel of this audio track, and 1.1 represents the second sound channel of this audio track.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTrackNum() {
        return this.TrackNum;
    }

    /**
     * Set Audio track and sound channel serial number, description:
When the SelectType value is trask, this value is of the integer type, for example: 1.
When the SelectType value is trask_channel, this value is of the decimal type, for example: 1.0.
Default value: `1.0`.
The integer part represents the audio track serial number, and the decimal part represents the sound channel. The audio track serial number is the stream index of the audio track, and input of 0 and positive integers is supported. The decimal part supports up to 2 decimal places, and only 0 - 63 is supported. However, when the Codec is aac/eac3/ac3, only 0 - 15 is supported for the decimal part. For example: for an audio track with a stream index of 1, 1.0 represents the first sound channel of this audio track, and 1.1 represents the second sound channel of this audio track.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TrackNum Audio track and sound channel serial number, description:
When the SelectType value is trask, this value is of the integer type, for example: 1.
When the SelectType value is trask_channel, this value is of the decimal type, for example: 1.0.
Default value: `1.0`.
The integer part represents the audio track serial number, and the decimal part represents the sound channel. The audio track serial number is the stream index of the audio track, and input of 0 and positive integers is supported. The decimal part supports up to 2 decimal places, and only 0 - 63 is supported. However, when the Codec is aac/eac3/ac3, only 0 - 15 is supported for the decimal part. For example: for an audio track with a stream index of 1, 1.0 represents the first sound channel of this audio track, and 1.1 represents the second sound channel of this audio track.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTrackNum(String TrackNum) {
        this.TrackNum = TrackNum;
    }

    /**
     * Get Sound channel volume. specifies the volume of the sound channel.
When the value of AudioChannel is 1, the value length is 1.
When the value of AudioChannel is 2, the value length is 2.
When the value of AudioChannel is 6, the length of this value is greater than 2.
The array value of this parameter has a valid value range of [-60, 6]. among them, -60 indicates mute, 0 indicates keeping the original volume, and 6 means doubling the original volume. the default value is -60.
Supports 3 decimal places.

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ChannelVolume Sound channel volume. specifies the volume of the sound channel.
When the value of AudioChannel is 1, the value length is 1.
When the value of AudioChannel is 2, the value length is 2.
When the value of AudioChannel is 6, the length of this value is greater than 2.
The array value of this parameter has a valid value range of [-60, 6]. among them, -60 indicates mute, 0 indicates keeping the original volume, and 6 means doubling the original volume. the default value is -60.
Supports 3 decimal places.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float [] getChannelVolume() {
        return this.ChannelVolume;
    }

    /**
     * Set Sound channel volume. specifies the volume of the sound channel.
When the value of AudioChannel is 1, the value length is 1.
When the value of AudioChannel is 2, the value length is 2.
When the value of AudioChannel is 6, the length of this value is greater than 2.
The array value of this parameter has a valid value range of [-60, 6]. among them, -60 indicates mute, 0 indicates keeping the original volume, and 6 means doubling the original volume. the default value is -60.
Supports 3 decimal places.

Note: This field may return null, indicating that no valid value can be obtained.
     * @param ChannelVolume Sound channel volume. specifies the volume of the sound channel.
When the value of AudioChannel is 1, the value length is 1.
When the value of AudioChannel is 2, the value length is 2.
When the value of AudioChannel is 6, the length of this value is greater than 2.
The array value of this parameter has a valid value range of [-60, 6]. among them, -60 indicates mute, 0 indicates keeping the original volume, and 6 means doubling the original volume. the default value is -60.
Supports 3 decimal places.

Note: This field may return null, indicating that no valid value can be obtained.
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

