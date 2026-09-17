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
    * 
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 
    */
    @SerializedName("ReqId")
    @Expose
    private String ReqId;

    /**
    * 
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * 
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * 
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * 
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * 
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * 
    */
    @SerializedName("CacheInputTokens")
    @Expose
    private Long CacheInputTokens;

    /**
    * 
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * 
    */
    @SerializedName("TPS")
    @Expose
    private Float TPS;

    /**
    * 
    */
    @SerializedName("TTFT")
    @Expose
    private Float TTFT;

    /**
    * 
    */
    @SerializedName("Total")
    @Expose
    private Float Total;

    /**
    * 
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
     * Get  
     * @return Timestamp 
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 
     * @param Timestamp 
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get  
     * @return ReqId 
     */
    public String getReqId() {
        return this.ReqId;
    }

    /**
     * Set 
     * @param ReqId 
     */
    public void setReqId(String ReqId) {
        this.ReqId = ReqId;
    }

    /**
     * Get  
     * @return ChatId 
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set 
     * @param ChatId 
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get  
     * @return StatusCode 
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 
     * @param StatusCode 
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get  
     * @return Model 
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 
     * @param Model 
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return ApiKey 
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set 
     * @param ApiKey 
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get  
     * @return Stream 
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set 
     * @param Stream 
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get  
     * @return InputTokens 
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set 
     * @param InputTokens 
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get  
     * @return OutputTokens 
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set 
     * @param OutputTokens 
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get  
     * @return CacheInputTokens 
     */
    public Long getCacheInputTokens() {
        return this.CacheInputTokens;
    }

    /**
     * Set 
     * @param CacheInputTokens 
     */
    public void setCacheInputTokens(Long CacheInputTokens) {
        this.CacheInputTokens = CacheInputTokens;
    }

    /**
     * Get  
     * @return TotalTokens 
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set 
     * @param TotalTokens 
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get  
     * @return TPS 
     */
    public Float getTPS() {
        return this.TPS;
    }

    /**
     * Set 
     * @param TPS 
     */
    public void setTPS(Float TPS) {
        this.TPS = TPS;
    }

    /**
     * Get  
     * @return TTFT 
     */
    public Float getTTFT() {
        return this.TTFT;
    }

    /**
     * Set 
     * @param TTFT 
     */
    public void setTTFT(Float TTFT) {
        this.TTFT = TTFT;
    }

    /**
     * Get  
     * @return Total 
     */
    public Float getTotal() {
        return this.Total;
    }

    /**
     * Set 
     * @param Total 
     */
    public void setTotal(Float Total) {
        this.Total = Total;
    }

    /**
     * Get  
     * @return ApiType 
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set 
     * @param ApiType 
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

