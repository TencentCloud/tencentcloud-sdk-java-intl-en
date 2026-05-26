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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFaceIdTokenIntlRequest extends AbstractModel {

    /**
    * <p>Indicates the detection mode. Parameter values as follows:<br>"liveness": liveness detection only;<br>"compare": liveness detection + face comparison;<br>Default value: "liveness".</p>
    */
    @SerializedName("CheckMode")
    @Expose
    private String CheckMode;

    /**
    * <p>Indicates the security level of authentication. Security levels are divided into:<br>"1": silent liveness;<br>"2": action liveness detection;<br>"3": light liveness;<br>"4": action + light liveness;<br>Default value is "4".</p>
**Note:** Security level increases from `1` to `4`, with `4` providing the highest security.
    */
    @SerializedName("SecureLevel")
    @Expose
    private String SecureLevel;

    /**
    * <p>The base64 code of the image for comparison, used for the "liveness comparison" mode. This parameter is required when CheckMode is "compare".</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>This parameter is a business passthrough parameter and can be omitted unless otherwise needed.</p>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>This API is used to control the sequence of actions. The action types are as follows:<br>"blink"<br>"mouth"<br>"nod"<br>"shake"<br>Choose 1-2 actions from the four.<br>Single action example: "blink"<br>Multi-action example: "blink,mouth".<br>Default value is blink.<br>Input this parameter only when SecureLevel is 2 or 4 for different action types to take effect; otherwise, the API returns an error.</p>
    */
    @SerializedName("ActionList")
    @Expose
    private String ActionList;

    /**
    * <p>PLUS: PLUS version, PRO: PRO version, ENHANCED: enhanced, BASIC: basic (default)</p>
    */
    @SerializedName("SdkVersion")
    @Expose
    private String SdkVersion;

    /**
    * <p>Liveness retry count</p><p>Value ranges from 1 to 5</p><p>Default value: 5</p>
    */
    @SerializedName("RetryLimit")
    @Expose
    private Long RetryLimit;

    /**
     * Get <p>Indicates the detection mode. Parameter values as follows:<br>"liveness": liveness detection only;<br>"compare": liveness detection + face comparison;<br>Default value: "liveness".</p> 
     * @return CheckMode <p>Indicates the detection mode. Parameter values as follows:<br>"liveness": liveness detection only;<br>"compare": liveness detection + face comparison;<br>Default value: "liveness".</p>
     */
    public String getCheckMode() {
        return this.CheckMode;
    }

    /**
     * Set <p>Indicates the detection mode. Parameter values as follows:<br>"liveness": liveness detection only;<br>"compare": liveness detection + face comparison;<br>Default value: "liveness".</p>
     * @param CheckMode <p>Indicates the detection mode. Parameter values as follows:<br>"liveness": liveness detection only;<br>"compare": liveness detection + face comparison;<br>Default value: "liveness".</p>
     */
    public void setCheckMode(String CheckMode) {
        this.CheckMode = CheckMode;
    }

    /**
     * Get <p>Indicates the security level of authentication. Security levels are divided into:<br>"1": silent liveness;<br>"2": action liveness detection;<br>"3": light liveness;<br>"4": action + light liveness;<br>Default value is "4".</p>
**Note:** Security level increases from `1` to `4`, with `4` providing the highest security. 
     * @return SecureLevel <p>Indicates the security level of authentication. Security levels are divided into:<br>"1": silent liveness;<br>"2": action liveness detection;<br>"3": light liveness;<br>"4": action + light liveness;<br>Default value is "4".</p>
**Note:** Security level increases from `1` to `4`, with `4` providing the highest security.
     */
    public String getSecureLevel() {
        return this.SecureLevel;
    }

    /**
     * Set <p>Indicates the security level of authentication. Security levels are divided into:<br>"1": silent liveness;<br>"2": action liveness detection;<br>"3": light liveness;<br>"4": action + light liveness;<br>Default value is "4".</p>
**Note:** Security level increases from `1` to `4`, with `4` providing the highest security.
     * @param SecureLevel <p>Indicates the security level of authentication. Security levels are divided into:<br>"1": silent liveness;<br>"2": action liveness detection;<br>"3": light liveness;<br>"4": action + light liveness;<br>Default value is "4".</p>
**Note:** Security level increases from `1` to `4`, with `4` providing the highest security.
     */
    public void setSecureLevel(String SecureLevel) {
        this.SecureLevel = SecureLevel;
    }

    /**
     * Get <p>The base64 code of the image for comparison, used for the "liveness comparison" mode. This parameter is required when CheckMode is "compare".</p> 
     * @return Image <p>The base64 code of the image for comparison, used for the "liveness comparison" mode. This parameter is required when CheckMode is "compare".</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>The base64 code of the image for comparison, used for the "liveness comparison" mode. This parameter is required when CheckMode is "compare".</p>
     * @param Image <p>The base64 code of the image for comparison, used for the "liveness comparison" mode. This parameter is required when CheckMode is "compare".</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>This parameter is a business passthrough parameter and can be omitted unless otherwise needed.</p> 
     * @return Extra <p>This parameter is a business passthrough parameter and can be omitted unless otherwise needed.</p>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>This parameter is a business passthrough parameter and can be omitted unless otherwise needed.</p>
     * @param Extra <p>This parameter is a business passthrough parameter and can be omitted unless otherwise needed.</p>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>This API is used to control the sequence of actions. The action types are as follows:<br>"blink"<br>"mouth"<br>"nod"<br>"shake"<br>Choose 1-2 actions from the four.<br>Single action example: "blink"<br>Multi-action example: "blink,mouth".<br>Default value is blink.<br>Input this parameter only when SecureLevel is 2 or 4 for different action types to take effect; otherwise, the API returns an error.</p> 
     * @return ActionList <p>This API is used to control the sequence of actions. The action types are as follows:<br>"blink"<br>"mouth"<br>"nod"<br>"shake"<br>Choose 1-2 actions from the four.<br>Single action example: "blink"<br>Multi-action example: "blink,mouth".<br>Default value is blink.<br>Input this parameter only when SecureLevel is 2 or 4 for different action types to take effect; otherwise, the API returns an error.</p>
     */
    public String getActionList() {
        return this.ActionList;
    }

    /**
     * Set <p>This API is used to control the sequence of actions. The action types are as follows:<br>"blink"<br>"mouth"<br>"nod"<br>"shake"<br>Choose 1-2 actions from the four.<br>Single action example: "blink"<br>Multi-action example: "blink,mouth".<br>Default value is blink.<br>Input this parameter only when SecureLevel is 2 or 4 for different action types to take effect; otherwise, the API returns an error.</p>
     * @param ActionList <p>This API is used to control the sequence of actions. The action types are as follows:<br>"blink"<br>"mouth"<br>"nod"<br>"shake"<br>Choose 1-2 actions from the four.<br>Single action example: "blink"<br>Multi-action example: "blink,mouth".<br>Default value is blink.<br>Input this parameter only when SecureLevel is 2 or 4 for different action types to take effect; otherwise, the API returns an error.</p>
     */
    public void setActionList(String ActionList) {
        this.ActionList = ActionList;
    }

    /**
     * Get <p>PLUS: PLUS version, PRO: PRO version, ENHANCED: enhanced, BASIC: basic (default)</p> 
     * @return SdkVersion <p>PLUS: PLUS version, PRO: PRO version, ENHANCED: enhanced, BASIC: basic (default)</p>
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set <p>PLUS: PLUS version, PRO: PRO version, ENHANCED: enhanced, BASIC: basic (default)</p>
     * @param SdkVersion <p>PLUS: PLUS version, PRO: PRO version, ENHANCED: enhanced, BASIC: basic (default)</p>
     */
    public void setSdkVersion(String SdkVersion) {
        this.SdkVersion = SdkVersion;
    }

    /**
     * Get <p>Liveness retry count</p><p>Value ranges from 1 to 5</p><p>Default value: 5</p> 
     * @return RetryLimit <p>Liveness retry count</p><p>Value ranges from 1 to 5</p><p>Default value: 5</p>
     */
    public Long getRetryLimit() {
        return this.RetryLimit;
    }

    /**
     * Set <p>Liveness retry count</p><p>Value ranges from 1 to 5</p><p>Default value: 5</p>
     * @param RetryLimit <p>Liveness retry count</p><p>Value ranges from 1 to 5</p><p>Default value: 5</p>
     */
    public void setRetryLimit(Long RetryLimit) {
        this.RetryLimit = RetryLimit;
    }

    public GetFaceIdTokenIntlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFaceIdTokenIntlRequest(GetFaceIdTokenIntlRequest source) {
        if (source.CheckMode != null) {
            this.CheckMode = new String(source.CheckMode);
        }
        if (source.SecureLevel != null) {
            this.SecureLevel = new String(source.SecureLevel);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.ActionList != null) {
            this.ActionList = new String(source.ActionList);
        }
        if (source.SdkVersion != null) {
            this.SdkVersion = new String(source.SdkVersion);
        }
        if (source.RetryLimit != null) {
            this.RetryLimit = new Long(source.RetryLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckMode", this.CheckMode);
        this.setParamSimple(map, prefix + "SecureLevel", this.SecureLevel);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "ActionList", this.ActionList);
        this.setParamSimple(map, prefix + "SdkVersion", this.SdkVersion);
        this.setParamSimple(map, prefix + "RetryLimit", this.RetryLimit);

    }
}

