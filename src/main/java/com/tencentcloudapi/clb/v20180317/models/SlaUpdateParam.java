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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlaUpdateParam extends AbstractModel {

    /**
    * ID of the CLB instance
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * LCU-supported instance specification. Value:
<li>`SLA`: If you have activated Super Large LCU-supported instances, `SLA` indicates Super Large 4.</li>
<li>`clb.c2.medium`: Standard</li>
<li>`clb.c3.small`: Advanced 1</li>
<li>`clb.c3.medium`: Advanced 2</li>
<li>`clb.c4.small`: Super Large 1</li>
<li>`clb.c4.medium`: Super Large 2</li>
<li>`clb.c4.large`: Super Large 3</li>
<li>`clb.c4.xlarge`: Super Large 4</li> For Super Large 2 and above specifications, please [submit a ticket](https://console.cloud.tencent.com/workorder/category). For more specifications, see [Specifications Comparison](https://intl.cloud.tencent.com/document/product/214/84689?from_cn_redirect=1)
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
     * Get ID of the CLB instance 
     * @return LoadBalancerId ID of the CLB instance
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the CLB instance
     * @param LoadBalancerId ID of the CLB instance
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get LCU-supported instance specification. Value:
<li>`SLA`: If you have activated Super Large LCU-supported instances, `SLA` indicates Super Large 4.</li>
<li>`clb.c2.medium`: Standard</li>
<li>`clb.c3.small`: Advanced 1</li>
<li>`clb.c3.medium`: Advanced 2</li>
<li>`clb.c4.small`: Super Large 1</li>
<li>`clb.c4.medium`: Super Large 2</li>
<li>`clb.c4.large`: Super Large 3</li>
<li>`clb.c4.xlarge`: Super Large 4</li> For Super Large 2 and above specifications, please [submit a ticket](https://console.cloud.tencent.com/workorder/category). For more specifications, see [Specifications Comparison](https://intl.cloud.tencent.com/document/product/214/84689?from_cn_redirect=1) 
     * @return SlaType LCU-supported instance specification. Value:
<li>`SLA`: If you have activated Super Large LCU-supported instances, `SLA` indicates Super Large 4.</li>
<li>`clb.c2.medium`: Standard</li>
<li>`clb.c3.small`: Advanced 1</li>
<li>`clb.c3.medium`: Advanced 2</li>
<li>`clb.c4.small`: Super Large 1</li>
<li>`clb.c4.medium`: Super Large 2</li>
<li>`clb.c4.large`: Super Large 3</li>
<li>`clb.c4.xlarge`: Super Large 4</li> For Super Large 2 and above specifications, please [submit a ticket](https://console.cloud.tencent.com/workorder/category). For more specifications, see [Specifications Comparison](https://intl.cloud.tencent.com/document/product/214/84689?from_cn_redirect=1)
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set LCU-supported instance specification. Value:
<li>`SLA`: If you have activated Super Large LCU-supported instances, `SLA` indicates Super Large 4.</li>
<li>`clb.c2.medium`: Standard</li>
<li>`clb.c3.small`: Advanced 1</li>
<li>`clb.c3.medium`: Advanced 2</li>
<li>`clb.c4.small`: Super Large 1</li>
<li>`clb.c4.medium`: Super Large 2</li>
<li>`clb.c4.large`: Super Large 3</li>
<li>`clb.c4.xlarge`: Super Large 4</li> For Super Large 2 and above specifications, please [submit a ticket](https://console.cloud.tencent.com/workorder/category). For more specifications, see [Specifications Comparison](https://intl.cloud.tencent.com/document/product/214/84689?from_cn_redirect=1)
     * @param SlaType LCU-supported instance specification. Value:
<li>`SLA`: If you have activated Super Large LCU-supported instances, `SLA` indicates Super Large 4.</li>
<li>`clb.c2.medium`: Standard</li>
<li>`clb.c3.small`: Advanced 1</li>
<li>`clb.c3.medium`: Advanced 2</li>
<li>`clb.c4.small`: Super Large 1</li>
<li>`clb.c4.medium`: Super Large 2</li>
<li>`clb.c4.large`: Super Large 3</li>
<li>`clb.c4.xlarge`: Super Large 4</li> For Super Large 2 and above specifications, please [submit a ticket](https://console.cloud.tencent.com/workorder/category). For more specifications, see [Specifications Comparison](https://intl.cloud.tencent.com/document/product/214/84689?from_cn_redirect=1)
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    public SlaUpdateParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlaUpdateParam(SlaUpdateParam source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);

    }
}

