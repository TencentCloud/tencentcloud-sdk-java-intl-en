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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamSelector extends AbstractModel {

    /**
    * Selection type: PID | TRACK
    */
    @SerializedName("SelectorType")
    @Expose
    private String SelectorType;

    /**
    * Based on the PID configuration selector
    */
    @SerializedName("PidSelector")
    @Expose
    private PidSelector PidSelector;

    /**
    * Select a selector based on the Track configuration
    */
    @SerializedName("TrackSelector")
    @Expose
    private TrackSelector TrackSelector;

    /**
     * Get Selection type: PID | TRACK 
     * @return SelectorType Selection type: PID | TRACK
     */
    public String getSelectorType() {
        return this.SelectorType;
    }

    /**
     * Set Selection type: PID | TRACK
     * @param SelectorType Selection type: PID | TRACK
     */
    public void setSelectorType(String SelectorType) {
        this.SelectorType = SelectorType;
    }

    /**
     * Get Based on the PID configuration selector 
     * @return PidSelector Based on the PID configuration selector
     */
    public PidSelector getPidSelector() {
        return this.PidSelector;
    }

    /**
     * Set Based on the PID configuration selector
     * @param PidSelector Based on the PID configuration selector
     */
    public void setPidSelector(PidSelector PidSelector) {
        this.PidSelector = PidSelector;
    }

    /**
     * Get Select a selector based on the Track configuration 
     * @return TrackSelector Select a selector based on the Track configuration
     */
    public TrackSelector getTrackSelector() {
        return this.TrackSelector;
    }

    /**
     * Set Select a selector based on the Track configuration
     * @param TrackSelector Select a selector based on the Track configuration
     */
    public void setTrackSelector(TrackSelector TrackSelector) {
        this.TrackSelector = TrackSelector;
    }

    public StreamSelector() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamSelector(StreamSelector source) {
        if (source.SelectorType != null) {
            this.SelectorType = new String(source.SelectorType);
        }
        if (source.PidSelector != null) {
            this.PidSelector = new PidSelector(source.PidSelector);
        }
        if (source.TrackSelector != null) {
            this.TrackSelector = new TrackSelector(source.TrackSelector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SelectorType", this.SelectorType);
        this.setParamObj(map, prefix + "PidSelector.", this.PidSelector);
        this.setParamObj(map, prefix + "TrackSelector.", this.TrackSelector);

    }
}

