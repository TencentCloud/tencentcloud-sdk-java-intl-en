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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputInfo extends AbstractModel {

    /**
    * Channel input URL.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Channel input authentication information.
    */
    @SerializedName("AuthInfo")
    @Expose
    private InputAuthInfo AuthInfo;

    /**
     * Get Channel input URL.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Url Channel input URL.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Channel input URL.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Url Channel input URL.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Channel input authentication information. 
     * @return AuthInfo Channel input authentication information.
     */
    public InputAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set Channel input authentication information.
     * @param AuthInfo Channel input authentication information.
     */
    public void setAuthInfo(InputAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    public InputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputInfo(InputInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AuthInfo != null) {
            this.AuthInfo = new InputAuthInfo(source.AuthInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);

    }
}

