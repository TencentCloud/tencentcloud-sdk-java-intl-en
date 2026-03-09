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

public class ExploreAuthorizationObject extends AbstractModel {

    /**
    * Authorized resource info, including resourceId and resourceType.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resource")
    @Expose
    private ExploreFileResource Resource;

    /**
    * Authorization details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthorizeSubjects")
    @Expose
    private ExploreAuthorizeSubject [] AuthorizeSubjects;

    /**
     * Get Authorized resource info, including resourceId and resourceType.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resource Authorized resource info, including resourceId and resourceType.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExploreFileResource getResource() {
        return this.Resource;
    }

    /**
     * Set Authorized resource info, including resourceId and resourceType.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resource Authorized resource info, including resourceId and resourceType.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResource(ExploreFileResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Authorization details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthorizeSubjects Authorization details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExploreAuthorizeSubject [] getAuthorizeSubjects() {
        return this.AuthorizeSubjects;
    }

    /**
     * Set Authorization details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthorizeSubjects Authorization details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthorizeSubjects(ExploreAuthorizeSubject [] AuthorizeSubjects) {
        this.AuthorizeSubjects = AuthorizeSubjects;
    }

    public ExploreAuthorizationObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExploreAuthorizationObject(ExploreAuthorizationObject source) {
        if (source.Resource != null) {
            this.Resource = new ExploreFileResource(source.Resource);
        }
        if (source.AuthorizeSubjects != null) {
            this.AuthorizeSubjects = new ExploreAuthorizeSubject[source.AuthorizeSubjects.length];
            for (int i = 0; i < source.AuthorizeSubjects.length; i++) {
                this.AuthorizeSubjects[i] = new ExploreAuthorizeSubject(source.AuthorizeSubjects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArrayObj(map, prefix + "AuthorizeSubjects.", this.AuthorizeSubjects);

    }
}

