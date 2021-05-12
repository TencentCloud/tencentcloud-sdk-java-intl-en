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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSmsTemplateListRequest extends AbstractModel{

    /**
    * Template ID array.
    */
    @SerializedName("TemplateIdSet")
    @Expose
    private Long [] TemplateIdSet;

    /**
    * Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
     * Get Template ID array. 
     * @return TemplateIdSet Template ID array.
     */
    public Long [] getTemplateIdSet() {
        return this.TemplateIdSet;
    }

    /**
     * Set Template ID array.
     * @param TemplateIdSet Template ID array.
     */
    public void setTemplateIdSet(Long [] TemplateIdSet) {
        this.TemplateIdSet = TemplateIdSet;
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

    public DescribeSmsTemplateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmsTemplateListRequest(DescribeSmsTemplateListRequest source) {
        if (source.TemplateIdSet != null) {
            this.TemplateIdSet = new Long[source.TemplateIdSet.length];
            for (int i = 0; i < source.TemplateIdSet.length; i++) {
                this.TemplateIdSet[i] = new Long(source.TemplateIdSet[i]);
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
        this.setParamArraySimple(map, prefix + "TemplateIdSet.", this.TemplateIdSet);
        this.setParamSimple(map, prefix + "International", this.International);

    }
}

