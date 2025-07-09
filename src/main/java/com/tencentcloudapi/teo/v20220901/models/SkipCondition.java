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
    * The field type. Values:
<li>`header_fields`: HTTP request header</li>
<li>`cookie`: HTTP request cookie</li>
<li>`query_string`: Query string in the HTTP request URL</li>
<li>`uri`: HTTP request URI</li>
<li>`body_raw`: HTTP request body</li>
<li>`body_json`: JSON HTTP request body</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The specific field. Values:
<li>`args`: Query parameter in the URI, such as "?name1=jack&age=12"</li>
<li>`path`: Partial path in the URI, such as "/path/to/resource.jpg"</li>
<li>`full`: Full path in the URI, such as "example.com/path/to/resource.jpg?name1=jack&age=12"</li>
<li>`upload_filename`: File path segment</li>
<li>`keys`: All keys</li>
<li>`values`: Values of all keys</li>
<li>`key_value`: Key and its value</li>
    */
    @SerializedName("Selector")
    @Expose
    private String Selector;

    /**
    * The match method used to match the key. Values:
<li>`equal`: Exact match</li>
<li>`wildcard`: Wildcard match (only asterisks)</li>
    */
    @SerializedName("MatchFromType")
    @Expose
    private String MatchFromType;

    /**
    * The value that matches the key.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("MatchFrom")
    @Expose
    private String [] MatchFrom;

    /**
    * The match method used to match the content.
<li>`equal`: Exact match</li>
<li>`wildcard`: Wildcard match (only asterisks)</li>
    */
    @SerializedName("MatchContentType")
    @Expose
    private String MatchContentType;

    /**
    * The value that matches the content.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("MatchContent")
    @Expose
    private String [] MatchContent;

    /**
     * Get The field type. Values:
<li>`header_fields`: HTTP request header</li>
<li>`cookie`: HTTP request cookie</li>
<li>`query_string`: Query string in the HTTP request URL</li>
<li>`uri`: HTTP request URI</li>
<li>`body_raw`: HTTP request body</li>
<li>`body_json`: JSON HTTP request body</li> 
     * @return Type The field type. Values:
<li>`header_fields`: HTTP request header</li>
<li>`cookie`: HTTP request cookie</li>
<li>`query_string`: Query string in the HTTP request URL</li>
<li>`uri`: HTTP request URI</li>
<li>`body_raw`: HTTP request body</li>
<li>`body_json`: JSON HTTP request body</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The field type. Values:
<li>`header_fields`: HTTP request header</li>
<li>`cookie`: HTTP request cookie</li>
<li>`query_string`: Query string in the HTTP request URL</li>
<li>`uri`: HTTP request URI</li>
<li>`body_raw`: HTTP request body</li>
<li>`body_json`: JSON HTTP request body</li>
     * @param Type The field type. Values:
<li>`header_fields`: HTTP request header</li>
<li>`cookie`: HTTP request cookie</li>
<li>`query_string`: Query string in the HTTP request URL</li>
<li>`uri`: HTTP request URI</li>
<li>`body_raw`: HTTP request body</li>
<li>`body_json`: JSON HTTP request body</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The specific field. Values:
<li>`args`: Query parameter in the URI, such as "?name1=jack&age=12"</li>
<li>`path`: Partial path in the URI, such as "/path/to/resource.jpg"</li>
<li>`full`: Full path in the URI, such as "example.com/path/to/resource.jpg?name1=jack&age=12"</li>
<li>`upload_filename`: File path segment</li>
<li>`keys`: All keys</li>
<li>`values`: Values of all keys</li>
<li>`key_value`: Key and its value</li> 
     * @return Selector The specific field. Values:
<li>`args`: Query parameter in the URI, such as "?name1=jack&age=12"</li>
<li>`path`: Partial path in the URI, such as "/path/to/resource.jpg"</li>
<li>`full`: Full path in the URI, such as "example.com/path/to/resource.jpg?name1=jack&age=12"</li>
<li>`upload_filename`: File path segment</li>
<li>`keys`: All keys</li>
<li>`values`: Values of all keys</li>
<li>`key_value`: Key and its value</li>
     */
    public String getSelector() {
        return this.Selector;
    }

    /**
     * Set The specific field. Values:
<li>`args`: Query parameter in the URI, such as "?name1=jack&age=12"</li>
<li>`path`: Partial path in the URI, such as "/path/to/resource.jpg"</li>
<li>`full`: Full path in the URI, such as "example.com/path/to/resource.jpg?name1=jack&age=12"</li>
<li>`upload_filename`: File path segment</li>
<li>`keys`: All keys</li>
<li>`values`: Values of all keys</li>
<li>`key_value`: Key and its value</li>
     * @param Selector The specific field. Values:
<li>`args`: Query parameter in the URI, such as "?name1=jack&age=12"</li>
<li>`path`: Partial path in the URI, such as "/path/to/resource.jpg"</li>
<li>`full`: Full path in the URI, such as "example.com/path/to/resource.jpg?name1=jack&age=12"</li>
<li>`upload_filename`: File path segment</li>
<li>`keys`: All keys</li>
<li>`values`: Values of all keys</li>
<li>`key_value`: Key and its value</li>
     */
    public void setSelector(String Selector) {
        this.Selector = Selector;
    }

    /**
     * Get The match method used to match the key. Values:
<li>`equal`: Exact match</li>
<li>`wildcard`: Wildcard match (only asterisks)</li> 
     * @return MatchFromType The match method used to match the key. Values:
<li>`equal`: Exact match</li>
<li>`wildcard`: Wildcard match (only asterisks)</li>
     */
    public String getMatchFromType() {
        return this.MatchFromType;
    }

    /**
     * Set The match method used to match the key. Values:
<li>`equal`: Exact match</li>
<li>`wildcard`: Wildcard match (only asterisks)</li>
     * @param MatchFromType The match method used to match the key. Values:
<li>`equal`: Exact match</li>
<li>`wildcard`: Wildcard match (only asterisks)</li>
     */
    public void setMatchFromType(String MatchFromType) {
        this.MatchFromType = MatchFromType;
    }

    /**
     * Get The value that matches the key.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return MatchFrom The value that matches the key.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getMatchFrom() {
        return this.MatchFrom;
    }

    /**
     * Set The value that matches the key.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param MatchFrom The value that matches the key.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMatchFrom(String [] MatchFrom) {
        this.MatchFrom = MatchFrom;
    }

    /**
     * Get The match method used to match the content.
<li>`equal`: Exact match</li>
<li>`wildcard`: Wildcard match (only asterisks)</li> 
     * @return MatchContentType The match method used to match the content.
<li>`equal`: Exact match</li>
<li>`wildcard`: Wildcard match (only asterisks)</li>
     */
    public String getMatchContentType() {
        return this.MatchContentType;
    }

    /**
     * Set The match method used to match the content.
<li>`equal`: Exact match</li>
<li>`wildcard`: Wildcard match (only asterisks)</li>
     * @param MatchContentType The match method used to match the content.
<li>`equal`: Exact match</li>
<li>`wildcard`: Wildcard match (only asterisks)</li>
     */
    public void setMatchContentType(String MatchContentType) {
        this.MatchContentType = MatchContentType;
    }

    /**
     * Get The value that matches the content.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return MatchContent The value that matches the content.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set The value that matches the content.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param MatchContent The value that matches the content.
Note: This field may return `null`, indicating that no valid value can be obtained.
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

