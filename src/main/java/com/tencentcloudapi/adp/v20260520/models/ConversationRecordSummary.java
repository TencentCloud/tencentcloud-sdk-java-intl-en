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

public class ConversationRecordSummary extends AbstractModel {

    /**
    * <p>Reply record ID, corresponding to the record_id of the reply message in messages</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>ID of the user's question record, corresponding to the record_id of the user message in messages</p>
    */
    @SerializedName("RelatedRecordId")
    @Expose
    private String RelatedRecordId;

    /**
    * <p>Duration info of a single dialogue</p>
    */
    @SerializedName("TimeUsage")
    @Expose
    private ConversationRecordTimeUsage TimeUsage;

    /**
    * <p>token consumption information of a single dialogue</p>
    */
    @SerializedName("TokenUsage")
    @Expose
    private ConversationRecordTokenUsage TokenUsage;

    /**
    * <p>Description of a single dialogue failure; empty if successful</p>
    */
    @SerializedName("ErrorInfo")
    @Expose
    private ConversationRecordErrorInfo ErrorInfo;

    /**
    * <p>Status of a single employee assistant dialogue.</p><p>Enumeration values: </p><ul><li>pending: Pending, </li><li>processing: Processing, </li><li>success: Success, </li><li>failed: Failure, </li><li>stop: Stopped.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>Reply record ID, corresponding to the record_id of the reply message in messages</p> 
     * @return RecordId <p>Reply record ID, corresponding to the record_id of the reply message in messages</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>Reply record ID, corresponding to the record_id of the reply message in messages</p>
     * @param RecordId <p>Reply record ID, corresponding to the record_id of the reply message in messages</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>ID of the user's question record, corresponding to the record_id of the user message in messages</p> 
     * @return RelatedRecordId <p>ID of the user's question record, corresponding to the record_id of the user message in messages</p>
     */
    public String getRelatedRecordId() {
        return this.RelatedRecordId;
    }

    /**
     * Set <p>ID of the user's question record, corresponding to the record_id of the user message in messages</p>
     * @param RelatedRecordId <p>ID of the user's question record, corresponding to the record_id of the user message in messages</p>
     */
    public void setRelatedRecordId(String RelatedRecordId) {
        this.RelatedRecordId = RelatedRecordId;
    }

    /**
     * Get <p>Duration info of a single dialogue</p> 
     * @return TimeUsage <p>Duration info of a single dialogue</p>
     */
    public ConversationRecordTimeUsage getTimeUsage() {
        return this.TimeUsage;
    }

    /**
     * Set <p>Duration info of a single dialogue</p>
     * @param TimeUsage <p>Duration info of a single dialogue</p>
     */
    public void setTimeUsage(ConversationRecordTimeUsage TimeUsage) {
        this.TimeUsage = TimeUsage;
    }

    /**
     * Get <p>token consumption information of a single dialogue</p> 
     * @return TokenUsage <p>token consumption information of a single dialogue</p>
     */
    public ConversationRecordTokenUsage getTokenUsage() {
        return this.TokenUsage;
    }

    /**
     * Set <p>token consumption information of a single dialogue</p>
     * @param TokenUsage <p>token consumption information of a single dialogue</p>
     */
    public void setTokenUsage(ConversationRecordTokenUsage TokenUsage) {
        this.TokenUsage = TokenUsage;
    }

    /**
     * Get <p>Description of a single dialogue failure; empty if successful</p> 
     * @return ErrorInfo <p>Description of a single dialogue failure; empty if successful</p>
     */
    public ConversationRecordErrorInfo getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>Description of a single dialogue failure; empty if successful</p>
     * @param ErrorInfo <p>Description of a single dialogue failure; empty if successful</p>
     */
    public void setErrorInfo(ConversationRecordErrorInfo ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get <p>Status of a single employee assistant dialogue.</p><p>Enumeration values: </p><ul><li>pending: Pending, </li><li>processing: Processing, </li><li>success: Success, </li><li>failed: Failure, </li><li>stop: Stopped.</li></ul> 
     * @return Status <p>Status of a single employee assistant dialogue.</p><p>Enumeration values: </p><ul><li>pending: Pending, </li><li>processing: Processing, </li><li>success: Success, </li><li>failed: Failure, </li><li>stop: Stopped.</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status of a single employee assistant dialogue.</p><p>Enumeration values: </p><ul><li>pending: Pending, </li><li>processing: Processing, </li><li>success: Success, </li><li>failed: Failure, </li><li>stop: Stopped.</li></ul>
     * @param Status <p>Status of a single employee assistant dialogue.</p><p>Enumeration values: </p><ul><li>pending: Pending, </li><li>processing: Processing, </li><li>success: Success, </li><li>failed: Failure, </li><li>stop: Stopped.</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ConversationRecordSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationRecordSummary(ConversationRecordSummary source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.RelatedRecordId != null) {
            this.RelatedRecordId = new String(source.RelatedRecordId);
        }
        if (source.TimeUsage != null) {
            this.TimeUsage = new ConversationRecordTimeUsage(source.TimeUsage);
        }
        if (source.TokenUsage != null) {
            this.TokenUsage = new ConversationRecordTokenUsage(source.TokenUsage);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new ConversationRecordErrorInfo(source.ErrorInfo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "RelatedRecordId", this.RelatedRecordId);
        this.setParamObj(map, prefix + "TimeUsage.", this.TimeUsage);
        this.setParamObj(map, prefix + "TokenUsage.", this.TokenUsage);
        this.setParamObj(map, prefix + "ErrorInfo.", this.ErrorInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

