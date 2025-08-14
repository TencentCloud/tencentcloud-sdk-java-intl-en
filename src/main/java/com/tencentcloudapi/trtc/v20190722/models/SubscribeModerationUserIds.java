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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeModerationUserIds extends AbstractModel {

    /**
    * Subscription audio stream allowlist. It specifies which UserIds' audio streams to subscribe to, for example, ["1", "2", "3"] indicates subscriptions to the audio streams of UserId 1, 2, and 3; ["1.*$"] indicates subscription to audio streams with UserId prefixes starting with 1. If this parameter is left unspecified, all audio streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubscribeAudioUserIds")
    @Expose
    private String [] SubscribeAudioUserIds;

    /**
    * Subscription audio stream blocklist. It specifies which UserIds' audio streams not to subscribe to, for example, ["1", "2", "3"] indicates that the audio streams of UserId 1, 2, and 3 are not subscribed to; ["1.*$"] indicates that audio streams with UserId prefixes starting with 1 are not subscribed to. If this parameter is left unspecified, all audio streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnSubscribeAudioUserIds")
    @Expose
    private String [] UnSubscribeAudioUserIds;

    /**
    * Subscription video stream allowlist. It specifies which UserIds' video streams to subscribe to, for example, ["1", "2", "3"] indicates subscriptions to the video streams of UserId 1, 2, and 3; ["1.*$"] indicates subscription to video streams with UserId prefixes starting with 1. If this parameter is left unspecified, all video streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubscribeVideoUserIds")
    @Expose
    private String [] SubscribeVideoUserIds;

    /**
    * Subscription video stream blocklist. It specifies which UserIds' video streams not to subscribe to, for example, ["1", "2", "3"] indicates that the video streams of UserId 1, 2, and 3 are not subscribed to; ["1.*$"] indicates that video streams with UserId prefixes starting with 1 are not subscribed to. If this parameter is left unspecified, all video streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnSubscribeVideoUserIds")
    @Expose
    private String [] UnSubscribeVideoUserIds;

    /**
     * Get Subscription audio stream allowlist. It specifies which UserIds' audio streams to subscribe to, for example, ["1", "2", "3"] indicates subscriptions to the audio streams of UserId 1, 2, and 3; ["1.*$"] indicates subscription to audio streams with UserId prefixes starting with 1. If this parameter is left unspecified, all audio streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubscribeAudioUserIds Subscription audio stream allowlist. It specifies which UserIds' audio streams to subscribe to, for example, ["1", "2", "3"] indicates subscriptions to the audio streams of UserId 1, 2, and 3; ["1.*$"] indicates subscription to audio streams with UserId prefixes starting with 1. If this parameter is left unspecified, all audio streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSubscribeAudioUserIds() {
        return this.SubscribeAudioUserIds;
    }

    /**
     * Set Subscription audio stream allowlist. It specifies which UserIds' audio streams to subscribe to, for example, ["1", "2", "3"] indicates subscriptions to the audio streams of UserId 1, 2, and 3; ["1.*$"] indicates subscription to audio streams with UserId prefixes starting with 1. If this parameter is left unspecified, all audio streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubscribeAudioUserIds Subscription audio stream allowlist. It specifies which UserIds' audio streams to subscribe to, for example, ["1", "2", "3"] indicates subscriptions to the audio streams of UserId 1, 2, and 3; ["1.*$"] indicates subscription to audio streams with UserId prefixes starting with 1. If this parameter is left unspecified, all audio streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubscribeAudioUserIds(String [] SubscribeAudioUserIds) {
        this.SubscribeAudioUserIds = SubscribeAudioUserIds;
    }

    /**
     * Get Subscription audio stream blocklist. It specifies which UserIds' audio streams not to subscribe to, for example, ["1", "2", "3"] indicates that the audio streams of UserId 1, 2, and 3 are not subscribed to; ["1.*$"] indicates that audio streams with UserId prefixes starting with 1 are not subscribed to. If this parameter is left unspecified, all audio streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnSubscribeAudioUserIds Subscription audio stream blocklist. It specifies which UserIds' audio streams not to subscribe to, for example, ["1", "2", "3"] indicates that the audio streams of UserId 1, 2, and 3 are not subscribed to; ["1.*$"] indicates that audio streams with UserId prefixes starting with 1 are not subscribed to. If this parameter is left unspecified, all audio streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getUnSubscribeAudioUserIds() {
        return this.UnSubscribeAudioUserIds;
    }

    /**
     * Set Subscription audio stream blocklist. It specifies which UserIds' audio streams not to subscribe to, for example, ["1", "2", "3"] indicates that the audio streams of UserId 1, 2, and 3 are not subscribed to; ["1.*$"] indicates that audio streams with UserId prefixes starting with 1 are not subscribed to. If this parameter is left unspecified, all audio streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnSubscribeAudioUserIds Subscription audio stream blocklist. It specifies which UserIds' audio streams not to subscribe to, for example, ["1", "2", "3"] indicates that the audio streams of UserId 1, 2, and 3 are not subscribed to; ["1.*$"] indicates that audio streams with UserId prefixes starting with 1 are not subscribed to. If this parameter is left unspecified, all audio streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnSubscribeAudioUserIds(String [] UnSubscribeAudioUserIds) {
        this.UnSubscribeAudioUserIds = UnSubscribeAudioUserIds;
    }

    /**
     * Get Subscription video stream allowlist. It specifies which UserIds' video streams to subscribe to, for example, ["1", "2", "3"] indicates subscriptions to the video streams of UserId 1, 2, and 3; ["1.*$"] indicates subscription to video streams with UserId prefixes starting with 1. If this parameter is left unspecified, all video streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubscribeVideoUserIds Subscription video stream allowlist. It specifies which UserIds' video streams to subscribe to, for example, ["1", "2", "3"] indicates subscriptions to the video streams of UserId 1, 2, and 3; ["1.*$"] indicates subscription to video streams with UserId prefixes starting with 1. If this parameter is left unspecified, all video streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSubscribeVideoUserIds() {
        return this.SubscribeVideoUserIds;
    }

    /**
     * Set Subscription video stream allowlist. It specifies which UserIds' video streams to subscribe to, for example, ["1", "2", "3"] indicates subscriptions to the video streams of UserId 1, 2, and 3; ["1.*$"] indicates subscription to video streams with UserId prefixes starting with 1. If this parameter is left unspecified, all video streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubscribeVideoUserIds Subscription video stream allowlist. It specifies which UserIds' video streams to subscribe to, for example, ["1", "2", "3"] indicates subscriptions to the video streams of UserId 1, 2, and 3; ["1.*$"] indicates subscription to video streams with UserId prefixes starting with 1. If this parameter is left unspecified, all video streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubscribeVideoUserIds(String [] SubscribeVideoUserIds) {
        this.SubscribeVideoUserIds = SubscribeVideoUserIds;
    }

    /**
     * Get Subscription video stream blocklist. It specifies which UserIds' video streams not to subscribe to, for example, ["1", "2", "3"] indicates that the video streams of UserId 1, 2, and 3 are not subscribed to; ["1.*$"] indicates that video streams with UserId prefixes starting with 1 are not subscribed to. If this parameter is left unspecified, all video streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnSubscribeVideoUserIds Subscription video stream blocklist. It specifies which UserIds' video streams not to subscribe to, for example, ["1", "2", "3"] indicates that the video streams of UserId 1, 2, and 3 are not subscribed to; ["1.*$"] indicates that video streams with UserId prefixes starting with 1 are not subscribed to. If this parameter is left unspecified, all video streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getUnSubscribeVideoUserIds() {
        return this.UnSubscribeVideoUserIds;
    }

    /**
     * Set Subscription video stream blocklist. It specifies which UserIds' video streams not to subscribe to, for example, ["1", "2", "3"] indicates that the video streams of UserId 1, 2, and 3 are not subscribed to; ["1.*$"] indicates that video streams with UserId prefixes starting with 1 are not subscribed to. If this parameter is left unspecified, all video streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnSubscribeVideoUserIds Subscription video stream blocklist. It specifies which UserIds' video streams not to subscribe to, for example, ["1", "2", "3"] indicates that the video streams of UserId 1, 2, and 3 are not subscribed to; ["1.*$"] indicates that video streams with UserId prefixes starting with 1 are not subscribed to. If this parameter is left unspecified, all video streams in the room are subscribed to by default. The number of users in the subscription list should not exceed 32.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnSubscribeVideoUserIds(String [] UnSubscribeVideoUserIds) {
        this.UnSubscribeVideoUserIds = UnSubscribeVideoUserIds;
    }

    public SubscribeModerationUserIds() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeModerationUserIds(SubscribeModerationUserIds source) {
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

