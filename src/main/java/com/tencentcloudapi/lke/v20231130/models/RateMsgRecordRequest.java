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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateMsgRecordRequest extends AbstractModel {

    /**
    * Application appkey.
    */
    @SerializedName("BotAppKey")
    @Expose
    private String BotAppKey;

    /**
    * Message ID.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 1: like; 2: dislike.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * Reason.
    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

    /**
     * Get Application appkey. 
     * @return BotAppKey Application appkey.
     */
    public String getBotAppKey() {
        return this.BotAppKey;
    }

    /**
     * Set Application appkey.
     * @param BotAppKey Application appkey.
     */
    public void setBotAppKey(String BotAppKey) {
        this.BotAppKey = BotAppKey;
    }

    /**
     * Get Message ID. 
     * @return RecordId Message ID.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Message ID.
     * @param RecordId Message ID.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 1: like; 2: dislike. 
     * @return Score 1: like; 2: dislike.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 1: like; 2: dislike.
     * @param Score 1: like; 2: dislike.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get Reason. 
     * @return Reasons Reason.
     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set Reason.
     * @param Reasons Reason.
     */
    public void setReasons(String [] Reasons) {
        this.Reasons = Reasons;
    }

    public RateMsgRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateMsgRecordRequest(RateMsgRecordRequest source) {
        if (source.BotAppKey != null) {
            this.BotAppKey = new String(source.BotAppKey);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Reasons != null) {
            this.Reasons = new String[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new String(source.Reasons[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotAppKey", this.BotAppKey);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "Reasons.", this.Reasons);

    }
}

