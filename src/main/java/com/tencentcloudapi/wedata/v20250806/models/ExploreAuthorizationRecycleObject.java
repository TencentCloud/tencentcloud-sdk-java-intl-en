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

public class ExploreAuthorizationRecycleObject extends AbstractModel {

    /**
    * File resource information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resource")
    @Expose
    private ExploreFileResource Resource;

    /**
    * Authorization details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecycleSubjects")
    @Expose
    private ExploreAuthorizeSubject [] RecycleSubjects;

    /**
     * Get File resource information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resource File resource information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExploreFileResource getResource() {
        return this.Resource;
    }

    /**
     * Set File resource information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resource File resource information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResource(ExploreFileResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Authorization details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecycleSubjects Authorization details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExploreAuthorizeSubject [] getRecycleSubjects() {
        return this.RecycleSubjects;
    }

    /**
     * Set Authorization details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecycleSubjects Authorization details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecycleSubjects(ExploreAuthorizeSubject [] RecycleSubjects) {
        this.RecycleSubjects = RecycleSubjects;
    }

    public ExploreAuthorizationRecycleObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExploreAuthorizationRecycleObject(ExploreAuthorizationRecycleObject source) {
        if (source.Resource != null) {
            this.Resource = new ExploreFileResource(source.Resource);
        }
        if (source.RecycleSubjects != null) {
            this.RecycleSubjects = new ExploreAuthorizeSubject[source.RecycleSubjects.length];
            for (int i = 0; i < source.RecycleSubjects.length; i++) {
                this.RecycleSubjects[i] = new ExploreAuthorizeSubject(source.RecycleSubjects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArrayObj(map, prefix + "RecycleSubjects.", this.RecycleSubjects);

    }
}

