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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnAclRule extends AbstractModel{

    /**
    * Match keywords. Valid values: `params`, `url`, `ip`, `referer`, and `user-agent`.
    */
    @SerializedName("MatchKey")
    @Expose
    private String MatchKey;

    /**
    * Logical operator. Valid values: `exclude`, `include`, `notequal`, `equal`, `len-less`, `len-equal`, and `len-more`.
    */
    @SerializedName("LogiOperator")
    @Expose
    private String LogiOperator;

    /**
    * Match value
    */
    @SerializedName("MatchValue")
    @Expose
    private String MatchValue;

    /**
     * Get Match keywords. Valid values: `params`, `url`, `ip`, `referer`, and `user-agent`. 
     * @return MatchKey Match keywords. Valid values: `params`, `url`, `ip`, `referer`, and `user-agent`.
     */
    public String getMatchKey() {
        return this.MatchKey;
    }

    /**
     * Set Match keywords. Valid values: `params`, `url`, `ip`, `referer`, and `user-agent`.
     * @param MatchKey Match keywords. Valid values: `params`, `url`, `ip`, `referer`, and `user-agent`.
     */
    public void setMatchKey(String MatchKey) {
        this.MatchKey = MatchKey;
    }

    /**
     * Get Logical operator. Valid values: `exclude`, `include`, `notequal`, `equal`, `len-less`, `len-equal`, and `len-more`. 
     * @return LogiOperator Logical operator. Valid values: `exclude`, `include`, `notequal`, `equal`, `len-less`, `len-equal`, and `len-more`.
     */
    public String getLogiOperator() {
        return this.LogiOperator;
    }

    /**
     * Set Logical operator. Valid values: `exclude`, `include`, `notequal`, `equal`, `len-less`, `len-equal`, and `len-more`.
     * @param LogiOperator Logical operator. Valid values: `exclude`, `include`, `notequal`, `equal`, `len-less`, `len-equal`, and `len-more`.
     */
    public void setLogiOperator(String LogiOperator) {
        this.LogiOperator = LogiOperator;
    }

    /**
     * Get Match value 
     * @return MatchValue Match value
     */
    public String getMatchValue() {
        return this.MatchValue;
    }

    /**
     * Set Match value
     * @param MatchValue Match value
     */
    public void setMatchValue(String MatchValue) {
        this.MatchValue = MatchValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchKey", this.MatchKey);
        this.setParamSimple(map, prefix + "LogiOperator", this.LogiOperator);
        this.setParamSimple(map, prefix + "MatchValue", this.MatchValue);

    }
}

