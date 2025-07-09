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

public class AccessURLRedirectQueryString extends AbstractModel {

    /**
    * Action to be executed. values:.
<Li>`Full`: retain all</li>.
<Li>`Ignore`: ignore all</li>.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get Action to be executed. values:.
<Li>`Full`: retain all</li>.
<Li>`Ignore`: ignore all</li>. 
     * @return Action Action to be executed. values:.
<Li>`Full`: retain all</li>.
<Li>`Ignore`: ignore all</li>.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action to be executed. values:.
<Li>`Full`: retain all</li>.
<Li>`Ignore`: ignore all</li>.
     * @param Action Action to be executed. values:.
<Li>`Full`: retain all</li>.
<Li>`Ignore`: ignore all</li>.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public AccessURLRedirectQueryString() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessURLRedirectQueryString(AccessURLRedirectQueryString source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

