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
    * The detection mode. Valid values:
`liveness`: Liveness detection only.
`compare`: Selfie Verification(liveness detection and face comparison).
Default value: `liveness`.
    */
    @SerializedName("CheckMode")
    @Expose
    private String CheckMode;

    /**
    * The verification security level. Valid values:
`1`: Video-based liveness detection.
`2`: Motion-based liveness detection.
`3`: Reflection-based liveness detection.
`4`: Motion- and reflection-based liveness detection.
Default value: `4`.
    */
    @SerializedName("SecureLevel")
    @Expose
    private String SecureLevel;

    /**
    * The photo (in Base64) to compare. This parameter is required when the value of `CheckMode` is `compare`.
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * The pass-through parameter, which can be omitted if there are no special requirements.
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * This interface is used to control th action sequences.
Action types are as follows:
"blink"
"mouth"
"nod"
"shake"
You can choose 1-2 actions out of the four.
Single action example: "blink"
Multiple action example: "blink,mouth"
The default value is blink. The different action types passed in this parameter take effect only when the SecurityLevel is 2 or 4; otherwise, the interface reports an error.
    */
    @SerializedName("ActionList")
    @Expose
    private String ActionList;

    /**
    * BASIC: Basic Version (Default).
    */
    @SerializedName("SdkVersion")
    @Expose
    private String SdkVersion;

    /**
     * Get The detection mode. Valid values:
`liveness`: Liveness detection only.
`compare`: Selfie Verification(liveness detection and face comparison).
Default value: `liveness`. 
     * @return CheckMode The detection mode. Valid values:
`liveness`: Liveness detection only.
`compare`: Selfie Verification(liveness detection and face comparison).
Default value: `liveness`.
     */
    public String getCheckMode() {
        return this.CheckMode;
    }

    /**
     * Set The detection mode. Valid values:
`liveness`: Liveness detection only.
`compare`: Selfie Verification(liveness detection and face comparison).
Default value: `liveness`.
     * @param CheckMode The detection mode. Valid values:
`liveness`: Liveness detection only.
`compare`: Selfie Verification(liveness detection and face comparison).
Default value: `liveness`.
     */
    public void setCheckMode(String CheckMode) {
        this.CheckMode = CheckMode;
    }

    /**
     * Get The verification security level. Valid values:
`1`: Video-based liveness detection.
`2`: Motion-based liveness detection.
`3`: Reflection-based liveness detection.
`4`: Motion- and reflection-based liveness detection.
Default value: `4`. 
     * @return SecureLevel The verification security level. Valid values:
`1`: Video-based liveness detection.
`2`: Motion-based liveness detection.
`3`: Reflection-based liveness detection.
`4`: Motion- and reflection-based liveness detection.
Default value: `4`.
     */
    public String getSecureLevel() {
        return this.SecureLevel;
    }

    /**
     * Set The verification security level. Valid values:
`1`: Video-based liveness detection.
`2`: Motion-based liveness detection.
`3`: Reflection-based liveness detection.
`4`: Motion- and reflection-based liveness detection.
Default value: `4`.
     * @param SecureLevel The verification security level. Valid values:
`1`: Video-based liveness detection.
`2`: Motion-based liveness detection.
`3`: Reflection-based liveness detection.
`4`: Motion- and reflection-based liveness detection.
Default value: `4`.
     */
    public void setSecureLevel(String SecureLevel) {
        this.SecureLevel = SecureLevel;
    }

    /**
     * Get The photo (in Base64) to compare. This parameter is required when the value of `CheckMode` is `compare`. 
     * @return Image The photo (in Base64) to compare. This parameter is required when the value of `CheckMode` is `compare`.
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set The photo (in Base64) to compare. This parameter is required when the value of `CheckMode` is `compare`.
     * @param Image The photo (in Base64) to compare. This parameter is required when the value of `CheckMode` is `compare`.
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get The pass-through parameter, which can be omitted if there are no special requirements. 
     * @return Extra The pass-through parameter, which can be omitted if there are no special requirements.
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set The pass-through parameter, which can be omitted if there are no special requirements.
     * @param Extra The pass-through parameter, which can be omitted if there are no special requirements.
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get This interface is used to control th action sequences.
Action types are as follows:
"blink"
"mouth"
"nod"
"shake"
You can choose 1-2 actions out of the four.
Single action example: "blink"
Multiple action example: "blink,mouth"
The default value is blink. The different action types passed in this parameter take effect only when the SecurityLevel is 2 or 4; otherwise, the interface reports an error. 
     * @return ActionList This interface is used to control th action sequences.
Action types are as follows:
"blink"
"mouth"
"nod"
"shake"
You can choose 1-2 actions out of the four.
Single action example: "blink"
Multiple action example: "blink,mouth"
The default value is blink. The different action types passed in this parameter take effect only when the SecurityLevel is 2 or 4; otherwise, the interface reports an error.
     */
    public String getActionList() {
        return this.ActionList;
    }

    /**
     * Set This interface is used to control th action sequences.
Action types are as follows:
"blink"
"mouth"
"nod"
"shake"
You can choose 1-2 actions out of the four.
Single action example: "blink"
Multiple action example: "blink,mouth"
The default value is blink. The different action types passed in this parameter take effect only when the SecurityLevel is 2 or 4; otherwise, the interface reports an error.
     * @param ActionList This interface is used to control th action sequences.
Action types are as follows:
"blink"
"mouth"
"nod"
"shake"
You can choose 1-2 actions out of the four.
Single action example: "blink"
Multiple action example: "blink,mouth"
The default value is blink. The different action types passed in this parameter take effect only when the SecurityLevel is 2 or 4; otherwise, the interface reports an error.
     */
    public void setActionList(String ActionList) {
        this.ActionList = ActionList;
    }

    /**
     * Get BASIC: Basic Version (Default). 
     * @return SdkVersion BASIC: Basic Version (Default).
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set BASIC: Basic Version (Default).
     * @param SdkVersion BASIC: Basic Version (Default).
     */
    public void setSdkVersion(String SdkVersion) {
        this.SdkVersion = SdkVersion;
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

    }
}

