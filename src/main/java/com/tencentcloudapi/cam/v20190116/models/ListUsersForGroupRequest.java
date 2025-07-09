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

public class ListUsersForGroupRequest extends AbstractModel {

    /**
    * User group ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Page number; default is 1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Number of entries per page; default is 20
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
     * Get User group ID 
     * @return GroupId User group ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set User group ID
     * @param GroupId User group ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Page number; default is 1 
     * @return Page Page number; default is 1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number; default is 1
     * @param Page Page number; default is 1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Number of entries per page; default is 20 
     * @return Rp Number of entries per page; default is 20
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set Number of entries per page; default is 20
     * @param Rp Number of entries per page; default is 20
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    public ListUsersForGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUsersForGroupRequest(ListUsersForGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);

    }
}

