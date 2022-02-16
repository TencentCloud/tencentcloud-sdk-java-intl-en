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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxyCustomConfResponse extends AbstractModel{

    /**
    * Number of queried proxy configurations
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Proxy configuration details
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("CustomConf")
    @Expose
    private CustomConfig CustomConf;

    /**
    * Weight rule
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("WeightRule")
    @Expose
    private Rule WeightRule;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of queried proxy configurations
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Count Number of queried proxy configurations
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of queried proxy configurations
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Count Number of queried proxy configurations
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Proxy configuration details
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return CustomConf Proxy configuration details
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public CustomConfig getCustomConf() {
        return this.CustomConf;
    }

    /**
     * Set Proxy configuration details
Note: this field may return `null`, indicating that no valid value can be found.
     * @param CustomConf Proxy configuration details
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setCustomConf(CustomConfig CustomConf) {
        this.CustomConf = CustomConf;
    }

    /**
     * Get Weight rule
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return WeightRule Weight rule
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Rule getWeightRule() {
        return this.WeightRule;
    }

    /**
     * Set Weight rule
Note: this field may return `null`, indicating that no valid value can be found.
     * @param WeightRule Weight rule
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setWeightRule(Rule WeightRule) {
        this.WeightRule = WeightRule;
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

    public DescribeProxyCustomConfResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyCustomConfResponse(DescribeProxyCustomConfResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CustomConf != null) {
            this.CustomConf = new CustomConfig(source.CustomConf);
        }
        if (source.WeightRule != null) {
            this.WeightRule = new Rule(source.WeightRule);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "CustomConf.", this.CustomConf);
        this.setParamObj(map, prefix + "WeightRule.", this.WeightRule);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

