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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCodeActionParams extends AbstractModel {

    /**
    * The status code.
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * The parameter name. You can call the [DescribeRulesSetting](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) API to view the requirements for entering the parameter name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The parameter value.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get The status code. 
     * @return StatusCode The status code.
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set The status code.
     * @param StatusCode The status code.
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get The parameter name. You can call the [DescribeRulesSetting](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) API to view the requirements for entering the parameter name. 
     * @return Name The parameter name. You can call the [DescribeRulesSetting](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) API to view the requirements for entering the parameter name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The parameter name. You can call the [DescribeRulesSetting](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) API to view the requirements for entering the parameter name.
     * @param Name The parameter name. You can call the [DescribeRulesSetting](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) API to view the requirements for entering the parameter name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The parameter value. 
     * @return Values The parameter value.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set The parameter value.
     * @param Values The parameter value.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public RuleCodeActionParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCodeActionParams(RuleCodeActionParams source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

