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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeWebHook extends AbstractModel {

    /**
    * Group Robot Type, currently supports Feishu
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HookType")
    @Expose
    private String HookType;

    /**
    * Group Robot Webhook Address, configuration method refer to https://intl.cloud.tencent.com/document/product/1254/70736?from_cn_redirect=1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HookAddress")
    @Expose
    private String HookAddress;

    /**
     * Get Group Robot Type, currently supports Feishu
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HookType Group Robot Type, currently supports Feishu
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getHookType() {
        return this.HookType;
    }

    /**
     * Set Group Robot Type, currently supports Feishu
Note: This field may return null, indicating that no valid value can be obtained.
     * @param HookType Group Robot Type, currently supports Feishu
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHookType(String HookType) {
        this.HookType = HookType;
    }

    /**
     * Get Group Robot Webhook Address, configuration method refer to https://intl.cloud.tencent.com/document/product/1254/70736?from_cn_redirect=1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HookAddress Group Robot Webhook Address, configuration method refer to https://intl.cloud.tencent.com/document/product/1254/70736?from_cn_redirect=1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getHookAddress() {
        return this.HookAddress;
    }

    /**
     * Set Group Robot Webhook Address, configuration method refer to https://intl.cloud.tencent.com/document/product/1254/70736?from_cn_redirect=1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param HookAddress Group Robot Webhook Address, configuration method refer to https://intl.cloud.tencent.com/document/product/1254/70736?from_cn_redirect=1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHookAddress(String HookAddress) {
        this.HookAddress = HookAddress;
    }

    public SubscribeWebHook() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeWebHook(SubscribeWebHook source) {
        if (source.HookType != null) {
            this.HookType = new String(source.HookType);
        }
        if (source.HookAddress != null) {
            this.HookAddress = new String(source.HookAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HookType", this.HookType);
        this.setParamSimple(map, prefix + "HookAddress", this.HookAddress);

    }
}

