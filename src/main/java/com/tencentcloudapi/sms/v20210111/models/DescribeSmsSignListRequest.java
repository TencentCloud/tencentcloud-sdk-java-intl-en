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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSmsSignListRequest extends AbstractModel {

    /**
    * Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * Signature ID array.
Note: the maximum length of the array is 100 by default.
    */
    @SerializedName("SignIdSet")
    @Expose
    private Long [] SignIdSet;

    /**
    * Upper limit. Maximum value: 100.
Note: it is 10 by default and is enabled when SignIdSet is empty.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
Note: it is 0 by default and is enabled when SignIdSet is empty.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS. 
     * @return International Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
     * @param International Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get Signature ID array.
Note: the maximum length of the array is 100 by default. 
     * @return SignIdSet Signature ID array.
Note: the maximum length of the array is 100 by default.
     */
    public Long [] getSignIdSet() {
        return this.SignIdSet;
    }

    /**
     * Set Signature ID array.
Note: the maximum length of the array is 100 by default.
     * @param SignIdSet Signature ID array.
Note: the maximum length of the array is 100 by default.
     */
    public void setSignIdSet(Long [] SignIdSet) {
        this.SignIdSet = SignIdSet;
    }

    /**
     * Get Upper limit. Maximum value: 100.
Note: it is 10 by default and is enabled when SignIdSet is empty. 
     * @return Limit Upper limit. Maximum value: 100.
Note: it is 10 by default and is enabled when SignIdSet is empty.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Upper limit. Maximum value: 100.
Note: it is 10 by default and is enabled when SignIdSet is empty.
     * @param Limit Upper limit. Maximum value: 100.
Note: it is 10 by default and is enabled when SignIdSet is empty.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset.
Note: it is 0 by default and is enabled when SignIdSet is empty. 
     * @return Offset Offset.
Note: it is 0 by default and is enabled when SignIdSet is empty.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
Note: it is 0 by default and is enabled when SignIdSet is empty.
     * @param Offset Offset.
Note: it is 0 by default and is enabled when SignIdSet is empty.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSmsSignListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmsSignListRequest(DescribeSmsSignListRequest source) {
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.SignIdSet != null) {
            this.SignIdSet = new Long[source.SignIdSet.length];
            for (int i = 0; i < source.SignIdSet.length; i++) {
                this.SignIdSet[i] = new Long(source.SignIdSet[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamArraySimple(map, prefix + "SignIdSet.", this.SignIdSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

