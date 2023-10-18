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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CptIssueRank extends AbstractModel {

    /**
    * The (claim protocol type) CPT name.
    */
    @SerializedName("CptName")
    @Expose
    private String CptName;

    /**
    * The ranking.
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
    * The number of credentials issued.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * The application name.
    */
    @SerializedName("ApplyName")
    @Expose
    private String ApplyName;

    /**
    * The application ID.
    */
    @SerializedName("ApplyId")
    @Expose
    private Long ApplyId;

    /**
     * Get The (claim protocol type) CPT name. 
     * @return CptName The (claim protocol type) CPT name.
     */
    public String getCptName() {
        return this.CptName;
    }

    /**
     * Set The (claim protocol type) CPT name.
     * @param CptName The (claim protocol type) CPT name.
     */
    public void setCptName(String CptName) {
        this.CptName = CptName;
    }

    /**
     * Get The ranking. 
     * @return Rank The ranking.
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set The ranking.
     * @param Rank The ranking.
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    /**
     * Get The number of credentials issued. 
     * @return Count The number of credentials issued.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of credentials issued.
     * @param Count The number of credentials issued.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get The application name. 
     * @return ApplyName The application name.
     */
    public String getApplyName() {
        return this.ApplyName;
    }

    /**
     * Set The application name.
     * @param ApplyName The application name.
     */
    public void setApplyName(String ApplyName) {
        this.ApplyName = ApplyName;
    }

    /**
     * Get The application ID. 
     * @return ApplyId The application ID.
     */
    public Long getApplyId() {
        return this.ApplyId;
    }

    /**
     * Set The application ID.
     * @param ApplyId The application ID.
     */
    public void setApplyId(Long ApplyId) {
        this.ApplyId = ApplyId;
    }

    public CptIssueRank() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CptIssueRank(CptIssueRank source) {
        if (source.CptName != null) {
            this.CptName = new String(source.CptName);
        }
        if (source.Rank != null) {
            this.Rank = new Long(source.Rank);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ApplyName != null) {
            this.ApplyName = new String(source.ApplyName);
        }
        if (source.ApplyId != null) {
            this.ApplyId = new Long(source.ApplyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CptName", this.CptName);
        this.setParamSimple(map, prefix + "Rank", this.Rank);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ApplyName", this.ApplyName);
        this.setParamSimple(map, prefix + "ApplyId", this.ApplyId);

    }
}

