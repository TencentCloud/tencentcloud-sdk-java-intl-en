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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecycleConfig extends AbstractModel {

    /**
    * Custom script before node initialization
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("PreInit")
    @Expose
    private String PreInit;

    /**
    * Custom script after node initialization
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("PostInit")
    @Expose
    private String PostInit;

    /**
     * Get Custom script before node initialization
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return PreInit Custom script before node initialization
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getPreInit() {
        return this.PreInit;
    }

    /**
     * Set Custom script before node initialization
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param PreInit Custom script before node initialization
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setPreInit(String PreInit) {
        this.PreInit = PreInit;
    }

    /**
     * Get Custom script after node initialization
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return PostInit Custom script after node initialization
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getPostInit() {
        return this.PostInit;
    }

    /**
     * Set Custom script after node initialization
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param PostInit Custom script after node initialization
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setPostInit(String PostInit) {
        this.PostInit = PostInit;
    }

    public LifecycleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleConfig(LifecycleConfig source) {
        if (source.PreInit != null) {
            this.PreInit = new String(source.PreInit);
        }
        if (source.PostInit != null) {
            this.PostInit = new String(source.PostInit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PreInit", this.PreInit);
        this.setParamSimple(map, prefix + "PostInit", this.PostInit);

    }
}

