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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcTextDetailData extends AbstractModel {

    /**
    * <p>Request start time (RFC3339)</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>Gateway layer request ID</p>
    */
    @SerializedName("ReqId")
    @Expose
    private String ReqId;

    /**
    * <p>Dialogue ID returned by the backend model</p>
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * <p>HTTP status code returned to client</p>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * <p>Model name</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>Application ID</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>api_key after masking: first 8 digits + **** (return without modification when length ≤ 8)</p>
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * <p>Whether to return in streaming mode</p>
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * <p>Number of input tokens</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>Number of output tokens</p>
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>Number of tokens with prompt cache hit</p>
    */
    @SerializedName("CacheInputTokens")
    @Expose
    private Long CacheInputTokens;

    /**
    * <p>Total tokens</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * <p>tokens per second in the generation stage</p>
    */
    @SerializedName("TPS")
    @Expose
    private Float TPS;

    /**
    * <p>Time To First Token</p><p>Measurement unit: seconds</p>
    */
    @SerializedName("TTFT")
    @Expose
    private Float TTFT;

    /**
    * <p>End-to-end total time</p><p>Unit: seconds</p>
    */
    @SerializedName("Total")
    @Expose
    private Float Total;

    /**
    * <p>Entry protocol:completions / responses / anthropic</p>
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
     * Get <p>Request start time (RFC3339)</p> 
     * @return Timestamp <p>Request start time (RFC3339)</p>
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>Request start time (RFC3339)</p>
     * @param Timestamp <p>Request start time (RFC3339)</p>
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>Gateway layer request ID</p> 
     * @return ReqId <p>Gateway layer request ID</p>
     */
    public String getReqId() {
        return this.ReqId;
    }

    /**
     * Set <p>Gateway layer request ID</p>
     * @param ReqId <p>Gateway layer request ID</p>
     */
    public void setReqId(String ReqId) {
        this.ReqId = ReqId;
    }

    /**
     * Get <p>Dialogue ID returned by the backend model</p> 
     * @return ChatId <p>Dialogue ID returned by the backend model</p>
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set <p>Dialogue ID returned by the backend model</p>
     * @param ChatId <p>Dialogue ID returned by the backend model</p>
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get <p>HTTP status code returned to client</p> 
     * @return StatusCode <p>HTTP status code returned to client</p>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set <p>HTTP status code returned to client</p>
     * @param StatusCode <p>HTTP status code returned to client</p>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get <p>Model name</p> 
     * @return Model <p>Model name</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>Model name</p>
     * @param Model <p>Model name</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>Application ID</p> 
     * @return SubAppId <p>Application ID</p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>Application ID</p>
     * @param SubAppId <p>Application ID</p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>api_key after masking: first 8 digits + **** (return without modification when length ≤ 8)</p> 
     * @return ApiKey <p>api_key after masking: first 8 digits + **** (return without modification when length ≤ 8)</p>
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set <p>api_key after masking: first 8 digits + **** (return without modification when length ≤ 8)</p>
     * @param ApiKey <p>api_key after masking: first 8 digits + **** (return without modification when length ≤ 8)</p>
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get <p>Whether to return in streaming mode</p> 
     * @return Stream <p>Whether to return in streaming mode</p>
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set <p>Whether to return in streaming mode</p>
     * @param Stream <p>Whether to return in streaming mode</p>
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get <p>Number of input tokens</p> 
     * @return InputTokens <p>Number of input tokens</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>Number of input tokens</p>
     * @param InputTokens <p>Number of input tokens</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>Number of output tokens</p> 
     * @return OutputTokens <p>Number of output tokens</p>
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>Number of output tokens</p>
     * @param OutputTokens <p>Number of output tokens</p>
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>Number of tokens with prompt cache hit</p> 
     * @return CacheInputTokens <p>Number of tokens with prompt cache hit</p>
     */
    public Long getCacheInputTokens() {
        return this.CacheInputTokens;
    }

    /**
     * Set <p>Number of tokens with prompt cache hit</p>
     * @param CacheInputTokens <p>Number of tokens with prompt cache hit</p>
     */
    public void setCacheInputTokens(Long CacheInputTokens) {
        this.CacheInputTokens = CacheInputTokens;
    }

    /**
     * Get <p>Total tokens</p> 
     * @return TotalTokens <p>Total tokens</p>
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>Total tokens</p>
     * @param TotalTokens <p>Total tokens</p>
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get <p>tokens per second in the generation stage</p> 
     * @return TPS <p>tokens per second in the generation stage</p>
     */
    public Float getTPS() {
        return this.TPS;
    }

    /**
     * Set <p>tokens per second in the generation stage</p>
     * @param TPS <p>tokens per second in the generation stage</p>
     */
    public void setTPS(Float TPS) {
        this.TPS = TPS;
    }

    /**
     * Get <p>Time To First Token</p><p>Measurement unit: seconds</p> 
     * @return TTFT <p>Time To First Token</p><p>Measurement unit: seconds</p>
     */
    public Float getTTFT() {
        return this.TTFT;
    }

    /**
     * Set <p>Time To First Token</p><p>Measurement unit: seconds</p>
     * @param TTFT <p>Time To First Token</p><p>Measurement unit: seconds</p>
     */
    public void setTTFT(Float TTFT) {
        this.TTFT = TTFT;
    }

    /**
     * Get <p>End-to-end total time</p><p>Unit: seconds</p> 
     * @return Total <p>End-to-end total time</p><p>Unit: seconds</p>
     */
    public Float getTotal() {
        return this.Total;
    }

    /**
     * Set <p>End-to-end total time</p><p>Unit: seconds</p>
     * @param Total <p>End-to-end total time</p><p>Unit: seconds</p>
     */
    public void setTotal(Float Total) {
        this.Total = Total;
    }

    /**
     * Get <p>Entry protocol:completions / responses / anthropic</p> 
     * @return ApiType <p>Entry protocol:completions / responses / anthropic</p>
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set <p>Entry protocol:completions / responses / anthropic</p>
     * @param ApiType <p>Entry protocol:completions / responses / anthropic</p>
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    public AigcTextDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcTextDetailData(AigcTextDetailData source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.ReqId != null) {
            this.ReqId = new String(source.ReqId);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.CacheInputTokens != null) {
            this.CacheInputTokens = new Long(source.CacheInputTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.TPS != null) {
            this.TPS = new Float(source.TPS);
        }
        if (source.TTFT != null) {
            this.TTFT = new Float(source.TTFT);
        }
        if (source.Total != null) {
            this.Total = new Float(source.Total);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "ReqId", this.ReqId);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "CacheInputTokens", this.CacheInputTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "TPS", this.TPS);
        this.setParamSimple(map, prefix + "TTFT", this.TTFT);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);

    }
}

