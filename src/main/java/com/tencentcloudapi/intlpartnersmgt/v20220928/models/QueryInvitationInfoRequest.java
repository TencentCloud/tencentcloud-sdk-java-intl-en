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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryInvitationInfoRequest extends AbstractModel {

    /**
    * Invite token. array member quantity value: [1, 100].
    */
    @SerializedName("InvitationToken")
    @Expose
    private String [] InvitationToken;

    /**
     * Get Invite token. array member quantity value: [1, 100]. 
     * @return InvitationToken Invite token. array member quantity value: [1, 100].
     */
    public String [] getInvitationToken() {
        return this.InvitationToken;
    }

    /**
     * Set Invite token. array member quantity value: [1, 100].
     * @param InvitationToken Invite token. array member quantity value: [1, 100].
     */
    public void setInvitationToken(String [] InvitationToken) {
        this.InvitationToken = InvitationToken;
    }

    public QueryInvitationInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryInvitationInfoRequest(QueryInvitationInfoRequest source) {
        if (source.InvitationToken != null) {
            this.InvitationToken = new String[source.InvitationToken.length];
            for (int i = 0; i < source.InvitationToken.length; i++) {
                this.InvitationToken[i] = new String(source.InvitationToken[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InvitationToken.", this.InvitationToken);

    }
}

