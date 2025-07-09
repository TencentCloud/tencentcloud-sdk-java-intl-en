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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSmsSignListRequest extends AbstractModel {

    /**
    * Signature ID array.
    */
    @SerializedName("SignIdSet")
    @Expose
    private Long [] SignIdSet;

    /**
    * Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
     * Get Signature ID array. 
     * @return SignIdSet Signature ID array.
     */
    public Long [] getSignIdSet() {
        return this.SignIdSet;
    }

    /**
     * Set Signature ID array.
     * @param SignIdSet Signature ID array.
     */
    public void setSignIdSet(Long [] SignIdSet) {
        this.SignIdSet = SignIdSet;
    }

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

    public DescribeSmsSignListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmsSignListRequest(DescribeSmsSignListRequest source) {
        if (source.SignIdSet != null) {
            this.SignIdSet = new Long[source.SignIdSet.length];
            for (int i = 0; i < source.SignIdSet.length; i++) {
                this.SignIdSet[i] = new Long(source.SignIdSet[i]);
            }
        }
        if (source.International != null) {
            this.International = new Long(source.International);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SignIdSet.", this.SignIdSet);
        this.setParamSimple(map, prefix + "International", this.International);

    }
}

