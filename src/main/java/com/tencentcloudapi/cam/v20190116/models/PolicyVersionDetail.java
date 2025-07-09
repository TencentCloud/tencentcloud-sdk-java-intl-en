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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyVersionDetail extends AbstractModel {

    /**
    * Policy version ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionId")
    @Expose
    private Long VersionId;

    /**
    * Policy version creation time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * Whether it is the operative version. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDefaultVersion")
    @Expose
    private Long IsDefaultVersion;

    /**
    * Policy syntax text
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Document")
    @Expose
    private String Document;

    /**
     * Get Policy version ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VersionId Policy version ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getVersionId() {
        return this.VersionId;
    }

    /**
     * Set Policy version ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VersionId Policy version ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVersionId(Long VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Policy version creation time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateDate Policy version creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set Policy version creation time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateDate Policy version creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get Whether it is the operative version. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsDefaultVersion Whether it is the operative version. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDefaultVersion() {
        return this.IsDefaultVersion;
    }

    /**
     * Set Whether it is the operative version. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsDefaultVersion Whether it is the operative version. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDefaultVersion(Long IsDefaultVersion) {
        this.IsDefaultVersion = IsDefaultVersion;
    }

    /**
     * Get Policy syntax text
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Document Policy syntax text
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDocument() {
        return this.Document;
    }

    /**
     * Set Policy syntax text
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Document Policy syntax text
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDocument(String Document) {
        this.Document = Document;
    }

    public PolicyVersionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyVersionDetail(PolicyVersionDetail source) {
        if (source.VersionId != null) {
            this.VersionId = new Long(source.VersionId);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.IsDefaultVersion != null) {
            this.IsDefaultVersion = new Long(source.IsDefaultVersion);
        }
        if (source.Document != null) {
            this.Document = new String(source.Document);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "IsDefaultVersion", this.IsDefaultVersion);
        this.setParamSimple(map, prefix + "Document", this.Document);

    }
}

