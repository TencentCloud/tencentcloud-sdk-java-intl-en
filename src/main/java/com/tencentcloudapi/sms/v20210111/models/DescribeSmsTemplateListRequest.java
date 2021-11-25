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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSmsTemplateListRequest extends AbstractModel{

    /**
    * Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * Array of template IDs. If the array is empty, the template list information will be queried by default (only allowed for root accounts). You need to use the `Limit` and `Offset` fields to set the query range.
<dx-alert infotype="notice" title="Note">The default array length can be up to 100</dx-alert>
    */
    @SerializedName("TemplateIdSet")
    @Expose
    private Long [] TemplateIdSet;

    /**
    * Upper limit. Maximum value: 100.
Note: it is 0 by default and is enabled when `TemplateIdSet` is empty.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
Note: it is 0 by default and is enabled when `TemplateIdSet` is empty.
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
     * Get Array of template IDs. If the array is empty, the template list information will be queried by default (only allowed for root accounts). You need to use the `Limit` and `Offset` fields to set the query range.
<dx-alert infotype="notice" title="Note">The default array length can be up to 100</dx-alert> 
     * @return TemplateIdSet Array of template IDs. If the array is empty, the template list information will be queried by default (only allowed for root accounts). You need to use the `Limit` and `Offset` fields to set the query range.
<dx-alert infotype="notice" title="Note">The default array length can be up to 100</dx-alert>
     */
    public Long [] getTemplateIdSet() {
        return this.TemplateIdSet;
    }

    /**
     * Set Array of template IDs. If the array is empty, the template list information will be queried by default (only allowed for root accounts). You need to use the `Limit` and `Offset` fields to set the query range.
<dx-alert infotype="notice" title="Note">The default array length can be up to 100</dx-alert>
     * @param TemplateIdSet Array of template IDs. If the array is empty, the template list information will be queried by default (only allowed for root accounts). You need to use the `Limit` and `Offset` fields to set the query range.
<dx-alert infotype="notice" title="Note">The default array length can be up to 100</dx-alert>
     */
    public void setTemplateIdSet(Long [] TemplateIdSet) {
        this.TemplateIdSet = TemplateIdSet;
    }

    /**
     * Get Upper limit. Maximum value: 100.
Note: it is 0 by default and is enabled when `TemplateIdSet` is empty. 
     * @return Limit Upper limit. Maximum value: 100.
Note: it is 0 by default and is enabled when `TemplateIdSet` is empty.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Upper limit. Maximum value: 100.
Note: it is 0 by default and is enabled when `TemplateIdSet` is empty.
     * @param Limit Upper limit. Maximum value: 100.
Note: it is 0 by default and is enabled when `TemplateIdSet` is empty.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset.
Note: it is 0 by default and is enabled when `TemplateIdSet` is empty. 
     * @return Offset Offset.
Note: it is 0 by default and is enabled when `TemplateIdSet` is empty.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
Note: it is 0 by default and is enabled when `TemplateIdSet` is empty.
     * @param Offset Offset.
Note: it is 0 by default and is enabled when `TemplateIdSet` is empty.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSmsTemplateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmsTemplateListRequest(DescribeSmsTemplateListRequest source) {
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.TemplateIdSet != null) {
            this.TemplateIdSet = new Long[source.TemplateIdSet.length];
            for (int i = 0; i < source.TemplateIdSet.length; i++) {
                this.TemplateIdSet[i] = new Long(source.TemplateIdSet[i]);
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
        this.setParamArraySimple(map, prefix + "TemplateIdSet.", this.TemplateIdSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

