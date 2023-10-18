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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRule extends AbstractModel {

    /**
    * `smart_status_close`: Disable; `smart_status_open`: Block;
`smart_status_observe`: Observe.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get `smart_status_close`: Disable; `smart_status_open`: Block;
`smart_status_observe`: Observe.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Mode `smart_status_close`: Disable; `smart_status_open`: Block;
`smart_status_observe`: Observe.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set `smart_status_close`: Disable; `smart_status_open`: Block;
`smart_status_observe`: Observe.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Mode `smart_status_close`: Disable; `smart_status_open`: Block;
`smart_status_observe`: Observe.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public AiRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRule(AiRule source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

