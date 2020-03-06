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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListOrganizationInvitationsRequest extends AbstractModel{

    /**
    * Whether to list the invitations you received or the invitations you sent. `1`: list the invitations you received; `0`: list the invitations you sent.
    */
    @SerializedName("Invited")
    @Expose
    private Long Invited;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Whether to list the invitations you received or the invitations you sent. `1`: list the invitations you received; `0`: list the invitations you sent. 
     * @return Invited Whether to list the invitations you received or the invitations you sent. `1`: list the invitations you received; `0`: list the invitations you sent.
     */
    public Long getInvited() {
        return this.Invited;
    }

    /**
     * Set Whether to list the invitations you received or the invitations you sent. `1`: list the invitations you received; `0`: list the invitations you sent.
     * @param Invited Whether to list the invitations you received or the invitations you sent. `1`: list the invitations you received; `0`: list the invitations you sent.
     */
    public void setInvited(Long Invited) {
        this.Invited = Invited;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Invited", this.Invited);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

