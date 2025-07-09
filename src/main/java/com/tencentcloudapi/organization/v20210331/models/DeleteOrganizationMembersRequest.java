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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOrganizationMembersRequest extends AbstractModel {

    /**
    * Uin list of the deleted members.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long [] MemberUin;

    /**
     * Get Uin list of the deleted members. 
     * @return MemberUin Uin list of the deleted members.
     */
    public Long [] getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Uin list of the deleted members.
     * @param MemberUin Uin list of the deleted members.
     */
    public void setMemberUin(Long [] MemberUin) {
        this.MemberUin = MemberUin;
    }

    public DeleteOrganizationMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOrganizationMembersRequest(DeleteOrganizationMembersRequest source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long[source.MemberUin.length];
            for (int i = 0; i < source.MemberUin.length; i++) {
                this.MemberUin[i] = new Long(source.MemberUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberUin.", this.MemberUin);

    }
}

