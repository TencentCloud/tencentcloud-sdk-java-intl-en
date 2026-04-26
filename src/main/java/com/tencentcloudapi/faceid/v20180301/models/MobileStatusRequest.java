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

public class MobileStatusRequest extends AbstractModel {

    /**
    * Mobile number.
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * Sensitive data encryption info.
-Users with encryption requirements for incoming information (mobile number) can use this parameter. For details, please click the left-side link.
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get Mobile number. 
     * @return Mobile Mobile number.
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set Mobile number.
     * @param Mobile Mobile number.
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get Sensitive data encryption info.
-Users with encryption requirements for incoming information (mobile number) can use this parameter. For details, please click the left-side link. 
     * @return Encryption Sensitive data encryption info.
-Users with encryption requirements for incoming information (mobile number) can use this parameter. For details, please click the left-side link.
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set Sensitive data encryption info.
-Users with encryption requirements for incoming information (mobile number) can use this parameter. For details, please click the left-side link.
     * @param Encryption Sensitive data encryption info.
-Users with encryption requirements for incoming information (mobile number) can use this parameter. For details, please click the left-side link.
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public MobileStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MobileStatusRequest(MobileStatusRequest source) {
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

