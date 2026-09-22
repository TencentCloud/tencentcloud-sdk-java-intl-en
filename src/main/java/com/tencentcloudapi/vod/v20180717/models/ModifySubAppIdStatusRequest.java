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

public class ModifySubAppIdStatusRequest extends AbstractModel {

    /**
    * <b>ID of the on-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1). For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * App status. Valid values:
<li>On: enabled.</li>
<li>Off: disabled</li>
<li>Destroyed: Terminated.</li>
If the current status is `Destoying`, the enable operation is not allowed. You have to wait until the destruction is completed before you can re-enable it.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <b>ID of the on-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1). For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>ID of the on-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1). For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>ID of the on-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1). For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>ID of the on-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1). For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get App status. Valid values:
<li>On: enabled.</li>
<li>Off: disabled</li>
<li>Destroyed: Terminated.</li>
If the current status is `Destoying`, the enable operation is not allowed. You have to wait until the destruction is completed before you can re-enable it. 
     * @return Status App status. Valid values:
<li>On: enabled.</li>
<li>Off: disabled</li>
<li>Destroyed: Terminated.</li>
If the current status is `Destoying`, the enable operation is not allowed. You have to wait until the destruction is completed before you can re-enable it.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set App status. Valid values:
<li>On: enabled.</li>
<li>Off: disabled</li>
<li>Destroyed: Terminated.</li>
If the current status is `Destoying`, the enable operation is not allowed. You have to wait until the destruction is completed before you can re-enable it.
     * @param Status App status. Valid values:
<li>On: enabled.</li>
<li>Off: disabled</li>
<li>Destroyed: Terminated.</li>
If the current status is `Destoying`, the enable operation is not allowed. You have to wait until the destruction is completed before you can re-enable it.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifySubAppIdStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubAppIdStatusRequest(ModifySubAppIdStatusRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

