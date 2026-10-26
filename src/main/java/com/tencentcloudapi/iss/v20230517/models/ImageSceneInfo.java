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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSceneInfo extends AbstractModel {

    /**
    * <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Frame capturing frequency</p><p>When Type=1, the value range is [5, 180] seconds; when Type=2, the value range is [30, 36000] seconds</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>Multiple screenshots mode</p>
    */
    @SerializedName("MultiMode")
    @Expose
    private MultiSnapshotMode MultiMode;

    /**
     * Get <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul> 
     * @return Type <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     * @param Type <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Frame capturing frequency</p><p>When Type=1, the value range is [5, 180] seconds; when Type=2, the value range is [30, 36000] seconds</p> 
     * @return Interval <p>Frame capturing frequency</p><p>When Type=1, the value range is [5, 180] seconds; when Type=2, the value range is [30, 36000] seconds</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Frame capturing frequency</p><p>When Type=1, the value range is [5, 180] seconds; when Type=2, the value range is [30, 36000] seconds</p>
     * @param Interval <p>Frame capturing frequency</p><p>When Type=1, the value range is [5, 180] seconds; when Type=2, the value range is [30, 36000] seconds</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Multiple screenshots mode</p> 
     * @return MultiMode <p>Multiple screenshots mode</p>
     */
    public MultiSnapshotMode getMultiMode() {
        return this.MultiMode;
    }

    /**
     * Set <p>Multiple screenshots mode</p>
     * @param MultiMode <p>Multiple screenshots mode</p>
     */
    public void setMultiMode(MultiSnapshotMode MultiMode) {
        this.MultiMode = MultiMode;
    }

    public ImageSceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSceneInfo(ImageSceneInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.MultiMode != null) {
            this.MultiMode = new MultiSnapshotMode(source.MultiMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamObj(map, prefix + "MultiMode.", this.MultiMode);

    }
}

