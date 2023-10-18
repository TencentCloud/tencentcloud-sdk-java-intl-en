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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListGroupsForUserRequest extends AbstractModel {

    /**
    * Sub-user UID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * Number of entries per page; default is 20
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * Page number; default is 1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Sub-account UIN
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
     * Get Sub-user UID 
     * @return Uid Sub-user UID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set Sub-user UID
     * @param Uid Sub-user UID
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
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
     * Get Sub-account UIN 
     * @return SubUin Sub-account UIN
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Sub-account UIN
     * @param SubUin Sub-account UIN
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    public ListGroupsForUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGroupsForUserRequest(ListGroupsForUserRequest source) {
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);

    }
}

