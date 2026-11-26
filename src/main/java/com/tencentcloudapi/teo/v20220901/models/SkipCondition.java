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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkipCondition extends AbstractModel {

    /**
    * Exception skip type. Value:
<li>header_fields: HTTP request header;</li>
<li>cookie: HTTP request cookie;</li>
<li>query_string: The query parameter in the HTTP Request URL;</li>
<li>uri: HTTP request URI;</li>
<li>body_raw: HTTP request body;</li>
<li>body_json: HTTP Body in JSON format.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Field to skip. Value:
<li>args: select query parameter under uri: ?name1=jack&age=12;</li>
<li>path: Select a path under the uri: /path/to/resource.jpg;</li>
<li>full: select the full path under uri: example.com/path/to/resource.jpg?name1=jack&age=12;</li>
<li>upload_filename: Segmented file name, that is, when transferring files in segments;</li>
<li>keys: all keys;</li>
<li>values: The value corresponding to the match Key;</li>
<li>key_value: Match key and match value.</li>
    */
    @SerializedName("Selector")
    @Expose
    private String Selector;

    /**
    * Match mode used by the match Key. Value:
<li>equal: exact match, equal to;</li>
<li>wildcard: wildcard match, supports * wildcard.</li>
    */
    @SerializedName("MatchFromType")
    @Expose
    private String MatchFromType;

    /**
    * Value of the match Key.
    */
    @SerializedName("MatchFrom")
    @Expose
    private String [] MatchFrom;

    /**
    * Match mode used by Content. Value:
<li>equal: exact match, equal to;</li>
<li>wildcard: wildcard match, supports * wildcard.</li>
    */
    @SerializedName("MatchContentType")
    @Expose
    private String MatchContentType;

    /**
    * Value of the match Value.
    */
    @SerializedName("MatchContent")
    @Expose
    private String [] MatchContent;

    /**
     * Get Exception skip type. Value:
<li>header_fields: HTTP request header;</li>
<li>cookie: HTTP request cookie;</li>
<li>query_string: The query parameter in the HTTP Request URL;</li>
<li>uri: HTTP request URI;</li>
<li>body_raw: HTTP request body;</li>
<li>body_json: HTTP Body in JSON format.</li> 
     * @return Type Exception skip type. Value:
<li>header_fields: HTTP request header;</li>
<li>cookie: HTTP request cookie;</li>
<li>query_string: The query parameter in the HTTP Request URL;</li>
<li>uri: HTTP request URI;</li>
<li>body_raw: HTTP request body;</li>
<li>body_json: HTTP Body in JSON format.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Exception skip type. Value:
<li>header_fields: HTTP request header;</li>
<li>cookie: HTTP request cookie;</li>
<li>query_string: The query parameter in the HTTP Request URL;</li>
<li>uri: HTTP request URI;</li>
<li>body_raw: HTTP request body;</li>
<li>body_json: HTTP Body in JSON format.</li>
     * @param Type Exception skip type. Value:
<li>header_fields: HTTP request header;</li>
<li>cookie: HTTP request cookie;</li>
<li>query_string: The query parameter in the HTTP Request URL;</li>
<li>uri: HTTP request URI;</li>
<li>body_raw: HTTP request body;</li>
<li>body_json: HTTP Body in JSON format.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Field to skip. Value:
<li>args: select query parameter under uri: ?name1=jack&age=12;</li>
<li>path: Select a path under the uri: /path/to/resource.jpg;</li>
<li>full: select the full path under uri: example.com/path/to/resource.jpg?name1=jack&age=12;</li>
<li>upload_filename: Segmented file name, that is, when transferring files in segments;</li>
<li>keys: all keys;</li>
<li>values: The value corresponding to the match Key;</li>
<li>key_value: Match key and match value.</li> 
     * @return Selector Field to skip. Value:
<li>args: select query parameter under uri: ?name1=jack&age=12;</li>
<li>path: Select a path under the uri: /path/to/resource.jpg;</li>
<li>full: select the full path under uri: example.com/path/to/resource.jpg?name1=jack&age=12;</li>
<li>upload_filename: Segmented file name, that is, when transferring files in segments;</li>
<li>keys: all keys;</li>
<li>values: The value corresponding to the match Key;</li>
<li>key_value: Match key and match value.</li>
     */
    public String getSelector() {
        return this.Selector;
    }

    /**
     * Set Field to skip. Value:
<li>args: select query parameter under uri: ?name1=jack&age=12;</li>
<li>path: Select a path under the uri: /path/to/resource.jpg;</li>
<li>full: select the full path under uri: example.com/path/to/resource.jpg?name1=jack&age=12;</li>
<li>upload_filename: Segmented file name, that is, when transferring files in segments;</li>
<li>keys: all keys;</li>
<li>values: The value corresponding to the match Key;</li>
<li>key_value: Match key and match value.</li>
     * @param Selector Field to skip. Value:
<li>args: select query parameter under uri: ?name1=jack&age=12;</li>
<li>path: Select a path under the uri: /path/to/resource.jpg;</li>
<li>full: select the full path under uri: example.com/path/to/resource.jpg?name1=jack&age=12;</li>
<li>upload_filename: Segmented file name, that is, when transferring files in segments;</li>
<li>keys: all keys;</li>
<li>values: The value corresponding to the match Key;</li>
<li>key_value: Match key and match value.</li>
     */
    public void setSelector(String Selector) {
        this.Selector = Selector;
    }

    /**
     * Get Match mode used by the match Key. Value:
<li>equal: exact match, equal to;</li>
<li>wildcard: wildcard match, supports * wildcard.</li> 
     * @return MatchFromType Match mode used by the match Key. Value:
<li>equal: exact match, equal to;</li>
<li>wildcard: wildcard match, supports * wildcard.</li>
     */
    public String getMatchFromType() {
        return this.MatchFromType;
    }

    /**
     * Set Match mode used by the match Key. Value:
<li>equal: exact match, equal to;</li>
<li>wildcard: wildcard match, supports * wildcard.</li>
     * @param MatchFromType Match mode used by the match Key. Value:
<li>equal: exact match, equal to;</li>
<li>wildcard: wildcard match, supports * wildcard.</li>
     */
    public void setMatchFromType(String MatchFromType) {
        this.MatchFromType = MatchFromType;
    }

    /**
     * Get Value of the match Key. 
     * @return MatchFrom Value of the match Key.
     */
    public String [] getMatchFrom() {
        return this.MatchFrom;
    }

    /**
     * Set Value of the match Key.
     * @param MatchFrom Value of the match Key.
     */
    public void setMatchFrom(String [] MatchFrom) {
        this.MatchFrom = MatchFrom;
    }

    /**
     * Get Match mode used by Content. Value:
<li>equal: exact match, equal to;</li>
<li>wildcard: wildcard match, supports * wildcard.</li> 
     * @return MatchContentType Match mode used by Content. Value:
<li>equal: exact match, equal to;</li>
<li>wildcard: wildcard match, supports * wildcard.</li>
     */
    public String getMatchContentType() {
        return this.MatchContentType;
    }

    /**
     * Set Match mode used by Content. Value:
<li>equal: exact match, equal to;</li>
<li>wildcard: wildcard match, supports * wildcard.</li>
     * @param MatchContentType Match mode used by Content. Value:
<li>equal: exact match, equal to;</li>
<li>wildcard: wildcard match, supports * wildcard.</li>
     */
    public void setMatchContentType(String MatchContentType) {
        this.MatchContentType = MatchContentType;
    }

    /**
     * Get Value of the match Value. 
     * @return MatchContent Value of the match Value.
     */
    public String [] getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set Value of the match Value.
     * @param MatchContent Value of the match Value.
     */
    public void setMatchContent(String [] MatchContent) {
        this.MatchContent = MatchContent;
    }

    public SkipCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkipCondition(SkipCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Selector != null) {
            this.Selector = new String(source.Selector);
        }
        if (source.MatchFromType != null) {
            this.MatchFromType = new String(source.MatchFromType);
        }
        if (source.MatchFrom != null) {
            this.MatchFrom = new String[source.MatchFrom.length];
            for (int i = 0; i < source.MatchFrom.length; i++) {
                this.MatchFrom[i] = new String(source.MatchFrom[i]);
            }
        }
        if (source.MatchContentType != null) {
            this.MatchContentType = new String(source.MatchContentType);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String[source.MatchContent.length];
            for (int i = 0; i < source.MatchContent.length; i++) {
                this.MatchContent[i] = new String(source.MatchContent[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Selector", this.Selector);
        this.setParamSimple(map, prefix + "MatchFromType", this.MatchFromType);
        this.setParamArraySimple(map, prefix + "MatchFrom.", this.MatchFrom);
        this.setParamSimple(map, prefix + "MatchContentType", this.MatchContentType);
        this.setParamArraySimple(map, prefix + "MatchContent.", this.MatchContent);

    }
}

