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

public class InputTrack extends AbstractModel {

    /**
    * Audio track index 1-based index mapping to the specified audio track integer starting from 1.
    */
    @SerializedName("TrackIndex")
    @Expose
    private Long TrackIndex;

    /**
     * Get Audio track index 1-based index mapping to the specified audio track integer starting from 1. 
     * @return TrackIndex Audio track index 1-based index mapping to the specified audio track integer starting from 1.
     */
    public Long getTrackIndex() {
        return this.TrackIndex;
    }

    /**
     * Set Audio track index 1-based index mapping to the specified audio track integer starting from 1.
     * @param TrackIndex Audio track index 1-based index mapping to the specified audio track integer starting from 1.
     */
    public void setTrackIndex(Long TrackIndex) {
        this.TrackIndex = TrackIndex;
    }

    public InputTrack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputTrack(InputTrack source) {
        if (source.TrackIndex != null) {
            this.TrackIndex = new Long(source.TrackIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrackIndex", this.TrackIndex);

    }
}

