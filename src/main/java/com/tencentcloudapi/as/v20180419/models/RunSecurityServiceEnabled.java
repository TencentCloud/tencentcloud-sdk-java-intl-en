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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunSecurityServiceEnabled extends AbstractModel {

    /**
    * Whether to enable [Cloud Workload Protection Platform (CWPP)](https://intl.cloud.tencent.com/document/product/296?from_cn_redirect=1). Valid values:
<li>TRUE: enable CWPP.</li>
<li>FALSE: disable CWPP.</li>
Default value: TRUE.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get Whether to enable [Cloud Workload Protection Platform (CWPP)](https://intl.cloud.tencent.com/document/product/296?from_cn_redirect=1). Valid values:
<li>TRUE: enable CWPP.</li>
<li>FALSE: disable CWPP.</li>
Default value: TRUE. 
     * @return Enabled Whether to enable [Cloud Workload Protection Platform (CWPP)](https://intl.cloud.tencent.com/document/product/296?from_cn_redirect=1). Valid values:
<li>TRUE: enable CWPP.</li>
<li>FALSE: disable CWPP.</li>
Default value: TRUE.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable [Cloud Workload Protection Platform (CWPP)](https://intl.cloud.tencent.com/document/product/296?from_cn_redirect=1). Valid values:
<li>TRUE: enable CWPP.</li>
<li>FALSE: disable CWPP.</li>
Default value: TRUE.
     * @param Enabled Whether to enable [Cloud Workload Protection Platform (CWPP)](https://intl.cloud.tencent.com/document/product/296?from_cn_redirect=1). Valid values:
<li>TRUE: enable CWPP.</li>
<li>FALSE: disable CWPP.</li>
Default value: TRUE.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public RunSecurityServiceEnabled() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunSecurityServiceEnabled(RunSecurityServiceEnabled source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

