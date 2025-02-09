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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryOnlineVersionResp extends AbstractModel {

    /**
    * Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * Version ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * Version note
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPVersionNote")
    @Expose
    private String MNPVersionNote;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Mini program ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPVersion Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set Version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPVersion Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get Version ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPVersionId Version ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set Version ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPVersionId Version ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
    }

    /**
     * Get Version note
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPVersionNote Version note
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPVersionNote() {
        return this.MNPVersionNote;
    }

    /**
     * Set Version note
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPVersionNote Version note
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPVersionNote(String MNPVersionNote) {
        this.MNPVersionNote = MNPVersionNote;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public QueryOnlineVersionResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOnlineVersionResp(QueryOnlineVersionResp source) {
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

