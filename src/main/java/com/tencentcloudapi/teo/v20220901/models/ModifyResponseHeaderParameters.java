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

public class ModifyResponseHeaderParameters extends AbstractModel {

    /**
    * HTTP origin-pull header rules list.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HeaderActions")
    @Expose
    private HeaderAction [] HeaderActions;

    /**
     * Get HTTP origin-pull header rules list.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return HeaderActions HTTP origin-pull header rules list.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public HeaderAction [] getHeaderActions() {
        return this.HeaderActions;
    }

    /**
     * Set HTTP origin-pull header rules list.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param HeaderActions HTTP origin-pull header rules list.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHeaderActions(HeaderAction [] HeaderActions) {
        this.HeaderActions = HeaderActions;
    }

    public ModifyResponseHeaderParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResponseHeaderParameters(ModifyResponseHeaderParameters source) {
        if (source.HeaderActions != null) {
            this.HeaderActions = new HeaderAction[source.HeaderActions.length];
            for (int i = 0; i < source.HeaderActions.length; i++) {
                this.HeaderActions[i] = new HeaderAction(source.HeaderActions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HeaderActions.", this.HeaderActions);

    }
}

