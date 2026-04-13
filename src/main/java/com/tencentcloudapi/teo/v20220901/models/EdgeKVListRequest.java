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

public class EdgeKVListRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Namespace name.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Prefix filtering for key names. Only return key names that begin with the specified prefix, with a length of 1-512 characters. Not specified means return all key names; does not allow input of empty string.
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * Cursor position. Indicates the starting position of the current query for traversing large amounts of data. Do not fill in during the initial query, start traversal from the beginning. Fill in the Cursor value returned last time during follow-up queries to proceed with traversal from that position.

    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * Number of key names returned. Default value: 20. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Namespace name. 
     * @return Namespace Namespace name.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace name.
     * @param Namespace Namespace name.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Prefix filtering for key names. Only return key names that begin with the specified prefix, with a length of 1-512 characters. Not specified means return all key names; does not allow input of empty string. 
     * @return Prefix Prefix filtering for key names. Only return key names that begin with the specified prefix, with a length of 1-512 characters. Not specified means return all key names; does not allow input of empty string.
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set Prefix filtering for key names. Only return key names that begin with the specified prefix, with a length of 1-512 characters. Not specified means return all key names; does not allow input of empty string.
     * @param Prefix Prefix filtering for key names. Only return key names that begin with the specified prefix, with a length of 1-512 characters. Not specified means return all key names; does not allow input of empty string.
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get Cursor position. Indicates the starting position of the current query for traversing large amounts of data. Do not fill in during the initial query, start traversal from the beginning. Fill in the Cursor value returned last time during follow-up queries to proceed with traversal from that position.
 
     * @return Cursor Cursor position. Indicates the starting position of the current query for traversing large amounts of data. Do not fill in during the initial query, start traversal from the beginning. Fill in the Cursor value returned last time during follow-up queries to proceed with traversal from that position.

     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set Cursor position. Indicates the starting position of the current query for traversing large amounts of data. Do not fill in during the initial query, start traversal from the beginning. Fill in the Cursor value returned last time during follow-up queries to proceed with traversal from that position.

     * @param Cursor Cursor position. Indicates the starting position of the current query for traversing large amounts of data. Do not fill in during the initial query, start traversal from the beginning. Fill in the Cursor value returned last time during follow-up queries to proceed with traversal from that position.

     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get Number of key names returned. Default value: 20. Maximum value: 1000. 
     * @return Limit Number of key names returned. Default value: 20. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of key names returned. Default value: 20. Maximum value: 1000.
     * @param Limit Number of key names returned. Default value: 20. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public EdgeKVListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeKVListRequest(EdgeKVListRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

