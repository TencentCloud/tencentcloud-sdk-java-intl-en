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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNetworkApplicationRequest extends AbstractModel {

    /**
    * <p>Network application name: length not exceeding 64 characters, name must be unique.</p><ul><li>Can only contain the following characters:<ul><li>English letters (a-z and A-Z)</li><li>Digits</li><li>Underscore</li><li>Hyphen (minus sign)</li><li>Chinese characters</li></ul></li><li>At least one character</li><li>Must not contain spaces</li><li>Cannot contain other special characters (such as @, #, $, %, etc.)</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Log Set ID</p><ul><li>Obtain the Log Set ID through the <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">logset list</a>.</li></ul>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>Topic name. The limits are as follows:</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get <p>Network application name: length not exceeding 64 characters, name must be unique.</p><ul><li>Can only contain the following characters:<ul><li>English letters (a-z and A-Z)</li><li>Digits</li><li>Underscore</li><li>Hyphen (minus sign)</li><li>Chinese characters</li></ul></li><li>At least one character</li><li>Must not contain spaces</li><li>Cannot contain other special characters (such as @, #, $, %, etc.)</li></ul> 
     * @return Name <p>Network application name: length not exceeding 64 characters, name must be unique.</p><ul><li>Can only contain the following characters:<ul><li>English letters (a-z and A-Z)</li><li>Digits</li><li>Underscore</li><li>Hyphen (minus sign)</li><li>Chinese characters</li></ul></li><li>At least one character</li><li>Must not contain spaces</li><li>Cannot contain other special characters (such as @, #, $, %, etc.)</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Network application name: length not exceeding 64 characters, name must be unique.</p><ul><li>Can only contain the following characters:<ul><li>English letters (a-z and A-Z)</li><li>Digits</li><li>Underscore</li><li>Hyphen (minus sign)</li><li>Chinese characters</li></ul></li><li>At least one character</li><li>Must not contain spaces</li><li>Cannot contain other special characters (such as @, #, $, %, etc.)</li></ul>
     * @param Name <p>Network application name: length not exceeding 64 characters, name must be unique.</p><ul><li>Can only contain the following characters:<ul><li>English letters (a-z and A-Z)</li><li>Digits</li><li>Underscore</li><li>Hyphen (minus sign)</li><li>Chinese characters</li></ul></li><li>At least one character</li><li>Must not contain spaces</li><li>Cannot contain other special characters (such as @, #, $, %, etc.)</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Log Set ID</p><ul><li>Obtain the Log Set ID through the <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">logset list</a>.</li></ul> 
     * @return LogsetId <p>Log Set ID</p><ul><li>Obtain the Log Set ID through the <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">logset list</a>.</li></ul>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>Log Set ID</p><ul><li>Obtain the Log Set ID through the <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">logset list</a>.</li></ul>
     * @param LogsetId <p>Log Set ID</p><ul><li>Obtain the Log Set ID through the <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">logset list</a>.</li></ul>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>Topic name. The limits are as follows:</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul> 
     * @return TopicName <p>Topic name. The limits are as follows:</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>Topic name. The limits are as follows:</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
     * @param TopicName <p>Topic name. The limits are as follows:</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public CreateNetworkApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNetworkApplicationRequest(CreateNetworkApplicationRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

