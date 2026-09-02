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

public class BaselineCustomItemConf extends AbstractModel {

    /**
    * <p>Built-in detection item rule ID. Either this or CustomItemID needs to be imported.</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * <p>User-defined judgment value list, which must comply with the value constraints defined by the detection item WebEditParam.</p>
    */
    @SerializedName("CustomValueList")
    @Expose
    private String [] CustomValueList;

    /**
    * <p>Existing custom configuration ID. It can be omitted when projects are added and is filled in when editing.</p>
    */
    @SerializedName("CustomItemID")
    @Expose
    private Long CustomItemID;

    /**
     * Get <p>Built-in detection item rule ID. Either this or CustomItemID needs to be imported.</p> 
     * @return RuleID <p>Built-in detection item rule ID. Either this or CustomItemID needs to be imported.</p>
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>Built-in detection item rule ID. Either this or CustomItemID needs to be imported.</p>
     * @param RuleID <p>Built-in detection item rule ID. Either this or CustomItemID needs to be imported.</p>
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>User-defined judgment value list, which must comply with the value constraints defined by the detection item WebEditParam.</p> 
     * @return CustomValueList <p>User-defined judgment value list, which must comply with the value constraints defined by the detection item WebEditParam.</p>
     */
    public String [] getCustomValueList() {
        return this.CustomValueList;
    }

    /**
     * Set <p>User-defined judgment value list, which must comply with the value constraints defined by the detection item WebEditParam.</p>
     * @param CustomValueList <p>User-defined judgment value list, which must comply with the value constraints defined by the detection item WebEditParam.</p>
     */
    public void setCustomValueList(String [] CustomValueList) {
        this.CustomValueList = CustomValueList;
    }

    /**
     * Get <p>Existing custom configuration ID. It can be omitted when projects are added and is filled in when editing.</p> 
     * @return CustomItemID <p>Existing custom configuration ID. It can be omitted when projects are added and is filled in when editing.</p>
     */
    public Long getCustomItemID() {
        return this.CustomItemID;
    }

    /**
     * Set <p>Existing custom configuration ID. It can be omitted when projects are added and is filled in when editing.</p>
     * @param CustomItemID <p>Existing custom configuration ID. It can be omitted when projects are added and is filled in when editing.</p>
     */
    public void setCustomItemID(Long CustomItemID) {
        this.CustomItemID = CustomItemID;
    }

    public BaselineCustomItemConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineCustomItemConf(BaselineCustomItemConf source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.CustomValueList != null) {
            this.CustomValueList = new String[source.CustomValueList.length];
            for (int i = 0; i < source.CustomValueList.length; i++) {
                this.CustomValueList[i] = new String(source.CustomValueList[i]);
            }
        }
        if (source.CustomItemID != null) {
            this.CustomItemID = new Long(source.CustomItemID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "CustomValueList.", this.CustomValueList);
        this.setParamSimple(map, prefix + "CustomItemID", this.CustomItemID);

    }
}

