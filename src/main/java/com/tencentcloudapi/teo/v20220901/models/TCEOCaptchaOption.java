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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCEOCaptchaOption extends AbstractModel {

    /**
    * <p>Browser-side WebView human-machine verification interaction mode.</p><p>Enumeration values:</p><ul><li>Invisible: invisible verification</li><li>Adaptive: self adaptive interactive verification</li></ul><p>Default value: Invisible</p>
    */
    @SerializedName("CaptchaMode")
    @Expose
    private String CaptchaMode;

    /**
    * <p>Human-machine verification interaction mode for native apps on mobile terminals.</p><p>Enumeration values:</p><ul><li>Invisible: Invisible verification</li><li>Visible: interactive verification</li></ul><p>Default value: Invisible</p>
    */
    @SerializedName("MobileCaptchaMode")
    @Expose
    private String MobileCaptchaMode;

    /**
     * Get <p>Browser-side WebView human-machine verification interaction mode.</p><p>Enumeration values:</p><ul><li>Invisible: invisible verification</li><li>Adaptive: self adaptive interactive verification</li></ul><p>Default value: Invisible</p> 
     * @return CaptchaMode <p>Browser-side WebView human-machine verification interaction mode.</p><p>Enumeration values:</p><ul><li>Invisible: invisible verification</li><li>Adaptive: self adaptive interactive verification</li></ul><p>Default value: Invisible</p>
     */
    public String getCaptchaMode() {
        return this.CaptchaMode;
    }

    /**
     * Set <p>Browser-side WebView human-machine verification interaction mode.</p><p>Enumeration values:</p><ul><li>Invisible: invisible verification</li><li>Adaptive: self adaptive interactive verification</li></ul><p>Default value: Invisible</p>
     * @param CaptchaMode <p>Browser-side WebView human-machine verification interaction mode.</p><p>Enumeration values:</p><ul><li>Invisible: invisible verification</li><li>Adaptive: self adaptive interactive verification</li></ul><p>Default value: Invisible</p>
     */
    public void setCaptchaMode(String CaptchaMode) {
        this.CaptchaMode = CaptchaMode;
    }

    /**
     * Get <p>Human-machine verification interaction mode for native apps on mobile terminals.</p><p>Enumeration values:</p><ul><li>Invisible: Invisible verification</li><li>Visible: interactive verification</li></ul><p>Default value: Invisible</p> 
     * @return MobileCaptchaMode <p>Human-machine verification interaction mode for native apps on mobile terminals.</p><p>Enumeration values:</p><ul><li>Invisible: Invisible verification</li><li>Visible: interactive verification</li></ul><p>Default value: Invisible</p>
     */
    public String getMobileCaptchaMode() {
        return this.MobileCaptchaMode;
    }

    /**
     * Set <p>Human-machine verification interaction mode for native apps on mobile terminals.</p><p>Enumeration values:</p><ul><li>Invisible: Invisible verification</li><li>Visible: interactive verification</li></ul><p>Default value: Invisible</p>
     * @param MobileCaptchaMode <p>Human-machine verification interaction mode for native apps on mobile terminals.</p><p>Enumeration values:</p><ul><li>Invisible: Invisible verification</li><li>Visible: interactive verification</li></ul><p>Default value: Invisible</p>
     */
    public void setMobileCaptchaMode(String MobileCaptchaMode) {
        this.MobileCaptchaMode = MobileCaptchaMode;
    }

    public TCEOCaptchaOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCEOCaptchaOption(TCEOCaptchaOption source) {
        if (source.CaptchaMode != null) {
            this.CaptchaMode = new String(source.CaptchaMode);
        }
        if (source.MobileCaptchaMode != null) {
            this.MobileCaptchaMode = new String(source.MobileCaptchaMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaMode", this.CaptchaMode);
        this.setParamSimple(map, prefix + "MobileCaptchaMode", this.MobileCaptchaMode);

    }
}

