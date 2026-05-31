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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioCodecDetail extends AbstractModel {

    /**
    * Sound track configuration. Available values: MONO, STEREO, 5.1.
    */
    @SerializedName("ChannelMode")
    @Expose
    private String ChannelMode;

    /**
    * Level in aac, available values: "LC", "HE-aac", "HE-AACV2".
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get Sound track configuration. Available values: MONO, STEREO, 5.1. 
     * @return ChannelMode Sound track configuration. Available values: MONO, STEREO, 5.1.
     */
    public String getChannelMode() {
        return this.ChannelMode;
    }

    /**
     * Set Sound track configuration. Available values: MONO, STEREO, 5.1.
     * @param ChannelMode Sound track configuration. Available values: MONO, STEREO, 5.1.
     */
    public void setChannelMode(String ChannelMode) {
        this.ChannelMode = ChannelMode;
    }

    /**
     * Get Level in aac, available values: "LC", "HE-aac", "HE-AACV2". 
     * @return Profile Level in aac, available values: "LC", "HE-aac", "HE-AACV2".
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set Level in aac, available values: "LC", "HE-aac", "HE-AACV2".
     * @param Profile Level in aac, available values: "LC", "HE-aac", "HE-AACV2".
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public AudioCodecDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioCodecDetail(AudioCodecDetail source) {
        if (source.ChannelMode != null) {
            this.ChannelMode = new String(source.ChannelMode);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMode", this.ChannelMode);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

