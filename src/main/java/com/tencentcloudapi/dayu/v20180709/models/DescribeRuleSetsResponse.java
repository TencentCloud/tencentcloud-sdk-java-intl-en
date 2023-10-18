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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleSetsResponse extends AbstractModel {

    /**
    * Rule record array. Valid values:
If `Key` is "Id", `Value` indicates the resource ID
If `Key` is "RuleIdList", `Value` indicates the resource rule ID. Multiple rule IDs are separated by ","
If `Key` is "RuleNameList", `Value` indicates the resource rule name. Multiple rule names are separated by ","
If `Key` is "RuleNum", `Value` indicates the number of resource rules
    */
    @SerializedName("L4RuleSets")
    @Expose
    private KeyValueRecord [] L4RuleSets;

    /**
    * Rule record array. Valid values:
If `Key` is "Id", `Value` indicates the resource ID
If `Key` is "RuleIdList", `Value` indicates the resource rule ID. Multiple rule IDs are separated by ","
If `Key` is "RuleNameList", `Value` indicates the resource rule name. Multiple rule names are separated by ","
If `Key` is "RuleNum", `Value` indicates the number of resource rules
    */
    @SerializedName("L7RuleSets")
    @Expose
    private KeyValueRecord [] L7RuleSets;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Rule record array. Valid values:
If `Key` is "Id", `Value` indicates the resource ID
If `Key` is "RuleIdList", `Value` indicates the resource rule ID. Multiple rule IDs are separated by ","
If `Key` is "RuleNameList", `Value` indicates the resource rule name. Multiple rule names are separated by ","
If `Key` is "RuleNum", `Value` indicates the number of resource rules 
     * @return L4RuleSets Rule record array. Valid values:
If `Key` is "Id", `Value` indicates the resource ID
If `Key` is "RuleIdList", `Value` indicates the resource rule ID. Multiple rule IDs are separated by ","
If `Key` is "RuleNameList", `Value` indicates the resource rule name. Multiple rule names are separated by ","
If `Key` is "RuleNum", `Value` indicates the number of resource rules
     */
    public KeyValueRecord [] getL4RuleSets() {
        return this.L4RuleSets;
    }

    /**
     * Set Rule record array. Valid values:
If `Key` is "Id", `Value` indicates the resource ID
If `Key` is "RuleIdList", `Value` indicates the resource rule ID. Multiple rule IDs are separated by ","
If `Key` is "RuleNameList", `Value` indicates the resource rule name. Multiple rule names are separated by ","
If `Key` is "RuleNum", `Value` indicates the number of resource rules
     * @param L4RuleSets Rule record array. Valid values:
If `Key` is "Id", `Value` indicates the resource ID
If `Key` is "RuleIdList", `Value` indicates the resource rule ID. Multiple rule IDs are separated by ","
If `Key` is "RuleNameList", `Value` indicates the resource rule name. Multiple rule names are separated by ","
If `Key` is "RuleNum", `Value` indicates the number of resource rules
     */
    public void setL4RuleSets(KeyValueRecord [] L4RuleSets) {
        this.L4RuleSets = L4RuleSets;
    }

    /**
     * Get Rule record array. Valid values:
If `Key` is "Id", `Value` indicates the resource ID
If `Key` is "RuleIdList", `Value` indicates the resource rule ID. Multiple rule IDs are separated by ","
If `Key` is "RuleNameList", `Value` indicates the resource rule name. Multiple rule names are separated by ","
If `Key` is "RuleNum", `Value` indicates the number of resource rules 
     * @return L7RuleSets Rule record array. Valid values:
If `Key` is "Id", `Value` indicates the resource ID
If `Key` is "RuleIdList", `Value` indicates the resource rule ID. Multiple rule IDs are separated by ","
If `Key` is "RuleNameList", `Value` indicates the resource rule name. Multiple rule names are separated by ","
If `Key` is "RuleNum", `Value` indicates the number of resource rules
     */
    public KeyValueRecord [] getL7RuleSets() {
        return this.L7RuleSets;
    }

    /**
     * Set Rule record array. Valid values:
If `Key` is "Id", `Value` indicates the resource ID
If `Key` is "RuleIdList", `Value` indicates the resource rule ID. Multiple rule IDs are separated by ","
If `Key` is "RuleNameList", `Value` indicates the resource rule name. Multiple rule names are separated by ","
If `Key` is "RuleNum", `Value` indicates the number of resource rules
     * @param L7RuleSets Rule record array. Valid values:
If `Key` is "Id", `Value` indicates the resource ID
If `Key` is "RuleIdList", `Value` indicates the resource rule ID. Multiple rule IDs are separated by ","
If `Key` is "RuleNameList", `Value` indicates the resource rule name. Multiple rule names are separated by ","
If `Key` is "RuleNum", `Value` indicates the number of resource rules
     */
    public void setL7RuleSets(KeyValueRecord [] L7RuleSets) {
        this.L7RuleSets = L7RuleSets;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRuleSetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleSetsResponse(DescribeRuleSetsResponse source) {
        if (source.L4RuleSets != null) {
            this.L4RuleSets = new KeyValueRecord[source.L4RuleSets.length];
            for (int i = 0; i < source.L4RuleSets.length; i++) {
                this.L4RuleSets[i] = new KeyValueRecord(source.L4RuleSets[i]);
            }
        }
        if (source.L7RuleSets != null) {
            this.L7RuleSets = new KeyValueRecord[source.L7RuleSets.length];
            for (int i = 0; i < source.L7RuleSets.length; i++) {
                this.L7RuleSets[i] = new KeyValueRecord(source.L7RuleSets[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "L4RuleSets.", this.L4RuleSets);
        this.setParamArrayObj(map, prefix + "L7RuleSets.", this.L7RuleSets);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

