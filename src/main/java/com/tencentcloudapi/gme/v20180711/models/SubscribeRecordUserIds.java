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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeRecordUserIds extends AbstractModel {

    /**
    * Blocklist for audio subscription. For example, `["1", "2", "3"]` means to not subscribe to the audio streams of users 1, 2, and 3. If this parameter is left empty, the audio streams of all users (max 20) in the room will not be subscribed to.
Note: You cannot specify `UnSubscribeAudioUserIds` and `SubscribeAudioUserIds` at the same time.
    */
    @SerializedName("UnSubscribeUserIds")
    @Expose
    private String [] UnSubscribeUserIds;

    /**
    * Allowlist for audio subscription. For example, `["1", "2", "3"]` means to subscribe to the audio streams of users 1, 2, and 3. If this parameter is left empty, the audio streams of all users (max 20) in the room will be subscribed to.
Note: You cannot specify `UnSubscribeAudioUserIds` and `SubscribeAudioUserIds` at the same time.
    */
    @SerializedName("SubscribeUserIds")
    @Expose
    private String [] SubscribeUserIds;

    /**
     * Get Blocklist for audio subscription. For example, `["1", "2", "3"]` means to not subscribe to the audio streams of users 1, 2, and 3. If this parameter is left empty, the audio streams of all users (max 20) in the room will not be subscribed to.
Note: You cannot specify `UnSubscribeAudioUserIds` and `SubscribeAudioUserIds` at the same time. 
     * @return UnSubscribeUserIds Blocklist for audio subscription. For example, `["1", "2", "3"]` means to not subscribe to the audio streams of users 1, 2, and 3. If this parameter is left empty, the audio streams of all users (max 20) in the room will not be subscribed to.
Note: You cannot specify `UnSubscribeAudioUserIds` and `SubscribeAudioUserIds` at the same time.
     */
    public String [] getUnSubscribeUserIds() {
        return this.UnSubscribeUserIds;
    }

    /**
     * Set Blocklist for audio subscription. For example, `["1", "2", "3"]` means to not subscribe to the audio streams of users 1, 2, and 3. If this parameter is left empty, the audio streams of all users (max 20) in the room will not be subscribed to.
Note: You cannot specify `UnSubscribeAudioUserIds` and `SubscribeAudioUserIds` at the same time.
     * @param UnSubscribeUserIds Blocklist for audio subscription. For example, `["1", "2", "3"]` means to not subscribe to the audio streams of users 1, 2, and 3. If this parameter is left empty, the audio streams of all users (max 20) in the room will not be subscribed to.
Note: You cannot specify `UnSubscribeAudioUserIds` and `SubscribeAudioUserIds` at the same time.
     */
    public void setUnSubscribeUserIds(String [] UnSubscribeUserIds) {
        this.UnSubscribeUserIds = UnSubscribeUserIds;
    }

    /**
     * Get Allowlist for audio subscription. For example, `["1", "2", "3"]` means to subscribe to the audio streams of users 1, 2, and 3. If this parameter is left empty, the audio streams of all users (max 20) in the room will be subscribed to.
Note: You cannot specify `UnSubscribeAudioUserIds` and `SubscribeAudioUserIds` at the same time. 
     * @return SubscribeUserIds Allowlist for audio subscription. For example, `["1", "2", "3"]` means to subscribe to the audio streams of users 1, 2, and 3. If this parameter is left empty, the audio streams of all users (max 20) in the room will be subscribed to.
Note: You cannot specify `UnSubscribeAudioUserIds` and `SubscribeAudioUserIds` at the same time.
     */
    public String [] getSubscribeUserIds() {
        return this.SubscribeUserIds;
    }

    /**
     * Set Allowlist for audio subscription. For example, `["1", "2", "3"]` means to subscribe to the audio streams of users 1, 2, and 3. If this parameter is left empty, the audio streams of all users (max 20) in the room will be subscribed to.
Note: You cannot specify `UnSubscribeAudioUserIds` and `SubscribeAudioUserIds` at the same time.
     * @param SubscribeUserIds Allowlist for audio subscription. For example, `["1", "2", "3"]` means to subscribe to the audio streams of users 1, 2, and 3. If this parameter is left empty, the audio streams of all users (max 20) in the room will be subscribed to.
Note: You cannot specify `UnSubscribeAudioUserIds` and `SubscribeAudioUserIds` at the same time.
     */
    public void setSubscribeUserIds(String [] SubscribeUserIds) {
        this.SubscribeUserIds = SubscribeUserIds;
    }

    public SubscribeRecordUserIds() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeRecordUserIds(SubscribeRecordUserIds source) {
        if (source.UnSubscribeUserIds != null) {
            this.UnSubscribeUserIds = new String[source.UnSubscribeUserIds.length];
            for (int i = 0; i < source.UnSubscribeUserIds.length; i++) {
                this.UnSubscribeUserIds[i] = new String(source.UnSubscribeUserIds[i]);
            }
        }
        if (source.SubscribeUserIds != null) {
            this.SubscribeUserIds = new String[source.SubscribeUserIds.length];
            for (int i = 0; i < source.SubscribeUserIds.length; i++) {
                this.SubscribeUserIds[i] = new String(source.SubscribeUserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UnSubscribeUserIds.", this.UnSubscribeUserIds);
        this.setParamArraySimple(map, prefix + "SubscribeUserIds.", this.SubscribeUserIds);

    }
}

