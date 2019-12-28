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

public class ListGroupsRequest extends AbstractModel{

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
    * Filter by User Group name
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

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

    /**
     * Get Filter by User Group name 
     * @return Keyword Filter by User Group name
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Filter by User Group name
     * @param Keyword Filter by User Group name
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

