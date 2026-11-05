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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConversationMessageListRequest extends AbstractModel {

    /**
    * <p>Session ID.</p>
    */
    @SerializedName("ConversationId")
    @Expose
    private String ConversationId;

    /**
    * <p>Session type enumeration values: 0-CONVERSATION_TYPE_UNSPECIFIED (unspecified; means all in list query), 1-CONVERSATION_TYPE_VISITOR (visitor trial), 2-CONVERSATION_TYPE_EVALUATION (evaluation), 5-CONVERSATION_TYPE_API (API integration), 10-CONVERSATION_TYPE_WORKFLOW (workflow debugging), 20-CONVERSATION_TYPE_SHARE (share link)</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Required when Type=CONVERSATION_TYPE_API. Application key</p>
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * <p>Total number of returned records. Default: 10. Maximum: 50. When querying forward or backward, messages of the record specified by record_id are excluded. When querying from the center in both directions, the message of the record specified by record_id is included. The number of returned records is limit / 2 for each direction, rounded up.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Sub-user Uin.</p>
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * <p>Root user Uin.</p>
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * <p>Query anchor record ID</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>Query direction relative to record_id. Enumeration values: 0-RECORD_QUERY_DIRECTION_UNSPECIFIED (not specified, compatible with legacy logic, query forward by default), 1-RECORD_QUERY_DIRECTION_BACKWARD (query earlier messages forward from record_id), 2-RECORD_QUERY_DIRECTION_FORWARD (query newer messages backward from record_id), 3-RECORD_QUERY_DIRECTION_BIDIRECTIONAL (query both forward and backward from record_id as the center)</p>
    */
    @SerializedName("RecordQueryDirection")
    @Expose
    private Long RecordQueryDirection;

    /**
    * <p>Required when Type is CONVERSATION_TYPE_SHARE. Share code</p>
    */
    @SerializedName("ShareCode")
    @Expose
    private String ShareCode;

    /**
    * <p>Required when Type=CONVERSATION_TYPE_API. Visitor ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>Session ID.</p> 
     * @return ConversationId <p>Session ID.</p>
     */
    public String getConversationId() {
        return this.ConversationId;
    }

    /**
     * Set <p>Session ID.</p>
     * @param ConversationId <p>Session ID.</p>
     */
    public void setConversationId(String ConversationId) {
        this.ConversationId = ConversationId;
    }

    /**
     * Get <p>Session type enumeration values: 0-CONVERSATION_TYPE_UNSPECIFIED (unspecified; means all in list query), 1-CONVERSATION_TYPE_VISITOR (visitor trial), 2-CONVERSATION_TYPE_EVALUATION (evaluation), 5-CONVERSATION_TYPE_API (API integration), 10-CONVERSATION_TYPE_WORKFLOW (workflow debugging), 20-CONVERSATION_TYPE_SHARE (share link)</p> 
     * @return Type <p>Session type enumeration values: 0-CONVERSATION_TYPE_UNSPECIFIED (unspecified; means all in list query), 1-CONVERSATION_TYPE_VISITOR (visitor trial), 2-CONVERSATION_TYPE_EVALUATION (evaluation), 5-CONVERSATION_TYPE_API (API integration), 10-CONVERSATION_TYPE_WORKFLOW (workflow debugging), 20-CONVERSATION_TYPE_SHARE (share link)</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Session type enumeration values: 0-CONVERSATION_TYPE_UNSPECIFIED (unspecified; means all in list query), 1-CONVERSATION_TYPE_VISITOR (visitor trial), 2-CONVERSATION_TYPE_EVALUATION (evaluation), 5-CONVERSATION_TYPE_API (API integration), 10-CONVERSATION_TYPE_WORKFLOW (workflow debugging), 20-CONVERSATION_TYPE_SHARE (share link)</p>
     * @param Type <p>Session type enumeration values: 0-CONVERSATION_TYPE_UNSPECIFIED (unspecified; means all in list query), 1-CONVERSATION_TYPE_VISITOR (visitor trial), 2-CONVERSATION_TYPE_EVALUATION (evaluation), 5-CONVERSATION_TYPE_API (API integration), 10-CONVERSATION_TYPE_WORKFLOW (workflow debugging), 20-CONVERSATION_TYPE_SHARE (share link)</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Required when Type=CONVERSATION_TYPE_API. Application key</p> 
     * @return AppKey <p>Required when Type=CONVERSATION_TYPE_API. Application key</p>
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set <p>Required when Type=CONVERSATION_TYPE_API. Application key</p>
     * @param AppKey <p>Required when Type=CONVERSATION_TYPE_API. Application key</p>
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get <p>Total number of returned records. Default: 10. Maximum: 50. When querying forward or backward, messages of the record specified by record_id are excluded. When querying from the center in both directions, the message of the record specified by record_id is included. The number of returned records is limit / 2 for each direction, rounded up.</p> 
     * @return Limit <p>Total number of returned records. Default: 10. Maximum: 50. When querying forward or backward, messages of the record specified by record_id are excluded. When querying from the center in both directions, the message of the record specified by record_id is included. The number of returned records is limit / 2 for each direction, rounded up.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Total number of returned records. Default: 10. Maximum: 50. When querying forward or backward, messages of the record specified by record_id are excluded. When querying from the center in both directions, the message of the record specified by record_id is included. The number of returned records is limit / 2 for each direction, rounded up.</p>
     * @param Limit <p>Total number of returned records. Default: 10. Maximum: 50. When querying forward or backward, messages of the record specified by record_id are excluded. When querying from the center in both directions, the message of the record specified by record_id is included. The number of returned records is limit / 2 for each direction, rounded up.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Sub-user Uin.</p> 
     * @return LoginSubAccountUin <p>Sub-user Uin.</p>
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set <p>Sub-user Uin.</p>
     * @param LoginSubAccountUin <p>Sub-user Uin.</p>
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get <p>Root user Uin.</p> 
     * @return LoginUin <p>Root user Uin.</p>
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set <p>Root user Uin.</p>
     * @param LoginUin <p>Root user Uin.</p>
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get <p>Query anchor record ID</p> 
     * @return RecordId <p>Query anchor record ID</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>Query anchor record ID</p>
     * @param RecordId <p>Query anchor record ID</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>Query direction relative to record_id. Enumeration values: 0-RECORD_QUERY_DIRECTION_UNSPECIFIED (not specified, compatible with legacy logic, query forward by default), 1-RECORD_QUERY_DIRECTION_BACKWARD (query earlier messages forward from record_id), 2-RECORD_QUERY_DIRECTION_FORWARD (query newer messages backward from record_id), 3-RECORD_QUERY_DIRECTION_BIDIRECTIONAL (query both forward and backward from record_id as the center)</p> 
     * @return RecordQueryDirection <p>Query direction relative to record_id. Enumeration values: 0-RECORD_QUERY_DIRECTION_UNSPECIFIED (not specified, compatible with legacy logic, query forward by default), 1-RECORD_QUERY_DIRECTION_BACKWARD (query earlier messages forward from record_id), 2-RECORD_QUERY_DIRECTION_FORWARD (query newer messages backward from record_id), 3-RECORD_QUERY_DIRECTION_BIDIRECTIONAL (query both forward and backward from record_id as the center)</p>
     */
    public Long getRecordQueryDirection() {
        return this.RecordQueryDirection;
    }

    /**
     * Set <p>Query direction relative to record_id. Enumeration values: 0-RECORD_QUERY_DIRECTION_UNSPECIFIED (not specified, compatible with legacy logic, query forward by default), 1-RECORD_QUERY_DIRECTION_BACKWARD (query earlier messages forward from record_id), 2-RECORD_QUERY_DIRECTION_FORWARD (query newer messages backward from record_id), 3-RECORD_QUERY_DIRECTION_BIDIRECTIONAL (query both forward and backward from record_id as the center)</p>
     * @param RecordQueryDirection <p>Query direction relative to record_id. Enumeration values: 0-RECORD_QUERY_DIRECTION_UNSPECIFIED (not specified, compatible with legacy logic, query forward by default), 1-RECORD_QUERY_DIRECTION_BACKWARD (query earlier messages forward from record_id), 2-RECORD_QUERY_DIRECTION_FORWARD (query newer messages backward from record_id), 3-RECORD_QUERY_DIRECTION_BIDIRECTIONAL (query both forward and backward from record_id as the center)</p>
     */
    public void setRecordQueryDirection(Long RecordQueryDirection) {
        this.RecordQueryDirection = RecordQueryDirection;
    }

    /**
     * Get <p>Required when Type is CONVERSATION_TYPE_SHARE. Share code</p> 
     * @return ShareCode <p>Required when Type is CONVERSATION_TYPE_SHARE. Share code</p>
     */
    public String getShareCode() {
        return this.ShareCode;
    }

    /**
     * Set <p>Required when Type is CONVERSATION_TYPE_SHARE. Share code</p>
     * @param ShareCode <p>Required when Type is CONVERSATION_TYPE_SHARE. Share code</p>
     */
    public void setShareCode(String ShareCode) {
        this.ShareCode = ShareCode;
    }

    /**
     * Get <p>Required when Type=CONVERSATION_TYPE_API. Visitor ID</p> 
     * @return UserId <p>Required when Type=CONVERSATION_TYPE_API. Visitor ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>Required when Type=CONVERSATION_TYPE_API. Visitor ID</p>
     * @param UserId <p>Required when Type=CONVERSATION_TYPE_API. Visitor ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DescribeConversationMessageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConversationMessageListRequest(DescribeConversationMessageListRequest source) {
        if (source.ConversationId != null) {
            this.ConversationId = new String(source.ConversationId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.RecordQueryDirection != null) {
            this.RecordQueryDirection = new Long(source.RecordQueryDirection);
        }
        if (source.ShareCode != null) {
            this.ShareCode = new String(source.ShareCode);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConversationId", this.ConversationId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "RecordQueryDirection", this.RecordQueryDirection);
        this.setParamSimple(map, prefix + "ShareCode", this.ShareCode);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

