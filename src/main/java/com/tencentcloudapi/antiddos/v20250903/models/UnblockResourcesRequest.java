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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnblockResourcesRequest extends AbstractModel {

    /**
    * <p>List of resources to apply for unblocking. Supports unblocking based on public IP. You can obtain detailed resource information of blocked resources through the DescribeDDoSBlockRecords API. Parameter example:</p><ul><li>Public IP: 117.175.94.230.</li></ul><p>Input parameter limit: Maximum list length is 10.</p>
    */
    @SerializedName("Resources")
    @Expose
    private String [] Resources;

    /**
     * Get <p>List of resources to apply for unblocking. Supports unblocking based on public IP. You can obtain detailed resource information of blocked resources through the DescribeDDoSBlockRecords API. Parameter example:</p><ul><li>Public IP: 117.175.94.230.</li></ul><p>Input parameter limit: Maximum list length is 10.</p> 
     * @return Resources <p>List of resources to apply for unblocking. Supports unblocking based on public IP. You can obtain detailed resource information of blocked resources through the DescribeDDoSBlockRecords API. Parameter example:</p><ul><li>Public IP: 117.175.94.230.</li></ul><p>Input parameter limit: Maximum list length is 10.</p>
     */
    public String [] getResources() {
        return this.Resources;
    }

    /**
     * Set <p>List of resources to apply for unblocking. Supports unblocking based on public IP. You can obtain detailed resource information of blocked resources through the DescribeDDoSBlockRecords API. Parameter example:</p><ul><li>Public IP: 117.175.94.230.</li></ul><p>Input parameter limit: Maximum list length is 10.</p>
     * @param Resources <p>List of resources to apply for unblocking. Supports unblocking based on public IP. You can obtain detailed resource information of blocked resources through the DescribeDDoSBlockRecords API. Parameter example:</p><ul><li>Public IP: 117.175.94.230.</li></ul><p>Input parameter limit: Maximum list length is 10.</p>
     */
    public void setResources(String [] Resources) {
        this.Resources = Resources;
    }

    public UnblockResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnblockResourcesRequest(UnblockResourcesRequest source) {
        if (source.Resources != null) {
            this.Resources = new String[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new String(source.Resources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Resources.", this.Resources);

    }
}

