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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeStreamUserIds extends AbstractModel {

    /**
    * The allowlist for audio subscription. For example, `["1", "2", "3"]` means to only subscribe to the audios of users 1, 2, and 3, and ["1.*$"] means to only subscribe to the audios of users whose ID prefix is `1`. If this parameter is left empty, the audios of all anchors in the room will be received. The array can contain at most 32 elements.
    */
    @SerializedName("SubscribeAudioUserIds")
    @Expose
    private String [] SubscribeAudioUserIds;

    /**
    * The blocklist for audio subscription. For example, `["1", "2", "3"]` means to not subscribe to the audios of users 1, 2, and 3, and `["1.*$"]` means to not subscribe to users whose ID prefix is `1`. If this parameter is left empty, the audios of all anchors in the room will be received. The array can contain at most 32 elements.
    */
    @SerializedName("UnSubscribeAudioUserIds")
    @Expose
    private String [] UnSubscribeAudioUserIds;

    /**
    * The allowlist for video subscription. For example, `["1", "2", "3"]` means to only subscribe to the videos of users 1, 2, and 3, and `["1.*$"]` means to only subscribe to the videos of users whose ID prefix is `1`. If this parameter is left empty, the videos of all anchors in the room will be received. The array can contain at most 32 elements.
    */
    @SerializedName("SubscribeVideoUserIds")
    @Expose
    private String [] SubscribeVideoUserIds;

    /**
    * The blocklist for video subscription. For example, `["1", "2", "3"]` means to not subscribe to the videos of users 1, 2, and 3, and `["1.*$"]` means to not subscribe to the videos of users whose ID prefix is `1`. If this parameter is left empty, the videos of all anchors in the room will be received. The array can contain at most 32 elements.
    */
    @SerializedName("UnSubscribeVideoUserIds")
    @Expose
    private String [] UnSubscribeVideoUserIds;

    /**
     * Get The allowlist for audio subscription. For example, `["1", "2", "3"]` means to only subscribe to the audios of users 1, 2, and 3, and ["1.*$"] means to only subscribe to the audios of users whose ID prefix is `1`. If this parameter is left empty, the audios of all anchors in the room will be received. The array can contain at most 32 elements. 
     * @return SubscribeAudioUserIds The allowlist for audio subscription. For example, `["1", "2", "3"]` means to only subscribe to the audios of users 1, 2, and 3, and ["1.*$"] means to only subscribe to the audios of users whose ID prefix is `1`. If this parameter is left empty, the audios of all anchors in the room will be received. The array can contain at most 32 elements.
     */
    public String [] getSubscribeAudioUserIds() {
        return this.SubscribeAudioUserIds;
    }

    /**
     * Set The allowlist for audio subscription. For example, `["1", "2", "3"]` means to only subscribe to the audios of users 1, 2, and 3, and ["1.*$"] means to only subscribe to the audios of users whose ID prefix is `1`. If this parameter is left empty, the audios of all anchors in the room will be received. The array can contain at most 32 elements.
     * @param SubscribeAudioUserIds The allowlist for audio subscription. For example, `["1", "2", "3"]` means to only subscribe to the audios of users 1, 2, and 3, and ["1.*$"] means to only subscribe to the audios of users whose ID prefix is `1`. If this parameter is left empty, the audios of all anchors in the room will be received. The array can contain at most 32 elements.
     */
    public void setSubscribeAudioUserIds(String [] SubscribeAudioUserIds) {
        this.SubscribeAudioUserIds = SubscribeAudioUserIds;
    }

    /**
     * Get The blocklist for audio subscription. For example, `["1", "2", "3"]` means to not subscribe to the audios of users 1, 2, and 3, and `["1.*$"]` means to not subscribe to users whose ID prefix is `1`. If this parameter is left empty, the audios of all anchors in the room will be received. The array can contain at most 32 elements. 
     * @return UnSubscribeAudioUserIds The blocklist for audio subscription. For example, `["1", "2", "3"]` means to not subscribe to the audios of users 1, 2, and 3, and `["1.*$"]` means to not subscribe to users whose ID prefix is `1`. If this parameter is left empty, the audios of all anchors in the room will be received. The array can contain at most 32 elements.
     */
    public String [] getUnSubscribeAudioUserIds() {
        return this.UnSubscribeAudioUserIds;
    }

    /**
     * Set The blocklist for audio subscription. For example, `["1", "2", "3"]` means to not subscribe to the audios of users 1, 2, and 3, and `["1.*$"]` means to not subscribe to users whose ID prefix is `1`. If this parameter is left empty, the audios of all anchors in the room will be received. The array can contain at most 32 elements.
     * @param UnSubscribeAudioUserIds The blocklist for audio subscription. For example, `["1", "2", "3"]` means to not subscribe to the audios of users 1, 2, and 3, and `["1.*$"]` means to not subscribe to users whose ID prefix is `1`. If this parameter is left empty, the audios of all anchors in the room will be received. The array can contain at most 32 elements.
     */
    public void setUnSubscribeAudioUserIds(String [] UnSubscribeAudioUserIds) {
        this.UnSubscribeAudioUserIds = UnSubscribeAudioUserIds;
    }

    /**
     * Get The allowlist for video subscription. For example, `["1", "2", "3"]` means to only subscribe to the videos of users 1, 2, and 3, and `["1.*$"]` means to only subscribe to the videos of users whose ID prefix is `1`. If this parameter is left empty, the videos of all anchors in the room will be received. The array can contain at most 32 elements. 
     * @return SubscribeVideoUserIds The allowlist for video subscription. For example, `["1", "2", "3"]` means to only subscribe to the videos of users 1, 2, and 3, and `["1.*$"]` means to only subscribe to the videos of users whose ID prefix is `1`. If this parameter is left empty, the videos of all anchors in the room will be received. The array can contain at most 32 elements.
     */
    public String [] getSubscribeVideoUserIds() {
        return this.SubscribeVideoUserIds;
    }

    /**
     * Set The allowlist for video subscription. For example, `["1", "2", "3"]` means to only subscribe to the videos of users 1, 2, and 3, and `["1.*$"]` means to only subscribe to the videos of users whose ID prefix is `1`. If this parameter is left empty, the videos of all anchors in the room will be received. The array can contain at most 32 elements.
     * @param SubscribeVideoUserIds The allowlist for video subscription. For example, `["1", "2", "3"]` means to only subscribe to the videos of users 1, 2, and 3, and `["1.*$"]` means to only subscribe to the videos of users whose ID prefix is `1`. If this parameter is left empty, the videos of all anchors in the room will be received. The array can contain at most 32 elements.
     */
    public void setSubscribeVideoUserIds(String [] SubscribeVideoUserIds) {
        this.SubscribeVideoUserIds = SubscribeVideoUserIds;
    }

    /**
     * Get The blocklist for video subscription. For example, `["1", "2", "3"]` means to not subscribe to the videos of users 1, 2, and 3, and `["1.*$"]` means to not subscribe to the videos of users whose ID prefix is `1`. If this parameter is left empty, the videos of all anchors in the room will be received. The array can contain at most 32 elements. 
     * @return UnSubscribeVideoUserIds The blocklist for video subscription. For example, `["1", "2", "3"]` means to not subscribe to the videos of users 1, 2, and 3, and `["1.*$"]` means to not subscribe to the videos of users whose ID prefix is `1`. If this parameter is left empty, the videos of all anchors in the room will be received. The array can contain at most 32 elements.
     */
    public String [] getUnSubscribeVideoUserIds() {
        return this.UnSubscribeVideoUserIds;
    }

    /**
     * Set The blocklist for video subscription. For example, `["1", "2", "3"]` means to not subscribe to the videos of users 1, 2, and 3, and `["1.*$"]` means to not subscribe to the videos of users whose ID prefix is `1`. If this parameter is left empty, the videos of all anchors in the room will be received. The array can contain at most 32 elements.
     * @param UnSubscribeVideoUserIds The blocklist for video subscription. For example, `["1", "2", "3"]` means to not subscribe to the videos of users 1, 2, and 3, and `["1.*$"]` means to not subscribe to the videos of users whose ID prefix is `1`. If this parameter is left empty, the videos of all anchors in the room will be received. The array can contain at most 32 elements.
     */
    public void setUnSubscribeVideoUserIds(String [] UnSubscribeVideoUserIds) {
        this.UnSubscribeVideoUserIds = UnSubscribeVideoUserIds;
    }

    public SubscribeStreamUserIds() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeStreamUserIds(SubscribeStreamUserIds source) {
        if (source.SubscribeAudioUserIds != null) {
            this.SubscribeAudioUserIds = new String[source.SubscribeAudioUserIds.length];
            for (int i = 0; i < source.SubscribeAudioUserIds.length; i++) {
                this.SubscribeAudioUserIds[i] = new String(source.SubscribeAudioUserIds[i]);
            }
        }
        if (source.UnSubscribeAudioUserIds != null) {
            this.UnSubscribeAudioUserIds = new String[source.UnSubscribeAudioUserIds.length];
            for (int i = 0; i < source.UnSubscribeAudioUserIds.length; i++) {
                this.UnSubscribeAudioUserIds[i] = new String(source.UnSubscribeAudioUserIds[i]);
            }
        }
        if (source.SubscribeVideoUserIds != null) {
            this.SubscribeVideoUserIds = new String[source.SubscribeVideoUserIds.length];
            for (int i = 0; i < source.SubscribeVideoUserIds.length; i++) {
                this.SubscribeVideoUserIds[i] = new String(source.SubscribeVideoUserIds[i]);
            }
        }
        if (source.UnSubscribeVideoUserIds != null) {
            this.UnSubscribeVideoUserIds = new String[source.UnSubscribeVideoUserIds.length];
            for (int i = 0; i < source.UnSubscribeVideoUserIds.length; i++) {
                this.UnSubscribeVideoUserIds[i] = new String(source.UnSubscribeVideoUserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SubscribeAudioUserIds.", this.SubscribeAudioUserIds);
        this.setParamArraySimple(map, prefix + "UnSubscribeAudioUserIds.", this.UnSubscribeAudioUserIds);
        this.setParamArraySimple(map, prefix + "SubscribeVideoUserIds.", this.SubscribeVideoUserIds);
        this.setParamArraySimple(map, prefix + "UnSubscribeVideoUserIds.", this.UnSubscribeVideoUserIds);

    }
}

