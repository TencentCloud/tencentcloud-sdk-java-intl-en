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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenStat extends AbstractModel {

    /**
    * Session ID.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Request ID.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * It corresponds to a session, session id, used for storing messages for answering. It can be generated in advance, used when saving messages.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Number of consumed tokens.
    */
    @SerializedName("UsedCount")
    @Expose
    private Long UsedCount;

    /**
    * Number of free tokens.
    */
    @SerializedName("FreeCount")
    @Expose
    private Long FreeCount;

    /**
    * Total number of tokens for orders.
    */
    @SerializedName("OrderCount")
    @Expose
    private Long OrderCount;

    /**
    * Current execution status summary. Constant: processing, success., failed.
    */
    @SerializedName("StatusSummary")
    @Expose
    private String StatusSummary;

    /**
    * Chinese display after summarizing the current execution status.
    */
    @SerializedName("StatusSummaryTitle")
    @Expose
    private String StatusSummaryTitle;

    /**
    * Current request execution time, in milliseconds.
    */
    @SerializedName("Elapsed")
    @Expose
    private Long Elapsed;

    /**
    * Number of tokens consumed by the current request.
    */
    @SerializedName("TokenCount")
    @Expose
    private Long TokenCount;

    /**
    * Execution information.
    */
    @SerializedName("Procedures")
    @Expose
    private Procedure [] Procedures;

    /**
    * Execution process information TraceId.
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
     * Get Session ID. 
     * @return SessionId Session ID.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session ID.
     * @param SessionId Session ID.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Request ID. 
     * @return RequestId Request ID.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Request ID.
     * @param RequestId Request ID.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get It corresponds to a session, session id, used for storing messages for answering. It can be generated in advance, used when saving messages. 
     * @return RecordId It corresponds to a session, session id, used for storing messages for answering. It can be generated in advance, used when saving messages.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set It corresponds to a session, session id, used for storing messages for answering. It can be generated in advance, used when saving messages.
     * @param RecordId It corresponds to a session, session id, used for storing messages for answering. It can be generated in advance, used when saving messages.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Number of consumed tokens. 
     * @return UsedCount Number of consumed tokens.
     */
    public Long getUsedCount() {
        return this.UsedCount;
    }

    /**
     * Set Number of consumed tokens.
     * @param UsedCount Number of consumed tokens.
     */
    public void setUsedCount(Long UsedCount) {
        this.UsedCount = UsedCount;
    }

    /**
     * Get Number of free tokens. 
     * @return FreeCount Number of free tokens.
     */
    public Long getFreeCount() {
        return this.FreeCount;
    }

    /**
     * Set Number of free tokens.
     * @param FreeCount Number of free tokens.
     */
    public void setFreeCount(Long FreeCount) {
        this.FreeCount = FreeCount;
    }

    /**
     * Get Total number of tokens for orders. 
     * @return OrderCount Total number of tokens for orders.
     */
    public Long getOrderCount() {
        return this.OrderCount;
    }

    /**
     * Set Total number of tokens for orders.
     * @param OrderCount Total number of tokens for orders.
     */
    public void setOrderCount(Long OrderCount) {
        this.OrderCount = OrderCount;
    }

    /**
     * Get Current execution status summary. Constant: processing, success., failed. 
     * @return StatusSummary Current execution status summary. Constant: processing, success., failed.
     */
    public String getStatusSummary() {
        return this.StatusSummary;
    }

    /**
     * Set Current execution status summary. Constant: processing, success., failed.
     * @param StatusSummary Current execution status summary. Constant: processing, success., failed.
     */
    public void setStatusSummary(String StatusSummary) {
        this.StatusSummary = StatusSummary;
    }

    /**
     * Get Chinese display after summarizing the current execution status. 
     * @return StatusSummaryTitle Chinese display after summarizing the current execution status.
     */
    public String getStatusSummaryTitle() {
        return this.StatusSummaryTitle;
    }

    /**
     * Set Chinese display after summarizing the current execution status.
     * @param StatusSummaryTitle Chinese display after summarizing the current execution status.
     */
    public void setStatusSummaryTitle(String StatusSummaryTitle) {
        this.StatusSummaryTitle = StatusSummaryTitle;
    }

    /**
     * Get Current request execution time, in milliseconds. 
     * @return Elapsed Current request execution time, in milliseconds.
     */
    public Long getElapsed() {
        return this.Elapsed;
    }

    /**
     * Set Current request execution time, in milliseconds.
     * @param Elapsed Current request execution time, in milliseconds.
     */
    public void setElapsed(Long Elapsed) {
        this.Elapsed = Elapsed;
    }

    /**
     * Get Number of tokens consumed by the current request. 
     * @return TokenCount Number of tokens consumed by the current request.
     */
    public Long getTokenCount() {
        return this.TokenCount;
    }

    /**
     * Set Number of tokens consumed by the current request.
     * @param TokenCount Number of tokens consumed by the current request.
     */
    public void setTokenCount(Long TokenCount) {
        this.TokenCount = TokenCount;
    }

    /**
     * Get Execution information. 
     * @return Procedures Execution information.
     */
    public Procedure [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set Execution information.
     * @param Procedures Execution information.
     */
    public void setProcedures(Procedure [] Procedures) {
        this.Procedures = Procedures;
    }

    /**
     * Get Execution process information TraceId. 
     * @return TraceId Execution process information TraceId.
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set Execution process information TraceId.
     * @param TraceId Execution process information TraceId.
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    public TokenStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenStat(TokenStat source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.UsedCount != null) {
            this.UsedCount = new Long(source.UsedCount);
        }
        if (source.FreeCount != null) {
            this.FreeCount = new Long(source.FreeCount);
        }
        if (source.OrderCount != null) {
            this.OrderCount = new Long(source.OrderCount);
        }
        if (source.StatusSummary != null) {
            this.StatusSummary = new String(source.StatusSummary);
        }
        if (source.StatusSummaryTitle != null) {
            this.StatusSummaryTitle = new String(source.StatusSummaryTitle);
        }
        if (source.Elapsed != null) {
            this.Elapsed = new Long(source.Elapsed);
        }
        if (source.TokenCount != null) {
            this.TokenCount = new Long(source.TokenCount);
        }
        if (source.Procedures != null) {
            this.Procedures = new Procedure[source.Procedures.length];
            for (int i = 0; i < source.Procedures.length; i++) {
                this.Procedures[i] = new Procedure(source.Procedures[i]);
            }
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "UsedCount", this.UsedCount);
        this.setParamSimple(map, prefix + "FreeCount", this.FreeCount);
        this.setParamSimple(map, prefix + "OrderCount", this.OrderCount);
        this.setParamSimple(map, prefix + "StatusSummary", this.StatusSummary);
        this.setParamSimple(map, prefix + "StatusSummaryTitle", this.StatusSummaryTitle);
        this.setParamSimple(map, prefix + "Elapsed", this.Elapsed);
        this.setParamSimple(map, prefix + "TokenCount", this.TokenCount);
        this.setParamArrayObj(map, prefix + "Procedures.", this.Procedures);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);

    }
}

