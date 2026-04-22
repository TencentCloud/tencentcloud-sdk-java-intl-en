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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryMNGOnlineVersionResp extends AbstractModel {

    /**
    * <p>Mini game appid</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Version number</p>
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * <p>Version ID</p>
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * <p>Version remarks</p>
    */
    @SerializedName("MNPVersionNote")
    @Expose
    private String MNPVersionNote;

    /**
    * <p>Update time</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Mini game appid</p> 
     * @return MNPId <p>Mini game appid</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini game appid</p>
     * @param MNPId <p>Mini game appid</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Version number</p> 
     * @return MNPVersion <p>Version number</p>
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set <p>Version number</p>
     * @param MNPVersion <p>Version number</p>
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get <p>Version ID</p> 
     * @return MNPVersionId <p>Version ID</p>
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set <p>Version ID</p>
     * @param MNPVersionId <p>Version ID</p>
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
    }

    /**
     * Get <p>Version remarks</p> 
     * @return MNPVersionNote <p>Version remarks</p>
     */
    public String getMNPVersionNote() {
        return this.MNPVersionNote;
    }

    /**
     * Set <p>Version remarks</p>
     * @param MNPVersionNote <p>Version remarks</p>
     */
    public void setMNPVersionNote(String MNPVersionNote) {
        this.MNPVersionNote = MNPVersionNote;
    }

    /**
     * Get <p>Update time</p> 
     * @return UpdateTime <p>Update time</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time</p>
     * @param UpdateTime <p>Update time</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public QueryMNGOnlineVersionResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMNGOnlineVersionResp(QueryMNGOnlineVersionResp source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPVersion != null) {
            this.MNPVersion = new String(source.MNPVersion);
        }
        if (source.MNPVersionId != null) {
            this.MNPVersionId = new Long(source.MNPVersionId);
        }
        if (source.MNPVersionNote != null) {
            this.MNPVersionNote = new String(source.MNPVersionNote);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPVersion", this.MNPVersion);
        this.setParamSimple(map, prefix + "MNPVersionId", this.MNPVersionId);
        this.setParamSimple(map, prefix + "MNPVersionNote", this.MNPVersionNote);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

