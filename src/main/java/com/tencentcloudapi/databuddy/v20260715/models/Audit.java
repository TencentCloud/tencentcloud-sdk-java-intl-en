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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Audit extends AbstractModel {

    /**
    * Creator. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Creation Timestamp
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Last modifier. Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastModifier")
    @Expose
    private String LastModifier;

    /**
    * Last modification timestamp
    */
    @SerializedName("LastModifiedAt")
    @Expose
    private String LastModifiedAt;

    /**
    * Creator name.
    */
    @SerializedName("CreatorName")
    @Expose
    private String CreatorName;

    /**
    * Name of the last modifier
    */
    @SerializedName("LastModifierName")
    @Expose
    private String LastModifierName;

    /**
     * Get Creator. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Creator Creator. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Creator Creator. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Creation Timestamp 
     * @return CreatedAt Creation Timestamp
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation Timestamp
     * @param CreatedAt Creation Timestamp
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Last modifier. Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastModifier Last modifier. Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLastModifier() {
        return this.LastModifier;
    }

    /**
     * Set Last modifier. Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastModifier Last modifier. Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastModifier(String LastModifier) {
        this.LastModifier = LastModifier;
    }

    /**
     * Get Last modification timestamp 
     * @return LastModifiedAt Last modification timestamp
     */
    public String getLastModifiedAt() {
        return this.LastModifiedAt;
    }

    /**
     * Set Last modification timestamp
     * @param LastModifiedAt Last modification timestamp
     */
    public void setLastModifiedAt(String LastModifiedAt) {
        this.LastModifiedAt = LastModifiedAt;
    }

    /**
     * Get Creator name. 
     * @return CreatorName Creator name.
     */
    public String getCreatorName() {
        return this.CreatorName;
    }

    /**
     * Set Creator name.
     * @param CreatorName Creator name.
     */
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    /**
     * Get Name of the last modifier 
     * @return LastModifierName Name of the last modifier
     */
    public String getLastModifierName() {
        return this.LastModifierName;
    }

    /**
     * Set Name of the last modifier
     * @param LastModifierName Name of the last modifier
     */
    public void setLastModifierName(String LastModifierName) {
        this.LastModifierName = LastModifierName;
    }

    public Audit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Audit(Audit source) {
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.LastModifier != null) {
            this.LastModifier = new String(source.LastModifier);
        }
        if (source.LastModifiedAt != null) {
            this.LastModifiedAt = new String(source.LastModifiedAt);
        }
        if (source.CreatorName != null) {
            this.CreatorName = new String(source.CreatorName);
        }
        if (source.LastModifierName != null) {
            this.LastModifierName = new String(source.LastModifierName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "LastModifier", this.LastModifier);
        this.setParamSimple(map, prefix + "LastModifiedAt", this.LastModifiedAt);
        this.setParamSimple(map, prefix + "CreatorName", this.CreatorName);
        this.setParamSimple(map, prefix + "LastModifierName", this.LastModifierName);

    }
}

