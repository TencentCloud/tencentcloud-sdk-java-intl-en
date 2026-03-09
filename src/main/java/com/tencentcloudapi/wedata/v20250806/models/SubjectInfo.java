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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubjectInfo extends AbstractModel {

    /**
    * Type.
    */
    @SerializedName("SubjectType")
    @Expose
    private String SubjectType;

    /**
    * Topic type display name.
    */
    @SerializedName("SubjectTypeDisplayName")
    @Expose
    private String SubjectTypeDisplayName;

    /**
    * Subject id.
    */
    @SerializedName("SubjectValue")
    @Expose
    private String SubjectValue;

    /**
    * Subject name.
    */
    @SerializedName("SubjectValueDisplayName")
    @Expose
    private String SubjectValueDisplayName;

    /**
     * Get Type. 
     * @return SubjectType Type.
     */
    public String getSubjectType() {
        return this.SubjectType;
    }

    /**
     * Set Type.
     * @param SubjectType Type.
     */
    public void setSubjectType(String SubjectType) {
        this.SubjectType = SubjectType;
    }

    /**
     * Get Topic type display name. 
     * @return SubjectTypeDisplayName Topic type display name.
     */
    public String getSubjectTypeDisplayName() {
        return this.SubjectTypeDisplayName;
    }

    /**
     * Set Topic type display name.
     * @param SubjectTypeDisplayName Topic type display name.
     */
    public void setSubjectTypeDisplayName(String SubjectTypeDisplayName) {
        this.SubjectTypeDisplayName = SubjectTypeDisplayName;
    }

    /**
     * Get Subject id. 
     * @return SubjectValue Subject id.
     */
    public String getSubjectValue() {
        return this.SubjectValue;
    }

    /**
     * Set Subject id.
     * @param SubjectValue Subject id.
     */
    public void setSubjectValue(String SubjectValue) {
        this.SubjectValue = SubjectValue;
    }

    /**
     * Get Subject name. 
     * @return SubjectValueDisplayName Subject name.
     */
    public String getSubjectValueDisplayName() {
        return this.SubjectValueDisplayName;
    }

    /**
     * Set Subject name.
     * @param SubjectValueDisplayName Subject name.
     */
    public void setSubjectValueDisplayName(String SubjectValueDisplayName) {
        this.SubjectValueDisplayName = SubjectValueDisplayName;
    }

    public SubjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubjectInfo(SubjectInfo source) {
        if (source.SubjectType != null) {
            this.SubjectType = new String(source.SubjectType);
        }
        if (source.SubjectTypeDisplayName != null) {
            this.SubjectTypeDisplayName = new String(source.SubjectTypeDisplayName);
        }
        if (source.SubjectValue != null) {
            this.SubjectValue = new String(source.SubjectValue);
        }
        if (source.SubjectValueDisplayName != null) {
            this.SubjectValueDisplayName = new String(source.SubjectValueDisplayName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubjectType", this.SubjectType);
        this.setParamSimple(map, prefix + "SubjectTypeDisplayName", this.SubjectTypeDisplayName);
        this.setParamSimple(map, prefix + "SubjectValue", this.SubjectValue);
        this.setParamSimple(map, prefix + "SubjectValueDisplayName", this.SubjectValueDisplayName);

    }
}

