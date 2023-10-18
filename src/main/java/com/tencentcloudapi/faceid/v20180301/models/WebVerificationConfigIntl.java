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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebVerificationConfigIntl extends AbstractModel {

    /**
    * Whether to automatically redirect to `RedirectUrl` after successful verification. Default value: `false`.
    */
    @SerializedName("AutoSkip")
    @Expose
    private Boolean AutoSkip;

    /**
     * Get Whether to automatically redirect to `RedirectUrl` after successful verification. Default value: `false`. 
     * @return AutoSkip Whether to automatically redirect to `RedirectUrl` after successful verification. Default value: `false`.
     */
    public Boolean getAutoSkip() {
        return this.AutoSkip;
    }

    /**
     * Set Whether to automatically redirect to `RedirectUrl` after successful verification. Default value: `false`.
     * @param AutoSkip Whether to automatically redirect to `RedirectUrl` after successful verification. Default value: `false`.
     */
    public void setAutoSkip(Boolean AutoSkip) {
        this.AutoSkip = AutoSkip;
    }

    public WebVerificationConfigIntl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebVerificationConfigIntl(WebVerificationConfigIntl source) {
        if (source.AutoSkip != null) {
            this.AutoSkip = new Boolean(source.AutoSkip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSkip", this.AutoSkip);

    }
}

