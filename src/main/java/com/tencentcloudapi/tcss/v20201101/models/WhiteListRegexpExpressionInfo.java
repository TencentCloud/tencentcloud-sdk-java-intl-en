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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhiteListRegexpExpressionInfo extends AbstractModel {

    /**
    * Logic symbol
AND
OR
NOT
    */
    @SerializedName("LogicSymbol")
    @Expose
    private String LogicSymbol;

    /**
    * Matching field
    */
    @SerializedName("MatchField")
    @Expose
    private String MatchField;

    /**
    * Matching content
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
     * Get Logic symbol
AND
OR
NOT 
     * @return LogicSymbol Logic symbol
AND
OR
NOT
     */
    public String getLogicSymbol() {
        return this.LogicSymbol;
    }

    /**
     * Set Logic symbol
AND
OR
NOT
     * @param LogicSymbol Logic symbol
AND
OR
NOT
     */
    public void setLogicSymbol(String LogicSymbol) {
        this.LogicSymbol = LogicSymbol;
    }

    /**
     * Get Matching field 
     * @return MatchField Matching field
     */
    public String getMatchField() {
        return this.MatchField;
    }

    /**
     * Set Matching field
     * @param MatchField Matching field
     */
    public void setMatchField(String MatchField) {
        this.MatchField = MatchField;
    }

    /**
     * Get Matching content 
     * @return MatchContent Matching content
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set Matching content
     * @param MatchContent Matching content
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
    }

    public WhiteListRegexpExpressionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhiteListRegexpExpressionInfo(WhiteListRegexpExpressionInfo source) {
        if (source.LogicSymbol != null) {
            this.LogicSymbol = new String(source.LogicSymbol);
        }
        if (source.MatchField != null) {
            this.MatchField = new String(source.MatchField);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogicSymbol", this.LogicSymbol);
        this.setParamSimple(map, prefix + "MatchField", this.MatchField);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);

    }
}

