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

public class QualityInspectResultItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("SegmentSet")
    @Expose
    private QualityInspectItem [] SegmentSet;

    /**
    * 
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * 
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return SegmentSet 
     */
    public QualityInspectItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 
     * @param SegmentSet 
     */
    public void setSegmentSet(QualityInspectItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get  
     * @return SegmentSetFileUrl 
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set 
     * @param SegmentSetFileUrl 
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get  
     * @return SegmentSetFileUrlExpireTime 
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set 
     * @param SegmentSetFileUrlExpireTime 
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    public QualityInspectResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectResultItem(QualityInspectResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new QualityInspectItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new QualityInspectItem(source.SegmentSet[i]);
            }
        }
        if (source.SegmentSetFileUrl != null) {
            this.SegmentSetFileUrl = new String(source.SegmentSetFileUrl);
        }
        if (source.SegmentSetFileUrlExpireTime != null) {
            this.SegmentSetFileUrlExpireTime = new String(source.SegmentSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SegmentSetFileUrl", this.SegmentSetFileUrl);
        this.setParamSimple(map, prefix + "SegmentSetFileUrlExpireTime", this.SegmentSetFileUrlExpireTime);

    }
}

