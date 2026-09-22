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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersistenceCompleteTask extends AbstractModel {

    /**
    * Fixed generated media ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Sources of clipping solidification are as follows.
<li>SimpleHlsClip: comes from simple HLS edit;</li>
<li>FastEditMedia: comes from rapid media editing;</li>
<li>LiveRealTimeClip: comes from live stream clipping.</li>
    */
    @SerializedName("PersistenceSource")
    @Expose
    private String PersistenceSource;

    /**
     * Get Fixed generated media ID. 
     * @return FileId Fixed generated media ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Fixed generated media ID.
     * @param FileId Fixed generated media ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Sources of clipping solidification are as follows.
<li>SimpleHlsClip: comes from simple HLS edit;</li>
<li>FastEditMedia: comes from rapid media editing;</li>
<li>LiveRealTimeClip: comes from live stream clipping.</li> 
     * @return PersistenceSource Sources of clipping solidification are as follows.
<li>SimpleHlsClip: comes from simple HLS edit;</li>
<li>FastEditMedia: comes from rapid media editing;</li>
<li>LiveRealTimeClip: comes from live stream clipping.</li>
     */
    public String getPersistenceSource() {
        return this.PersistenceSource;
    }

    /**
     * Set Sources of clipping solidification are as follows.
<li>SimpleHlsClip: comes from simple HLS edit;</li>
<li>FastEditMedia: comes from rapid media editing;</li>
<li>LiveRealTimeClip: comes from live stream clipping.</li>
     * @param PersistenceSource Sources of clipping solidification are as follows.
<li>SimpleHlsClip: comes from simple HLS edit;</li>
<li>FastEditMedia: comes from rapid media editing;</li>
<li>LiveRealTimeClip: comes from live stream clipping.</li>
     */
    public void setPersistenceSource(String PersistenceSource) {
        this.PersistenceSource = PersistenceSource;
    }

    public PersistenceCompleteTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersistenceCompleteTask(PersistenceCompleteTask source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.PersistenceSource != null) {
            this.PersistenceSource = new String(source.PersistenceSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "PersistenceSource", this.PersistenceSource);

    }
}

