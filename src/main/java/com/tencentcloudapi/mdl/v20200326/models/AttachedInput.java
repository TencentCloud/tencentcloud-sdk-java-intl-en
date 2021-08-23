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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachedInput extends AbstractModel{

    /**
    * Input ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Audio selector for the input. There can be 0 to 20 audio selectors.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AudioSelectors")
    @Expose
    private AudioSelectorInfo [] AudioSelectors;

    /**
    * Pull mode. If the input type is `HLS_PULL` or `MP4_PULL`, you can set this parameter to `LOOP` or `ONCE`. `LOOP` is the default value.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PullBehavior")
    @Expose
    private String PullBehavior;

    /**
    * Input failover configuration
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("FailOverSettings")
    @Expose
    private FailOverSettings FailOverSettings;

    /**
     * Get Input ID 
     * @return Id Input ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Input ID
     * @param Id Input ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Audio selector for the input. There can be 0 to 20 audio selectors.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return AudioSelectors Audio selector for the input. There can be 0 to 20 audio selectors.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public AudioSelectorInfo [] getAudioSelectors() {
        return this.AudioSelectors;
    }

    /**
     * Set Audio selector for the input. There can be 0 to 20 audio selectors.
Note: this field may return `null`, indicating that no valid value was found.
     * @param AudioSelectors Audio selector for the input. There can be 0 to 20 audio selectors.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setAudioSelectors(AudioSelectorInfo [] AudioSelectors) {
        this.AudioSelectors = AudioSelectors;
    }

    /**
     * Get Pull mode. If the input type is `HLS_PULL` or `MP4_PULL`, you can set this parameter to `LOOP` or `ONCE`. `LOOP` is the default value.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return PullBehavior Pull mode. If the input type is `HLS_PULL` or `MP4_PULL`, you can set this parameter to `LOOP` or `ONCE`. `LOOP` is the default value.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getPullBehavior() {
        return this.PullBehavior;
    }

    /**
     * Set Pull mode. If the input type is `HLS_PULL` or `MP4_PULL`, you can set this parameter to `LOOP` or `ONCE`. `LOOP` is the default value.
Note: this field may return `null`, indicating that no valid value was found.
     * @param PullBehavior Pull mode. If the input type is `HLS_PULL` or `MP4_PULL`, you can set this parameter to `LOOP` or `ONCE`. `LOOP` is the default value.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setPullBehavior(String PullBehavior) {
        this.PullBehavior = PullBehavior;
    }

    /**
     * Get Input failover configuration
Note: this field may return `null`, indicating that no valid value was found. 
     * @return FailOverSettings Input failover configuration
Note: this field may return `null`, indicating that no valid value was found.
     */
    public FailOverSettings getFailOverSettings() {
        return this.FailOverSettings;
    }

    /**
     * Set Input failover configuration
Note: this field may return `null`, indicating that no valid value was found.
     * @param FailOverSettings Input failover configuration
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setFailOverSettings(FailOverSettings FailOverSettings) {
        this.FailOverSettings = FailOverSettings;
    }

    public AttachedInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachedInput(AttachedInput source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AudioSelectors != null) {
            this.AudioSelectors = new AudioSelectorInfo[source.AudioSelectors.length];
            for (int i = 0; i < source.AudioSelectors.length; i++) {
                this.AudioSelectors[i] = new AudioSelectorInfo(source.AudioSelectors[i]);
            }
        }
        if (source.PullBehavior != null) {
            this.PullBehavior = new String(source.PullBehavior);
        }
        if (source.FailOverSettings != null) {
            this.FailOverSettings = new FailOverSettings(source.FailOverSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "AudioSelectors.", this.AudioSelectors);
        this.setParamSimple(map, prefix + "PullBehavior", this.PullBehavior);
        this.setParamObj(map, prefix + "FailOverSettings.", this.FailOverSettings);

    }
}

