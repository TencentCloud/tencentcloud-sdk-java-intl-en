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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMComprehendSummaryForUpdate extends AbstractModel {

    /**
    * Segment summary task switch, available values:
-ON: Enable segment summary task.
-OFF: Disable segment summary.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Extended parameter, which is a serialized json string. See [Extended Parameter description](https://www.tencentcloud.com/document/product/862/104493?from_cn_redirect=1#note).
    */
    @SerializedName("ExtendedParameter")
    @Expose
    private String ExtendedParameter;

    /**
     * Get Segment summary task switch, available values:
-ON: Enable segment summary task.
-OFF: Disable segment summary. 
     * @return Switch Segment summary task switch, available values:
-ON: Enable segment summary task.
-OFF: Disable segment summary.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Segment summary task switch, available values:
-ON: Enable segment summary task.
-OFF: Disable segment summary.
     * @param Switch Segment summary task switch, available values:
-ON: Enable segment summary task.
-OFF: Disable segment summary.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Extended parameter, which is a serialized json string. See [Extended Parameter description](https://www.tencentcloud.com/document/product/862/104493?from_cn_redirect=1#note). 
     * @return ExtendedParameter Extended parameter, which is a serialized json string. See [Extended Parameter description](https://www.tencentcloud.com/document/product/862/104493?from_cn_redirect=1#note).
     */
    public String getExtendedParameter() {
        return this.ExtendedParameter;
    }

    /**
     * Set Extended parameter, which is a serialized json string. See [Extended Parameter description](https://www.tencentcloud.com/document/product/862/104493?from_cn_redirect=1#note).
     * @param ExtendedParameter Extended parameter, which is a serialized json string. See [Extended Parameter description](https://www.tencentcloud.com/document/product/862/104493?from_cn_redirect=1#note).
     */
    public void setExtendedParameter(String ExtendedParameter) {
        this.ExtendedParameter = ExtendedParameter;
    }

    public LLMComprehendSummaryForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMComprehendSummaryForUpdate(LLMComprehendSummaryForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ExtendedParameter != null) {
            this.ExtendedParameter = new String(source.ExtendedParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ExtendedParameter", this.ExtendedParameter);

    }
}

