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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntlDomainRequest extends AbstractModel {

    /**
    * The domain ID.
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
     * Get The domain ID. 
     * @return DomainId The domain ID.
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set The domain ID.
     * @param DomainId The domain ID.
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    public DescribeIntlDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntlDomainRequest(DescribeIntlDomainRequest source) {
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

