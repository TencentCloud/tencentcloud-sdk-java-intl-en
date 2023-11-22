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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpHeaderPathRule extends AbstractModel {

    /**
    * http header setting method: <li>set: setting. Change the value of the specified header parameter to the set value; if the set header does not exist, the header will be added; if there are multiple duplicate header parameters, all will be changed and merged into one header. ;</li> <li>del: delete. Delete the specified header parameter;</li> <li>add: add. Add the specified header parameters. By default, repeated addition is allowed, that is, the same header is added repeatedly (note: repeated addition may affect the browser response, please use the set operation first). </li>
    */
    @SerializedName("HeaderMode")
    @Expose
    private String HeaderMode;

    /**
    * HTTP header name. Up to 100 characters can be set.
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * http header value, up to 1000 characters can be set; optional when Mode is del; required when Mode is add/set.
    */
    @SerializedName("HeaderValue")
    @Expose
    private String HeaderValue;

    /**
    * Rule type: <li>all: valid for all files;</li> <li>file: valid for specified file suffix;</li> <li>directory: valid for specified path;</li> <li>path: specified absolute The path takes effect. </li>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Matching content under the corresponding type of RuleType: <li>Fill in * when all is used;</li> <li>Fill in suffix name when file is used, such as jpg, txt;</li> <li>Fill in path when directory is used, such as /xxx/ test/;</li> <li>Fill in the absolute path when path is specified, such as /xxx/test.html. </li>
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get http header setting method: <li>set: setting. Change the value of the specified header parameter to the set value; if the set header does not exist, the header will be added; if there are multiple duplicate header parameters, all will be changed and merged into one header. ;</li> <li>del: delete. Delete the specified header parameter;</li> <li>add: add. Add the specified header parameters. By default, repeated addition is allowed, that is, the same header is added repeatedly (note: repeated addition may affect the browser response, please use the set operation first). </li> 
     * @return HeaderMode http header setting method: <li>set: setting. Change the value of the specified header parameter to the set value; if the set header does not exist, the header will be added; if there are multiple duplicate header parameters, all will be changed and merged into one header. ;</li> <li>del: delete. Delete the specified header parameter;</li> <li>add: add. Add the specified header parameters. By default, repeated addition is allowed, that is, the same header is added repeatedly (note: repeated addition may affect the browser response, please use the set operation first). </li>
     */
    public String getHeaderMode() {
        return this.HeaderMode;
    }

    /**
     * Set http header setting method: <li>set: setting. Change the value of the specified header parameter to the set value; if the set header does not exist, the header will be added; if there are multiple duplicate header parameters, all will be changed and merged into one header. ;</li> <li>del: delete. Delete the specified header parameter;</li> <li>add: add. Add the specified header parameters. By default, repeated addition is allowed, that is, the same header is added repeatedly (note: repeated addition may affect the browser response, please use the set operation first). </li>
     * @param HeaderMode http header setting method: <li>set: setting. Change the value of the specified header parameter to the set value; if the set header does not exist, the header will be added; if there are multiple duplicate header parameters, all will be changed and merged into one header. ;</li> <li>del: delete. Delete the specified header parameter;</li> <li>add: add. Add the specified header parameters. By default, repeated addition is allowed, that is, the same header is added repeatedly (note: repeated addition may affect the browser response, please use the set operation first). </li>
     */
    public void setHeaderMode(String HeaderMode) {
        this.HeaderMode = HeaderMode;
    }

    /**
     * Get HTTP header name. Up to 100 characters can be set. 
     * @return HeaderName HTTP header name. Up to 100 characters can be set.
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set HTTP header name. Up to 100 characters can be set.
     * @param HeaderName HTTP header name. Up to 100 characters can be set.
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get http header value, up to 1000 characters can be set; optional when Mode is del; required when Mode is add/set. 
     * @return HeaderValue http header value, up to 1000 characters can be set; optional when Mode is del; required when Mode is add/set.
     */
    public String getHeaderValue() {
        return this.HeaderValue;
    }

    /**
     * Set http header value, up to 1000 characters can be set; optional when Mode is del; required when Mode is add/set.
     * @param HeaderValue http header value, up to 1000 characters can be set; optional when Mode is del; required when Mode is add/set.
     */
    public void setHeaderValue(String HeaderValue) {
        this.HeaderValue = HeaderValue;
    }

    /**
     * Get Rule type: <li>all: valid for all files;</li> <li>file: valid for specified file suffix;</li> <li>directory: valid for specified path;</li> <li>path: specified absolute The path takes effect. </li> 
     * @return RuleType Rule type: <li>all: valid for all files;</li> <li>file: valid for specified file suffix;</li> <li>directory: valid for specified path;</li> <li>path: specified absolute The path takes effect. </li>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type: <li>all: valid for all files;</li> <li>file: valid for specified file suffix;</li> <li>directory: valid for specified path;</li> <li>path: specified absolute The path takes effect. </li>
     * @param RuleType Rule type: <li>all: valid for all files;</li> <li>file: valid for specified file suffix;</li> <li>directory: valid for specified path;</li> <li>path: specified absolute The path takes effect. </li>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Matching content under the corresponding type of RuleType: <li>Fill in * when all is used;</li> <li>Fill in suffix name when file is used, such as jpg, txt;</li> <li>Fill in path when directory is used, such as /xxx/ test/;</li> <li>Fill in the absolute path when path is specified, such as /xxx/test.html. </li> 
     * @return RulePaths Matching content under the corresponding type of RuleType: <li>Fill in * when all is used;</li> <li>Fill in suffix name when file is used, such as jpg, txt;</li> <li>Fill in path when directory is used, such as /xxx/ test/;</li> <li>Fill in the absolute path when path is specified, such as /xxx/test.html. </li>
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Matching content under the corresponding type of RuleType: <li>Fill in * when all is used;</li> <li>Fill in suffix name when file is used, such as jpg, txt;</li> <li>Fill in path when directory is used, such as /xxx/ test/;</li> <li>Fill in the absolute path when path is specified, such as /xxx/test.html. </li>
     * @param RulePaths Matching content under the corresponding type of RuleType: <li>Fill in * when all is used;</li> <li>Fill in suffix name when file is used, such as jpg, txt;</li> <li>Fill in path when directory is used, such as /xxx/ test/;</li> <li>Fill in the absolute path when path is specified, such as /xxx/test.html. </li>
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    public HttpHeaderPathRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpHeaderPathRule(HttpHeaderPathRule source) {
        if (source.HeaderMode != null) {
            this.HeaderMode = new String(source.HeaderMode);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
        if (source.HeaderValue != null) {
            this.HeaderValue = new String(source.HeaderValue);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeaderMode", this.HeaderMode);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);
        this.setParamSimple(map, prefix + "HeaderValue", this.HeaderValue);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);

    }
}

