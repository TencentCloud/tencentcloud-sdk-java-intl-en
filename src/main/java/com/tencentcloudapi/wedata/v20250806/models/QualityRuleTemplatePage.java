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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityRuleTemplatePage extends AbstractModel {

    /**
    * Number of records.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Template list.
    */
    @SerializedName("Items")
    @Expose
    private QualityRuleTemplate [] Items;

    /**
     * Get Number of records. 
     * @return TotalCount Number of records.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of records.
     * @param TotalCount Number of records.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Template list. 
     * @return Items Template list.
     */
    public QualityRuleTemplate [] getItems() {
        return this.Items;
    }

    /**
     * Set Template list.
     * @param Items Template list.
     */
    public void setItems(QualityRuleTemplate [] Items) {
        this.Items = Items;
    }

    public QualityRuleTemplatePage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityRuleTemplatePage(QualityRuleTemplatePage source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new QualityRuleTemplate[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new QualityRuleTemplate(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

