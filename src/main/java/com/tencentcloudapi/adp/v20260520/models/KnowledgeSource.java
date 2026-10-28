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

public class KnowledgeSource extends AbstractModel {

    /**
    * <p>Whether it is big data</p>
    */
    @SerializedName("IsBigData")
    @Expose
    private Boolean IsBigData;

    /**
    * <p>Whether it is a shared knowledge base</p>
    */
    @SerializedName("IsShared")
    @Expose
    private Boolean IsShared;

    /**
    * <p>Knowledge base name</p>
    */
    @SerializedName("KbName")
    @Expose
    private String KbName;

    /**
     * Get <p>Whether it is big data</p> 
     * @return IsBigData <p>Whether it is big data</p>
     */
    public Boolean getIsBigData() {
        return this.IsBigData;
    }

    /**
     * Set <p>Whether it is big data</p>
     * @param IsBigData <p>Whether it is big data</p>
     */
    public void setIsBigData(Boolean IsBigData) {
        this.IsBigData = IsBigData;
    }

    /**
     * Get <p>Whether it is a shared knowledge base</p> 
     * @return IsShared <p>Whether it is a shared knowledge base</p>
     */
    public Boolean getIsShared() {
        return this.IsShared;
    }

    /**
     * Set <p>Whether it is a shared knowledge base</p>
     * @param IsShared <p>Whether it is a shared knowledge base</p>
     */
    public void setIsShared(Boolean IsShared) {
        this.IsShared = IsShared;
    }

    /**
     * Get <p>Knowledge base name</p> 
     * @return KbName <p>Knowledge base name</p>
     */
    public String getKbName() {
        return this.KbName;
    }

    /**
     * Set <p>Knowledge base name</p>
     * @param KbName <p>Knowledge base name</p>
     */
    public void setKbName(String KbName) {
        this.KbName = KbName;
    }

    public KnowledgeSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeSource(KnowledgeSource source) {
        if (source.IsBigData != null) {
            this.IsBigData = new Boolean(source.IsBigData);
        }
        if (source.IsShared != null) {
            this.IsShared = new Boolean(source.IsShared);
        }
        if (source.KbName != null) {
            this.KbName = new String(source.KbName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsBigData", this.IsBigData);
        this.setParamSimple(map, prefix + "IsShared", this.IsShared);
        this.setParamSimple(map, prefix + "KbName", this.KbName);

    }
}

