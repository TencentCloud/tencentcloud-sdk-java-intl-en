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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAttachedGroupPoliciesRequest extends AbstractModel{

    /**
    * User group ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private Long TargetGroupId;

    /**
    * Page number, which starts from 1. Default is 1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Number of entries per page; 20 by default
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
     * Get User group ID 
     * @return TargetGroupId User group ID
     */
    public Long getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set User group ID
     * @param TargetGroupId User group ID
     */
    public void setTargetGroupId(Long TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get Page number, which starts from 1. Default is 1 
     * @return Page Page number, which starts from 1. Default is 1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number, which starts from 1. Default is 1
     * @param Page Page number, which starts from 1. Default is 1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Number of entries per page; 20 by default 
     * @return Rp Number of entries per page; 20 by default
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set Number of entries per page; 20 by default
     * @param Rp Number of entries per page; 20 by default
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);

    }
}

