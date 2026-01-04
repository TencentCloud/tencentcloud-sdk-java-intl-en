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

public class AdBreakSetting extends AbstractModel {

    /**
    * Advertising type, currently supports L-SQUEEZE
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Duration, in milliseconds, requires 1000<duration<=600000. The current accuracy is seconds, which is a multiple of 1000
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * L-type compression recovery configuration
    */
    @SerializedName("LSqueezeSetting")
    @Expose
    private LSqueezeSetting LSqueezeSetting;

    /**
    * AdSource type, supports UPLOAD_CREATIVES
    */
    @SerializedName("AdSource")
    @Expose
    private String AdSource;

    /**
     * Get Advertising type, currently supports L-SQUEEZE 
     * @return Format Advertising type, currently supports L-SQUEEZE
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Advertising type, currently supports L-SQUEEZE
     * @param Format Advertising type, currently supports L-SQUEEZE
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Duration, in milliseconds, requires 1000<duration<=600000. The current accuracy is seconds, which is a multiple of 1000 
     * @return Duration Duration, in milliseconds, requires 1000<duration<=600000. The current accuracy is seconds, which is a multiple of 1000
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration, in milliseconds, requires 1000<duration<=600000. The current accuracy is seconds, which is a multiple of 1000
     * @param Duration Duration, in milliseconds, requires 1000<duration<=600000. The current accuracy is seconds, which is a multiple of 1000
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get L-type compression recovery configuration 
     * @return LSqueezeSetting L-type compression recovery configuration
     */
    public LSqueezeSetting getLSqueezeSetting() {
        return this.LSqueezeSetting;
    }

    /**
     * Set L-type compression recovery configuration
     * @param LSqueezeSetting L-type compression recovery configuration
     */
    public void setLSqueezeSetting(LSqueezeSetting LSqueezeSetting) {
        this.LSqueezeSetting = LSqueezeSetting;
    }

    /**
     * Get AdSource type, supports UPLOAD_CREATIVES 
     * @return AdSource AdSource type, supports UPLOAD_CREATIVES
     */
    public String getAdSource() {
        return this.AdSource;
    }

    /**
     * Set AdSource type, supports UPLOAD_CREATIVES
     * @param AdSource AdSource type, supports UPLOAD_CREATIVES
     */
    public void setAdSource(String AdSource) {
        this.AdSource = AdSource;
    }

    public AdBreakSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdBreakSetting(AdBreakSetting source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.LSqueezeSetting != null) {
            this.LSqueezeSetting = new LSqueezeSetting(source.LSqueezeSetting);
        }
        if (source.AdSource != null) {
            this.AdSource = new String(source.AdSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamObj(map, prefix + "LSqueezeSetting.", this.LSqueezeSetting);
        this.setParamSimple(map, prefix + "AdSource", this.AdSource);

    }
}

