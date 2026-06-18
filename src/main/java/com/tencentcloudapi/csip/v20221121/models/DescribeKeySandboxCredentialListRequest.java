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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKeySandboxCredentialListRequest extends AbstractModel {

    /**
    * Filter criteria list: supported filter conditions as follows:
CredentialName - Credential name (fuzzy matching)
CredentialType - Credential type (exact match). Parameter values: access, sts.
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get Filter criteria list: supported filter conditions as follows:
CredentialName - Credential name (fuzzy matching)
CredentialType - Credential type (exact match). Parameter values: access, sts. 
     * @return Filter Filter criteria list: supported filter conditions as follows:
CredentialName - Credential name (fuzzy matching)
CredentialType - Credential type (exact match). Parameter values: access, sts.
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter criteria list: supported filter conditions as follows:
CredentialName - Credential name (fuzzy matching)
CredentialType - Credential type (exact match). Parameter values: access, sts.
     * @param Filter Filter criteria list: supported filter conditions as follows:
CredentialName - Credential name (fuzzy matching)
CredentialType - Credential type (exact match). Parameter values: access, sts.
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeKeySandboxCredentialListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKeySandboxCredentialListRequest(DescribeKeySandboxCredentialListRequest source) {
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

