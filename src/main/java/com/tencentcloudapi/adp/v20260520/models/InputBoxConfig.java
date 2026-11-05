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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputBoxConfig extends AbstractModel {

    /**
    * Input box buttons: 1: Upload image, 2: Upload documents, 3: Tencent Docs, 4: Online search
    */
    @SerializedName("InputBoxButtons")
    @Expose
    private Long [] InputBoxButtons;

    /**
     * Get Input box buttons: 1: Upload image, 2: Upload documents, 3: Tencent Docs, 4: Online search 
     * @return InputBoxButtons Input box buttons: 1: Upload image, 2: Upload documents, 3: Tencent Docs, 4: Online search
     */
    public Long [] getInputBoxButtons() {
        return this.InputBoxButtons;
    }

    /**
     * Set Input box buttons: 1: Upload image, 2: Upload documents, 3: Tencent Docs, 4: Online search
     * @param InputBoxButtons Input box buttons: 1: Upload image, 2: Upload documents, 3: Tencent Docs, 4: Online search
     */
    public void setInputBoxButtons(Long [] InputBoxButtons) {
        this.InputBoxButtons = InputBoxButtons;
    }

    public InputBoxConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputBoxConfig(InputBoxConfig source) {
        if (source.InputBoxButtons != null) {
            this.InputBoxButtons = new Long[source.InputBoxButtons.length];
            for (int i = 0; i < source.InputBoxButtons.length; i++) {
                this.InputBoxButtons[i] = new Long(source.InputBoxButtons[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InputBoxButtons.", this.InputBoxButtons);

    }
}

