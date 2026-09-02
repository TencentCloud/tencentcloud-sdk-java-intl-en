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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDspmAccessRecordRequest extends AbstractModel {

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Source IP
    */
    @SerializedName("Id")
    @Expose
    private DspmAccessRecordId [] Id;

    /**
    * View. ip or instance.
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * Read tag. 1 - Read
    */
    @SerializedName("Noted")
    @Expose
    private Long Noted;

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Source IP 
     * @return Id Source IP
     */
    public DspmAccessRecordId [] getId() {
        return this.Id;
    }

    /**
     * Set Source IP
     * @param Id Source IP
     */
    public void setId(DspmAccessRecordId [] Id) {
        this.Id = Id;
    }

    /**
     * Get View. ip or instance. 
     * @return View View. ip or instance.
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set View. ip or instance.
     * @param View View. ip or instance.
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get Read tag. 1 - Read 
     * @return Noted Read tag. 1 - Read
     */
    public Long getNoted() {
        return this.Noted;
    }

    /**
     * Set Read tag. 1 - Read
     * @param Noted Read tag. 1 - Read
     */
    public void setNoted(Long Noted) {
        this.Noted = Noted;
    }

    public ModifyDspmAccessRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAccessRecordRequest(ModifyDspmAccessRecordRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new DspmAccessRecordId[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new DspmAccessRecordId(source.Id[i]);
            }
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.Noted != null) {
            this.Noted = new Long(source.Noted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Id.", this.Id);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamSimple(map, prefix + "Noted", this.Noted);

    }
}

