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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemberIdentity extends AbstractModel {

    /**
    * Identity ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * Identity name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdentityAliasName")
    @Expose
    private String IdentityAliasName;

    /**
     * Get Identity ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdentityId Identity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set Identity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdentityId Identity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get Identity name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdentityAliasName Identity name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdentityAliasName() {
        return this.IdentityAliasName;
    }

    /**
     * Set Identity name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdentityAliasName Identity name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdentityAliasName(String IdentityAliasName) {
        this.IdentityAliasName = IdentityAliasName;
    }

    public MemberIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberIdentity(MemberIdentity source) {
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.IdentityAliasName != null) {
            this.IdentityAliasName = new String(source.IdentityAliasName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "IdentityAliasName", this.IdentityAliasName);

    }
}

