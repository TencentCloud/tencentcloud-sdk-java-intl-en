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

public class ExploreAuthorizeSubject extends AbstractModel {

    /**
    * Type (user, role, group).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubjectType")
    @Expose
    private String SubjectType;

    /**
    * Value list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubjectValues")
    @Expose
    private String [] SubjectValues;

    /**
    * Permission list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
     * Get Type (user, role, group).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubjectType Type (user, role, group).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubjectType() {
        return this.SubjectType;
    }

    /**
     * Set Type (user, role, group).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubjectType Type (user, role, group).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubjectType(String SubjectType) {
        this.SubjectType = SubjectType;
    }

    /**
     * Get Value list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubjectValues Value list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSubjectValues() {
        return this.SubjectValues;
    }

    /**
     * Set Value list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubjectValues Value list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubjectValues(String [] SubjectValues) {
        this.SubjectValues = SubjectValues;
    }

    /**
     * Get Permission list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Privileges Permission list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set Permission list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Privileges Permission list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    public ExploreAuthorizeSubject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExploreAuthorizeSubject(ExploreAuthorizeSubject source) {
        if (source.SubjectType != null) {
            this.SubjectType = new String(source.SubjectType);
        }
        if (source.SubjectValues != null) {
            this.SubjectValues = new String[source.SubjectValues.length];
            for (int i = 0; i < source.SubjectValues.length; i++) {
                this.SubjectValues[i] = new String(source.SubjectValues[i]);
            }
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubjectType", this.SubjectType);
        this.setParamArraySimple(map, prefix + "SubjectValues.", this.SubjectValues);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);

    }
}

