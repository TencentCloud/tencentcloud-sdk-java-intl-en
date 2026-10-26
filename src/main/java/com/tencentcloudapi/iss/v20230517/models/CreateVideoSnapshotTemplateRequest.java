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

public class CreateVideoSnapshotTemplateRequest extends AbstractModel {

    /**
    * <p>Template name: Chinese, English, digits, "-", "_", with a length not exceeding 128 characters</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Screenshot type: 1-Real-time frame capture 2-Low frequency frame capture<br>Note: Real-time frame capture pulls the real-time stream throughout the effective period. Low frequency frame capture pulls the real-time stream as needed during the effective period, with a minimum duration of not less than 1 minute each time.</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Frame capturing frequency: When Type = 1, the value range is [5, 180] seconds; when Type = 2, the value range is [30, 36000] seconds</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>Effective period. Note: The array size is no more than 100, and each time period is not less than 1 minute.</p>
    */
    @SerializedName("Times")
    @Expose
    private EffectiveTime [] Times;

    /**
    * <p>Multiple mode</p>
    */
    @SerializedName("MultiMode")
    @Expose
    private MultiVideoSnapshotMode MultiMode;

    /**
     * Get <p>Template name: Chinese, English, digits, "-", "_", with a length not exceeding 128 characters</p> 
     * @return Name <p>Template name: Chinese, English, digits, "-", "_", with a length not exceeding 128 characters</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Template name: Chinese, English, digits, "-", "_", with a length not exceeding 128 characters</p>
     * @param Name <p>Template name: Chinese, English, digits, "-", "_", with a length not exceeding 128 characters</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Screenshot type: 1-Real-time frame capture 2-Low frequency frame capture<br>Note: Real-time frame capture pulls the real-time stream throughout the effective period. Low frequency frame capture pulls the real-time stream as needed during the effective period, with a minimum duration of not less than 1 minute each time.</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul> 
     * @return Type <p>Screenshot type: 1-Real-time frame capture 2-Low frequency frame capture<br>Note: Real-time frame capture pulls the real-time stream throughout the effective period. Low frequency frame capture pulls the real-time stream as needed during the effective period, with a minimum duration of not less than 1 minute each time.</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Screenshot type: 1-Real-time frame capture 2-Low frequency frame capture<br>Note: Real-time frame capture pulls the real-time stream throughout the effective period. Low frequency frame capture pulls the real-time stream as needed during the effective period, with a minimum duration of not less than 1 minute each time.</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     * @param Type <p>Screenshot type: 1-Real-time frame capture 2-Low frequency frame capture<br>Note: Real-time frame capture pulls the real-time stream throughout the effective period. Low frequency frame capture pulls the real-time stream as needed during the effective period, with a minimum duration of not less than 1 minute each time.</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Frame capturing frequency: When Type = 1, the value range is [5, 180] seconds; when Type = 2, the value range is [30, 36000] seconds</p> 
     * @return Interval <p>Frame capturing frequency: When Type = 1, the value range is [5, 180] seconds; when Type = 2, the value range is [30, 36000] seconds</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Frame capturing frequency: When Type = 1, the value range is [5, 180] seconds; when Type = 2, the value range is [30, 36000] seconds</p>
     * @param Interval <p>Frame capturing frequency: When Type = 1, the value range is [5, 180] seconds; when Type = 2, the value range is [30, 36000] seconds</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Effective period. Note: The array size is no more than 100, and each time period is not less than 1 minute.</p> 
     * @return Times <p>Effective period. Note: The array size is no more than 100, and each time period is not less than 1 minute.</p>
     */
    public EffectiveTime [] getTimes() {
        return this.Times;
    }

    /**
     * Set <p>Effective period. Note: The array size is no more than 100, and each time period is not less than 1 minute.</p>
     * @param Times <p>Effective period. Note: The array size is no more than 100, and each time period is not less than 1 minute.</p>
     */
    public void setTimes(EffectiveTime [] Times) {
        this.Times = Times;
    }

    /**
     * Get <p>Multiple mode</p> 
     * @return MultiMode <p>Multiple mode</p>
     */
    public MultiVideoSnapshotMode getMultiMode() {
        return this.MultiMode;
    }

    /**
     * Set <p>Multiple mode</p>
     * @param MultiMode <p>Multiple mode</p>
     */
    public void setMultiMode(MultiVideoSnapshotMode MultiMode) {
        this.MultiMode = MultiMode;
    }

    public CreateVideoSnapshotTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVideoSnapshotTemplateRequest(CreateVideoSnapshotTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Times != null) {
            this.Times = new EffectiveTime[source.Times.length];
            for (int i = 0; i < source.Times.length; i++) {
                this.Times[i] = new EffectiveTime(source.Times[i]);
            }
        }
        if (source.MultiMode != null) {
            this.MultiMode = new MultiVideoSnapshotMode(source.MultiMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Times.", this.Times);
        this.setParamObj(map, prefix + "MultiMode.", this.MultiMode);

    }
}

