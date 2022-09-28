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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCondition extends AbstractModel{

    /**
    * Operator. Valid values:
<li>equal: Equal to.</li>
<li>notequal: Not equal to.</li>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Match type. Valid values:
<li>`host`: All</li>
<li>`filename`: File name</li>
<li>`extension`: File extension</li>
<li>`host`: HOST: .</li>
<li>`full_url`: The full URL of the current site. It must contain the HTTP protocol, host, and path.</li>
<li>`url`: The URL path of the current site.</li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Parameter values of the match type. Each match type has the following valid values:
<li>`Target=extension`:  The extension of the file, such as `jpg` and `txt`.</li>
<li>`Target=filename`: The file name without the extension.</li>
<li>`Target=host`: Values can be `all` 
or a host, such as `www.maxx55.com`.</li>
<li>`Target=url`: A URL request path under the current site, such as `/example`.</li>
<li>`Target=full_url`: A complete URL request under the current site. It must contain the protocol, host, and path, such as `https://www.maxx55.cn/example`.</li>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Operator. Valid values:
<li>equal: Equal to.</li>
<li>notequal: Not equal to.</li> 
     * @return Operator Operator. Valid values:
<li>equal: Equal to.</li>
<li>notequal: Not equal to.</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator. Valid values:
<li>equal: Equal to.</li>
<li>notequal: Not equal to.</li>
     * @param Operator Operator. Valid values:
<li>equal: Equal to.</li>
<li>notequal: Not equal to.</li>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Match type. Valid values:
<li>`host`: All</li>
<li>`filename`: File name</li>
<li>`extension`: File extension</li>
<li>`host`: HOST: .</li>
<li>`full_url`: The full URL of the current site. It must contain the HTTP protocol, host, and path.</li>
<li>`url`: The URL path of the current site.</li> 
     * @return Target Match type. Valid values:
<li>`host`: All</li>
<li>`filename`: File name</li>
<li>`extension`: File extension</li>
<li>`host`: HOST: .</li>
<li>`full_url`: The full URL of the current site. It must contain the HTTP protocol, host, and path.</li>
<li>`url`: The URL path of the current site.</li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Match type. Valid values:
<li>`host`: All</li>
<li>`filename`: File name</li>
<li>`extension`: File extension</li>
<li>`host`: HOST: .</li>
<li>`full_url`: The full URL of the current site. It must contain the HTTP protocol, host, and path.</li>
<li>`url`: The URL path of the current site.</li>
     * @param Target Match type. Valid values:
<li>`host`: All</li>
<li>`filename`: File name</li>
<li>`extension`: File extension</li>
<li>`host`: HOST: .</li>
<li>`full_url`: The full URL of the current site. It must contain the HTTP protocol, host, and path.</li>
<li>`url`: The URL path of the current site.</li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Parameter values of the match type. Each match type has the following valid values:
<li>`Target=extension`:  The extension of the file, such as `jpg` and `txt`.</li>
<li>`Target=filename`: The file name without the extension.</li>
<li>`Target=host`: Values can be `all` 
or a host, such as `www.maxx55.com`.</li>
<li>`Target=url`: A URL request path under the current site, such as `/example`.</li>
<li>`Target=full_url`: A complete URL request under the current site. It must contain the protocol, host, and path, such as `https://www.maxx55.cn/example`.</li> 
     * @return Values Parameter values of the match type. Each match type has the following valid values:
<li>`Target=extension`:  The extension of the file, such as `jpg` and `txt`.</li>
<li>`Target=filename`: The file name without the extension.</li>
<li>`Target=host`: Values can be `all` 
or a host, such as `www.maxx55.com`.</li>
<li>`Target=url`: A URL request path under the current site, such as `/example`.</li>
<li>`Target=full_url`: A complete URL request under the current site. It must contain the protocol, host, and path, such as `https://www.maxx55.cn/example`.</li>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Parameter values of the match type. Each match type has the following valid values:
<li>`Target=extension`:  The extension of the file, such as `jpg` and `txt`.</li>
<li>`Target=filename`: The file name without the extension.</li>
<li>`Target=host`: Values can be `all` 
or a host, such as `www.maxx55.com`.</li>
<li>`Target=url`: A URL request path under the current site, such as `/example`.</li>
<li>`Target=full_url`: A complete URL request under the current site. It must contain the protocol, host, and path, such as `https://www.maxx55.cn/example`.</li>
     * @param Values Parameter values of the match type. Each match type has the following valid values:
<li>`Target=extension`:  The extension of the file, such as `jpg` and `txt`.</li>
<li>`Target=filename`: The file name without the extension.</li>
<li>`Target=host`: Values can be `all` 
or a host, such as `www.maxx55.com`.</li>
<li>`Target=url`: A URL request path under the current site, such as `/example`.</li>
<li>`Target=full_url`: A complete URL request under the current site. It must contain the protocol, host, and path, such as `https://www.maxx55.cn/example`.</li>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public RuleCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCondition(RuleCondition source) {
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
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
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

