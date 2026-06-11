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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PatchInfoDetail extends AbstractModel {

    /**
    * KB No.
    */
    @SerializedName("KBNo")
    @Expose
    private String KBNo;

    /**
    * KB name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 2025-05
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * Vulnerability impacted by KB
    */
    @SerializedName("RelatedCveId")
    @Expose
    private String [] RelatedCveId;

    /**
    * KB documentation
    */
    @SerializedName("KbDocUrl")
    @Expose
    private String KbDocUrl;

    /**
    * KB id No.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get KB No. 
     * @return KBNo KB No.
     */
    public String getKBNo() {
        return this.KBNo;
    }

    /**
     * Set KB No.
     * @param KBNo KB No.
     */
    public void setKBNo(String KBNo) {
        this.KBNo = KBNo;
    }

    /**
     * Get KB name 
     * @return Name KB name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set KB name
     * @param Name KB name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 2025-05 
     * @return PublishTime 2025-05
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 2025-05
     * @param PublishTime 2025-05
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get Vulnerability impacted by KB 
     * @return RelatedCveId Vulnerability impacted by KB
     */
    public String [] getRelatedCveId() {
        return this.RelatedCveId;
    }

    /**
     * Set Vulnerability impacted by KB
     * @param RelatedCveId Vulnerability impacted by KB
     */
    public void setRelatedCveId(String [] RelatedCveId) {
        this.RelatedCveId = RelatedCveId;
    }

    /**
     * Get KB documentation 
     * @return KbDocUrl KB documentation
     */
    public String getKbDocUrl() {
        return this.KbDocUrl;
    }

    /**
     * Set KB documentation
     * @param KbDocUrl KB documentation
     */
    public void setKbDocUrl(String KbDocUrl) {
        this.KbDocUrl = KbDocUrl;
    }

    /**
     * Get KB id No. 
     * @return Id KB id No.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set KB id No.
     * @param Id KB id No.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public PatchInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PatchInfoDetail(PatchInfoDetail source) {
        if (source.KBNo != null) {
            this.KBNo = new String(source.KBNo);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.RelatedCveId != null) {
            this.RelatedCveId = new String[source.RelatedCveId.length];
            for (int i = 0; i < source.RelatedCveId.length; i++) {
                this.RelatedCveId[i] = new String(source.RelatedCveId[i]);
            }
        }
        if (source.KbDocUrl != null) {
            this.KbDocUrl = new String(source.KbDocUrl);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KBNo", this.KBNo);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamArraySimple(map, prefix + "RelatedCveId.", this.RelatedCveId);
        this.setParamSimple(map, prefix + "KbDocUrl", this.KbDocUrl);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

