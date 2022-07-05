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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuAudioParams extends AbstractModel{

    /**
    * The audio encoding parameters.
    */
    @SerializedName("AudioEncode")
    @Expose
    private AudioEncode AudioEncode;

    /**
    * The users whose audios are mixed. For the `StartPublishCdnStream` API, if you do not pass this parameter or leave it empty, the audios of all anchors will be mixed. For the `UpdatePublishCdnStream` API, if you do not pass this parameter, TRTC will not change the users whose audios are mixed; if you pass in an empty string, the audios of all anchors will be mixed.
    */
    @SerializedName("SubscribeAudioList")
    @Expose
    private McuUserInfoParams [] SubscribeAudioList;

    /**
     * Get The audio encoding parameters. 
     * @return AudioEncode The audio encoding parameters.
     */
    public AudioEncode getAudioEncode() {
        return this.AudioEncode;
    }

    /**
     * Set The audio encoding parameters.
     * @param AudioEncode The audio encoding parameters.
     */
    public void setAudioEncode(AudioEncode AudioEncode) {
        this.AudioEncode = AudioEncode;
    }

    /**
     * Get The users whose audios are mixed. For the `StartPublishCdnStream` API, if you do not pass this parameter or leave it empty, the audios of all anchors will be mixed. For the `UpdatePublishCdnStream` API, if you do not pass this parameter, TRTC will not change the users whose audios are mixed; if you pass in an empty string, the audios of all anchors will be mixed. 
     * @return SubscribeAudioList The users whose audios are mixed. For the `StartPublishCdnStream` API, if you do not pass this parameter or leave it empty, the audios of all anchors will be mixed. For the `UpdatePublishCdnStream` API, if you do not pass this parameter, TRTC will not change the users whose audios are mixed; if you pass in an empty string, the audios of all anchors will be mixed.
     */
    public McuUserInfoParams [] getSubscribeAudioList() {
        return this.SubscribeAudioList;
    }

    /**
     * Set The users whose audios are mixed. For the `StartPublishCdnStream` API, if you do not pass this parameter or leave it empty, the audios of all anchors will be mixed. For the `UpdatePublishCdnStream` API, if you do not pass this parameter, TRTC will not change the users whose audios are mixed; if you pass in an empty string, the audios of all anchors will be mixed.
     * @param SubscribeAudioList The users whose audios are mixed. For the `StartPublishCdnStream` API, if you do not pass this parameter or leave it empty, the audios of all anchors will be mixed. For the `UpdatePublishCdnStream` API, if you do not pass this parameter, TRTC will not change the users whose audios are mixed; if you pass in an empty string, the audios of all anchors will be mixed.
     */
    public void setSubscribeAudioList(McuUserInfoParams [] SubscribeAudioList) {
        this.SubscribeAudioList = SubscribeAudioList;
    }

    public McuAudioParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuAudioParams(McuAudioParams source) {
        if (source.AudioEncode != null) {
            this.AudioEncode = new AudioEncode(source.AudioEncode);
        }
        if (source.SubscribeAudioList != null) {
            this.SubscribeAudioList = new McuUserInfoParams[source.SubscribeAudioList.length];
            for (int i = 0; i < source.SubscribeAudioList.length; i++) {
                this.SubscribeAudioList[i] = new McuUserInfoParams(source.SubscribeAudioList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AudioEncode.", this.AudioEncode);
        this.setParamArrayObj(map, prefix + "SubscribeAudioList.", this.SubscribeAudioList);

    }
}

